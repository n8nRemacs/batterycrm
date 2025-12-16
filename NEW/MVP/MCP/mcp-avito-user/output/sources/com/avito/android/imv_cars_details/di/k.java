package com.avito.android.imv_cars_details.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ImvCarsDetailsItemModule_Companion_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class k implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.imv_cars_details.presentation.items.price_description.e f169944a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.imv_cars_details.presentation.items.all_affecting_params.b f169945b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.imv_cars_details.presentation.items.title_Item.b f169946c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.imv_chart.f> f169947d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.imv_cars_details.presentation.items.imv_cars_line_chart.b f169948e;

    /* renamed from: f, reason: collision with root package name */
    public final com.avito.android.imv_cars_details.presentation.items.imv_cars_details_neighbors_list.b f169949f;

    /* renamed from: g, reason: collision with root package name */
    public final com.avito.android.imv_cars_details.presentation.items.imv_cars_details_poll_item.b f169950g;

    /* renamed from: h, reason: collision with root package name */
    public final com.avito.android.imv_cars_details.presentation.items.difference_imv_avg_price.b f169951h;

    /* renamed from: i, reason: collision with root package name */
    public final com.avito.android.imv_cars_details.presentation.items.text_block_item.b f169952i;

    /* renamed from: j, reason: collision with root package name */
    public final com.avito.android.imv_cars_details.presentation.items.seller_comment.b f169953j;

    /* renamed from: k, reason: collision with root package name */
    public final com.avito.android.imv_cars_details.presentation.items.imv_autoteka_teaser.b f169954k;

    /* renamed from: l, reason: collision with root package name */
    public final com.avito.android.advert_details_items.imv_v4_cars.e f169955l;

    public k(com.avito.android.imv_cars_details.presentation.items.price_description.e eVar, com.avito.android.imv_cars_details.presentation.items.all_affecting_params.b bVar, com.avito.android.imv_cars_details.presentation.items.title_Item.b bVar2, Provider provider, com.avito.android.imv_cars_details.presentation.items.imv_cars_line_chart.b bVar3, com.avito.android.imv_cars_details.presentation.items.imv_cars_details_neighbors_list.b bVar4, com.avito.android.imv_cars_details.presentation.items.imv_cars_details_poll_item.b bVar5, com.avito.android.imv_cars_details.presentation.items.difference_imv_avg_price.b bVar6, com.avito.android.imv_cars_details.presentation.items.text_block_item.b bVar7, com.avito.android.imv_cars_details.presentation.items.seller_comment.b bVar8, com.avito.android.imv_cars_details.presentation.items.imv_autoteka_teaser.b bVar9, com.avito.android.advert_details_items.imv_v4_cars.e eVar2) {
        this.f169944a = eVar;
        this.f169945b = bVar;
        this.f169946c = bVar2;
        this.f169947d = provider;
        this.f169948e = bVar3;
        this.f169949f = bVar4;
        this.f169950g = bVar5;
        this.f169951h = bVar6;
        this.f169952i = bVar7;
        this.f169953j = bVar8;
        this.f169954k = bVar9;
        this.f169955l = eVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.imv_cars_details.presentation.items.price_description.d dVar = (com.avito.android.imv_cars_details.presentation.items.price_description.d) this.f169944a.get();
        com.avito.android.imv_cars_details.presentation.items.all_affecting_params.a aVar = (com.avito.android.imv_cars_details.presentation.items.all_affecting_params.a) this.f169945b.get();
        com.avito.android.imv_cars_details.presentation.items.title_Item.a aVar2 = (com.avito.android.imv_cars_details.presentation.items.title_Item.a) this.f169946c.get();
        com.avito.android.imv_chart.f fVar = this.f169947d.get();
        com.avito.android.imv_cars_details.presentation.items.imv_cars_line_chart.a aVar3 = (com.avito.android.imv_cars_details.presentation.items.imv_cars_line_chart.a) this.f169948e.get();
        com.avito.android.imv_cars_details.presentation.items.imv_cars_details_neighbors_list.a aVar4 = (com.avito.android.imv_cars_details.presentation.items.imv_cars_details_neighbors_list.a) this.f169949f.get();
        com.avito.android.imv_cars_details.presentation.items.imv_cars_details_poll_item.a aVar5 = (com.avito.android.imv_cars_details.presentation.items.imv_cars_details_poll_item.a) this.f169950g.get();
        com.avito.android.imv_cars_details.presentation.items.difference_imv_avg_price.a aVar6 = (com.avito.android.imv_cars_details.presentation.items.difference_imv_avg_price.a) this.f169951h.get();
        com.avito.android.imv_cars_details.presentation.items.text_block_item.a aVar7 = (com.avito.android.imv_cars_details.presentation.items.text_block_item.a) this.f169952i.get();
        com.avito.android.imv_cars_details.presentation.items.seller_comment.a aVar8 = (com.avito.android.imv_cars_details.presentation.items.seller_comment.a) this.f169953j.get();
        com.avito.android.imv_cars_details.presentation.items.imv_autoteka_teaser.a aVar9 = (com.avito.android.imv_cars_details.presentation.items.imv_autoteka_teaser.a) this.f169954k.get();
        com.avito.android.advert_details_items.imv_v4_cars.d dVar2 = (com.avito.android.advert_details_items.imv_v4_cars.d) this.f169955l.get();
        h.f169940a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(dVar);
        c10493a.b(aVar);
        c10493a.b(aVar2);
        c10493a.b(fVar);
        c10493a.b(aVar3);
        c10493a.b(aVar4);
        c10493a.b(aVar5);
        c10493a.b(aVar6);
        c10493a.b(aVar7);
        c10493a.b(aVar8);
        c10493a.b(aVar9);
        c10493a.b(dVar2);
        return c10493a.a();
    }
}
