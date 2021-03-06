package com.blackcurrantapps.iamhere.backend;

import com.blackcurrantapps.iamhere.backend.model.AppUser;
import com.blackcurrantapps.iamhere.backend.model.LOG;
import com.blackcurrantapps.iamhere.backend.model.Manager;
import com.blackcurrantapps.iamhere.backend.model.Offer;
import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyFactory;
import com.googlecode.objectify.ObjectifyService;

/**
 * Objectify service wrapper so we can statically register our persistence classes
 * More on Objectify here : https://code.google.com/p/objectify-appengine/
 */
public class OfyService {

    static {
        ObjectifyService.register(AppUser.class);
        ObjectifyService.register(Offer.class);
        ObjectifyService.register(Manager.class);
        ObjectifyService.register(LOG.class);

    }

    public static Objectify ofy() {
        return ObjectifyService.ofy();
    }

    public static ObjectifyFactory factory() {
        return ObjectifyService.factory();
    }
}
