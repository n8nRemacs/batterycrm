package com.avito.android.iac_dialer.impl_module.audio.tone;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacTonePlayer_Factory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f165929a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f165930b;

    public d(C30102l3 c30102l3, Provider provider) {
        this.f165929a = c30102l3;
        this.f165930b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((Context) this.f165929a.get(), this.f165930b.get());
    }
}
