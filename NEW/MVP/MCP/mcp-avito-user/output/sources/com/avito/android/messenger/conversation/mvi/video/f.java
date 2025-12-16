package com.avito.android.messenger.conversation.mvi.video;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VideoCompressorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class f implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f194997a;

    /* renamed from: b, reason: collision with root package name */
    public final C30102l3 f194998b;

    public f(C30102l3 c30102l3, Provider provider) {
        this.f194997a = provider;
        this.f194998b = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((Context) this.f194998b.get(), this.f194997a.get());
    }
}
