package com.avito.android.item_map.view;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: ItemMapItemDecorator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/item_map/view/j;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.item_map.view.j, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31073j extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f173624b;

    /* renamed from: c, reason: collision with root package name */
    public final int f173625c = y6.b(18);

    public C31073j(@Y61.k Resources resources) {
        this.f173624b = resources.getDimensionPixelSize(R.dimen.map_bottom_sheet_recycler_view_margin);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        super.getItemOffsets(rect, view, recyclerView, zVar);
        if (recyclerView.W(view) instanceof JM.b) {
            int i12 = this.f173624b;
            rect.left = i12;
            rect.right = i12;
            rect.bottom = this.f173625c;
        }
    }
}
