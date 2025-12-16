package com.avito.android.search.filter.location_filter.di;

import android.content.res.Resources;
import com.avito.android.C0;
import com.avito.android.C34160q2;
import com.avito.android.search.filter.location_filter.di.a;
import com.avito.android.util.InterfaceC35945t1;
import com.avito.android.util.P3;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Locale;
import javax.inject.Provider;

/* compiled from: LocationFiltersModule_ProvideCategoryParametersElementConverter$_avito_search_filter_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class l implements dagger.internal.h<com.avito.android.search.filter.converter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final P3 f263617a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.f> f263618b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Locale> f263619c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<C34160q2> f263620d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f263621e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<hJ.e> f263622f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<hJ.g> f263623g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<C0> f263624h;

    public l(P3 p32, Provider provider, Provider provider2, Provider provider3, dagger.internal.l lVar, Provider provider4, Provider provider5, Provider provider6) {
        this.f263617a = p32;
        this.f263618b = provider;
        this.f263619c = provider2;
        this.f263620d = provider3;
        this.f263621e = lVar;
        this.f263622f = provider4;
        this.f263623g = provider5;
        this.f263624h = provider6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC35945t1 interfaceC35945t1 = (InterfaceC35945t1) this.f263617a.get();
        com.avito.android.server_time.f fVar = (com.avito.android.server_time.f) ((a.c.x) this.f263618b).get();
        Locale locale = ((a.c.k) this.f263619c).f263580a.locale();
        C34160q2 c34160q2G3 = ((a.c.w) this.f263620d).f263592a.G3();
        Resources resources = (Resources) this.f263621e.f393949a;
        hJ.e eVar = (hJ.e) ((a.c.i) this.f263622f).get();
        hJ.g gVar = (hJ.g) ((a.c.j) this.f263623g).get();
        C0 c0T0 = ((a.c.g) this.f263624h).f263576a.T0();
        k kVar = k.f263616a;
        kotlin.reflect.n<Object> nVar = C0.f67235e[2];
        return new com.avito.android.search.filter.converter.j(interfaceC35945t1, resources, fVar, locale, false, gVar, eVar, false, c34160q2G3, ((Boolean) c0T0.f67238d.a().invoke()).booleanValue(), 128, null);
    }
}
