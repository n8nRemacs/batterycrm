package com.avito.android.feed_shortcuts.widget;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: FeedShortcutWidgetItemDecorator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/feed_shortcuts/widget/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_bx-content_widget_feed-shortcuts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f157701b;

    /* renamed from: c, reason: collision with root package name */
    public final int f157702c;

    /* renamed from: d, reason: collision with root package name */
    public final int f157703d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f157704e;

    public a(@Y61.k Resources resources) {
        this.f157701b = resources.getDimensionPixelSize(R.dimen.serp_feed_shortcuts_edge_offset);
        this.f157702c = resources.getDimensionPixelSize(R.dimen.serp_feed_shortcuts_inner_horizontal_offset);
        this.f157703d = resources.getDimensionPixelSize(R.dimen.serp_feed_shortcuts_inner_vertical_offset);
        this.f157704e = resources.getConfiguration().orientation == 2 || resources.getBoolean(R.bool.is_tablet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        RecyclerView.C cW2 = recyclerView.W(view);
        if (cW2 instanceof com.avito.android.feed_shortcuts.element.e) {
            int absoluteAdapterPosition = cW2.getAbsoluteAdapterPosition() + 1;
            boolean z12 = this.f157704e;
            int i12 = this.f157703d;
            int i13 = this.f157701b;
            if (!z12) {
                rect.left = i13;
                rect.right = i13;
                rect.top = absoluteAdapterPosition != 1 ? i12 : 0;
                return;
            }
            int i14 = absoluteAdapterPosition % 2;
            int i15 = this.f157702c;
            rect.left = i14 > 0 ? i13 : i15;
            if (i14 > 0) {
                i13 = i15;
            }
            rect.right = i13;
            if (absoluteAdapterPosition != 1 && absoluteAdapterPosition != 2) {
                i = i12;
            }
            rect.top = i;
        }
    }
}
