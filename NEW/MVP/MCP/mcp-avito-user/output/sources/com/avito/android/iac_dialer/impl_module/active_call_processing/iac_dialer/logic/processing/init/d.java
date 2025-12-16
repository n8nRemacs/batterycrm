package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.init;

import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddleware;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RemoveCallInitMiddleware_IacMiddleware_Singleton_MultiBindingModule_927dfd13_ProvideIacMiddlewareFactory.java */
@e
@x
@y
/* loaded from: classes14.dex */
public final class d implements h<IacMiddleware> {

    /* compiled from: RemoveCallInitMiddleware_IacMiddleware_Singleton_MultiBindingModule_927dfd13_ProvideIacMiddlewareFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f165479a = new d();
    }

    public static d a() {
        return a.f165479a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c.f165478a.getClass();
        RemoveCallInitMiddleware removeCallInitMiddleware = RemoveCallInitMiddleware.INSTANCE;
        t.d(removeCallInitMiddleware);
        return removeCallInitMiddleware;
    }
}
