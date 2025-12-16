package WO0;

import Y61.k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PaginationScrollListener.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LWO0/a;", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LinearLayoutManager f17912b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Y41.a<G0> f17913c;

    /* renamed from: e, reason: collision with root package name */
    public int f17915e;

    /* renamed from: d, reason: collision with root package name */
    public final int f17914d = 20;

    /* renamed from: f, reason: collision with root package name */
    public boolean f17916f = true;

    public a(@k LinearLayoutManager linearLayoutManager, @k Y41.a<G0> aVar) {
        this.f17912b = linearLayoutManager;
        this.f17913c = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void k(@k RecyclerView recyclerView, int i12, int i13) {
        LinearLayoutManager linearLayoutManager = this.f17912b;
        int iE02 = linearLayoutManager.e0();
        int iO02 = linearLayoutManager.o0();
        int iK1 = linearLayoutManager.K1();
        if (iO02 == 0) {
            this.f17916f = true;
        }
        if (this.f17916f && iO02 > this.f17915e) {
            this.f17916f = false;
        }
        this.f17915e = iO02;
        if (this.f17916f || iK1 + iE02 + this.f17914d < iO02) {
            return;
        }
        this.f17916f = true;
        this.f17913c.invoke();
    }
}
