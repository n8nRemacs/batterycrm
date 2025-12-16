package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.init;

import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddleware;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: OnCallInitiatedMiddleware_IacMiddleware_Singleton_MultiBindingModule_62e1a4c7_ProvideIacMiddlewareFactory.java */
@e
@x
@y
/* loaded from: classes14.dex */
public final class b implements h<IacMiddleware> {

    /* compiled from: OnCallInitiatedMiddleware_IacMiddleware_Singleton_MultiBindingModule_62e1a4c7_ProvideIacMiddlewareFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f165477a = new b();
    }

    public static b a() {
        return a.f165477a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.init.a.f165476a.getClass();
        OnCallInitiatedMiddleware onCallInitiatedMiddleware = OnCallInitiatedMiddleware.INSTANCE;
        t.d(onCallInitiatedMiddleware);
        return onCallInitiatedMiddleware;
    }
}
