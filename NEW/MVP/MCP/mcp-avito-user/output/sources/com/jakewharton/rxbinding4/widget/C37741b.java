package com.jakewharton.rxbinding4.widget;

import android.widget.AbsListView;
import h41.AbstractC40770a;
import kotlin.Metadata;

/* compiled from: AbsListViewScrollEventObservable.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/b;", "Lio/reactivex/rxjava3/core/z;", "Lcom/jakewharton/rxbinding4/widget/a;", "a", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
/* renamed from: com.jakewharton.rxbinding4.widget.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C37741b extends io.reactivex.rxjava3.core.z<C37739a> {

    /* compiled from: AbsListViewScrollEventObservable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/b$a;", "Lh41/a;", "Landroid/widget/AbsListView$OnScrollListener;", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.jakewharton.rxbinding4.widget.b$a */
    public static final class a extends AbstractC40770a implements AbsListView.OnScrollListener {

        /* renamed from: c, reason: collision with root package name */
        public int f364215c;

        /* renamed from: d, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super C37739a> f364216d;

        public a(@Y61.k io.reactivex.rxjava3.core.G g12) {
            this.f364216d = g12;
        }

        @Override // h41.AbstractC40770a
        public final void n() {
            throw null;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScroll(@Y61.k AbsListView absListView, int i12, int i13, int i14) {
            if (this.f396996b.get()) {
                return;
            }
            this.f364216d.onNext(new C37739a(this.f364215c, i12, i13, i14));
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScrollStateChanged(@Y61.k AbsListView absListView, int i12) {
            this.f364215c = i12;
            if (!this.f396996b.get()) {
                throw null;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(@Y61.k io.reactivex.rxjava3.core.G<? super C37739a> g12) {
        if (Z01.b.a(g12)) {
            g12.b(new a(g12));
            throw null;
        }
    }
}
