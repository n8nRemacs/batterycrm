package defpackage;

import Y41.a;
import Y61.k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PaginationScrollListener.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Le;", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_gig_shift-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final a<Boolean> f394209b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final a<G0> f394210c;

    public e(@k a<Boolean> aVar, @k a<G0> aVar2) {
        this.f394209b = aVar;
        this.f394210c = aVar2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void k(@k RecyclerView recyclerView, int i12, int i13) {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        int iE02 = linearLayoutManager.e0();
        int iO02 = linearLayoutManager.o0();
        int iK1 = linearLayoutManager.K1();
        if (!this.f394209b.invoke().booleanValue() || iE02 + iK1 < iO02 || iK1 < 0) {
            return;
        }
        this.f394210c.invoke();
    }
}
