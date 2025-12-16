package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import java.util.List;

/* loaded from: classes8.dex */
public final class x30 {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final j70 f391537b;

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ak1 f391536a = new ak1();

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final y30 f391538c = new y30();

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final Handler f391539d = new Handler(Looper.getMainLooper());

    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        @j.N
        private final com.yandex.mobile.ads.nativeads.w f391540b;

        public a(com.yandex.mobile.ads.nativeads.w wVar) {
            this.f391540b = wVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            View viewE = this.f391540b.e();
            if (viewE instanceof FrameLayout) {
                x30.this.f391538c.a(x30.this.f391537b.a(viewE.getContext()), (FrameLayout) viewE);
                x30 x30Var = x30.this;
                x30Var.f391539d.postDelayed(x30Var.new a(this.f391540b), 300L);
            }
        }
    }

    public x30(@j.N dn0 dn0Var, @j.N List<q31> list) {
        this.f391537b = k70.a(dn0Var, list);
    }

    public final void a(@j.N Context context, @j.N com.yandex.mobile.ads.nativeads.w wVar) {
        this.f391536a.getClass();
        q21 q21VarB = q21.b();
        v11 v11VarA = q21VarB.a(context);
        Boolean boolG0 = v11VarA != null ? v11VarA.g0() : null;
        if (boolG0 != null ? boolG0.booleanValue() : q21VarB.e() && h7.a(context)) {
            this.f391539d.post(new a(wVar));
        }
    }

    public final void a() {
        this.f391539d.removeCallbacksAndMessages(null);
    }

    public final void a(@j.N com.yandex.mobile.ads.nativeads.w wVar) {
        a();
        View viewE = wVar.e();
        if (viewE instanceof FrameLayout) {
            this.f391538c.a((FrameLayout) viewE);
        }
    }
}
