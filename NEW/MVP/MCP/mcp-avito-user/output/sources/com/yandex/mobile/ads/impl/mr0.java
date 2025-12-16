package com.yandex.mobile.ads.impl;

import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes8.dex */
public final class mr0 extends ViewPager2.i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final ui0 f388062a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    private final ri0 f388063b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f388064c;

    public mr0(@Y61.k ui0 ui0Var, @Y61.l ri0 ri0Var) {
        this.f388062a = ui0Var;
        this.f388063b = ri0Var;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public final void onPageScrollStateChanged(int i12) {
        if (i12 == 0) {
            this.f388064c = false;
        } else {
            if (i12 != 1) {
                return;
            }
            ri0 ri0Var = this.f388063b;
            if (ri0Var != null) {
                ri0Var.a();
            }
            this.f388064c = true;
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public final void onPageSelected(int i12) {
        if (this.f388064c) {
            this.f388062a.c();
            this.f388064c = false;
        }
    }
}
