package com.jakewharton.rxbinding4.recyclerview;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import h41.AbstractC40770a;
import io.reactivex.rxjava3.core.G;
import io.reactivex.rxjava3.core.z;
import kotlin.Metadata;

/* compiled from: RecyclerViewChildAttachStateChangeEventObservable.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/jakewharton/rxbinding4/recyclerview/f;", "Lio/reactivex/rxjava3/core/z;", "Lcom/jakewharton/rxbinding4/recyclerview/e;", "a", "rxbinding-recyclerview_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
final class f extends z<e> {

    /* compiled from: RecyclerViewChildAttachStateChangeEventObservable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/jakewharton/rxbinding4/recyclerview/f$a;", "Lh41/a;", "Landroidx/recyclerview/widget/RecyclerView$o;", "rxbinding-recyclerview_release"}, k = 1, mv = {1, 4, 0})
    public static final class a extends AbstractC40770a implements RecyclerView.o {

        /* renamed from: c, reason: collision with root package name */
        public final G<? super e> f364109c;

        public a(@Y61.k G g12) {
            this.f364109c = g12;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public final void d(@Y61.k View view) {
            if (this.f396996b.get()) {
                return;
            }
            this.f364109c.onNext(new g(view));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public final void j(@Y61.k View view) {
            if (this.f396996b.get()) {
                return;
            }
            this.f364109c.onNext(new d(view));
        }

        @Override // h41.AbstractC40770a
        public final void n() {
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(@Y61.k G<? super e> g12) {
        if (Z01.b.a(g12)) {
            g12.b(new a(g12));
            throw null;
        }
    }
}
