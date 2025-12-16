package com.avito.android.map.view.adverts_in_pin;

import com.avito.android.serp.adapter.Y0;
import com.avito.android.serp.adapter.h1;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertsInPinViewBinder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map/view/adverts_in_pin/c;", "Lcom/avito/android/map/view/adverts_in_pin/b;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f185368a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.favorite.n f185369b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.viewed.f f185370c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y0 f185371d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final h1 f185372e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.retry.a f185373f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.floating_views.f f185374g;

    @Inject
    public c(@com.avito.android.map.di.a @Y61.k com.avito.konveyor.adapter.a aVar, @com.avito.android.map.di.a @Y61.k com.avito.android.favorite.n nVar, @com.avito.android.map.di.a @Y61.k com.avito.android.advert.viewed.f fVar, @com.avito.android.map.di.a @Y61.k Y0 y02, @com.avito.android.map.di.a @Y61.k h1 h1Var, @com.avito.android.map.di.a @Y61.k com.avito.android.serp.adapter.retry.a aVar2, @Y61.k com.avito.android.floating_views.f fVar2) {
        this.f185368a = aVar;
        this.f185369b = nVar;
        this.f185370c = fVar;
        this.f185371d = y02;
        this.f185372e = h1Var;
        this.f185373f = aVar2;
        this.f185374g = fVar2;
        y02.f(aVar2);
    }

    @Override // com.avito.android.map_core.view.pin_items.g
    public final void a() {
        this.f185369b.I();
        this.f185370c.e0();
        this.f185374g.a();
    }

    @Override // com.avito.android.map_core.view.pin_items.e
    public final void b(@Y61.k UV0.c cVar, int i12) {
        Y0 y02 = this.f185371d;
        y02.e(i12);
        y02.c(cVar);
        this.f185368a.c(cVar);
        h1 h1Var = this.f185372e;
        h1Var.e(i12);
        h1Var.c(cVar);
        this.f185369b.c(cVar);
        this.f185370c.c(cVar);
    }

    @Override // com.avito.android.map_core.view.pin_items.g
    public final void c(@Y61.k com.avito.android.map_core.view.pin_items.f fVar) {
        this.f185369b.s4(fVar);
        this.f185370c.d(fVar);
        com.avito.android.floating_views.f fVar2 = this.f185374g;
        fVar2.g(this.f185373f);
        fVar2.c(fVar);
    }
}
