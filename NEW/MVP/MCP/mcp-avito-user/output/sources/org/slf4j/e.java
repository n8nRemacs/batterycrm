package org.slf4j;

import org.slf4j.helpers.m;
import org.slf4j.impl.StaticMarkerBinder;

/* compiled from: MarkerFactory.java */
/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static final IMarkerFactory f421819a;

    static {
        try {
            f421819a = a();
        } catch (Exception e12) {
            m.c("Unexpected failure while binding MarkerFactory", e12);
        } catch (NoClassDefFoundError unused) {
            new org.slf4j.helpers.c();
        }
    }

    public static IMarkerFactory a() {
        try {
            return StaticMarkerBinder.getSingleton().getMarkerFactory();
        } catch (NoSuchMethodError unused) {
            return StaticMarkerBinder.SINGLETON.getMarkerFactory();
        }
    }
}
