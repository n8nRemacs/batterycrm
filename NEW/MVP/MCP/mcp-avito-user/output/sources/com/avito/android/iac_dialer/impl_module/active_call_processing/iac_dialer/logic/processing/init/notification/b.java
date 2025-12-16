package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.init.notification;

import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddleware;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: NotificationMiddleware_IacMiddleware_Singleton_MultiBindingModule_ca00a3d2_ProvideIacMiddlewareFactory.java */
@e
@x
@y
/* loaded from: classes14.dex */
public final class b implements h<IacMiddleware> {

    /* compiled from: NotificationMiddleware_IacMiddleware_Singleton_MultiBindingModule_ca00a3d2_ProvideIacMiddlewareFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f165484a = new b();
    }

    public static b a() {
        return a.f165484a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.init.notification.a.f165483a.getClass();
        NotificationMiddleware notificationMiddleware = NotificationMiddleware.INSTANCE;
        t.d(notificationMiddleware);
        return notificationMiddleware;
    }
}
