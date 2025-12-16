package com.avito.android.search.filter.di;

import android.content.res.Resources;
import com.avito.android.C0;
import com.avito.android.C34160q2;
import com.avito.android.search.filter.di.a;
import com.avito.android.util.InterfaceC35945t1;
import com.avito.android.util.P3;
import java.util.Locale;
import javax.inject.Provider;

/* compiled from: FiltersModule_ProvideCategoryParametersElementConverter$_avito_search_filter_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class p implements dagger.internal.h<com.avito.android.search.filter.converter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final P3 f263273a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.f> f263274b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Locale> f263275c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<C34160q2> f263276d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f263277e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f263278f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<hJ.e> f263279g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<hJ.g> f263280h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<C0> f263281i;

    public p(P3 p32, Provider provider, Provider provider2, Provider provider3, dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider4, Provider provider5, Provider provider6) {
        this.f263273a = p32;
        this.f263274b = provider;
        this.f263275c = provider2;
        this.f263276d = provider3;
        this.f263277e = lVar;
        this.f263278f = lVar2;
        this.f263279g = provider4;
        this.f263280h = provider5;
        this.f263281i = provider6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC35945t1 interfaceC35945t1 = (InterfaceC35945t1) this.f263273a.get();
        com.avito.android.server_time.f fVar = (com.avito.android.server_time.f) ((a.c.H) this.f263274b).get();
        Locale locale = ((a.c.t) this.f263275c).f263216a.locale();
        C34160q2 c34160q2G3 = ((a.c.G) this.f263276d).f263193a.G3();
        boolean zBooleanValue = ((Boolean) this.f263277e.f393949a).booleanValue();
        Resources resources = (Resources) this.f263278f.f393949a;
        hJ.e eVar = (hJ.e) ((a.c.r) this.f263279g).get();
        hJ.g gVar = (hJ.g) ((a.c.s) this.f263280h).get();
        C0 c0T0 = ((a.c.o) this.f263281i).f263211a.T0();
        o oVar = o.f263272a;
        kotlin.reflect.n<Object> nVar = C0.f67235e[2];
        return new com.avito.android.search.filter.converter.j(interfaceC35945t1, resources, fVar, locale, zBooleanValue, gVar, eVar, false, c34160q2G3, ((Boolean) c0T0.f67238d.a().invoke()).booleanValue(), 128, null);
    }
}
