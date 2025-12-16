package rV;

import Y61.k;
import Y61.l;
import android.content.res.Resources;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import tV.C48606a;

/* compiled from: RecyclerViewAttachDelegate.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LrV/h;", "LrV/a;", "Landroidx/recyclerview/widget/RecyclerView;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h implements InterfaceC47597a<RecyclerView> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f429821a;

    /* renamed from: c, reason: collision with root package name */
    public RecyclerView f429823c;

    /* renamed from: d, reason: collision with root package name */
    public RecyclerView.Adapter<?> f429824d;

    /* renamed from: b, reason: collision with root package name */
    public final int f429822b = Resources.getSystem().getDisplayMetrics().widthPixels / 2;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final b f429825e = new b();

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a f429826f = new a();

    /* compiled from: RecyclerViewAttachDelegate.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"rV/h$a", "Landroidx/recyclerview/widget/RecyclerView$g;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends RecyclerView.g {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void a() {
            h.this.c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void b(int i12, int i13) {
            h.this.c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void c(int i12, int i13, @l Object obj) {
            h.this.c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void d(int i12, int i13) {
            h.this.c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void e(int i12, int i13) {
            h.this.c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void f(int i12, int i13) {
            h.this.c();
        }
    }

    /* compiled from: RecyclerViewAttachDelegate.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"rV/h$b", "Landroidx/recyclerview/widget/RecyclerView$r;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends RecyclerView.r {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void k(@k RecyclerView recyclerView, int i12, int i13) {
            h.this.d(i12);
        }
    }

    public h(@k f fVar) {
        this.f429821a = fVar;
    }

    @Override // rV.InterfaceC47597a
    public final void a() {
        RecyclerView recyclerView = this.f429823c;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.v0(this.f429825e);
        RecyclerView.Adapter<?> adapter = this.f429824d;
        (adapter != null ? adapter : null).unregisterAdapterDataObserver(this.f429826f);
    }

    public final void b(@k RecyclerView recyclerView) {
        this.f429823c = recyclerView;
        RecyclerView.Adapter<?> adapter = recyclerView.getAdapter();
        if (adapter == null) {
            throw new IllegalArgumentException("RecyclerView's Adapter must be set for PageIndicator");
        }
        this.f429824d = adapter;
        RecyclerView recyclerView2 = this.f429823c;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        RecyclerView.m layoutManager = recyclerView2.getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null) == null) {
            throw new IllegalArgumentException("PageIndicator supports only LinearLayoutManager");
        }
        if (!c()) {
            this.f429821a.a(0, 0);
        }
        RecyclerView recyclerView3 = this.f429823c;
        if (recyclerView3 == null) {
            recyclerView3 = null;
        }
        recyclerView3.o(this.f429825e);
        RecyclerView.Adapter<?> adapter2 = this.f429824d;
        (adapter2 != null ? adapter2 : null).registerAdapterDataObserver(this.f429826f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c() {
        RecyclerView.Adapter<?> adapter = this.f429824d;
        RecyclerView.Adapter adapter2 = adapter;
        if (adapter == null) {
            adapter2 = 0;
        }
        this.f429821a.b(adapter2 instanceof InterfaceC47599c ? ((InterfaceC47599c) adapter2).f() : adapter2.getItemCount());
        return d(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d(int i12) {
        RecyclerView recyclerView = this.f429823c;
        Integer num = null;
        if (recyclerView == null) {
            recyclerView = null;
        }
        int iA2 = C48606a.a(this.f429822b, recyclerView);
        Integer numValueOf = Integer.valueOf(iA2);
        if (iA2 != -1) {
            RecyclerView.Adapter<?> adapter = this.f429824d;
            RecyclerView.Adapter adapter2 = adapter;
            if (adapter == null) {
                adapter2 = 0;
            }
            if (iA2 < (adapter2 instanceof InterfaceC47599c ? ((InterfaceC47599c) adapter2).f() : adapter2.getItemCount())) {
                num = numValueOf;
            }
        }
        if (num == null) {
            return false;
        }
        this.f429821a.a(num.intValue(), i12);
        return true;
    }
}
