package com.yandex.mobile.ads.impl;

import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes8.dex */
public class ii0 extends ye {

    /* renamed from: b, reason: collision with root package name */
    final vh0 f386496b;

    public ii0(@j.N nr0 nr0Var, @j.N q00 q00Var) {
        super(nr0Var);
        vh0 vh0Var = new vh0(nr0Var);
        this.f386496b = vh0Var;
        vh0Var.a(new a(q00Var));
    }

    @Override // com.yandex.mobile.ads.impl.ye, com.yandex.mobile.ads.impl.k00
    public final void a(@j.N String str) {
        this.f386496b.a(str);
    }

    @Override // com.yandex.mobile.ads.impl.ye, com.yandex.mobile.ads.impl.k00
    public final void invalidate() {
        super.invalidate();
        this.f386496b.a();
    }

    public static class a implements fi0 {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        private final WeakReference<q00> f386497a;

        public a(@j.N q00 q00Var) {
            this.f386497a = new WeakReference<>(q00Var);
        }

        @Override // com.yandex.mobile.ads.impl.fi0
        public final void a(@j.N nr0 nr0Var, @j.P Map map) {
            q00 q00Var = this.f386497a.get();
            if (q00Var != null) {
                q00Var.a(nr0Var, map);
            }
        }

        @Override // com.yandex.mobile.ads.impl.fi0
        public final void a(@j.N String str) {
            q00 q00Var = this.f386497a.get();
            if (q00Var != null) {
                q00Var.a(str);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.ye
    public final void a(@j.N q00 q00Var) {
        super.a(new ai0(this.f386496b, q00Var));
    }
}
