package com.avito.android.comparison.items.nested_scrolling_item;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: NestedRecyclerAdapter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comparison/items/nested_scrolling_item/b;", "Lcom/avito/konveyor/adapter/j;", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b extends com.avito.konveyor.adapter.j {
    public b() {
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(RecyclerView.C c12) {
        TV0.e eVar = (com.avito.konveyor.adapter.b) c12;
        if (eVar instanceof a) {
            ((a) eVar).tR();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(RecyclerView.C c12) {
        TV0.e eVar = (com.avito.konveyor.adapter.b) c12;
        if (eVar instanceof a) {
            ((a) eVar).pg();
        }
    }
}
