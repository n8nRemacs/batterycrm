package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.incoming.resolving;

import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddleware;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: IncomingPreconditionsResolvedMiddleware_IacMiddleware_Singleton_MultiBindingModule_308a1141_ProvideIacMiddlewareFactory.java */
@e
@x
@y
/* loaded from: classes14.dex */
public final class d implements h<IacMiddleware> {

    /* compiled from: IncomingPreconditionsResolvedMiddleware_IacMiddleware_Singleton_MultiBindingModule_308a1141_ProvideIacMiddlewareFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f165475a = new d();
    }

    public static d a() {
        return a.f165475a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c.f165474a.getClass();
        IncomingPreconditionsResolvedMiddleware incomingPreconditionsResolvedMiddleware = IncomingPreconditionsResolvedMiddleware.INSTANCE;
        t.d(incomingPreconditionsResolvedMiddleware);
        return incomingPreconditionsResolvedMiddleware;
    }
}
