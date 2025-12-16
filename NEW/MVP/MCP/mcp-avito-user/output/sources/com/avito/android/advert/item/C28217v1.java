package com.avito.android.advert.item;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.beduin.v2.render.android_view.BeduinView;
import kotlin.Metadata;

/* compiled from: AdvertDetailsView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/v1;", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.v1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28217v1 extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I1 f80653b;

    public C28217v1(I1 i12) {
        this.f80653b = i12;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void k(@Y61.k RecyclerView recyclerView, int i12, int i13) {
        RecyclerView recyclerViewB;
        I1 i14 = this.f80653b;
        BeduinView beduinView = i14.f71648E0;
        RecyclerView.m layoutManager = (beduinView == null || (recyclerViewB = Z1.b(beduinView)) == null) ? null : recyclerViewB.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            int iK1 = linearLayoutManager.K1();
            Integer numValueOf = Integer.valueOf(iK1);
            if (iK1 == -1) {
                numValueOf = null;
            }
            int iM1 = linearLayoutManager.M1();
            Integer numValueOf2 = iM1 != -1 ? Integer.valueOf(iM1) : null;
            if (numValueOf != null && numValueOf2 != null) {
                i14.f71741t.a(numValueOf.intValue(), numValueOf2.intValue());
            }
        }
        i14.y(recyclerView);
    }
}
