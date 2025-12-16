package com.avito.android.messenger.channels.mvi.data;

import com.avito.android.messenger.conversation.mvi.data.InterfaceC32021j;
import javax.inject.Provider;

/* compiled from: ChannelEntityConverterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.channels.mvi.data.g, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31699g implements dagger.internal.h<C31698f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC32021j> f187220a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f187221b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f187222c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC31706n> f187223d;

    public C31699g(dagger.internal.u uVar, dagger.internal.u uVar2, Provider provider, Provider provider2) {
        this.f187220a = provider;
        this.f187221b = uVar;
        this.f187222c = uVar2;
        this.f187223d = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C31698f(this.f187220a.get(), (c0) this.f187221b.get(), (InterfaceC31693a) this.f187222c.get(), this.f187223d.get());
    }
}
