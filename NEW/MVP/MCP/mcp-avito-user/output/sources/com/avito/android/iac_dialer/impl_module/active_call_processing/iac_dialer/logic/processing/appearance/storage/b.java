package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.appearance.storage;

import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddleware;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UpdateStorageMiddleware_IacMiddleware_Singleton_MultiBindingModule_2e477dfd_ProvideIacMiddlewareFactory.java */
@e
@x
@y
/* loaded from: classes14.dex */
public final class b implements h<IacMiddleware> {

    /* compiled from: UpdateStorageMiddleware_IacMiddleware_Singleton_MultiBindingModule_2e477dfd_ProvideIacMiddlewareFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f165446a = new b();
    }

    public static b a() {
        return a.f165446a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.appearance.storage.a.f165445a.getClass();
        UpdateStorageMiddleware updateStorageMiddleware = UpdateStorageMiddleware.INSTANCE;
        t.d(updateStorageMiddleware);
        return updateStorageMiddleware;
    }
}
