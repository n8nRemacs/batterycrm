package com.avito.android.bxcontent.last_search_tooltip;

import com.avito.android.C36135w2;
import com.avito.android.account.E;
import com.avito.android.bxcontent.N1;
import com.avito.android.remote.model.SearchParamsConverter;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import ks0.InterfaceC43493a;

/* compiled from: LastSearchTooltipInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC43493a> f111177a;

    /* renamed from: b, reason: collision with root package name */
    public final l f111178b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<N1> f111179c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.timestamp_storage.domain.d> f111180d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<E> f111181e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<SearchParamsConverter> f111182f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<C36135w2> f111183g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<BE0.a> f111184h;

    public h(Provider provider, l lVar, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.f111177a = provider;
        this.f111178b = lVar;
        this.f111179c = provider2;
        this.f111180d = provider3;
        this.f111181e = provider4;
        this.f111182f = provider5;
        this.f111183g = provider6;
        this.f111184h = provider7;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC43493a interfaceC43493a = this.f111177a.get();
        this.f111178b.getClass();
        return new c(interfaceC43493a, new k(), this.f111179c.get(), this.f111180d.get(), this.f111181e.get(), this.f111182f.get(), this.f111183g.get(), this.f111184h.get());
    }
}
