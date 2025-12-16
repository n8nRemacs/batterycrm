package com.avito.android.scroll_tracker;

import Y61.l;
import android.content.res.Resources;
import android.view.View;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.serp.adapter.skeleton.ScrollUnpredictiveGridLayoutManager;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SnippetScrollTracker.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/scroll_tracker/h;", "Landroidx/recyclerview/widget/RecyclerView$r;", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ScrollUnpredictiveGridLayoutManager f261719b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.subjects.e<G0> f261720c = new io.reactivex.rxjava3.subjects.e<>();

    /* renamed from: d, reason: collision with root package name */
    public final int f261721d;

    /* compiled from: SnippetScrollTracker.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/scroll_tracker/h$a;", "", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f261722a;

        /* renamed from: b, reason: collision with root package name */
        public final int f261723b;

        public a(int i12, int i13) {
            this.f261722a = i12;
            this.f261723b = i13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f261722a == aVar.f261722a && this.f261723b == aVar.f261723b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f261723b) + (Integer.hashCode(this.f261722a) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SnippetScrollState(firstVisibleItemPosition=");
            sb2.append(this.f261722a);
            sb2.append(", lastVisibleItemPosition=");
            return r.t(sb2, this.f261723b, ')');
        }
    }

    public h(@Y61.k ScrollUnpredictiveGridLayoutManager scrollUnpredictiveGridLayoutManager, @Y61.k Resources resources) {
        this.f261719b = scrollUnpredictiveGridLayoutManager;
        this.f261721d = (int) resources.getDimension(R.dimen.toolbar_search_layout_height);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void k(@Y61.k RecyclerView recyclerView, int i12, int i13) {
        this.f261720c.onNext(G0.f406611a);
    }

    public final boolean l(View view, RecyclerView recyclerView) {
        return view.getY() + ((float) view.getHeight()) > recyclerView.getY() + ((float) this.f261721d) && view.getY() < recyclerView.getY() + ((float) recyclerView.getHeight());
    }
}
