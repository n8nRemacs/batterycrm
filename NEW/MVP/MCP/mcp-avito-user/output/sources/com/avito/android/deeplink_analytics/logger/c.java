package com.avito.android.deeplink_analytics.logger;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DeeplinkEventsLogger_Factory.java */
@e
@x
@y
/* loaded from: classes12.dex */
public final class c implements h<com.avito.android.deeplink_analytics.logger.a> {

    /* compiled from: DeeplinkEventsLogger_Factory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f134120a = new c();
    }

    public static c a() {
        return a.f134120a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new com.avito.android.deeplink_analytics.logger.a();
    }
}
