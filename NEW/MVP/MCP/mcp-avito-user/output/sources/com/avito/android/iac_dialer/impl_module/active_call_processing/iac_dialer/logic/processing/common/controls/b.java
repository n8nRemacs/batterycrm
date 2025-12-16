package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.common.controls;

import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddleware;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ResetControlsVisibilityMiddleware_IacMiddleware_Singleton_MultiBindingModule_1630c6ca_ProvideIacMiddlewareFactory.java */
@e
@x
@y
/* loaded from: classes14.dex */
public final class b implements h<IacMiddleware> {

    /* compiled from: ResetControlsVisibilityMiddleware_IacMiddleware_Singleton_MultiBindingModule_1630c6ca_ProvideIacMiddlewareFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f165462a = new b();
    }

    public static b a() {
        return a.f165462a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.common.controls.a.f165461a.getClass();
        ResetControlsVisibilityMiddleware resetControlsVisibilityMiddleware = ResetControlsVisibilityMiddleware.INSTANCE;
        t.d(resetControlsVisibilityMiddleware);
        return resetControlsVisibilityMiddleware;
    }
}
