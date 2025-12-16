package rV;

import Y61.k;
import Y61.l;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Metadata;

/* compiled from: ViewPager2AttachDelegate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LrV/i;", "LrV/a;", "Landroidx/viewpager2/widget/ViewPager2;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i implements InterfaceC47597a<ViewPager2> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f429829a;

    /* renamed from: b, reason: collision with root package name */
    public ViewPager2 f429830b;

    /* renamed from: c, reason: collision with root package name */
    public RecyclerView.Adapter<?> f429831c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final b f429832d = new b();

    /* renamed from: e, reason: collision with root package name */
    @k
    public final a f429833e = new a();

    /* compiled from: ViewPager2AttachDelegate.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"rV/i$a", "Landroidx/recyclerview/widget/RecyclerView$g;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends RecyclerView.g {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void a() {
            i.this.c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void b(int i12, int i13) {
            i.this.c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void c(int i12, int i13, @l Object obj) {
            i.this.c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void d(int i12, int i13) {
            i.this.c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void e(int i12, int i13) {
            i.this.c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void f(int i12, int i13) {
            i.this.c();
        }
    }

    /* compiled from: ViewPager2AttachDelegate.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"rV/i$b", "Landroidx/viewpager2/widget/ViewPager2$i;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends ViewPager2.i {
        public b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public final void onPageSelected(int i12) {
            i.this.f429829a.a(i12, 0);
        }
    }

    public i(@k f fVar) {
        this.f429829a = fVar;
    }

    @Override // rV.InterfaceC47597a
    public final void a() {
        RecyclerView.Adapter<?> adapter = this.f429831c;
        if (adapter == null) {
            adapter = null;
        }
        adapter.unregisterAdapterDataObserver(this.f429833e);
        ViewPager2 viewPager2 = this.f429830b;
        (viewPager2 != null ? viewPager2 : null).i(this.f429832d);
    }

    public final void b(@k ViewPager2 viewPager2) {
        this.f429830b = viewPager2;
        RecyclerView.Adapter<?> adapter = viewPager2.getAdapter();
        if (adapter == null) {
            throw new IllegalArgumentException("ViewPager's Adapter must be set for PageIndicator");
        }
        this.f429831c = adapter;
        adapter.registerAdapterDataObserver(this.f429833e);
        ViewPager2 viewPager22 = this.f429830b;
        if (viewPager22 == null) {
            viewPager22 = null;
        }
        viewPager22.e(this.f429832d);
        c();
    }

    public final void c() {
        RecyclerView.Adapter<?> adapter = this.f429831c;
        if (adapter == null) {
            adapter = null;
        }
        int itemCount = adapter.getItemCount();
        f fVar = this.f429829a;
        fVar.b(itemCount);
        ViewPager2 viewPager2 = this.f429830b;
        if (viewPager2 == null) {
            viewPager2 = null;
        }
        int currentItem = viewPager2.getCurrentItem();
        if (currentItem >= 0) {
            RecyclerView.Adapter<?> adapter2 = this.f429831c;
            if (currentItem < (adapter2 != null ? adapter2 : null).getItemCount()) {
                fVar.a(currentItem, 0);
            }
        }
    }
}
