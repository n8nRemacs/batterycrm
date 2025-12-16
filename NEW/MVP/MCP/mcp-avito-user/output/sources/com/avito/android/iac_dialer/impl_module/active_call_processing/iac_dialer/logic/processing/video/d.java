package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.video;

import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddleware;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutoDisableCameraMiddleware_IacMiddleware_Singleton_MultiBindingModule_b0e84889_ProvideIacMiddlewareFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes14.dex */
public final class d implements h<IacMiddleware> {

    /* compiled from: AutoDisableCameraMiddleware_IacMiddleware_Singleton_MultiBindingModule_b0e84889_ProvideIacMiddlewareFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f165505a = new d();
    }

    public static d a() {
        return a.f165505a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c.f165504a.getClass();
        AutoDisableCameraMiddleware autoDisableCameraMiddleware = AutoDisableCameraMiddleware.INSTANCE;
        t.d(autoDisableCameraMiddleware);
        return autoDisableCameraMiddleware;
    }
}
