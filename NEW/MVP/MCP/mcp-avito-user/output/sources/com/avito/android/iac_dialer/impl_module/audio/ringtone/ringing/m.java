package com.avito.android.iac_dialer.impl_module.audio.ringtone.ringing;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: IacVibrationPlayerApi27Impl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f165896a;

    public m(C30102l3 c30102l3) {
        this.f165896a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l((Context) this.f165896a.get());
    }
}
