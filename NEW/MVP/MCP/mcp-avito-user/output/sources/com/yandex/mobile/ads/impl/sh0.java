package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
final class sh0 implements oj {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final View f389944a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final Handler f389945b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final ic1 f389946c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f389947d;

    public static class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        @j.N
        private final WeakReference<View> f389948b;

        public a(@j.N View view) {
            this.f389948b = new WeakReference<>(view);
        }

        @Override // java.lang.Runnable
        public final void run() {
            View view = this.f389948b.get();
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    public sh0(@j.N FrameLayout frameLayout, @j.N ic1 ic1Var) {
        this.f389944a = frameLayout;
        frameLayout.setVisibility(8);
        this.f389946c = ic1Var;
    }

    @Override // com.yandex.mobile.ads.impl.oj
    public final void a() {
    }

    @Override // com.yandex.mobile.ads.impl.oj
    public final void c() {
        if (this.f389947d) {
            return;
        }
        this.f389945b.postDelayed(new a(this.f389944a), 200L);
    }

    @Override // com.yandex.mobile.ads.impl.oj
    @j.N
    public final View d() {
        return this.f389944a;
    }

    @Override // com.yandex.mobile.ads.impl.oj
    public final void a(boolean z12) {
        this.f389947d = true;
        this.f389945b.removeCallbacksAndMessages(null);
        ic1 ic1Var = this.f389946c;
        View view = this.f389944a;
        ic1Var.getClass();
        view.setVisibility(z12 ? 8 : 0);
    }

    @Override // com.yandex.mobile.ads.impl.oj
    public final void b() {
    }

    @Override // com.yandex.mobile.ads.impl.oj
    public final void invalidate() {
    }
}
