package com.avito.android.vas_performance.ui.recycler;

import Y61.k;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: PerformanceVasPaddingDecoration.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/ui/recycler/d;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Resources f321904b;

    /* renamed from: c, reason: collision with root package name */
    public final int f321905c;

    public d(@k Resources resources) {
        this.f321904b = resources;
        this.f321905c = resources.getDimensionPixelSize(R.dimen.margin_large);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) throws Resources.NotFoundException {
        boolean z12 = recyclerView.W(view) instanceof com.avito.android.vas_performance.ui.items.tabs.i;
        int dimensionPixelOffset = this.f321905c;
        Resources resources = this.f321904b;
        rect.left = z12 ? resources.getDimensionPixelOffset(R.dimen.margin_tiny) : dimensionPixelOffset;
        if (recyclerView.W(view) instanceof com.avito.android.vas_performance.ui.items.tabs.i) {
            dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.margin_tiny);
        }
        rect.right = dimensionPixelOffset;
        Object objW = recyclerView.W(view);
        rect.bottom = objW instanceof com.avito.android.vas_performance.ui.items.header.d ? ((com.avito.android.vas_performance.ui.items.header.d) objW).lv() ? resources.getDimensionPixelOffset(R.dimen.header_bottom_padding) : resources.getDimensionPixelOffset(R.dimen.header_without_description_bottom_padding) : objW instanceof com.avito.android.vas_performance.ui.items.tabs.i ? resources.getDimensionPixelOffset(R.dimen.tabs_bottom_padding) : objW instanceof com.avito.android.vas_performance.ui.items.lightning_block.f ? resources.getDimensionPixelOffset(R.dimen.lightning_block_bottom_padding) : resources.getDimensionPixelOffset(R.dimen.margin_small);
    }
}
