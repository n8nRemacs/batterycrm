package com.avito.android.similar_adverts;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.serp.adapter.InterfaceC34860t0;
import kotlin.Metadata;

/* compiled from: SimilarAdvertsItemDecoration.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/similar_adverts/h;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f283932b;

    /* renamed from: c, reason: collision with root package name */
    public final int f283933c;

    /* renamed from: d, reason: collision with root package name */
    public final int f283934d;

    public h(int i12, int i13, int i14) {
        this.f283932b = i12;
        this.f283933c = i13;
        this.f283934d = i14;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        super.getItemOffsets(rect, view, recyclerView, zVar);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        GridLayoutManager.b bVar = layoutParams instanceof GridLayoutManager.b ? (GridLayoutManager.b) layoutParams : null;
        int i12 = bVar != null ? bVar.f53669f : -1;
        boolean z12 = i12 == 0;
        boolean z13 = i12 == this.f283934d - 1;
        RecyclerView.C cW2 = recyclerView.W(view);
        if (cW2 instanceof InterfaceC34860t0 ? true : cW2 instanceof com.avito.android.serp.adapter.skeleton.k ? true : cW2 instanceof com.avito.android.serp.adapter.sale_advert_item.e) {
            int i13 = this.f283933c;
            int i14 = this.f283932b;
            if (z12) {
                rect.set(0, i14, i13 / 2, 0);
            } else if (z13) {
                rect.set(i13 / 2, i14, 0, 0);
            } else {
                rect.set(i13 / 2, i14, i13 / 2, 0);
            }
        }
    }
}
