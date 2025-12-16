package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.fn0;
import com.yandex.mobile.ads.impl.lm0;
import com.yandex.mobile.ads.impl.tn0;
import com.yandex.mobile.ads.impl.to0;
import j.InterfaceC42148d;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes8.dex */
public final class qm0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final lm0 f389241a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final tn0 f389242b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final to0 f389243c = new to0();

    @InterfaceC42148d
    public interface a {
        void b();
    }

    public static class b implements lm0.a, tn0.a, fn0.b, to0.a {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        private final AtomicInteger f389244a = new AtomicInteger(3);

        /* renamed from: b, reason: collision with root package name */
        @j.N
        private final a f389245b;

        public b(@j.N um0 um0Var) {
            this.f389245b = um0Var;
        }

        @Override // com.yandex.mobile.ads.impl.fn0.b
        public final void a() {
            if (this.f389244a.decrementAndGet() == 0) {
                this.f389245b.b();
            }
        }

        public final void b() {
            if (this.f389244a.decrementAndGet() == 0) {
                this.f389245b.b();
            }
        }

        public final void c() {
            if (this.f389244a.decrementAndGet() == 0) {
                this.f389245b.b();
            }
        }

        public final void d() {
            if (this.f389244a.decrementAndGet() == 0) {
                this.f389245b.b();
            }
        }
    }

    public qm0(@j.N Context context, @j.N a4 a4Var) {
        this.f389241a = new lm0(context, a4Var);
        this.f389242b = new tn0(context, a4Var);
    }

    public final void a(@j.N Context context, @j.N uj0 uj0Var, @j.N hs0 hs0Var, @j.N um0 um0Var, @j.N qn qnVar) {
        b bVar = new b(um0Var);
        this.f389242b.a(uj0Var, bVar, qnVar);
        this.f389241a.a(uj0Var, hs0Var, bVar);
        this.f389243c.a(context, uj0Var, bVar);
    }

    public final void a() {
        this.f389242b.a();
        this.f389241a.getClass();
        this.f389243c.getClass();
    }
}
