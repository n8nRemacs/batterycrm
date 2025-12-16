package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Collections;

/* loaded from: classes8.dex */
public final class ta0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final za0 f390137a = za0.a();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final l50 f390138b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final v40 f390139c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final C39375w1 f390140d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final ya0 f390141e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final yf1 f390142f;

    public class a implements InterfaceC39378x1 {
        private a() {
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC39378x1
        public final void a() {
            ta0.this.f390141e.onInstreamAdBreakPrepared();
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC39378x1
        public final void b() {
            ta0.this.f390141e.onInstreamAdBreakStarted();
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC39378x1
        public final void e() {
            ta0.this.f390141e.onInstreamAdBreakCompleted();
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC39378x1
        public final void g() {
            ta0.this.f390141e.onInstreamAdBreakError("Ad player returned error");
        }

        public /* synthetic */ a(ta0 ta0Var, int i12) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC39378x1
        public final void d() {
        }
    }

    public ta0(@j.N Context context, @j.N p60 p60Var, @j.N v40 v40Var, @j.N C39304a2 c39304a2, @j.N ya0 ya0Var) {
        this.f390139c = v40Var;
        this.f390141e = ya0Var;
        l50 l50Var = new l50();
        this.f390138b = l50Var;
        this.f390140d = new C39375w1(context, p60Var, v40Var, new h50(context, l50Var, new ab0(), v40Var), l50Var, c39304a2);
        this.f390142f = new yf1();
    }

    public final void b() {
        k50 k50VarA = this.f390138b.a();
        if (k50VarA == null || k50VarA.b() == null) {
            return;
        }
        this.f390140d.a();
    }

    public final void c() {
        this.f390139c.a();
        this.f390140d.a(new a(this, 0));
        this.f390140d.d();
    }

    public final void d() {
        k50 k50VarA = this.f390138b.a();
        if (k50VarA == null || k50VarA.b() == null) {
            return;
        }
        this.f390140d.f();
    }

    public final void a(@j.P vf1 vf1Var) {
        xf1 xf1VarA;
        if (vf1Var != null) {
            this.f390142f.getClass();
            xf1VarA = yf1.a(vf1Var);
        } else {
            xf1VarA = null;
        }
        this.f390140d.a(xf1VarA);
    }

    public final void a() {
        this.f390140d.b();
        this.f390139c.b();
        this.f390138b.b();
    }

    public final void a(@j.N lu luVar) {
        ta0 ta0VarA = this.f390137a.a(luVar);
        if (!equals(ta0VarA)) {
            if (ta0VarA != null) {
                ta0VarA.f390140d.c();
                ta0VarA.f390138b.b();
            }
            if (this.f390137a.a(this)) {
                this.f390140d.c();
                this.f390138b.b();
            }
            this.f390137a.a(luVar, this);
        }
        this.f390138b.a(luVar, Collections.emptyList());
        this.f390139c.a();
        this.f390140d.g();
    }
}
