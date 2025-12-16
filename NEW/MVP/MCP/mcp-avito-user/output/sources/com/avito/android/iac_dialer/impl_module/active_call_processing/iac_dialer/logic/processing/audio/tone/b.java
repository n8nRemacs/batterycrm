package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.audio.tone;

import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddleware;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ToneMiddleware_IacMiddleware_Singleton_MultiBindingModule_59962630_ProvideIacMiddlewareFactory.java */
@e
@x
@y
/* loaded from: classes14.dex */
public final class b implements h<IacMiddleware> {

    /* compiled from: ToneMiddleware_IacMiddleware_Singleton_MultiBindingModule_59962630_ProvideIacMiddlewareFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f165457a = new b();
    }

    public static b a() {
        return a.f165457a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.audio.tone.a.f165456a.getClass();
        ToneMiddleware toneMiddleware = ToneMiddleware.INSTANCE;
        t.d(toneMiddleware);
        return toneMiddleware;
    }
}
