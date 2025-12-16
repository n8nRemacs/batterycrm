package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.outgoing.resolving;

import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddleware;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: OutgoingPreconditionsCheckSchedulingMiddleware_IacMiddleware_Singleton_MultiBindingModule_59d33637_ProvideIacMiddlewareFactory.java */
@e
@x
@y
/* loaded from: classes14.dex */
public final class b implements h<IacMiddleware> {

    /* compiled from: OutgoingPreconditionsCheckSchedulingMiddleware_IacMiddleware_Singleton_MultiBindingModule_59d33637_ProvideIacMiddlewareFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f165490a = new b();
    }

    public static b a() {
        return a.f165490a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.outgoing.resolving.a.f165489a.getClass();
        OutgoingPreconditionsCheckSchedulingMiddleware outgoingPreconditionsCheckSchedulingMiddleware = OutgoingPreconditionsCheckSchedulingMiddleware.INSTANCE;
        t.d(outgoingPreconditionsCheckSchedulingMiddleware);
        return outgoingPreconditionsCheckSchedulingMiddleware;
    }
}
