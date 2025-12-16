package com.avito.android.lib.design.chips;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: HorizontalChipsDecoration.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/chips/y;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class y extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f178815b;

    public y(int i12) {
        this.f178815b = i12;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        int i12;
        int bindingAdapterPosition = ((RecyclerView.n) view.getLayoutParams()).f53858b.getBindingAdapterPosition();
        int i13 = this.f178815b;
        if (bindingAdapterPosition == 0) {
            i12 = i13;
            i13 = 0;
        } else {
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            i12 = bindingAdapterPosition == (adapter != null ? adapter.getItemCount() : 0) + (-1) ? 0 : i13;
        }
        rect.set(i13, 0, i12, 0);
    }
}
