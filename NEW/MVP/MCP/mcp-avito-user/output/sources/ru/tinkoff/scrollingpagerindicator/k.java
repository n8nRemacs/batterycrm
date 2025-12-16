package ru.tinkoff.scrollingpagerindicator;

import androidx.viewpager.widget.ViewPager;

/* compiled from: ViewPagerAttacher.java */
/* loaded from: classes9.dex */
class k implements ViewPager.i {

    /* renamed from: b, reason: collision with root package name */
    public boolean f437149b;

    @Override // androidx.viewpager.widget.ViewPager.i
    public final void b(int i12) {
        if (this.f437149b) {
            throw null;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public final void c(int i12) {
        this.f437149b = i12 == 0;
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public final void h(int i12, float f12, int i13) {
        throw null;
    }
}
