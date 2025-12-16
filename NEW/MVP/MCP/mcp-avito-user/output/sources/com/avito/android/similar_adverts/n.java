package com.avito.android.similar_adverts;

import Lw0.InterfaceC14445b;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.serp.adapter.Y0;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SimilarAdvertsView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/similar_adverts/n;", "Lcom/avito/android/similar_adverts/l;", "_avito_similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n implements l {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f283979b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.recycler.data_aware.c f283980c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.favorite.n f283981d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Y0 f283982e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.progress_overlay.l f283983f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f283984g;

    public n(@Y61.k View view, @Y61.k com.avito.android.recycler.data_aware.c cVar, @Y61.k com.avito.android.favorite.n nVar, @Y61.k Y0 y02, @Y61.k GridLayoutManager.c cVar2, @Y61.k i iVar, @Y61.k com.avito.konveyor.adapter.j jVar, @Y61.k InterfaceC14445b interfaceC14445b) {
        this.f283979b = view;
        this.f283980c = cVar;
        this.f283981d = nVar;
        this.f283982e = y02;
        View viewFindViewById = view.findViewById(R.id.content_holder);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        this.f283983f = new com.avito.android.progress_overlay.l((FrameLayout) viewFindViewById, R.id.similar_list, null, 0, 0, 28, null);
        View viewFindViewById2 = view.findViewById(R.id.similar_list);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
        this.f283984g = recyclerView;
        view.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(iVar.a());
        gridLayoutManager.f53667M = cVar2;
        recyclerView.setAdapter(jVar);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.l(new h(y6.b(16), y6.b(10), iVar.a()), -1);
        interfaceC14445b.b(recyclerView);
        y02.f(this);
    }

    @Override // com.avito.android.favorite.s, com.avito.android.advert.viewed.j, com.avito.android.serp.adapter.closable.e
    public final void C3(int i12) {
        RecyclerView.Adapter adapter = this.f283984g.getAdapter();
        if (adapter != null) {
            adapter.notifyItemChanged(i12);
        }
    }

    @Override // com.avito.android.ui.adapter.f
    /* renamed from: gk */
    public final boolean getF207731j() {
        return false;
    }

    @Override // com.avito.android.ui.adapter.f
    public final void rp() {
    }
}
