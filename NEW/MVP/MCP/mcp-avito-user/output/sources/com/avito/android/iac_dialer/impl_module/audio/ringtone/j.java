package com.avito.android.iac_dialer.impl_module.audio.ringtone;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RingerModeChangeReceiver_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f165879a;

    public j(C30102l3 c30102l3) {
        this.f165879a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((Context) this.f165879a.get());
    }
}
