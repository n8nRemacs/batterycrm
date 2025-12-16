package com.avito.android.photo_list_view;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: MainPhotoDecoration.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view/C;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_photo-list-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class C extends RecyclerView.l {
    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void onDrawOver(@Y61.k Canvas canvas, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        RecyclerView.C cQ2;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null || adapter.getItemCount() != 0) {
            RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
            if ((adapter2 != null ? adapter2.getItemViewType(0) : -1) > 0 && (cQ2 = recyclerView.Q(0, false)) != null && cQ2.itemView != null) {
                throw null;
            }
        }
    }
}
