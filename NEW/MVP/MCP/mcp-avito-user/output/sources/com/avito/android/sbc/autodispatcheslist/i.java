package com.avito.android.sbc.autodispatcheslist;

import Y61.k;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SbcAutoDispatchesPaginationListener.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/autodispatcheslist/i;", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LinearLayoutManager f259114b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Y41.a<G0> f259115c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f259116d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f259117e;

    public i(@k LinearLayoutManager linearLayoutManager, @k Y41.a<G0> aVar) {
        this.f259114b = linearLayoutManager;
        this.f259115c = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void k(@k RecyclerView recyclerView, int i12, int i13) {
        LinearLayoutManager linearLayoutManager = this.f259114b;
        int iK1 = linearLayoutManager.K1() + linearLayoutManager.e0();
        long jO02 = (linearLayoutManager.o0() - 1) - 25;
        if (!this.f259116d || this.f259117e || 0 > jO02 || jO02 > iK1) {
            return;
        }
        this.f259115c.invoke();
    }
}
