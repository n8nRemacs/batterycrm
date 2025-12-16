package com.jakewharton.rxbinding4.swiperefreshlayout;

import Y61.k;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import h41.AbstractC40770a;
import io.reactivex.rxjava3.core.G;
import io.reactivex.rxjava3.core.z;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SwipeRefreshLayoutRefreshObservable.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/jakewharton/rxbinding4/swiperefreshlayout/d;", "Lio/reactivex/rxjava3/core/z;", "Lkotlin/G0;", "a", "rxbinding-swiperefreshlayout_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
final class d extends z<G0> {

    /* renamed from: b, reason: collision with root package name */
    public final SwipeRefreshLayout f364128b;

    /* compiled from: SwipeRefreshLayoutRefreshObservable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/jakewharton/rxbinding4/swiperefreshlayout/d$a;", "Lh41/a;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$f;", "rxbinding-swiperefreshlayout_release"}, k = 1, mv = {1, 4, 0})
    public static final class a extends AbstractC40770a implements SwipeRefreshLayout.f {

        /* renamed from: c, reason: collision with root package name */
        public final SwipeRefreshLayout f364129c;

        /* renamed from: d, reason: collision with root package name */
        public final G<? super G0> f364130d;

        public a(@k SwipeRefreshLayout swipeRefreshLayout, @k G<? super G0> g12) {
            this.f364129c = swipeRefreshLayout;
            this.f364130d = g12;
        }

        @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
        public final void j0() {
            if (this.f396996b.get()) {
                return;
            }
            this.f364130d.onNext(G0.f406611a);
        }

        @Override // h41.AbstractC40770a
        public final void n() {
            this.f364129c.setOnRefreshListener(null);
        }
    }

    public d(@k SwipeRefreshLayout swipeRefreshLayout) {
        this.f364128b = swipeRefreshLayout;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(@k G<? super G0> g12) {
        if (Z01.b.a(g12)) {
            SwipeRefreshLayout swipeRefreshLayout = this.f364128b;
            a aVar = new a(swipeRefreshLayout, g12);
            g12.b(aVar);
            swipeRefreshLayout.setOnRefreshListener(aVar);
        }
    }
}
