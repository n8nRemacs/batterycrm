package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.video;

import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddleware;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutoEnableCameraMiddleware_IacMiddleware_Singleton_MultiBindingModule_3bd103b5_ProvideIacMiddlewareFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes14.dex */
public final class f implements h<IacMiddleware> {

    /* compiled from: AutoEnableCameraMiddleware_IacMiddleware_Singleton_MultiBindingModule_3bd103b5_ProvideIacMiddlewareFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final f f165507a = new f();
    }

    public static f a() {
        return a.f165507a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e.f165506a.getClass();
        AutoEnableCameraMiddleware autoEnableCameraMiddleware = AutoEnableCameraMiddleware.INSTANCE;
        t.d(autoEnableCameraMiddleware);
        return autoEnableCameraMiddleware;
    }
}
