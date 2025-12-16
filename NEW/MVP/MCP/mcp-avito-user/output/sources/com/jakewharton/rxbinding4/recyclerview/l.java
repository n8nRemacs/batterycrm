package com.jakewharton.rxbinding4.recyclerview;

import androidx.recyclerview.widget.RecyclerView;
import h41.AbstractC40770a;
import io.reactivex.rxjava3.core.G;
import io.reactivex.rxjava3.core.z;
import kotlin.Metadata;

/* compiled from: RecyclerViewScrollEventObservable.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/jakewharton/rxbinding4/recyclerview/l;", "Lio/reactivex/rxjava3/core/z;", "Lcom/jakewharton/rxbinding4/recyclerview/k;", "a", "rxbinding-recyclerview_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
final class l extends z<k> {

    /* renamed from: b, reason: collision with root package name */
    public final RecyclerView f364118b;

    /* compiled from: RecyclerViewScrollEventObservable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/jakewharton/rxbinding4/recyclerview/l$a;", "Lh41/a;", "rxbinding-recyclerview_release"}, k = 1, mv = {1, 4, 0})
    public static final class a extends AbstractC40770a {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final C10775a f364119c;

        /* renamed from: d, reason: collision with root package name */
        public final RecyclerView f364120d;

        /* compiled from: RecyclerViewScrollEventObservable.kt */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/jakewharton/rxbinding4/recyclerview/l$a$a", "Landroidx/recyclerview/widget/RecyclerView$r;", "rxbinding-recyclerview_release"}, k = 1, mv = {1, 4, 0})
        /* renamed from: com.jakewharton.rxbinding4.recyclerview.l$a$a, reason: collision with other inner class name */
        public static final class C10775a extends RecyclerView.r {

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ G f364122c;

            public C10775a(G g12) {
                this.f364122c = g12;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.r
            public final void k(@Y61.k RecyclerView recyclerView, int i12, int i13) {
                if (a.this.f396996b.get()) {
                    return;
                }
                this.f364122c.onNext(new k(recyclerView, i12, i13));
            }
        }

        public a(@Y61.k RecyclerView recyclerView, @Y61.k G<? super k> g12) {
            this.f364120d = recyclerView;
            this.f364119c = new C10775a(g12);
        }

        @Override // h41.AbstractC40770a
        public final void n() {
            this.f364120d.v0(this.f364119c);
        }
    }

    public l(@Y61.k RecyclerView recyclerView) {
        this.f364118b = recyclerView;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(@Y61.k G<? super k> g12) {
        if (Z01.b.a(g12)) {
            RecyclerView recyclerView = this.f364118b;
            a aVar = new a(recyclerView, g12);
            g12.b(aVar);
            recyclerView.o(aVar.f364119c);
        }
    }
}
