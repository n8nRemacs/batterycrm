package com.avito.android.photo_list_view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: PhotoUploaderPaddingDecoration.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view/I;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_photo-list-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class I extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f218079b;

    /* renamed from: c, reason: collision with root package name */
    public final int f218080c;

    public I(Context context, int i12, int i13, int i14, C42822w c42822w) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, d.n.f178981m0, (i14 & 2) != 0 ? R.attr.photoUploaderList : i12, (i14 & 4) != 0 ? R.style.Design_Widget_PhotoUploaderList : i13);
        this.f218079b = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, this.f218079b);
        this.f218080c = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, this.f218080c);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        int i12 = gridLayoutManager != null ? gridLayoutManager.f53662H : 1;
        int iCeil = (int) Math.ceil(zVar.b() / i12);
        int bindingAdapterPosition = ((RecyclerView.n) view.getLayoutParams()).f53858b.getBindingAdapterPosition();
        int i13 = bindingAdapterPosition % i12;
        int i14 = bindingAdapterPosition / i12;
        int i15 = this.f218080c / 2;
        int i16 = this.f218079b / i12;
        Integer numValueOf = Integer.valueOf(i15);
        if (i14 <= 0) {
            numValueOf = null;
        }
        rect.top = numValueOf != null ? numValueOf.intValue() : 0;
        Integer numValueOf2 = i14 < iCeil - 1 ? Integer.valueOf(i15) : null;
        rect.bottom = numValueOf2 != null ? numValueOf2.intValue() : 0;
        rect.left = i16 * i13;
        rect.right = ((i12 - i13) - 1) * i16;
    }
}
