package com.avito.android.lib.design.tab_layout.util;

import Y61.k;
import androidx.viewpager2.widget.ViewPager2;
import com.avito.android.lib.design.tab_layout.c;
import kotlin.Metadata;

/* compiled from: ViewPagers.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/tab_layout/util/a;", "Landroidx/viewpager2/widget/ViewPager2$i;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class a extends ViewPager2.i {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final c.l f180917d;

    public a(@k c.l lVar) {
        this.f180917d = lVar;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public final void onPageScrollStateChanged(int i12) {
        this.f180917d.c(i12);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public final void onPageScrolled(int i12, float f12, int i13) {
        this.f180917d.h(i12, f12, i13);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public final void onPageSelected(int i12) {
        this.f180917d.b(i12);
    }
}
