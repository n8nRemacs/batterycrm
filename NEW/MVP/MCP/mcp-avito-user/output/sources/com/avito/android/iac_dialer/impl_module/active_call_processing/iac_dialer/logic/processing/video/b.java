package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.video;

import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddleware;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AttachDetachRenderersToAvCallsMiddleware_IacMiddleware_Singleton_MultiBindingModule_66793fa7_ProvideIacMiddlewareFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes14.dex */
public final class b implements h<IacMiddleware> {

    /* compiled from: AttachDetachRenderersToAvCallsMiddleware_IacMiddleware_Singleton_MultiBindingModule_66793fa7_ProvideIacMiddlewareFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f165503a = new b();
    }

    public static b a() {
        return a.f165503a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.video.a.f165502a.getClass();
        AttachDetachRenderersToAvCallsMiddleware attachDetachRenderersToAvCallsMiddleware = AttachDetachRenderersToAvCallsMiddleware.INSTANCE;
        t.d(attachDetachRenderersToAvCallsMiddleware);
        return attachDetachRenderersToAvCallsMiddleware;
    }
}
