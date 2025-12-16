package com.avito.android.iac_dialer.impl_module.audio.ringtone.ringing;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: IacRingtonePlayerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f165893a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.iac_dialer.impl_module.splitter.features.c f165894b;

    public i(C30102l3 c30102l3, com.avito.android.iac_dialer.impl_module.splitter.features.c cVar) {
        this.f165893a = c30102l3;
        this.f165894b = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.f165893a.get();
        this.f165894b.get();
        return new h(context);
    }
}
