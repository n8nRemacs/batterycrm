package com.avito.android.search.filter.location_filter;

import android.os.Bundle;
import com.avito.android.B2;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.search.filter.FiltersInteractor;
import com.avito.android.search.filter.InterfaceC34581l;
import com.avito.android.search.filter.di.w;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import gq0.InterfaceC40721a;
import javax.inject.Provider;

/* compiled from: LocationFiltersPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class s implements dagger.internal.h<r> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<FiltersInteractor> f263680a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f263681b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC34581l> f263682c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.recycler.data_aware.c> f263683d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.search.filter.converter.j> f263684e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f263685f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.search.filter.analytics.c> f263686g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC40721a> f263687h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<com.avito.android.search.filter.tracker.a> f263688i;

    /* renamed from: j, reason: collision with root package name */
    public final dagger.internal.l f263689j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<com.avito.android.location.r> f263690k;

    /* renamed from: l, reason: collision with root package name */
    public final dagger.internal.u f263691l;

    /* renamed from: m, reason: collision with root package name */
    public final Provider<w> f263692m;

    /* renamed from: n, reason: collision with root package name */
    public final Provider<B2> f263693n;

    public s(Provider provider, dagger.internal.l lVar, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, dagger.internal.l lVar2, Provider provider9, dagger.internal.u uVar, Provider provider10, Provider provider11) {
        this.f263680a = provider;
        this.f263681b = lVar;
        this.f263682c = provider2;
        this.f263683d = provider3;
        this.f263684e = provider4;
        this.f263685f = provider5;
        this.f263686g = provider6;
        this.f263687h = provider7;
        this.f263688i = provider8;
        this.f263689j = lVar2;
        this.f263690k = provider9;
        this.f263691l = uVar;
        this.f263692m = provider10;
        this.f263693n = provider11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new r(this.f263680a.get(), (SearchParams) this.f263681b.f393949a, this.f263682c.get(), this.f263683d.get(), this.f263684e.get(), this.f263685f.get(), this.f263686g.get(), this.f263687h.get(), this.f263688i.get(), (Bundle) this.f263689j.f393949a, this.f263690k.get(), (com.avito.android.select.x) this.f263691l.get(), this.f263692m.get(), this.f263693n.get());
    }
}
