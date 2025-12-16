package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes8.dex */
public final class vr0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final h00 f390981a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final r00 f390982b;

    /* renamed from: f, reason: collision with root package name */
    private boolean f390986f;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final j41 f390984d = new j41();

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final Handler f390983c = new Handler(Looper.getMainLooper());

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final c5 f390985e = new c5();

    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f390987b;

        public a(long j12) {
            this.f390987b = j12;
        }

        @Override // java.lang.Runnable
        public final void run() {
            vr0.this.f390983c.postDelayed(vr0.this.f390985e, this.f390987b);
        }
    }

    public vr0(@j.N j00 j00Var, @j.N h00 h00Var) {
        this.f390982b = j00Var;
        this.f390981a = h00Var;
    }

    public final void a(int i12, String str) {
        this.f390986f = true;
        this.f390983c.removeCallbacks(this.f390985e);
        this.f390983c.post(new ml1(i12, str, this.f390982b));
    }

    public final void b() {
        if (this.f390986f) {
            return;
        }
        this.f390984d.a(new a(this.f390981a.a()));
    }

    public final void a(@j.P q00 q00Var) {
        this.f390985e.a(q00Var);
    }

    public final void a() {
        this.f390983c.removeCallbacksAndMessages(null);
        this.f390985e.a(null);
    }
}
