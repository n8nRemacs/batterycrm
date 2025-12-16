package com.avito.android.beduin.common.component.photo_picker;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import j.U;
import kotlin.Metadata;

/* compiled from: BeduinPhotoPickerItemsDecoration.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/photo_picker/h;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f101984b;

    /* renamed from: c, reason: collision with root package name */
    public final int f101985c;

    public h(@U int i12, @U int i13) {
        this.f101984b = i12;
        this.f101985c = i13;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        int i12 = ((GridLayoutManager) recyclerView.getLayoutManager()).f53662H;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        GridLayoutManager.b bVar = layoutParams instanceof GridLayoutManager.b ? (GridLayoutManager.b) layoutParams : null;
        int i13 = bVar != null ? bVar.f53669f : 0;
        int iU2 = RecyclerView.U(view);
        float f12 = this.f101984b;
        float f13 = i12;
        rect.set((int) ((i13 * f12) / f13), iU2 >= i12 ? this.f101985c : 0, (int) (f12 - (((i13 + 1) * f12) / f13)), 0);
    }
}
