package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.audio.ringtone;

import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddleware;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RingtoneMiddleware_IacMiddleware_Singleton_MultiBindingModule_9be74aa2_ProvideIacMiddlewareFactory.java */
@e
@x
@y
/* loaded from: classes14.dex */
public final class b implements h<IacMiddleware> {

    /* compiled from: RingtoneMiddleware_IacMiddleware_Singleton_MultiBindingModule_9be74aa2_ProvideIacMiddlewareFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f165455a = new b();
    }

    public static b a() {
        return a.f165455a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.audio.ringtone.a.f165454a.getClass();
        RingtoneMiddleware ringtoneMiddleware = RingtoneMiddleware.INSTANCE;
        t.d(ringtoneMiddleware);
        return ringtoneMiddleware;
    }
}
