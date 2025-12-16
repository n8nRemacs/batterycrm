package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.audio.devices;

import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddleware;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutoEnableSpeakerMiddleware_IacMiddleware_Singleton_MultiBindingModule_5e52aac4_ProvideIacMiddlewareFactory.java */
@e
@x
@y
/* loaded from: classes14.dex */
public final class b implements h<IacMiddleware> {

    /* compiled from: AutoEnableSpeakerMiddleware_IacMiddleware_Singleton_MultiBindingModule_5e52aac4_ProvideIacMiddlewareFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f165453a = new b();
    }

    public static b a() {
        return a.f165453a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.audio.devices.a.f165452a.getClass();
        AutoEnableSpeakerMiddleware autoEnableSpeakerMiddleware = AutoEnableSpeakerMiddleware.INSTANCE;
        t.d(autoEnableSpeakerMiddleware);
        return autoEnableSpeakerMiddleware;
    }
}
