package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.nativeads.Rating;

/* loaded from: classes8.dex */
public final class tk0 {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f390216c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static volatile tk0 f390217d;

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Handler f390218a = new Handler();

    /* renamed from: b, reason: collision with root package name */
    private boolean f390219b;

    private tk0() {
    }

    public final void b(@j.N View view, @j.N MotionEvent motionEvent) {
        if ((view instanceof TextView) || (view instanceof Rating)) {
            a(view, motionEvent);
        }
    }

    public static tk0 a() {
        if (f390217d == null) {
            synchronized (f390216c) {
                try {
                    if (f390217d == null) {
                        f390217d = new tk0();
                    }
                } finally {
                }
            }
        }
        return f390217d;
    }

    private void a(@j.N View view, @j.N MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (!this.f390219b) {
                view.setAlpha(view.getAlpha() / 2.0f);
                this.f390219b = true;
            }
            this.f390218a.postDelayed(new H(23, this, view), 100L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view) {
        if (this.f390219b) {
            view.setAlpha(view.getAlpha() * 2.0f);
            this.f390219b = false;
        }
    }
}
