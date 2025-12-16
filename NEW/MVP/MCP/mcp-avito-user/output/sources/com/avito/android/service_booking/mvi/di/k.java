package com.avito.android.service_booking.mvi.di;

import com.avito.android.remote.parse.adapter.RuntimeTypeAdapterFactory;
import com.avito.android.service_booking.SbSpecialistsBlock;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServiceBookingBlockJsonModule_ProvideSpecialistTypeAdapterFactoryFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes3.dex */
public final class k implements dagger.internal.h<com.google.gson.r> {

    /* compiled from: ServiceBookingBlockJsonModule_ProvideSpecialistTypeAdapterFactoryFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final k f274337a = new k();
    }

    public static k a() {
        return a.f274337a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        i.f274335a.getClass();
        RuntimeTypeAdapterFactory.f254218g.getClass();
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactory = new RuntimeTypeAdapterFactory(SbSpecialistsBlock.SbSpecialist.class);
        runtimeTypeAdapterFactory.b(SbSpecialistsBlock.SbAnySpecialistBlock.class, "any_specialist", null);
        runtimeTypeAdapterFactory.b(SbSpecialistsBlock.SbSpecialistBlock.class, "specialist", null);
        return runtimeTypeAdapterFactory;
    }
}
