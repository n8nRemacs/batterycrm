package com.avito.android.photo_list_view.re23;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: PublishPhotoItemDecoration.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_list_view/re23/d;", "Landroidx/recyclerview/widget/RecyclerView$l;", "<init>", "()V", "_avito_photo-list-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f218202b = y6.b(3);

    /* renamed from: c, reason: collision with root package name */
    public final int f218203c = y6.b(3);

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        int bindingAdapterPosition = ((RecyclerView.n) view.getLayoutParams()).f53858b.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return;
        }
        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        if (gridLayoutManager != null) {
            int i12 = gridLayoutManager.f53662H;
            int i13 = bindingAdapterPosition % i12;
            boolean z12 = i13 == 0;
            boolean z13 = i13 == i12 + (-1);
            double dCeil = Math.ceil(bindingAdapterPosition / i12);
            int i14 = this.f218203c;
            rect.top = dCeil == 0.0d ? 0 : i14;
            rect.bottom = i14;
            int i15 = this.f218202b;
            rect.left = z12 ? 0 : i15;
            rect.right = z13 ? 0 : i15;
        }
    }
}
