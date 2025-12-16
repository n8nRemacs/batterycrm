package com.yandex.mobile.ads.impl;

import androidx.viewpager2.widget.ViewPager2;
import java.lang.ref.WeakReference;
import java.util.Timer;

/* loaded from: classes8.dex */
public final class ri0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final bj0 f389545a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final ui0 f389546b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final WeakReference<ViewPager2> f389547c;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    private cj0 f389549e;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final Timer f389548d = new Timer();

    /* renamed from: f, reason: collision with root package name */
    private boolean f389550f = true;

    public ri0(@Y61.k ViewPager2 viewPager2, @Y61.k bj0 bj0Var, @Y61.k ui0 ui0Var) {
        this.f389545a = bj0Var;
        this.f389546b = ui0Var;
        this.f389547c = new WeakReference<>(viewPager2);
    }

    public final void a(long j12) {
        kotlin.G0 g02;
        if (j12 <= 0 || !this.f389550f) {
            return;
        }
        b();
        ViewPager2 viewPager2 = this.f389547c.get();
        if (viewPager2 != null) {
            cj0 cj0Var = new cj0(viewPager2, this.f389545a, this.f389546b);
            this.f389549e = cj0Var;
            try {
                this.f389548d.schedule(cj0Var, j12, j12);
            } catch (Exception unused) {
                b();
            }
            g02 = kotlin.G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            a();
        }
    }

    public final void b() {
        cj0 cj0Var = this.f389549e;
        if (cj0Var != null) {
            cj0Var.cancel();
        }
        this.f389549e = null;
    }

    public final void a() {
        b();
        this.f389550f = false;
        this.f389548d.cancel();
    }
}
