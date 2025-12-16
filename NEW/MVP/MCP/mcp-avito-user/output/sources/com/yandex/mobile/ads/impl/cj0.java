package com.yandex.mobile.ads.impl;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.lang.ref.WeakReference;
import java.util.TimerTask;

/* loaded from: classes8.dex */
public final class cj0 extends TimerTask {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final bj0 f384316b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final ui0 f384317c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final WeakReference<ViewPager2> f384318d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    private int f384319e = 1;

    public cj0(@Y61.k ViewPager2 viewPager2, @Y61.k bj0 bj0Var, @Y61.k ui0 ui0Var) {
        this.f384316b = bj0Var;
        this.f384317c = ui0Var;
        this.f384318d = new WeakReference<>(viewPager2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(cj0 cj0Var, ViewPager2 viewPager2) {
        RecyclerView.Adapter adapter = viewPager2.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        if (itemCount != 0) {
            int currentItem = viewPager2.getCurrentItem();
            if (currentItem == 0) {
                cj0Var.f384319e = 1;
            } else if (currentItem == itemCount - 1) {
                cj0Var.f384319e = 2;
            }
        } else {
            cj0Var.cancel();
        }
        int iA2 = n6.a(cj0Var.f384319e);
        if (iA2 == 0) {
            cj0Var.f384316b.a();
        } else if (iA2 == 1) {
            cj0Var.f384316b.b();
        }
        cj0Var.f384317c.a();
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        ViewPager2 viewPager2 = this.f384318d.get();
        if (viewPager2 == null) {
            cancel();
        } else if (rj1.b(viewPager2) > 0) {
            viewPager2.post(new H(8, this, viewPager2));
        }
    }
}
