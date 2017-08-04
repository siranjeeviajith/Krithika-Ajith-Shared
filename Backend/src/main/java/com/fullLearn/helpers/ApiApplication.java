package com.fullLearn.helpers;

import com.fullLearn.endpoints.api.LearningStatsEndpoint;
import com.fullLearn.endpoints.api.LearningStatsv1Endpoint;
import com.fullLearn.endpoints.api.UserDevicesEndpoint;
import com.fullLearn.endpoints.cron.ContactSyncCronEndpoint;
import com.fullLearn.endpoints.cron.NotificationCronEndpoint;
import com.fullLearn.endpoints.cron.UserStatsCronEndpoint;
import com.fullLearn.filter.AccessTokenFilter;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

/**
 * Created by amandeep on 7/12/2017.
 */
public class ApiApplication extends Application {


    AccessTokenFilter accessTokenFilter = new AccessTokenFilter();
    private Set<Object> singletons = new HashSet<Object>();

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<>();
        classes.add(LearningStatsEndpoint.class);
        classes.add(ContactSyncCronEndpoint.class);
        classes.add(UserStatsCronEndpoint.class);
        classes.add(UserDevicesEndpoint.class);
        classes.add(NotificationCronEndpoint.class);
        classes.add(LearningStatsv1Endpoint.class);
        return classes;
    }

    @Override
    public Set<Object> getSingletons() {
        singletons.add(accessTokenFilter);
        return singletons;


    }
}