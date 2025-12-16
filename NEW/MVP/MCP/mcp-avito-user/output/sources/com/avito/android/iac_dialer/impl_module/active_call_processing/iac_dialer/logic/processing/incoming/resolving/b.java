package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.incoming.resolving;

import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddleware;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: IncomingPreconditionsCheckSchedulingMiddleware_IacMiddleware_Singleton_MultiBindingModule_99b1a798_ProvideIacMiddlewareFactory.java */
@e
@x
@y
/* loaded from: classes14.dex */
public final class b implements h<IacMiddleware> {

    /* compiled from: IncomingPreconditionsCheckSchedulingMiddleware_IacMiddleware_Singleton_MultiBindingModule_99b1a798_ProvideIacMiddlewareFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f165473a = new b();
    }

    public static b a() {
        return a.f165473a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.incoming.resolving.a.f165472a.getClass();
        IncomingPreconditionsCheckSchedulingMiddleware incomingPreconditionsCheckSchedulingMiddleware = IncomingPreconditionsCheckSchedulingMiddleware.INSTANCE;
        t.d(incomingPreconditionsCheckSchedulingMiddleware);
        return incomingPreconditionsCheckSchedulingMiddleware;
    }
}
