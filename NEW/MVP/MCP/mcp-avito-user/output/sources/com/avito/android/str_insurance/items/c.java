package com.avito.android.str_insurance.items;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.str_insurance.items.insight.f;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: StrInsuranceOfferScreenDecorator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_insurance/items/c;", "Landroidx/recyclerview/widget/RecyclerView$l;", "<init>", "()V", "_avito_str-insurance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c extends RecyclerView.l {
    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        super.getItemOffsets(rect, view, recyclerView, zVar);
        recyclerView.getClass();
        int iU2 = RecyclerView.U(view);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        boolean z12 = iU2 == (adapter != null ? adapter.getItemCount() : 0) - 1;
        RecyclerView.C cW2 = recyclerView.W(view);
        if (cW2 instanceof com.avito.android.str_insurance.items.title.a) {
            rect.bottom = y6.b(20);
            return;
        }
        if ((cW2 instanceof f) && !z12) {
            rect.bottom = y6.b(16);
        } else if (z12) {
            rect.bottom = y6.b(12);
        }
    }
}
