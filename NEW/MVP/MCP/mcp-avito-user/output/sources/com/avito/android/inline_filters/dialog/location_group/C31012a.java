package com.avito.android.inline_filters.dialog.location_group;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: ChipsItemDecorator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/inline_filters/dialog/location_group/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "<init>", "()V", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.inline_filters.dialog.location_group.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31012a extends RecyclerView.l {
    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) throws Resources.NotFoundException {
        super.getItemOffsets(rect, view, recyclerView, zVar);
        if (recyclerView.W(view) instanceof com.avito.android.inline_filters.dialog.location_group.adapter.chips.h) {
            int dimensionPixelSize = recyclerView.getContext().getResources().getDimensionPixelSize(R.dimen.inline_filter_dialog_horizontal_padding);
            int dimensionPixelSize2 = recyclerView.getContext().getResources().getDimensionPixelSize(R.dimen.inline_filter_recycler_padding_start);
            rect.right = -dimensionPixelSize;
            rect.left = -dimensionPixelSize2;
        }
    }
}
