package com.avito.android.iac_dialer.impl_module.audio.ringtone;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import com.avito.android.notification.m;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DndModeChangeReceiver_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f165856a;

    /* renamed from: b, reason: collision with root package name */
    public final C30102l3 f165857b;

    public b(C30102l3 c30102l3, dagger.internal.f fVar) {
        this.f165856a = fVar;
        this.f165857b = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((m) this.f165856a.get(), (Context) this.f165857b.get());
    }
}
