package com.avito.android.advert_details_items.neighboring_dates.tools;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: ChipsItemDecorator.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details_items/neighboring_dates/tools/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f84955b;

    /* renamed from: c, reason: collision with root package name */
    public final int f84956c;

    public a(int i12, int i13) {
        this.f84955b = i12;
        this.f84956c = i13;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        recyclerView.getClass();
        int iU2 = RecyclerView.U(view);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        int itemCount = (adapter != null ? adapter.getItemCount() : 0) - 1;
        if (iU2 < itemCount) {
            rect.right = this.f84955b;
        }
        int i12 = this.f84956c;
        if (iU2 == 0) {
            rect.left = i12;
        }
        if (iU2 == itemCount) {
            rect.right = i12;
        }
    }
}
