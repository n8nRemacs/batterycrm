package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.init.media_service;

import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddleware;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MediaServiceMiddleware_IacMiddleware_Singleton_MultiBindingModule_06f05087_ProvideIacMiddlewareFactory.java */
@e
@x
@y
/* loaded from: classes14.dex */
public final class b implements h<IacMiddleware> {

    /* compiled from: MediaServiceMiddleware_IacMiddleware_Singleton_MultiBindingModule_06f05087_ProvideIacMiddlewareFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f165482a = new b();
    }

    public static b a() {
        return a.f165482a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.init.media_service.a.f165481a.getClass();
        MediaServiceMiddleware mediaServiceMiddleware = MediaServiceMiddleware.INSTANCE;
        t.d(mediaServiceMiddleware);
        return mediaServiceMiddleware;
    }
}
