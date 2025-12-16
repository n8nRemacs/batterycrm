package com.avito.android.advert_core.map;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: MapPreviewInitListener.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/map/l;", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class l extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final d f83777b;

    /* renamed from: c, reason: collision with root package name */
    public int f83778c = -1;

    public l(@Y61.k d dVar) {
        this.f83777b = dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void i(int i12, @Y61.k RecyclerView recyclerView) {
        if (this.f83778c == -1) {
            return;
        }
        d dVar = this.f83777b;
        if (!dVar.B4() && i12 == 0) {
            RecyclerView.m layoutManager = recyclerView.getLayoutManager();
            GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
            if (gridLayoutManager != null && gridLayoutManager.L1() >= this.f83778c - 1) {
                dVar.C4();
            }
        }
    }
}
