package com.avito.android.delivery_common;

import Y61.k;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ShadowScrollListener.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_common/h;", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_delivery-common_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    public final int f135011b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Y41.a<G0> f135012c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Y41.a<G0> f135013d;

    public h(int i12, @k Y41.a<G0> aVar, @k Y41.a<G0> aVar2) {
        this.f135011b = i12;
        this.f135012c = aVar;
        this.f135013d = aVar2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void k(@k RecyclerView recyclerView, int i12, int i13) {
        if (recyclerView.canScrollVertically(this.f135011b)) {
            this.f135012c.invoke();
        } else {
            this.f135013d.invoke();
        }
    }
}
