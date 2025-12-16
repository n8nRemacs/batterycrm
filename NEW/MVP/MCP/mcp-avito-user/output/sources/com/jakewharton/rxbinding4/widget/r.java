package com.jakewharton.rxbinding4.widget;

import android.widget.PopupMenu;
import h41.AbstractC40770a;
import kotlin.Metadata;

/* compiled from: PopupMenuDismissObservable.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/r;", "Lio/reactivex/rxjava3/core/z;", "Lkotlin/G0;", "a", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
final class r extends io.reactivex.rxjava3.core.z<kotlin.G0> {

    /* compiled from: PopupMenuDismissObservable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/r$a;", "Lh41/a;", "Landroid/widget/PopupMenu$OnDismissListener;", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
    public static final class a extends AbstractC40770a implements PopupMenu.OnDismissListener {

        /* renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super kotlin.G0> f364238c;

        public a(@Y61.k io.reactivex.rxjava3.core.G g12) {
            this.f364238c = g12;
        }

        @Override // h41.AbstractC40770a
        public final void n() {
            throw null;
        }

        @Override // android.widget.PopupMenu.OnDismissListener
        public final void onDismiss(@Y61.k PopupMenu popupMenu) {
            if (this.f396996b.get()) {
                return;
            }
            this.f364238c.onNext(kotlin.G0.f406611a);
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(@Y61.k io.reactivex.rxjava3.core.G<? super kotlin.G0> g12) {
        if (Z01.b.a(g12)) {
            new a(g12);
            throw null;
        }
    }
}
