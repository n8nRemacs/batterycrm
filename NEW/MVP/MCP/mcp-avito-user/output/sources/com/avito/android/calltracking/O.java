package com.avito.android.calltracking;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: CalltrackingViewModelFactory_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class O implements dagger.internal.h<N> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC29293v> f113595a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.calltracking_core.f> f113596b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f113597c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f113598d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f113599e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.account.E> f113600f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f113601g;

    public O(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.f113595a = provider;
        this.f113596b = provider2;
        this.f113597c = provider3;
        this.f113598d = provider4;
        this.f113599e = lVar;
        this.f113600f = provider5;
        this.f113601g = provider6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC29293v interfaceC29293v = this.f113595a.get();
        com.avito.android.calltracking_core.f fVar = this.f113596b.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f113597c.get();
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f113598d.get();
        return new N(this.f113600f.get(), this.f113601g.get(), interfaceC29293v, (CalltrackingScreenType) this.f113599e.f393949a, fVar, aVar, interfaceC35745a5);
    }
}
