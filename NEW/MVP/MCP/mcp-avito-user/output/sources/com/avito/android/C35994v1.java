package com.avito.android;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: PaginationScrollListener.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/v1;", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_feedback-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.v1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C35994v1 extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LinearLayoutManager f319195b;

    /* renamed from: c, reason: collision with root package name */
    public final int f319196c = 3;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.a<kotlin.G0> f319197d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f319198e;

    public C35994v1(@Y61.k LinearLayoutManager linearLayoutManager, @Y61.k Y41.a aVar) {
        this.f319195b = linearLayoutManager;
        this.f319197d = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void k(@Y61.k RecyclerView recyclerView, int i12, int i13) {
        l();
    }

    public final void l() {
        LinearLayoutManager linearLayoutManager;
        int iO02;
        if (!this.f319198e || (iO02 = (linearLayoutManager = this.f319195b).o0()) <= 0) {
            return;
        }
        int iE02 = linearLayoutManager.e0();
        int iK1 = linearLayoutManager.K1();
        if (iK1 < 0 || iK1 + iE02 < iO02 - this.f319196c) {
            return;
        }
        this.f319197d.invoke();
    }
}
