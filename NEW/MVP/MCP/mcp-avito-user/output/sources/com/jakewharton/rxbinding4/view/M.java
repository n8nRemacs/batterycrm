package com.jakewharton.rxbinding4.view;

import android.view.View;
import android.view.ViewGroup;
import h41.AbstractC40770a;
import kotlin.Metadata;

/* compiled from: ViewGroupHierarchyChangeEventObservable.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/jakewharton/rxbinding4/view/M;", "Lio/reactivex/rxjava3/core/z;", "Lcom/jakewharton/rxbinding4/view/L;", "a", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
final class M extends io.reactivex.rxjava3.core.z<L> {

    /* compiled from: ViewGroupHierarchyChangeEventObservable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/jakewharton/rxbinding4/view/M$a;", "Lh41/a;", "Landroid/view/ViewGroup$OnHierarchyChangeListener;", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
    public static final class a extends AbstractC40770a implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super L> f364142c;

        public a(@Y61.k io.reactivex.rxjava3.core.G g12) {
            this.f364142c = g12;
        }

        @Override // h41.AbstractC40770a
        public final void n() {
            throw null;
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(@Y61.k View view, @Y61.k View view2) {
            if (this.f396996b.get()) {
                return;
            }
            this.f364142c.onNext(new N(view2));
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(@Y61.k View view, @Y61.k View view2) {
            if (this.f396996b.get()) {
                return;
            }
            this.f364142c.onNext(new O(view2));
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(@Y61.k io.reactivex.rxjava3.core.G<? super L> g12) {
        if (Z01.b.a(g12)) {
            g12.b(new a(g12));
            throw null;
        }
    }
}
