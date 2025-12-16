package com.avito.android.favorite_sellers.adapter.advert_list;

import Oi0.InterfaceC14697a;
import Y61.k;
import Y61.l;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.favorite.n;
import com.avito.android.util.C35976x4;
import com.avito.konveyor.adapter.j;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertListItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/favorite_sellers/adapter/advert_list/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/favorite_sellers/adapter/advert_list/g;", "LOi0/a;", "_avito_favorite-sellers-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i extends com.avito.konveyor.adapter.b implements g, InterfaceC14697a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final d f155544b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.a f155545c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final n f155546d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.advert.viewed.f f155547e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final View f155548f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final RecyclerView f155549g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final LinearLayoutManager f155550h;

    /* renamed from: i, reason: collision with root package name */
    public final int f155551i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public P f155552j;

    public i(@k d dVar, @k com.avito.konveyor.adapter.a aVar, @k n nVar, @k com.avito.android.advert.viewed.f fVar, @k View view, @k com.avito.konveyor.a aVar2) {
        super(view);
        this.f155544b = dVar;
        this.f155545c = aVar;
        this.f155546d = nVar;
        this.f155547e = fVar;
        this.f155548f = view;
        View viewFindViewById = view.findViewById(R.id.items);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f155549g = recyclerView;
        this.f155551i = view.getResources().getDimensionPixelOffset(R.dimen.list_serp_card_padding);
        recyclerView.setItemAnimator(null);
        j jVar = new j(aVar, aVar2);
        jVar.setHasStableIds(true);
        view.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        this.f155550h = linearLayoutManager;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setAdapter(jVar);
    }

    public final void B80(P p12) {
        P p13 = this.f155552j;
        if (p13 != null) {
            p13.b(null);
        }
        RecyclerView recyclerView = this.f155549g;
        recyclerView.setOnFlingListener(null);
        recyclerView.s();
        recyclerView.o(new h(this));
        p12.b(recyclerView);
        this.f155552j = p12;
    }

    @Override // com.avito.android.favorite.s, com.avito.android.advert.viewed.j, com.avito.android.serp.adapter.closable.e
    public final void C3(int i12) {
        C35976x4.c(i12, this.f155549g);
    }

    @Override // com.avito.android.favorite_sellers.adapter.advert_list.g
    public final void Gd(boolean z12) {
        this.f155548f.setAlpha(z12 ? 0.5f : 1.0f);
    }

    @Override // com.avito.android.favorite_sellers.adapter.advert_list.g
    @k
    /* renamed from: O9, reason: from getter */
    public final com.avito.android.advert.viewed.f getF155547e() {
        return this.f155547e;
    }

    @Override // com.avito.android.favorite_sellers.adapter.advert_list.g
    public final void U9() {
        this.f155549g.setScrollingTouchSlop(1);
        B80(new SV.b(this.f155551i, null, 2, null));
    }

    @Override // com.avito.android.favorite_sellers.adapter.advert_list.g
    @k
    /* renamed from: V5, reason: from getter */
    public final n getF155546d() {
        return this.f155546d;
    }

    @Override // com.avito.android.favorite_sellers.adapter.advert_list.g
    public final void W0(int i12) {
        this.f155550h.b2(i12, this.f155551i);
    }

    @Override // com.avito.android.favorite_sellers.adapter.advert_list.g
    public final void Wd() {
        this.f155549g.setScrollingTouchSlop(0);
        B80(new SV.c(8388611, this.f155551i));
    }

    @Override // com.avito.konveyor.adapter.b, Oi0.InterfaceC14697a
    public final void destroy() {
        this.f155546d.I();
        this.f155547e.e0();
    }

    @Override // com.avito.android.favorite_sellers.adapter.advert_list.g
    public final void e8() {
        RecyclerView.Adapter adapter = this.f155549g.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f155546d.I();
        this.f155547e.e0();
    }

    @Override // com.avito.android.favorite_sellers.adapter.advert_list.g
    public final void s(@k String str) {
        this.f155548f.setTag(str);
    }

    @Override // com.avito.android.favorite_sellers.adapter.advert_list.g
    @k
    /* renamed from: zc, reason: from getter */
    public final com.avito.konveyor.adapter.a getF155545c() {
        return this.f155545c;
    }
}
