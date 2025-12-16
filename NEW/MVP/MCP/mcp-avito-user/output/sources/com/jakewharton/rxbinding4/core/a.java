package com.jakewharton.rxbinding4.core;

import Y61.k;
import androidx.core.widget.NestedScrollView;
import com.jakewharton.rxbinding4.view.W;
import h41.AbstractC40770a;
import io.reactivex.rxjava3.core.G;
import io.reactivex.rxjava3.core.z;
import kotlin.Metadata;

/* compiled from: NestedScrollViewScrollChangeEventObservable.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/jakewharton/rxbinding4/core/a;", "Lio/reactivex/rxjava3/core/z;", "Lcom/jakewharton/rxbinding4/view/W;", "a", "rxbinding-core_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
final class a extends z<W> {

    /* compiled from: NestedScrollViewScrollChangeEventObservable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/jakewharton/rxbinding4/core/a$a;", "Lh41/a;", "Landroidx/core/widget/NestedScrollView$e;", "rxbinding-core_release"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.jakewharton.rxbinding4.core.a$a, reason: collision with other inner class name */
    public static final class C10772a extends AbstractC40770a implements NestedScrollView.e {

        /* renamed from: c, reason: collision with root package name */
        public final G<? super W> f364105c;

        public C10772a(@k G g12) {
            this.f364105c = g12;
        }

        @Override // androidx.core.widget.NestedScrollView.e
        public final void g(@k NestedScrollView nestedScrollView, int i12, int i13, int i14, int i15) {
            if (this.f396996b.get()) {
                return;
            }
            this.f364105c.onNext(new W(null, i12, i13, i14, i15));
        }

        @Override // h41.AbstractC40770a
        public final void n() {
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(@k G<? super W> g12) {
        if (Z01.b.a(g12)) {
            g12.b(new C10772a(g12));
            throw null;
        }
    }
}
