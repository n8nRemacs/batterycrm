package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.finalizing;

import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddleware;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: HandleFinishedStateMiddleware_IacMiddleware_Singleton_MultiBindingModule_b58908a0_ProvideIacMiddlewareFactory.java */
@e
@x
@y
/* loaded from: classes14.dex */
public final class b implements h<IacMiddleware> {

    /* compiled from: HandleFinishedStateMiddleware_IacMiddleware_Singleton_MultiBindingModule_b58908a0_ProvideIacMiddlewareFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f165470a = new b();
    }

    public static b a() {
        return a.f165470a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.finalizing.a.f165469a.getClass();
        HandleFinishedStateMiddleware handleFinishedStateMiddleware = HandleFinishedStateMiddleware.INSTANCE;
        t.d(handleFinishedStateMiddleware);
        return handleFinishedStateMiddleware;
    }
}
