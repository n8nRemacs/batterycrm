package com.avito.android.messenger.conversation.mvi.sync;

import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: MissingUsersSyncAgentImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class M0 implements dagger.internal.h<C32293v0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<ru.avito.messenger.A> f194614a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.B> f194615b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f194616c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.w0> f194617d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f194618e;

    public M0(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f194614a = provider;
        this.f194615b = provider2;
        this.f194616c = uVar;
        this.f194617d = provider3;
        this.f194618e = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C32293v0(this.f194614a.get(), this.f194615b.get(), (com.avito.android.messenger.channels.mvi.data.f0) this.f194616c.get(), this.f194617d.get(), this.f194618e.get());
    }
}
