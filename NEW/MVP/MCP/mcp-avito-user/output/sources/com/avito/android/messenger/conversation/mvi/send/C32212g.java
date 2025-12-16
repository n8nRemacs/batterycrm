package com.avito.android.messenger.conversation.mvi.send;

import com.avito.android.di.module.C30214v6;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: OnboardingsInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.conversation.mvi.send.g, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32212g implements dagger.internal.h<C32210f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f194511a;

    /* renamed from: b, reason: collision with root package name */
    public final C30214v6 f194512b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<JY.a> f194513c;

    public C32212g(Provider provider, C30214v6 c30214v6, Provider provider2) {
        this.f194511a = provider;
        this.f194512b = c30214v6;
        this.f194513c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C32210f(this.f194511a.get(), (AK0.l) this.f194512b.get(), this.f194513c.get());
    }
}
