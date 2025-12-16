package ru.tinkoff.scrollingpagerindicator;

import androidx.viewpager2.widget.ViewPager2;

/* compiled from: ViewPager2Attacher.java */
/* loaded from: classes9.dex */
class h extends ViewPager2.i {

    /* renamed from: d, reason: collision with root package name */
    public boolean f437148d;

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public final void onPageScrollStateChanged(int i12) {
        this.f437148d = i12 == 0;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public final void onPageScrolled(int i12, float f12, int i13) {
        throw null;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public final void onPageSelected(int i12) {
        if (this.f437148d) {
            throw null;
        }
    }
}
