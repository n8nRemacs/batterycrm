package com.avito.android.list.grid_snippet.item;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: GridSnippetSpacingItemDecorator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/list/grid_snippet/item/g;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_search-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f181583b;

    /* renamed from: c, reason: collision with root package name */
    public final int f181584c;

    /* renamed from: d, reason: collision with root package name */
    public final int f181585d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f181586e = true;

    public g(int i12, int i13, int i14) {
        this.f181583b = i12;
        this.f181584c = i13;
        this.f181585d = i14;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        recyclerView.getClass();
        int iU2 = RecyclerView.U(view);
        if (iU2 < 0) {
            return;
        }
        int i12 = this.f181583b;
        int i13 = iU2 % i12;
        boolean z12 = this.f181586e;
        int i14 = this.f181584c;
        int i15 = this.f181585d;
        if (z12) {
            rect.left = i14 - ((i13 * i14) / i12);
            rect.right = ((i13 + 1) * i14) / i12;
            if (iU2 < i12) {
                rect.top = i15;
            }
            rect.bottom = i15;
            return;
        }
        rect.left = (i13 * i14) / i12;
        rect.right = i14 - (((i13 + 1) * i14) / i12);
        if (iU2 >= i12) {
            rect.top = i15;
        }
    }
}
