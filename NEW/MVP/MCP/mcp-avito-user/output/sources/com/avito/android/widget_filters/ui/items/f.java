package com.avito.android.widget_filters.ui.items;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: WidgetFiltersItemsDecoration.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/ui/items/f;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f330395b;

    /* renamed from: c, reason: collision with root package name */
    public final int f330396c;

    /* renamed from: d, reason: collision with root package name */
    public final int f330397d;

    /* renamed from: e, reason: collision with root package name */
    public final int f330398e;

    public f(int i12, int i13, int i14, int i15) {
        this.f330395b = i12;
        this.f330396c = i13;
        this.f330397d = i14;
        this.f330398e = i15;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        recyclerView.getClass();
        int iU2 = RecyclerView.U(view);
        int i12 = this.f330397d;
        rect.top = iU2 == 0 ? this.f330395b : i12;
        int i13 = this.f330398e;
        rect.left = i13;
        rect.right = i13;
        if (RecyclerView.U(view) == zVar.b() - 1) {
            i12 = this.f330396c;
        }
        rect.bottom = i12;
    }
}
