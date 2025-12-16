package com.avito.android.list.list_snippet;

import Y61.k;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: ListSnippetDecorator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/list/list_snippet/d;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_search-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f181601b;

    public d(@k Resources resources) {
        this.f181601b = resources.getDimensionPixelOffset(R.dimen.list_snippet_top_compensation);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        if (recyclerView.W(view) instanceof i) {
            rect.top = this.f181601b;
        }
    }
}
