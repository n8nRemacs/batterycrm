package com.avito.android.inline_filters.dialog.category_nodes.adapter;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j.U;
import kotlin.Metadata;

/* compiled from: CategoryNodesSpacingItemDecoration.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/dialog/category_nodes/adapter/c;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f171426b;

    public c(@U int i12) {
        this.f171426b = i12;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        com.avito.konveyor.adapter.d dVar = adapter instanceof com.avito.konveyor.adapter.d ? (com.avito.konveyor.adapter.d) adapter : null;
        if (dVar == null) {
            return;
        }
        Object obj = dVar.f53650c.f53994f.get(RecyclerView.U(view));
        NodeItem nodeItem = obj instanceof NodeItem ? (NodeItem) obj : null;
        if (nodeItem == null || nodeItem.f171418o == null || nodeItem.f171419p == null) {
            return;
        }
        int i12 = this.f171426b;
        rect.top = i12;
        rect.bottom = i12;
    }
}
