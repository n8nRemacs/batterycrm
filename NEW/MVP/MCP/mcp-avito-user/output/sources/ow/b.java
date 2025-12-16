package Ow;

import Y61.k;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PaginationScrollListener.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOw/b;", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LinearLayoutManager f12716b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final N f12717c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f12718d = true;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@k LinearLayoutManager linearLayoutManager, @k Y41.a aVar) {
        this.f12716b = linearLayoutManager;
        this.f12717c = (N) aVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void k(@k RecyclerView recyclerView, int i12, int i13) {
        LinearLayoutManager linearLayoutManager = this.f12716b;
        int iO02 = linearLayoutManager.o0();
        if (!this.f12718d || iO02 <= 0) {
            return;
        }
        int iK1 = linearLayoutManager.K1();
        int iM1 = linearLayoutManager.M1();
        int i14 = iO02 - 1;
        if (iK1 < 0 || iM1 < i14) {
            return;
        }
        this.f12717c.invoke();
    }
}
