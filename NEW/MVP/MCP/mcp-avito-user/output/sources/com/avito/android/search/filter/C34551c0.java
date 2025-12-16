package com.avito.android.search.filter;

import com.avito.android.I1;
import com.avito.android.geo_common.interactor.InterfaceC30715a;
import com.avito.android.permissions.InterfaceC33034d;
import com.avito.android.remote.model.Category;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParameters;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.remote.model.search.map.Area;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import com.avito.android.util.P2;
import java.util.List;
import javax.inject.Provider;
import lW.InterfaceC43691a;

/* compiled from: FiltersInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.search.filter.c0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34551c0 implements dagger.internal.h<E> {

    /* renamed from: A, reason: collision with root package name */
    public final dagger.internal.u f262661A;

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f262662a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f262663b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f262664c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f262665d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f262666e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC34547b> f262667f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<C1> f262668g;

    /* renamed from: h, reason: collision with root package name */
    public final dagger.internal.l f262669h;

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.l f262670i;

    /* renamed from: j, reason: collision with root package name */
    public final dagger.internal.l f262671j;

    /* renamed from: k, reason: collision with root package name */
    public final dagger.internal.l f262672k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<SearchParamsConverter> f262673l;

    /* renamed from: m, reason: collision with root package name */
    public final Provider<w1> f262674m;

    /* renamed from: n, reason: collision with root package name */
    public final dagger.internal.u f262675n;

    /* renamed from: o, reason: collision with root package name */
    public final dagger.internal.u f262676o;

    /* renamed from: p, reason: collision with root package name */
    public final dagger.internal.u f262677p;

    /* renamed from: q, reason: collision with root package name */
    public final dagger.internal.u f262678q;

    /* renamed from: r, reason: collision with root package name */
    public final dagger.internal.l f262679r;

    /* renamed from: s, reason: collision with root package name */
    public final Provider<InterfaceC33034d> f262680s;

    /* renamed from: t, reason: collision with root package name */
    public final Provider<com.avito.android.location.find.l> f262681t;

    /* renamed from: u, reason: collision with root package name */
    public final Provider<InterfaceC43691a> f262682u;

    /* renamed from: v, reason: collision with root package name */
    public final dagger.internal.l f262683v;

    /* renamed from: w, reason: collision with root package name */
    public final dagger.internal.l f262684w;

    /* renamed from: x, reason: collision with root package name */
    public final Provider<InterfaceC34565e> f262685x;

    /* renamed from: y, reason: collision with root package name */
    public final Provider<com.avito.android.search.filter.analytics.c> f262686y;

    /* renamed from: z, reason: collision with root package name */
    public final Provider<com.avito.android.preloading.j<com.avito.android.search.filter.preloading.c, kotlin.Q<List<Category>, P2<SearchParameters>>>> f262687z;

    public C34551c0(dagger.internal.u uVar, dagger.internal.u uVar2, dagger.internal.u uVar3, dagger.internal.u uVar4, dagger.internal.u uVar5, Provider provider, Provider provider2, dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3, dagger.internal.l lVar4, Provider provider3, Provider provider4, dagger.internal.u uVar6, dagger.internal.u uVar7, dagger.internal.u uVar8, dagger.internal.u uVar9, dagger.internal.l lVar5, Provider provider5, Provider provider6, Provider provider7, dagger.internal.l lVar6, dagger.internal.l lVar7, Provider provider8, Provider provider9, Provider provider10, dagger.internal.u uVar10) {
        this.f262662a = uVar;
        this.f262663b = uVar2;
        this.f262664c = uVar3;
        this.f262665d = uVar4;
        this.f262666e = uVar5;
        this.f262667f = provider;
        this.f262668g = provider2;
        this.f262669h = lVar;
        this.f262670i = lVar2;
        this.f262671j = lVar3;
        this.f262672k = lVar4;
        this.f262673l = provider3;
        this.f262674m = provider4;
        this.f262675n = uVar6;
        this.f262676o = uVar7;
        this.f262677p = uVar8;
        this.f262678q = uVar9;
        this.f262679r = lVar5;
        this.f262680s = provider5;
        this.f262681t = provider6;
        this.f262682u = provider7;
        this.f262683v = lVar6;
        this.f262684w = lVar7;
        this.f262685x = provider8;
        this.f262686y = provider9;
        this.f262687z = provider10;
        this.f262661A = uVar10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.categories.a aVar = (com.avito.android.categories.a) this.f262662a.get();
        com.avito.android.geo_common.interactor.B b12 = (com.avito.android.geo_common.interactor.B) this.f262663b.get();
        InterfaceC30715a interfaceC30715a = (InterfaceC30715a) this.f262664c.get();
        com.avito.android.geo_common.interactor.g gVar = (com.avito.android.geo_common.interactor.g) this.f262665d.get();
        h31.e eVarB = dagger.internal.g.b(this.f262666e);
        InterfaceC34547b interfaceC34547b = this.f262667f.get();
        C1 c12 = this.f262668g.get();
        SearchParams searchParams = (SearchParams) this.f262669h.f393949a;
        Area area = (Area) this.f262670i.f393949a;
        String str = (String) this.f262671j.f393949a;
        PresentationType presentationType = (PresentationType) this.f262672k.f393949a;
        SearchParamsConverter searchParamsConverter = this.f262673l.get();
        w1 w1Var = this.f262674m.get();
        com.avito.android.remote.error.f fVar = (com.avito.android.remote.error.f) this.f262675n.get();
        InterfaceC35745a5 interfaceC35745a5 = (InterfaceC35745a5) this.f262676o.get();
        I1 i12 = (I1) this.f262677p.get();
        return new E(aVar, b12, interfaceC30715a, gVar, eVarB, interfaceC34547b, c12, searchParams, area, str, presentationType, searchParamsConverter, w1Var, fVar, interfaceC35745a5, i12, (Kundle) this.f262679r.f393949a, this.f262680s.get(), this.f262681t.get(), this.f262682u.get(), (FiltersMode) this.f262683v.f393949a, (String) this.f262684w.f393949a, this.f262685x.get(), this.f262686y.get(), this.f262687z.get(), (com.avito.android.search.filter.interactor.d) this.f262661A.get());
    }
}
