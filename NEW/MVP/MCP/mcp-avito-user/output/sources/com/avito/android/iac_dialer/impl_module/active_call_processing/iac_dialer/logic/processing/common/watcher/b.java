package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.common.watcher;

import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddleware;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: WatcherMiddleware_IacMiddleware_Singleton_MultiBindingModule_3a01e335_ProvideIacMiddlewareFactory.java */
@e
@x
@y
/* loaded from: classes14.dex */
public final class b implements h<IacMiddleware> {

    /* compiled from: WatcherMiddleware_IacMiddleware_Singleton_MultiBindingModule_3a01e335_ProvideIacMiddlewareFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f165468a = new b();
    }

    public static b a() {
        return a.f165468a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.common.watcher.a.f165467a.getClass();
        WatcherMiddleware watcherMiddleware = WatcherMiddleware.INSTANCE;
        t.d(watcherMiddleware);
        return watcherMiddleware;
    }
}
