package com.avito.android.publish.slots.images_groups_recommendations.analytics;

import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.U;

/* compiled from: ImagesGroupsRecommendationsScrollListener.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/images_groups_recommendations/analytics/a;", "Landroidx/recyclerview/widget/RecyclerView$o;", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a extends RecyclerView.r implements RecyclerView.o {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final RecyclerView f244160b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final d f244161c;

    public a(@k RecyclerView recyclerView, @k d dVar) {
        this.f244160b = recyclerView;
        this.f244161c = dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void d(@k View view) {
        if (L.f(view.getTag(), "images_groups_recommendations")) {
            d dVar = this.f244161c;
            dVar.f244170e = false;
            U.b(dVar.f244168c, null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void i(int i12, @k RecyclerView recyclerView) {
        if (i12 == 0) {
            d dVar = this.f244161c;
            if (!dVar.f244170e || dVar.f244169d.get()) {
                return;
            }
            RecyclerView.m layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager == null) {
                return;
            }
            int iK1 = linearLayoutManager.K1();
            int iM1 = linearLayoutManager.M1();
            while (iM1 >= iK1 && !(recyclerView.P(iM1) instanceof com.avito.android.publish.slots.images_groups_recommendations.item.k)) {
                iM1--;
            }
            dVar.a(iM1, recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void j(@k View view) {
        if (L.f(view.getTag(), "images_groups_recommendations")) {
            d dVar = this.f244161c;
            dVar.f244170e = true;
            if (dVar.f244169d.get()) {
                return;
            }
            C43259k.d(dVar.f244168c, null, null, new c(this.f244160b, dVar, null), 3);
        }
    }
}
