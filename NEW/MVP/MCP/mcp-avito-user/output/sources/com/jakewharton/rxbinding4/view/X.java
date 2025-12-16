package com.jakewharton.rxbinding4.view;

import android.view.View;
import h41.AbstractC40770a;
import kotlin.Metadata;

/* compiled from: ViewScrollChangeEventObservable.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/jakewharton/rxbinding4/view/X;", "Lio/reactivex/rxjava3/core/z;", "Lcom/jakewharton/rxbinding4/view/W;", "a", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
@j.X
/* loaded from: classes7.dex */
final class X extends io.reactivex.rxjava3.core.z<W> {

    /* compiled from: ViewScrollChangeEventObservable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/jakewharton/rxbinding4/view/X$a;", "Lh41/a;", "Landroid/view/View$OnScrollChangeListener;", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
    public static final class a extends AbstractC40770a implements View.OnScrollChangeListener {

        /* renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super W> f364168c;

        public a(@Y61.k io.reactivex.rxjava3.core.G g12) {
            this.f364168c = g12;
        }

        @Override // h41.AbstractC40770a
        public final void n() {
            throw null;
        }

        @Override // android.view.View.OnScrollChangeListener
        public final void onScrollChange(@Y61.k View view, int i12, int i13, int i14, int i15) {
            if (this.f396996b.get()) {
                return;
            }
            this.f364168c.onNext(new W(view, i12, i13, i14, i15));
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(@Y61.k io.reactivex.rxjava3.core.G<? super W> g12) {
        if (Z01.b.a(g12)) {
            g12.b(new a(g12));
            throw null;
        }
    }
}
