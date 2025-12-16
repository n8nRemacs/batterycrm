package com.avito.android.search_view;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.remote.model.search.suggest.PaddingInfo;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: BannerDecorator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_view/d;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_search-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f264551b;

    public d(@Y61.k Resources resources) {
        this.f264551b = resources.getDimensionPixelSize(R.dimen.banner_padding_left_and_right);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        Integer bottom;
        Integer top;
        Object objW = recyclerView.W(view);
        if (objW instanceof com.avito.android.list.banner.e) {
            com.avito.android.list.banner.e eVar = (com.avito.android.list.banner.e) objW;
            PaddingInfo f181548c = eVar.getF181548c();
            if (f181548c != null && (top = f181548c.getTop()) != null) {
                rect.top = y6.b(top.intValue());
            }
            PaddingInfo f181548c2 = eVar.getF181548c();
            if (f181548c2 != null && (bottom = f181548c2.getBottom()) != null) {
                rect.bottom = y6.b(bottom.intValue());
            }
            int i12 = this.f264551b;
            rect.left = i12;
            rect.right = i12;
        }
    }
}
