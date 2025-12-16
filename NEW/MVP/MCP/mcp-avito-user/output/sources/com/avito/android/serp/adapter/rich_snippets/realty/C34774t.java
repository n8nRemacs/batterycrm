package com.avito.android.serp.adapter.rich_snippets.realty;

import com.avito.android.C36135w2;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.Kundle;
import javax.inject.Provider;

/* compiled from: DevelopmentRichItemPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.serp.adapter.rich_snippets.realty.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34774t implements dagger.internal.h<C34773s> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f271010a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f271011b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f271012c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<C36135w2> f271013d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.account.E> f271014e;

    public C34774t(dagger.internal.f fVar, dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3) {
        this.f271010a = fVar;
        this.f271011b = provider;
        this.f271012c = lVar;
        this.f271013d = provider2;
        this.f271014e = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C34773s(dagger.internal.g.b(this.f271010a), this.f271011b.get(), (Kundle) this.f271012c.f393949a, this.f271013d.get(), this.f271014e.get());
    }
}
