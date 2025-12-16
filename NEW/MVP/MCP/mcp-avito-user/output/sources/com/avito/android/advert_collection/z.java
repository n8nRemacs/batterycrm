package com.avito.android.advert_collection;

import I7.a;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.view.C22981N;
import androidx.view.InterfaceC22983P;
import com.avito.android.R;
import com.avito.android.favorites.adapter.advert.FavoriteAdvertItem;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.C35835l0;
import com.avito.conveyor_item.ParcelableItem;
import com.google.android.material.internal.CheckableImageButton;
import j.InterfaceC42150f;
import j.InterfaceC42165v;
import j.L;
import java.util.Arrays;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertCollectionView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_collection/z;", "Lcom/avito/android/advert_collection/o;", "LM81/b;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class z implements o, M81.b {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f81704b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.j f81705c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f81706d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final A f81707e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22983P f81708f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.favorites.adapter.advert.d f81709g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.favorites.adapter.loading.c f81710h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.favorites.adapter.error.c f81711i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_collection.adapter.author.c f81712j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_collection.adapter.order.c f81713k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ M81.c f81714l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final SwipeRefreshLayout f81715m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final Button f81716n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final View f81717o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final Toolbar f81718p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final CheckableImageButton f81719q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final TextView f81720r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.bottom_sheet.d f81721s;

    public z(@Y61.k View view, @Y61.k com.avito.konveyor.adapter.j jVar, @Y61.k com.avito.konveyor.adapter.a aVar, @Y61.k A a12, @Y61.k InterfaceC22983P interfaceC22983P, @Y61.k com.avito.android.favorites.adapter.advert.d dVar, @Y61.k com.avito.android.favorites.adapter.loading.c cVar, @Y61.k com.avito.android.favorites.adapter.error.c cVar2, @Y61.k com.avito.android.advert_collection.adapter.author.c cVar3, @Y61.k com.avito.android.advert_collection.adapter.order.c cVar4, @Y61.k Resources resources, @Y61.k com.avito.android.advert_collection.adapter.a aVar2) {
        this.f81704b = view;
        this.f81705c = jVar;
        this.f81706d = aVar;
        this.f81707e = a12;
        this.f81708f = interfaceC22983P;
        this.f81709g = dVar;
        this.f81710h = cVar;
        this.f81711i = cVar2;
        this.f81712j = cVar3;
        this.f81713k = cVar4;
        View viewFindViewById = view.findViewById(R.id.content);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        M81.c cVar5 = new M81.c(view, viewFindViewById, false, 4, null);
        this.f81714l = cVar5;
        View viewFindViewById2 = view.findViewById(R.id.content);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.swipe_refresh_layout);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.swiperefreshlayout.widget.SwipeRefreshLayout");
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewFindViewById3;
        this.f81715m = swipeRefreshLayout;
        View viewFindViewById4 = view.findViewById(R.id.add_items_button);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById4;
        this.f81716n = button;
        View viewFindViewById5 = view.findViewById(R.id.add_button_container);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f81717o = viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.toolbar);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        Toolbar toolbar = (Toolbar) viewFindViewById6;
        this.f81718p = toolbar;
        View viewFindViewById7 = view.findViewById(R.id.like_button);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.internal.CheckableImageButton");
        }
        CheckableImageButton checkableImageButton = (CheckableImageButton) viewFindViewById7;
        this.f81719q = checkableImageButton;
        View viewFindViewById8 = view.findViewById(R.id.likes_count);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f81720r = (TextView) viewFindViewById8;
        g5(R.drawable.ic_back_24_black, null);
        setMenu(R.menu.advert_collection);
        h5(R.attr.black);
        N81.e eVar = cVar5.f10418g;
        if (eVar != null) {
            eVar.b();
            G0 g02 = G0.f406611a;
        }
        recyclerView.setAdapter(jVar);
        recyclerView.l(aVar2, -1);
        recyclerView.l(new com.avito.android.favorites.adapter.promo.t(resources), -1);
        int[] iArrA = com.avito.android.lib.deprecated_design.c.a(swipeRefreshLayout.getContext(), false);
        swipeRefreshLayout.setColorSchemeColors(Arrays.copyOf(iArrA, iArrA.length));
        swipeRefreshLayout.setProgressBackgroundColorSchemeColor(C35835l0.d(R.attr.white, swipeRefreshLayout.getContext()));
        swipeRefreshLayout.g(0, C35835l0.f(R.attr.actionBarSize, swipeRefreshLayout.getContext()), true);
        swipeRefreshLayout.setOnRefreshListener(new p(this));
        dVar.H1(new t(this));
        cVar.D1(new u(this));
        cVar2.s1(new v(this));
        cVar3.u0(new w(this));
        cVar4.setListener(new x(this));
        com.avito.android.ui.d.b(toolbar, new p(this));
        final int i12 = 0;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.advert_collection.q

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ z f81690c;

            {
                this.f81690c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        this.f81690c.f81707e.accept(a.b.f7955a);
                        break;
                    case 1:
                        this.f81690c.f81707e.accept(a.C0448a.f7954a);
                        break;
                    default:
                        this.f81690c.f81707e.accept(a.m.f7966a);
                        break;
                }
            }
        });
        final int i13 = 1;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.advert_collection.q

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ z f81690c;

            {
                this.f81690c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        this.f81690c.f81707e.accept(a.b.f7955a);
                        break;
                    case 1:
                        this.f81690c.f81707e.accept(a.C0448a.f7954a);
                        break;
                    default:
                        this.f81690c.f81707e.accept(a.m.f7966a);
                        break;
                }
            }
        });
        final int i14 = 2;
        checkableImageButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.advert_collection.q

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ z f81690c;

            {
                this.f81690c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        this.f81690c.f81707e.accept(a.b.f7955a);
                        break;
                    case 1:
                        this.f81690c.f81707e.accept(a.C0448a.f7954a);
                        break;
                    default:
                        this.f81690c.f81707e.accept(a.m.f7966a);
                        break;
                }
            }
        });
        C22981N.a(interfaceC22983P.getLifecycle()).c(new s(this, null));
        C22981N.a(interfaceC22983P.getLifecycle()).c(new r(this, null));
    }

    @Override // com.avito.android.favorite.s, com.avito.android.advert.viewed.j, com.avito.android.serp.adapter.closable.e
    public final void C3(int i12) {
        ParcelableItem parcelableItem = (ParcelableItem) C42745f0.K(i12, this.f81707e.getState().getValue().f81615b);
        com.avito.android.favorites.adapter.advert.c cVar = null;
        if (parcelableItem != null && (parcelableItem instanceof FavoriteAdvertItem)) {
            FavoriteAdvertItem favoriteAdvertItem = (FavoriteAdvertItem) parcelableItem;
            cVar = new com.avito.android.favorites.adapter.advert.c(favoriteAdvertItem.f156394F, favoriteAdvertItem.f156419q);
        }
        this.f81705c.notifyItemChanged(i12, cVar);
    }

    @Override // M81.b
    @Y61.k
    public final io.reactivex.rxjava3.core.z<Integer> e5() {
        return this.f81714l.f10413b;
    }

    @Override // M81.b
    public final void f5(@Y61.k Y41.a<G0> aVar) {
        this.f81714l.f5(aVar);
    }

    @Override // M81.b
    public final void g5(@InterfaceC42165v int i12, @InterfaceC42150f @Y61.l Integer num) {
        this.f81714l.g5(i12, num);
    }

    @Override // M81.b
    public final void h5(@InterfaceC42150f int i12) {
        this.f81714l.h5(i12);
    }

    @Override // M81.b
    public final void setMenu(@L int i12) {
        this.f81714l.setMenu(i12);
    }
}
