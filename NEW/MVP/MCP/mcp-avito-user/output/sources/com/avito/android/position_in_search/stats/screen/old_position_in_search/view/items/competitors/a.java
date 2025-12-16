package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.competitors;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: CompetitorItemDecorator.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/competitors/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f220946b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final GridLayoutManager.c f220947c;

    /* renamed from: d, reason: collision with root package name */
    public final int f220948d = y6.b(6);

    /* renamed from: e, reason: collision with root package name */
    public final int f220949e = y6.b(24);

    public a(int i12, @k GridLayoutManager.c cVar) {
        this.f220946b = i12;
        this.f220947c = cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        rect.setEmpty();
        RecyclerView.C cW2 = recyclerView.W(view);
        int iU2 = RecyclerView.U(view);
        GridLayoutManager.c cVar = this.f220947c;
        int i12 = this.f220946b;
        int iE2 = cVar.e(iU2, i12);
        boolean z12 = iE2 == 0;
        boolean z13 = cVar.f(iU2) + iE2 == i12;
        if (cW2 instanceof com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.competitors.item.d) {
            int i13 = this.f220948d;
            if (!z12) {
                rect.left = i13;
            }
            if (!z13) {
                rect.right = i13;
            }
            rect.top = this.f220949e;
        }
    }
}
