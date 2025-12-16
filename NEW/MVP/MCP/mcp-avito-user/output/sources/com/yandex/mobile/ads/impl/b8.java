package com.yandex.mobile.ads.impl;

import android.app.Dialog;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class b8 {

    /* renamed from: f, reason: collision with root package name */
    private static final long f383807f = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final i8 f383808a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final Dialog f383809b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final Handler f383810c = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final at f383811d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final br0 f383812e;

    public class a implements l8 {
        private a() {
        }

        public /* synthetic */ a(b8 b8Var, int i12) {
            this();
        }
    }

    public class b implements Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (b8.this.f383809b.getOwnerActivity() == null || b8.this.f383809b.getOwnerActivity().isFinishing()) {
                return;
            }
            b8.this.f383809b.dismiss();
        }

        public /* synthetic */ b(b8 b8Var, int i12) {
            this();
        }
    }

    public b8(@j.N Dialog dialog, @j.N i8 i8Var, @j.N at atVar, @j.N br0 br0Var) {
        this.f383808a = i8Var;
        this.f383809b = dialog;
        this.f383811d = atVar;
        this.f383812e = br0Var;
    }

    public static void c(b8 b8Var) {
        b8Var.f383810c.removeCallbacksAndMessages(null);
    }

    public final void a(@j.N String str) {
        int i12 = 0;
        this.f383808a.setAdtuneWebViewListener(new a(this, i12));
        this.f383808a.loadUrl(str);
        this.f383810c.postDelayed(new b(this, i12), f383807f);
        this.f383809b.show();
    }
}
