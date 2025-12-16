package com.jakewharton.rxbinding4.viewpager;

import Y61.k;
import androidx.viewpager.widget.ViewPager;
import h41.AbstractC40770a;
import io.reactivex.rxjava3.core.G;
import io.reactivex.rxjava3.core.z;
import kotlin.Metadata;

/* compiled from: ViewPagerPageScrolledObservable.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/jakewharton/rxbinding4/viewpager/h;", "Lio/reactivex/rxjava3/core/z;", "Lcom/jakewharton/rxbinding4/viewpager/f;", "a", "rxbinding-viewpager_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
final class h extends z<f> {
    @Override // io.reactivex.rxjava3.core.z
    public final void w0(@k G<? super f> g12) {
        if (Z01.b.a(g12)) {
            g12.b(new a(g12));
            throw null;
        }
    }

    /* compiled from: ViewPagerPageScrolledObservable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/jakewharton/rxbinding4/viewpager/h$a;", "Lh41/a;", "Landroidx/viewpager/widget/ViewPager$i;", "rxbinding-viewpager_release"}, k = 1, mv = {1, 4, 0})
    public static final class a extends AbstractC40770a implements ViewPager.i {

        /* renamed from: c, reason: collision with root package name */
        public final G<? super f> f364188c;

        public a(@k G g12) {
            this.f364188c = g12;
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void h(int i12, float f12, int i13) {
            if (this.f396996b.get()) {
                return;
            }
            this.f364188c.onNext(new f(f12, i12, i13));
        }

        @Override // h41.AbstractC40770a
        public final void n() {
            throw null;
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void b(int i12) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void c(int i12) {
        }
    }
}
