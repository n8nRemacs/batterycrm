package com.jakewharton.rxbinding4.view;

import android.view.View;
import android.view.ViewGroup;
import h41.AbstractC40770a;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ViewLayoutChangeObservable.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/jakewharton/rxbinding4/view/U;", "Lio/reactivex/rxjava3/core/z;", "Lkotlin/G0;", "a", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
final class U extends io.reactivex.rxjava3.core.z<G0> {

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f364159b;

    /* compiled from: ViewLayoutChangeObservable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/jakewharton/rxbinding4/view/U$a;", "Lh41/a;", "Landroid/view/View$OnLayoutChangeListener;", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
    public static final class a extends AbstractC40770a implements View.OnLayoutChangeListener {

        /* renamed from: c, reason: collision with root package name */
        public final ViewGroup f364160c;

        /* renamed from: d, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super G0> f364161d;

        public a(@Y61.k ViewGroup viewGroup, @Y61.k io.reactivex.rxjava3.core.G g12) {
            this.f364160c = viewGroup;
            this.f364161d = g12;
        }

        @Override // h41.AbstractC40770a
        public final void n() {
            this.f364160c.removeOnLayoutChangeListener(this);
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(@Y61.k View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            if (this.f396996b.get()) {
                return;
            }
            this.f364161d.onNext(G0.f406611a);
        }
    }

    public U(@Y61.k ViewGroup viewGroup) {
        this.f364159b = viewGroup;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(@Y61.k io.reactivex.rxjava3.core.G<? super G0> g12) {
        if (Z01.b.a(g12)) {
            ViewGroup viewGroup = this.f364159b;
            a aVar = new a(viewGroup, g12);
            g12.b(aVar);
            viewGroup.addOnLayoutChangeListener(aVar);
        }
    }
}
