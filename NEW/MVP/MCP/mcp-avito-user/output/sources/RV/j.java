package rV;

import Y61.k;
import android.database.DataSetObserver;
import androidx.viewpager.widget.ViewPager;
import kotlin.Metadata;

/* compiled from: ViewPagerAttachDelegate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LrV/j;", "LrV/a;", "Landroidx/viewpager/widget/ViewPager;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class j implements InterfaceC47597a<ViewPager> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f429836a;

    /* renamed from: b, reason: collision with root package name */
    public ViewPager f429837b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.viewpager.widget.a f429838c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final b f429839d = new b();

    /* renamed from: e, reason: collision with root package name */
    @k
    public final a f429840e = new a();

    /* compiled from: ViewPagerAttachDelegate.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"rV/j$a", "Landroid/database/DataSetObserver;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends DataSetObserver {
        public a() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            j.this.c();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            j.this.c();
        }
    }

    /* compiled from: ViewPagerAttachDelegate.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"rV/j$b", "Landroidx/viewpager/widget/ViewPager$l;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends ViewPager.l {
        public b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.l, androidx.viewpager.widget.ViewPager.i
        public final void b(int i12) {
            j.this.f429836a.a(i12, 0);
        }
    }

    public j(@k f fVar) {
        this.f429836a = fVar;
    }

    @Override // rV.InterfaceC47597a
    public final void a() {
        androidx.viewpager.widget.a aVar = this.f429838c;
        if (aVar == null) {
            aVar = null;
        }
        aVar.n(this.f429840e);
        ViewPager viewPager = this.f429837b;
        (viewPager != null ? viewPager : null).u(this.f429839d);
    }

    public final void b(@k ViewPager viewPager) {
        this.f429837b = viewPager;
        androidx.viewpager.widget.a adapter = viewPager.getAdapter();
        if (adapter == null) {
            throw new IllegalArgumentException("ViewPager's Adapter must be set for PageIndicator");
        }
        this.f429838c = adapter;
        adapter.i(this.f429840e);
        ViewPager viewPager2 = this.f429837b;
        if (viewPager2 == null) {
            viewPager2 = null;
        }
        viewPager2.c(this.f429839d);
        c();
    }

    public final void c() {
        androidx.viewpager.widget.a aVar = this.f429838c;
        if (aVar == null) {
            aVar = null;
        }
        int iC2 = aVar.c();
        f fVar = this.f429836a;
        fVar.b(iC2);
        ViewPager viewPager = this.f429837b;
        if (viewPager == null) {
            viewPager = null;
        }
        int currentItem = viewPager.getCurrentItem();
        if (currentItem >= 0) {
            androidx.viewpager.widget.a aVar2 = this.f429838c;
            if (currentItem < (aVar2 != null ? aVar2 : null).c()) {
                fVar.a(currentItem, 0);
            }
        }
    }
}
