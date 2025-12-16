package com.avito.android.item_price_history.presentation;

import EO.a;
import Y61.k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ItemPriceHistoryView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/item_price_history/presentation/g;", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_item-price-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f173737b;

    public g(h hVar) {
        this.f173737b = hVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void i(int i12, @k RecyclerView recyclerView) {
        h hVar = this.f173737b;
        RecyclerView.m layoutManager = hVar.f173740c.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            ((c) hVar.f173739b).invoke(new a.C0231a(linearLayoutManager.M1()));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void k(@k RecyclerView recyclerView, int i12, int i13) {
        if (i13 < 0) {
            return;
        }
        h hVar = this.f173737b;
        RecyclerView.m layoutManager = hVar.f173740c.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            hVar.f173739b.invoke(new a.C0231a(linearLayoutManager.M1()));
        }
    }
}
