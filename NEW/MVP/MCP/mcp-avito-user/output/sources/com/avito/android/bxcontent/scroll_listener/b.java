package com.avito.android.bxcontent.scroll_listener;

import Y61.k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ScrollToLastItemListener.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/scroll_listener/b;", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LinearLayoutManager f112828b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final RecyclerView f112829c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Y41.a<G0> f112830d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f112831e;

    public b(@k LinearLayoutManager linearLayoutManager, @k RecyclerView recyclerView, @k Y41.a<G0> aVar) {
        this.f112828b = linearLayoutManager;
        this.f112829c = recyclerView;
        this.f112830d = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void k(@k RecyclerView recyclerView, int i12, int i13) {
        if (i12 == 0 && i13 == 0) {
            return;
        }
        l();
    }

    public final void l() {
        int iO02;
        LinearLayoutManager linearLayoutManager = this.f112828b;
        int iL1 = linearLayoutManager.L1();
        if (iL1 != -1 && (iO02 = linearLayoutManager.o0()) > 0 && iL1 == iO02 - 1 && !this.f112831e) {
            this.f112831e = true;
            this.f112830d.invoke();
        }
    }

    public final void m() {
        D6.C(new a(this), this.f112829c);
    }
}
