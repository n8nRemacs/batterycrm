package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes8.dex */
public final class kg1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ag1 f387126a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final hg1 f387127b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final Handler f387128c = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    private boolean f387129d;

    public class a implements Runnable {
        private a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            long adPosition = kg1.this.f387126a.getAdPosition();
            kg1.this.f387127b.a(kg1.this.f387126a.d(), adPosition);
            if (kg1.this.f387129d) {
                kg1.this.f387128c.postDelayed(this, 200L);
            }
        }

        public /* synthetic */ a(kg1 kg1Var, int i12) {
            this();
        }
    }

    public kg1(@j.N ag1 ag1Var, @j.N hg1 hg1Var) {
        this.f387126a = ag1Var;
        this.f387127b = hg1Var;
    }

    public final void a() {
        if (this.f387129d) {
            return;
        }
        this.f387129d = true;
        this.f387127b.a();
        this.f387128c.post(new a(this, 0));
    }

    public final void b() {
        if (this.f387129d) {
            this.f387127b.b();
            this.f387128c.removeCallbacksAndMessages(null);
            this.f387129d = false;
        }
    }
}
