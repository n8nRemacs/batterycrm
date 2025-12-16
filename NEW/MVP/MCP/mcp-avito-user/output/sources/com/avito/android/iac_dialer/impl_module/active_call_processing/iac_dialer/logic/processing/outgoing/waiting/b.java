package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.outgoing.waiting;

import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddleware;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CloseAnyWaitBottomSheetMiddleware_IacMiddleware_Singleton_MultiBindingModule_c7f3e009_ProvideIacMiddlewareFactory.java */
@e
@x
@y
/* loaded from: classes14.dex */
public final class b implements h<IacMiddleware> {

    /* compiled from: CloseAnyWaitBottomSheetMiddleware_IacMiddleware_Singleton_MultiBindingModule_c7f3e009_ProvideIacMiddlewareFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f165498a = new b();
    }

    public static b a() {
        return a.f165498a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.outgoing.waiting.a.f165493a.getClass();
        CloseAnyWaitBottomSheetMiddleware closeAnyWaitBottomSheetMiddleware = CloseAnyWaitBottomSheetMiddleware.INSTANCE;
        t.d(closeAnyWaitBottomSheetMiddleware);
        return closeAnyWaitBottomSheetMiddleware;
    }
}
