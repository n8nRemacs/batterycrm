package com.avito.android.shortcut_navigation_bar.adapter.horizontal_chips;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: HorizontalChipsItemDecoration.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/shortcut_navigation_bar/adapter/horizontal_chips/j;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_shortcut-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f283303b;

    /* renamed from: c, reason: collision with root package name */
    public final int f283304c;

    /* renamed from: d, reason: collision with root package name */
    public final int f283305d;

    /* renamed from: e, reason: collision with root package name */
    public final int f283306e;

    /* renamed from: f, reason: collision with root package name */
    public final int f283307f;

    public j(@Y61.k Resources resources, int i12) {
        this.f283303b = resources.getDimensionPixelOffset(R.dimen.horizontal_chips_top_offset);
        this.f283304c = resources.getDimensionPixelOffset(R.dimen.horizontal_chips_bottom_offset);
        this.f283305d = resources.getDimensionPixelOffset(R.dimen.horizontal_chips_horizontal_offset);
        this.f283306e = resources.getDimensionPixelOffset(R.dimen.horizontal_chips_horizontal_offset);
        this.f283307f = i12;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        super.getItemOffsets(rect, view, recyclerView, zVar);
        recyclerView.getClass();
        int iU2 = RecyclerView.U(view);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        RecyclerView.C cW2 = recyclerView.W(view);
        if (adapter != null) {
            if ((cW2 instanceof t) || (cW2 instanceof com.avito.android.shortcut_navigation_bar.adapter.category_node.c)) {
                rect.top = this.f283303b;
                rect.bottom = this.f283304c;
                int i12 = this.f283307f;
                rect.left = iU2 == 0 ? i12 : this.f283305d;
                if (iU2 != adapter.getItemCount() - 1) {
                    i12 = this.f283306e;
                }
                rect.right = i12;
            }
        }
    }
}
