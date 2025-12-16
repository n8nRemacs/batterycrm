package com.avito.android.iac_dialer.impl_module.audio.ringtone.ringing;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: IacVibrationPlayerApi31Impl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f165898a;

    public o(C30102l3 c30102l3) {
        this.f165898a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new n((Context) this.f165898a.get());
    }
}
