package com.avito.android.lib.design.tab_group.layout;

import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Metadata;

/* compiled from: TabGroupLayoutViewPagerExt.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/tab_group/layout/h;", "Landroidx/viewpager/widget/ViewPager$i;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h implements ViewPager.i {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPager2.i f180812b;

    public h(ViewPager2.i iVar) {
        this.f180812b = iVar;
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public final void b(int i12) {
        this.f180812b.onPageSelected(i12);
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public final void c(int i12) {
        this.f180812b.onPageScrollStateChanged(i12);
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public final void h(int i12, float f12, int i13) {
        this.f180812b.onPageScrolled(i12, f12, i13);
    }
}
