package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes8.dex */
public final class og1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final ei1 f388516a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final a f388517b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final Handler f388518c = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    private boolean f388519d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f388520e;

    public interface a {
        void a();
    }

    public final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (og1.this.f388519d || !og1.this.f388516a.a()) {
                og1.this.f388518c.postDelayed(this, 200L);
                return;
            }
            og1.this.f388517b.a();
            og1.this.f388519d = true;
            og1.this.b();
        }
    }

    public og1(@Y61.k ei1 ei1Var, @Y61.k a aVar) {
        this.f388516a = ei1Var;
        this.f388517b = aVar;
    }

    public final void a() {
        if (this.f388520e || this.f388519d) {
            return;
        }
        this.f388520e = true;
        this.f388518c.post(new b());
    }

    public final void b() {
        this.f388518c.removeCallbacksAndMessages(null);
        this.f388520e = false;
    }
}
