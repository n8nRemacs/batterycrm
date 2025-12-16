package com.avito.android.iac_dialer.impl_module.audio.ringtone.ringing;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: IacVibrationPlayerApi33Impl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f165900a;

    public q(C30102l3 c30102l3) {
        this.f165900a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new p((Context) this.f165900a.get());
    }
}
