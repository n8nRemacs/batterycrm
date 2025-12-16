package com.avito.android.advert.item.hotel.hotel_review;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BadgesMarginItemDecoration.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_review/i;", "Landroidx/recyclerview/widget/RecyclerView$l;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class i extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f76271b = y6.b(3);

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        recyclerView.getClass();
        int iU2 = RecyclerView.U(view);
        Integer numValueOf = Integer.valueOf(iU2);
        if (iU2 == -1) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            int i12 = this.f76271b;
            int i13 = iIntValue != 0 ? i12 : 0;
            if (iIntValue == zVar.b() - 1) {
                i12 = 0;
            }
            rect.set(i13, 0, i12, 0);
        }
    }
}
