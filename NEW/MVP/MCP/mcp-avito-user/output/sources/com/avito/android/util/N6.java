package com.avito.android.util;

import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.serp.adapter.skeleton.ScrollUnpredictiveGridLayoutManager;
import kotlin.Metadata;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C43175k;

/* compiled from: WidgetScrollTracker.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/util/N6;", "Landroidx/recyclerview/widget/RecyclerView$r;", "a", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class N6 extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ScrollUnpredictiveGridLayoutManager f318693b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.subjects.b<a> f318694c = io.reactivex.rxjava3.subjects.b.N0();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final kotlinx.coroutines.flow.e2 f318695d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final kotlinx.coroutines.flow.d2<a> f318696e;

    /* compiled from: WidgetScrollTracker.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/util/N6$a;", "", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f318697a;

        /* renamed from: b, reason: collision with root package name */
        public final int f318698b;

        public a(int i12, int i13) {
            this.f318697a = i12;
            this.f318698b = i13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f318697a == aVar.f318697a && this.f318698b == aVar.f318698b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f318698b) + (Integer.hashCode(this.f318697a) * 31);
        }

        @Y61.k
        public final String toString() {
            return "WidgetScrollState: firstPartiallyVisibleItemPosition = " + this.f318697a + ", lastPartiallyVisibleItemPosition = " + this.f318698b;
        }
    }

    public N6(@Y61.k ScrollUnpredictiveGridLayoutManager scrollUnpredictiveGridLayoutManager) {
        this.f318693b = scrollUnpredictiveGridLayoutManager;
        kotlinx.coroutines.flow.e2 e2VarA = kotlinx.coroutines.flow.f2.a(1, 1, BufferOverflow.f410778c);
        this.f318695d = e2VarA;
        this.f318696e = C43175k.a(e2VarA);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void k(@Y61.k RecyclerView recyclerView, int i12, int i13) {
        ScrollUnpredictiveGridLayoutManager scrollUnpredictiveGridLayoutManager = this.f318693b;
        a aVar = new a(scrollUnpredictiveGridLayoutManager.K1(), scrollUnpredictiveGridLayoutManager.M1());
        this.f318694c.onNext(aVar);
        this.f318695d.K5(aVar);
    }
}
