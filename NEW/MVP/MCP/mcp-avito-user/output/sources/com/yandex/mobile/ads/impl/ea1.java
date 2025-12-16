package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.o30;
import com.yandex.mobile.ads.impl.xc1;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes8.dex */
public abstract class ea1 extends yz implements o30.a, InterfaceC39306b0 {

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final Context f384821e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final AdResponse<?> f384822f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final pp0 f384823g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    private final l7 f384824h;

    /* renamed from: i, reason: collision with root package name */
    @j.N
    private final n30 f384825i;

    /* renamed from: j, reason: collision with root package name */
    @j.N
    private final o30 f384826j;

    /* renamed from: k, reason: collision with root package name */
    @j.N
    private final C39302a0 f384827k;

    /* renamed from: l, reason: collision with root package name */
    @j.N
    private final rx0 f384828l;

    public class a implements ga1 {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.ga1
        @j.N
        public final xc1 a(int i12) {
            return new xc1(ea1.b(ea1.this) ? xc1.a.f391695l : !ea1.this.j() ? xc1.a.f391697n : !ea1.this.i() ? xc1.a.f391692i : xc1.a.f391685b, new f5());
        }

        @Override // com.yandex.mobile.ads.impl.ga1
        @j.N
        public final xc1 b(int i12) {
            return new xc1(ea1.this.c() ? xc1.a.f391686c : ea1.b(ea1.this) ? xc1.a.f391695l : !ea1.this.j() ? xc1.a.f391697n : (ea1.this.a(i12) && ea1.this.i()) ? xc1.a.f391685b : xc1.a.f391692i, new f5());
        }
    }

    public ea1(@j.N Context context, @j.N l7 l7Var, @j.N AdResponse<String> adResponse, @j.N n2 n2Var) {
        super(context, adResponse);
        a aVar = new a();
        this.f384821e = context;
        this.f384822f = adResponse;
        this.f384824h = l7Var;
        p3 p3Var = new p3(new zz(adResponse));
        r30 r30Var = new r30(context, n2Var);
        n30 n30Var = new n30();
        this.f384825i = n30Var;
        this.f384826j = p30.a(context, this, r30Var, p3Var, n30Var);
        pp0 pp0VarA = qp0.a(context, n2Var, r30Var, aVar, g7.a(this));
        this.f384823g = pp0VarA;
        pp0VarA.a(n30Var);
        n30Var.a(new op0(pp0VarA));
        this.f384827k = new C39302a0(context, n2Var, this);
        this.f384828l = new rx0(context, new e5(context, l7Var, new d00()), adResponse, n2Var, p3Var, n30Var, null, adResponse.i());
    }

    public abstract boolean a(int i12);

    public final void b(int i12) {
        v11 v11VarA = q21.b().a(this.f384821e);
        if (v11VarA == null || !v11VarA.P()) {
            if (this.f384824h.b()) {
                this.f384823g.b();
            } else {
                this.f384823g.a();
            }
        } else if (i12 == 0) {
            this.f384823g.b();
        } else {
            this.f384823g.a();
        }
        getClass().toString();
    }

    @Override // com.yandex.mobile.ads.impl.yz
    public final void f() {
        toString();
        super.f();
        this.f384823g.a();
        this.f384828l.c();
    }

    @j.N
    public final n30 h() {
        return this.f384825i;
    }

    public abstract boolean i();

    public abstract boolean j();

    public final synchronized void k() {
        toString();
        this.f384823g.b();
        this.f384828l.b();
    }

    @Override // com.yandex.mobile.ads.impl.q2
    public void onReceiveResult(int i12, @j.P Bundle bundle) {
        if (i12 == 14) {
            this.f384825i.d();
        }
        if (i12 == 15) {
            this.f384825i.b();
            return;
        }
        switch (i12) {
            case 6:
                onLeftApplication();
                this.f384827k.f();
                break;
            case 7:
                onLeftApplication();
                this.f384827k.d();
                break;
            case 8:
                this.f384827k.e();
                break;
            case 9:
                this.f384827k.a();
                this.f384825i.a();
                break;
        }
    }

    @Override // com.yandex.mobile.ads.impl.ns0.a
    public final void a(@j.N Intent intent) {
        intent.getAction();
        this.f384824h.b();
        this.f384823g.a(intent, this.f384824h.b());
    }

    public final void a(@j.P Map<String, String> map) {
        toString();
        ArrayList arrayListA = g7.a(this.f384822f, map);
        this.f384826j.a(arrayListA, this.f384822f.y());
        this.f384823g.a(this.f384822f, arrayListA);
        this.f384827k.a(this.f384822f.x());
        k();
    }

    public static boolean b(ea1 ea1Var) {
        return !ea1Var.f384824h.b();
    }
}
