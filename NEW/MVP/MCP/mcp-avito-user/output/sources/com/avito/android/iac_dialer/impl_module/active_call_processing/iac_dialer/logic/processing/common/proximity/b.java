package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.common.proximity;

import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddleware;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ProximityWakeLockerMiddleware_IacMiddleware_Singleton_MultiBindingModule_114e75b6_ProvideIacMiddlewareFactory.java */
@e
@x
@y
/* loaded from: classes14.dex */
public final class b implements h<IacMiddleware> {

    /* compiled from: ProximityWakeLockerMiddleware_IacMiddleware_Singleton_MultiBindingModule_114e75b6_ProvideIacMiddlewareFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f165466a = new b();
    }

    public static b a() {
        return a.f165466a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.common.proximity.a.f165465a.getClass();
        ProximityWakeLockerMiddleware proximityWakeLockerMiddleware = ProximityWakeLockerMiddleware.INSTANCE;
        t.d(proximityWakeLockerMiddleware);
        return proximityWakeLockerMiddleware;
    }
}
