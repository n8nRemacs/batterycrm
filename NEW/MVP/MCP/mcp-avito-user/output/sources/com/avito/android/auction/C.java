package com.avito.android.auction;

import Pd.InterfaceC14769a;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import lD.C43617a;
import lD.C43619c;
import sj0.InterfaceC48373a;

/* compiled from: SendDraftToAuctionInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class C implements dagger.internal.h<B> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC14769a> f92312a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC48373a> f92313b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f92314c;

    /* renamed from: d, reason: collision with root package name */
    public final C43619c f92315d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.f f92316e;

    public C(Provider provider, Provider provider2, Provider provider3, C43619c c43619c, dagger.internal.f fVar) {
        this.f92312a = provider;
        this.f92313b = provider2;
        this.f92314c = provider3;
        this.f92315d = c43619c;
        this.f92316e = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new B(this.f92312a.get(), this.f92313b.get(), this.f92314c.get(), (C43617a) this.f92315d.get(), (com.avito.android.deep_linking.x) this.f92316e.get());
    }
}
