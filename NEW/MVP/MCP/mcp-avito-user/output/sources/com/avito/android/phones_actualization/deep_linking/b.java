package com.avito.android.phones_actualization.deep_linking;

import dagger.internal.x;
import dagger.internal.y;
import java.util.Calendar;
import java.util.TimeZone;

/* compiled from: ActualizePhonesDeeplinkMappingsModule_ProvideCalendarFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes15.dex */
public final class b implements dagger.internal.h<Calendar> {

    /* compiled from: ActualizePhonesDeeplinkMappingsModule_ProvideCalendarFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f216181a = new b();
    }

    public static b a() {
        return a.f216181a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.phones_actualization.deep_linking.a.f216180a.getClass();
        return Calendar.getInstance(TimeZone.getTimeZone("UTC"));
    }
}
