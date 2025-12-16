package com.avito.android.di.module;

import com.avito.android.C30277e1;
import com.avito.android.C30713g1;
import javax.inject.Provider;

/* compiled from: MessengerInfoModule_ProvideMessengerInfoProviderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class L5 implements dagger.internal.h<com.avito.android.messenger.service.d> {

    /* renamed from: a, reason: collision with root package name */
    public final K5 f144044a;

    /* renamed from: b, reason: collision with root package name */
    public final C30713g1 f144045b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.S f144046c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.util.C> f144047d;

    public L5(K5 k52, C30713g1 c30713g1, com.avito.android.S s5, Provider provider) {
        this.f144044a = k52;
        this.f144045b = c30713g1;
        this.f144046c = s5;
        this.f144047d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C30277e1 c30277e1 = (C30277e1) this.f144045b.get();
        com.avito.android.P p12 = (com.avito.android.P) this.f144046c.get();
        com.avito.android.util.C c12 = this.f144047d.get();
        this.f144044a.getClass();
        return new com.avito.android.messenger.service.e(c30277e1, p12, c12);
    }
}
