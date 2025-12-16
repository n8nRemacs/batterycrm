package com.yandex.mobile.ads.impl;

import androidx.viewpager2.widget.ViewPager2;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
public final class bj0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final WeakReference<ViewPager2> f383969a;

    public bj0(@Y61.k ViewPager2 viewPager2) {
        this.f383969a = new WeakReference<>(viewPager2);
    }

    public final void a() {
        ViewPager2 viewPager2 = this.f383969a.get();
        if (viewPager2 != null) {
            viewPager2.g(viewPager2.getCurrentItem() + 1, true);
        }
    }

    public final void b() {
        ViewPager2 viewPager2 = this.f383969a.get();
        if (viewPager2 != null) {
            viewPager2.g(viewPager2.getCurrentItem() - 1, true);
        }
    }
}
