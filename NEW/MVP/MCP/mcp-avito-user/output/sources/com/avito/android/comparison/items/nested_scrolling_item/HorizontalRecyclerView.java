package com.avito.android.comparison.items.nested_scrolling_item;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: HorizontalRecyclerView.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/comparison/items/nested_scrolling_item/HorizontalRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "", "offset", "Lkotlin/G0;", "setHorizontalOffset", "(I)V", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class HorizontalRecyclerView extends RecyclerView {
    @X41.j
    public HorizontalRecyclerView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void setHorizontalOffset(int offset) {
        int iComputeHorizontalScrollOffset = computeHorizontalScrollOffset();
        if (offset > iComputeHorizontalScrollOffset) {
            scrollBy(offset - iComputeHorizontalScrollOffset, 0);
        } else if (offset < iComputeHorizontalScrollOffset) {
            scrollBy(-(iComputeHorizontalScrollOffset - offset), 0);
        }
    }

    public HorizontalRecyclerView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
    }
}
