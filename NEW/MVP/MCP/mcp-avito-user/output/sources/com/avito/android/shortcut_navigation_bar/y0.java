package com.avito.android.shortcut_navigation_bar;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ShortcutsItemDecoration.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/shortcut_navigation_bar/y0;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_shortcut-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class y0 extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f283587b;

    /* renamed from: c, reason: collision with root package name */
    public final int f283588c;

    /* renamed from: d, reason: collision with root package name */
    public final int f283589d;

    public y0(Resources resources, int i12, int i13, int i14, int i15, C42822w c42822w) {
        i12 = (i15 & 2) != 0 ? R.dimen.main_edge_shortcuts_padding : i12;
        i13 = (i15 & 4) != 0 ? R.dimen.main_shortcuts_padding : i13;
        i14 = (i15 & 8) != 0 ? R.dimen.main_vertical_shortcuts_padding : i14;
        this.f283587b = resources.getDimensionPixelOffset(i12);
        this.f283588c = resources.getDimensionPixelOffset(i13);
        this.f283589d = resources.getDimensionPixelOffset(i14);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        recyclerView.getClass();
        int iU2 = RecyclerView.U(view);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        RecyclerView.C cW2 = recyclerView.W(view);
        if (adapter == null || (cW2 instanceof com.avito.android.shortcut_navigation_bar.adapter.tag.h) || (cW2 instanceof com.avito.android.shortcut_navigation_bar.adapter.horizontal_chips.t) || (cW2 instanceof com.avito.android.shortcut_navigation_bar.adapter.category_node.c)) {
            return;
        }
        int i12 = this.f283588c;
        int i13 = this.f283587b;
        rect.left = iU2 == 0 ? i13 : i12;
        if (iU2 == adapter.getItemCount() - 1) {
            i12 = i13;
        }
        rect.right = i12;
        int i14 = this.f283589d;
        rect.top = i14;
        rect.bottom = i14;
    }
}
