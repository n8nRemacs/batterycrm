package com.avito.android.advert.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: AdvertFragmentModule_ProvideTabbedDetailsItemBinder$_avito_advert_details_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class m0 implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: A, reason: collision with root package name */
    public final com.avito.android.advert.item.modelSpecs.button.b f69419A;

    /* renamed from: B, reason: collision with root package name */
    public final M f69420B;

    /* renamed from: C, reason: collision with root package name */
    public final L f69421C;

    /* renamed from: D, reason: collision with root package name */
    public final com.avito.android.rating_ui.attributed_text.d f69422D;

    /* renamed from: E, reason: collision with root package name */
    public final com.avito.android.advert_core.equipments.redesign.b f69423E;

    /* renamed from: F, reason: collision with root package name */
    public final com.avito.android.serp.adapter.images_and_links_item.c f69424F;

    /* renamed from: G, reason: collision with root package name */
    public final C27704m f69425G;

    /* renamed from: H, reason: collision with root package name */
    public final com.avito.android.advert.item.hotel.hotel_description.b f69426H;

    /* renamed from: I, reason: collision with root package name */
    public final com.avito.android.advert.item.hotel.hotel_promo_widget.b f69427I;

    /* renamed from: J, reason: collision with root package name */
    public final com.avito.android.advert.item.hotel.hotel_review.b f69428J;

    /* renamed from: K, reason: collision with root package name */
    public final com.avito.android.advert_details_items.geo_zones.b f69429K;

    /* renamed from: L, reason: collision with root package name */
    public final com.avito.android.advert_details_items.work_time.b f69430L;

    /* renamed from: M, reason: collision with root package name */
    public final com.avito.android.advert.item.beduin_block.d f69431M;

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.advert.item.complementary.i f69432a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.section.complementary.j f69433b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.advert_details_items.description.b f69434c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.advert_details_items.description.restyle.b f69435d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.advert_details_items.description.hotel_redesign.b f69436e;

    /* renamed from: f, reason: collision with root package name */
    public final com.avito.android.advert_details_items.address.b f69437f;

    /* renamed from: g, reason: collision with root package name */
    public final com.avito.android.advert.item.groups.b f69438g;

    /* renamed from: h, reason: collision with root package name */
    public final com.avito.android.advert.item.styled_title.b f69439h;

    /* renamed from: i, reason: collision with root package name */
    public final com.avito.android.advert_details_items.flats.b f69440i;

    /* renamed from: j, reason: collision with root package name */
    public final com.avito.android.advert_details_items.flats.restyle.b f69441j;

    /* renamed from: k, reason: collision with root package name */
    public final com.avito.android.advert_details_items.flats.auto_flats_redesign.k f69442k;

    /* renamed from: l, reason: collision with root package name */
    public final com.avito.android.advert.item.note.b f69443l;

    /* renamed from: m, reason: collision with root package name */
    public final com.avito.android.advert_core.block_header.b f69444m;

    /* renamed from: n, reason: collision with root package name */
    public final com.avito.android.advert_core.gap.b f69445n;

    /* renamed from: o, reason: collision with root package name */
    public final com.avito.android.advert_core.divider.b f69446o;

    /* renamed from: p, reason: collision with root package name */
    public final com.avito.android.advert.item.skeleton.b f69447p;

    /* renamed from: q, reason: collision with root package name */
    public final com.avito.android.advert_details_items.show_description_button.b f69448q;

    /* renamed from: r, reason: collision with root package name */
    public final dagger.internal.A f69449r;

    /* renamed from: s, reason: collision with root package name */
    public final com.avito.android.advert.item.compatibility.v2.e f69450s;

    /* renamed from: t, reason: collision with root package name */
    public final com.avito.android.advert.item.compatibility.v3.i f69451t;

    /* renamed from: u, reason: collision with root package name */
    public final com.avito.android.advert.item.compatibility.v4.e f69452u;

    /* renamed from: v, reason: collision with root package name */
    public final com.avito.android.advert.item.header.b f69453v;

    /* renamed from: w, reason: collision with root package name */
    public final com.avito.android.serp.adapter.recomendations.b f69454w;

    /* renamed from: x, reason: collision with root package name */
    public final com.avito.android.serp.adapter.recomendations.restyle.b f69455x;

    /* renamed from: y, reason: collision with root package name */
    public final com.avito.android.advert.item.modelSpecs.link.b f69456y;

    /* renamed from: z, reason: collision with root package name */
    public final com.avito.android.advert.item.modelSpecs.link.restyle.b f69457z;

    public m0(com.avito.android.advert.item.complementary.i iVar, com.avito.android.section.complementary.j jVar, com.avito.android.advert_details_items.description.b bVar, com.avito.android.advert_details_items.description.restyle.b bVar2, com.avito.android.advert_details_items.description.hotel_redesign.b bVar3, com.avito.android.advert_details_items.address.b bVar4, com.avito.android.advert.item.groups.b bVar5, com.avito.android.advert.item.styled_title.b bVar6, com.avito.android.advert_details_items.flats.b bVar7, com.avito.android.advert_details_items.flats.restyle.b bVar8, com.avito.android.advert_details_items.flats.auto_flats_redesign.k kVar, com.avito.android.advert.item.note.b bVar9, com.avito.android.advert_core.block_header.b bVar10, com.avito.android.advert_core.gap.b bVar11, com.avito.android.advert_core.divider.b bVar12, com.avito.android.advert.item.skeleton.b bVar13, com.avito.android.advert_details_items.show_description_button.b bVar14, dagger.internal.A a12, com.avito.android.advert.item.compatibility.v2.e eVar, com.avito.android.advert.item.compatibility.v3.i iVar2, com.avito.android.advert.item.compatibility.v4.e eVar2, com.avito.android.advert.item.header.b bVar15, com.avito.android.serp.adapter.recomendations.b bVar16, com.avito.android.serp.adapter.recomendations.restyle.b bVar17, com.avito.android.advert.item.modelSpecs.link.b bVar18, com.avito.android.advert.item.modelSpecs.link.restyle.b bVar19, com.avito.android.advert.item.modelSpecs.button.b bVar20, M m12, L l12, com.avito.android.rating_ui.attributed_text.d dVar, com.avito.android.advert_core.equipments.redesign.b bVar21, com.avito.android.serp.adapter.images_and_links_item.c cVar, C27704m c27704m, com.avito.android.advert.item.hotel.hotel_description.b bVar22, com.avito.android.advert.item.hotel.hotel_promo_widget.b bVar23, com.avito.android.advert.item.hotel.hotel_review.b bVar24, com.avito.android.advert_details_items.geo_zones.b bVar25, com.avito.android.advert_details_items.work_time.b bVar26, com.avito.android.advert.item.beduin_block.d dVar2) {
        this.f69432a = iVar;
        this.f69433b = jVar;
        this.f69434c = bVar;
        this.f69435d = bVar2;
        this.f69436e = bVar3;
        this.f69437f = bVar4;
        this.f69438g = bVar5;
        this.f69439h = bVar6;
        this.f69440i = bVar7;
        this.f69441j = bVar8;
        this.f69442k = kVar;
        this.f69443l = bVar9;
        this.f69444m = bVar10;
        this.f69445n = bVar11;
        this.f69446o = bVar12;
        this.f69447p = bVar13;
        this.f69448q = bVar14;
        this.f69449r = a12;
        this.f69450s = eVar;
        this.f69451t = iVar2;
        this.f69452u = eVar2;
        this.f69453v = bVar15;
        this.f69454w = bVar16;
        this.f69455x = bVar17;
        this.f69456y = bVar18;
        this.f69457z = bVar19;
        this.f69419A = bVar20;
        this.f69420B = m12;
        this.f69421C = l12;
        this.f69422D = dVar;
        this.f69423E = bVar21;
        this.f69424F = cVar;
        this.f69425G = c27704m;
        this.f69426H = bVar22;
        this.f69427I = bVar23;
        this.f69428J = bVar24;
        this.f69429K = bVar25;
        this.f69430L = bVar26;
        this.f69431M = dVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.advert.item.complementary.h hVar = (com.avito.android.advert.item.complementary.h) this.f69432a.get();
        com.avito.android.section.complementary.i iVar = (com.avito.android.section.complementary.i) this.f69433b.get();
        com.avito.android.advert_details_items.description.a aVar = (com.avito.android.advert_details_items.description.a) this.f69434c.get();
        com.avito.android.advert_details_items.description.restyle.a aVar2 = (com.avito.android.advert_details_items.description.restyle.a) this.f69435d.get();
        com.avito.android.advert_details_items.description.hotel_redesign.a aVar3 = (com.avito.android.advert_details_items.description.hotel_redesign.a) this.f69436e.get();
        com.avito.android.advert_details_items.address.a aVar4 = (com.avito.android.advert_details_items.address.a) this.f69437f.get();
        com.avito.android.advert.item.groups.a aVar5 = (com.avito.android.advert.item.groups.a) this.f69438g.get();
        com.avito.android.advert.item.styled_title.a aVar6 = (com.avito.android.advert.item.styled_title.a) this.f69439h.get();
        com.avito.android.advert_details_items.flats.a aVar7 = (com.avito.android.advert_details_items.flats.a) this.f69440i.get();
        com.avito.android.advert_details_items.flats.restyle.a aVar8 = (com.avito.android.advert_details_items.flats.restyle.a) this.f69441j.get();
        com.avito.android.advert_details_items.flats.auto_flats_redesign.j jVar = (com.avito.android.advert_details_items.flats.auto_flats_redesign.j) this.f69442k.get();
        com.avito.android.advert.item.note.a aVar9 = (com.avito.android.advert.item.note.a) this.f69443l.get();
        com.avito.android.advert_core.block_header.a aVar10 = (com.avito.android.advert_core.block_header.a) this.f69444m.get();
        com.avito.android.advert_core.gap.a aVar11 = (com.avito.android.advert_core.gap.a) this.f69445n.get();
        com.avito.android.advert_core.divider.a aVar12 = (com.avito.android.advert_core.divider.a) this.f69446o.get();
        com.avito.android.advert.item.skeleton.a aVar13 = (com.avito.android.advert.item.skeleton.a) this.f69447p.get();
        com.avito.android.advert_details_items.show_description_button.a aVar14 = (com.avito.android.advert_details_items.show_description_button.a) this.f69448q.get();
        Set set = (Set) this.f69449r.get();
        com.avito.android.advert.item.compatibility.v2.d dVar = (com.avito.android.advert.item.compatibility.v2.d) this.f69450s.get();
        com.avito.android.advert.item.compatibility.v3.h hVar2 = (com.avito.android.advert.item.compatibility.v3.h) this.f69451t.get();
        com.avito.android.advert.item.compatibility.v4.d dVar2 = (com.avito.android.advert.item.compatibility.v4.d) this.f69452u.get();
        com.avito.android.advert.item.header.a aVar15 = (com.avito.android.advert.item.header.a) this.f69453v.get();
        com.avito.android.serp.adapter.recomendations.a aVar16 = (com.avito.android.serp.adapter.recomendations.a) this.f69454w.get();
        com.avito.android.serp.adapter.recomendations.restyle.a aVar17 = (com.avito.android.serp.adapter.recomendations.restyle.a) this.f69455x.get();
        com.avito.android.advert.item.modelSpecs.link.a aVar18 = (com.avito.android.advert.item.modelSpecs.link.a) this.f69456y.get();
        com.avito.android.advert.item.modelSpecs.link.restyle.a aVar19 = (com.avito.android.advert.item.modelSpecs.link.restyle.a) this.f69457z.get();
        com.avito.android.advert.item.modelSpecs.button.a aVar20 = (com.avito.android.advert.item.modelSpecs.button.a) this.f69419A.get();
        com.avito.android.advert_core.expand_items_button.d dVar3 = (com.avito.android.advert_core.expand_items_button.d) this.f69420B.get();
        com.avito.android.advert_core.expand_items_button.a aVar21 = (com.avito.android.advert_core.expand_items_button.a) this.f69421C.get();
        com.avito.android.rating_ui.attributed_text.c cVar = (com.avito.android.rating_ui.attributed_text.c) this.f69422D.get();
        com.avito.android.advert_core.equipments.redesign.a aVar22 = (com.avito.android.advert_core.equipments.redesign.a) this.f69423E.get();
        com.avito.android.serp.adapter.images_and_links_item.b bVar = (com.avito.android.serp.adapter.images_and_links_item.b) this.f69424F.get();
        com.avito.android.advert.item.multi_item.a aVar23 = (com.avito.android.advert.item.multi_item.a) this.f69425G.get();
        com.avito.android.advert.item.hotel.hotel_description.a aVar24 = (com.avito.android.advert.item.hotel.hotel_description.a) this.f69426H.get();
        com.avito.android.advert.item.hotel.hotel_promo_widget.a aVar25 = (com.avito.android.advert.item.hotel.hotel_promo_widget.a) this.f69427I.get();
        com.avito.android.advert.item.hotel.hotel_review.a aVar26 = (com.avito.android.advert.item.hotel.hotel_review.a) this.f69428J.get();
        com.avito.android.advert_details_items.geo_zones.a aVar27 = (com.avito.android.advert_details_items.geo_zones.a) this.f69429K.get();
        com.avito.android.advert_details_items.work_time.a aVar28 = (com.avito.android.advert_details_items.work_time.a) this.f69430L.get();
        List list = (List) this.f69431M.get();
        C27710t.f69463a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(hVar);
        c10493a.b(iVar);
        c10493a.b(aVar);
        c10493a.b(aVar2);
        c10493a.b(aVar3);
        c10493a.b(aVar4);
        c10493a.b(aVar5);
        c10493a.b(aVar6);
        c10493a.b(aVar7);
        c10493a.b(aVar8);
        c10493a.b(jVar);
        c10493a.b(aVar9);
        c10493a.b(aVar10);
        c10493a.b(aVar11);
        c10493a.b(aVar12);
        c10493a.b(aVar13);
        c10493a.b(aVar14);
        c10493a.b(dVar);
        c10493a.b(hVar2);
        c10493a.b(dVar2);
        c10493a.b(aVar15);
        c10493a.b(aVar16);
        c10493a.b(aVar17);
        c10493a.b(aVar18);
        c10493a.b(aVar19);
        c10493a.b(aVar20);
        c10493a.b(dVar3);
        c10493a.b(aVar21);
        c10493a.b(cVar);
        c10493a.b(aVar22);
        c10493a.b(bVar);
        c10493a.b(aVar23);
        c10493a.b(aVar24);
        c10493a.b(aVar25);
        c10493a.b(aVar26);
        c10493a.b(aVar27);
        c10493a.b(aVar28);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            c10493a.b((TV0.b) it.next());
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            c10493a.b((com.avito.android.advert.item.beduin_block.a) it2.next());
        }
        return c10493a.a();
    }
}
