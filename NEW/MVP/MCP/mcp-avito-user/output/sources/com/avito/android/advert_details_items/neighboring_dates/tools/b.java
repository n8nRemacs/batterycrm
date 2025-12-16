package com.avito.android.advert_details_items.neighboring_dates.tools;

import Y41.l;
import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.A;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.advert_details_items.neighboring_dates.items.NeighboringDatesItem;
import java.util.LinkedHashSet;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import ra.InterfaceC47622a;

/* compiled from: ChipsOnScrollListener.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details_items/neighboring_dates/tools/b;", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final A f84957b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final e f84958c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final l<String, G0> f84959d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final LinkedHashSet f84960e = new LinkedHashSet();

    /* JADX WARN: Multi-variable type inference failed */
    public b(@InterfaceC47622a @k A a12, @k e eVar, @k l<? super String, G0> lVar) {
        this.f84957b = a12;
        this.f84958c = eVar;
        this.f84959d = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void i(int i12, @k RecyclerView recyclerView) {
        RecyclerView.m layoutManager;
        A a12;
        View viewF;
        int[] iArrC;
        int i13;
        if (i12 != 0 || (layoutManager = recyclerView.getLayoutManager()) == null || (viewF = (a12 = this.f84957b).f(layoutManager)) == null || (iArrC = a12.c(layoutManager, viewF)) == null || (i13 = iArrC[0]) == 0 || !recyclerView.canScrollHorizontally(1)) {
            return;
        }
        recyclerView.C0(i13, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void k(@k RecyclerView recyclerView, int i12, int i13) {
        NeighboringDatesItem.PreloadContext preloadContext;
        String f84937b;
        if (this.f84958c.isLoading()) {
            return;
        }
        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        com.avito.konveyor.adapter.d dVar = adapter instanceof com.avito.konveyor.adapter.d ? (com.avito.konveyor.adapter.d) adapter : null;
        if (dVar == null) {
            return;
        }
        int iK1 = linearLayoutManager.K1();
        int iM1 = linearLayoutManager.M1();
        if (iK1 == -1 || iM1 == -1 || iK1 > iM1) {
            return;
        }
        while (true) {
            TV0.a aVar = (TV0.a) C42745f0.K(iK1, dVar.f53650c.f53994f);
            if (aVar != null && (aVar instanceof NeighboringDatesItem.NeighboringDatesShimmerItem) && (preloadContext = ((NeighboringDatesItem.NeighboringDatesShimmerItem) aVar).f84935c) != null && (f84937b = preloadContext.getF84937b()) != null) {
                LinkedHashSet linkedHashSet = this.f84960e;
                if (!linkedHashSet.contains(f84937b)) {
                    linkedHashSet.add(f84937b);
                    this.f84959d.invoke(f84937b);
                    return;
                }
            }
            if (iK1 == iM1) {
                return;
            } else {
                iK1++;
            }
        }
    }
}
