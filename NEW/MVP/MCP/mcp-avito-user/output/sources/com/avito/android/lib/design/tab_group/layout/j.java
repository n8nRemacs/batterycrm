package com.avito.android.lib.design.tab_group.layout;

import androidx.viewpager2.widget.ViewPager2;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

/* compiled from: TabGroupLayoutViewPagerExt.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/tab_group/layout/j;", "Landroidx/viewpager2/widget/ViewPager2$i;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class j extends ViewPager2.i {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final WeakReference<d> f180813d;

    /* renamed from: e, reason: collision with root package name */
    public int f180814e;

    /* renamed from: f, reason: collision with root package name */
    public int f180815f;

    public j(@Y61.k WeakReference<d> weakReference) {
        this.f180813d = weakReference;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public final void onPageScrollStateChanged(int i12) {
        this.f180814e = this.f180815f;
        this.f180815f = i12;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public final void onPageScrolled(int i12, float f12, int i13) {
        d dVar = this.f180813d.get();
        if (dVar != null) {
            int i14 = this.f180815f;
            dVar.p(i12, f12, i14 != 2 || this.f180814e == 1, (i14 == 2 && this.f180814e == 0) ? false : true);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public final void onPageSelected(int i12) {
        d dVar = this.f180813d.get();
        if (dVar == null || dVar.getSelectedTabPosition() == i12 || i12 >= dVar.getTabCount()) {
            return;
        }
        int i13 = this.f180815f;
        dVar.o(dVar.j(i12), i13 == 0 || (i13 == 2 && this.f180814e == 0));
    }
}
