package com.avito.android.serp.adapter.vertical_main.vertical_filter.item;

import Y61.k;
import Y61.l;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.serp.adapter.vertical_main.vertical_filter.M;
import com.avito.android.util.D6;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: VerticalSearchFilterItemDecorator.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/item/h;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final M f273559b;

    /* renamed from: c, reason: collision with root package name */
    public final int f273560c;

    /* renamed from: d, reason: collision with root package name */
    public final int f273561d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Integer f273562e;

    public /* synthetic */ h(Resources resources, com.avito.konveyor.a aVar, M m12, int i12, C42822w c42822w) {
        this(resources, (i12 & 2) != 0 ? null : aVar, (i12 & 4) != 0 ? null : m12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        super.getItemOffsets(rect, view, recyclerView, zVar);
        Integer num = this.f273562e;
        if (num != null) {
            RecyclerView.C cW2 = recyclerView.W(view);
            if (cW2.getBindingAdapterPosition() == 0 && cW2.getItemViewType() != num.intValue()) {
                D6.c(recyclerView, null, Integer.valueOf(this.f273560c), null, null, 13);
            }
        }
        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        int i12 = gridLayoutManager != null ? gridLayoutManager.f53662H : 1;
        if (i.a(view) == i12) {
            rect.left = 0;
            rect.right = 0;
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        GridLayoutManager.b bVar = layoutParams instanceof GridLayoutManager.b ? (GridLayoutManager.b) layoutParams : null;
        int i13 = bVar != null ? bVar.f53669f : 0;
        int i14 = this.f273561d;
        if (i13 == 0) {
            rect.left = 0;
            rect.right = i14;
            return;
        }
        M m12 = this.f273559b;
        if (m12 != null && i.a(view) == m12.a()) {
            rect.left = i14;
            rect.right = 0;
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        GridLayoutManager.b bVar2 = layoutParams2 instanceof GridLayoutManager.b ? (GridLayoutManager.b) layoutParams2 : null;
        if (i.a(view) + (bVar2 != null ? bVar2.f53669f : 0) == i12) {
            rect.left = i14;
            rect.right = 0;
        } else {
            rect.left = i14;
            rect.right = i14;
        }
    }

    public h(@k Resources resources, @l com.avito.konveyor.a aVar, @l M m12) {
        this.f273559b = m12;
        this.f273560c = resources.getDimensionPixelOffset(R.dimen.vertical_search_filter_top_offset);
        this.f273561d = resources.getDimensionPixelOffset(R.dimen.vertical_search_filter_column_offset) / 2;
        this.f273562e = aVar != null ? Integer.valueOf(aVar.Y(com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.geo_control.a.class)) : null;
    }
}
