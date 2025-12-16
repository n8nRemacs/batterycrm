package com.avito.android.comparison.mvi;

import Pq.InterfaceC14826a;
import com.avito.android.comparison.ComparisonFragmentMvi;
import javax.inject.Provider;

/* compiled from: ComparisonActor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.comparison.domain.a> f124149a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f124150b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Sq.g> f124151c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.comparison.e> f124152d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f124153e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC14826a> f124154f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.u f124155g;

    public n(dagger.internal.l lVar, dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f124149a = provider;
        this.f124150b = lVar;
        this.f124151c = provider2;
        this.f124152d = provider3;
        this.f124153e = provider4;
        this.f124154f = provider5;
        this.f124155g = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new m(this.f124149a.get(), (ComparisonFragmentMvi.a) this.f124150b.f393949a, this.f124151c.get(), this.f124152d.get(), this.f124153e.get(), this.f124154f.get(), (io.reactivex.rxjava3.subjects.b) this.f124155g.get());
    }
}
