package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.common.AdImpressionData;
import java.util.List;

/* loaded from: classes8.dex */
public final class o30 implements s30, dh0, mh1, yx0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final a f388428a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final q30 f388429b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final p3 f388430c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final Context f388431d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    private List<q31> f388432e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    private AdImpressionData f388433f;

    public interface a {
        void a(@j.P AdImpressionData adImpressionData);
    }

    public o30(@j.N Context context, @j.N a aVar, @j.N r30 r30Var, @j.N p3 p3Var) {
        this.f388431d = context.getApplicationContext();
        this.f388428a = aVar;
        this.f388430c = p3Var;
        this.f388429b = new q30(r30Var);
    }

    public final void a(@j.N List<q31> list, @j.P AdImpressionData adImpressionData) {
        this.f388432e = list;
        this.f388433f = adImpressionData;
        this.f388429b.a();
    }

    @Override // com.yandex.mobile.ads.impl.dh0
    public final void b() {
        if (a()) {
            return;
        }
        this.f388429b.c();
        v11 v11VarA = q21.b().a(this.f388431d);
        if (v11VarA == null || v11VarA.B()) {
            this.f388430c.a();
            this.f388428a.a(this.f388433f);
        }
    }

    @Override // com.yandex.mobile.ads.impl.mh1
    public final void c() {
        if (a()) {
            return;
        }
        this.f388429b.b();
        v11 v11VarA = q21.b().a(this.f388431d);
        if (v11VarA == null || v11VarA.B()) {
            return;
        }
        this.f388430c.a();
        this.f388428a.a(this.f388433f);
    }

    @Override // com.yandex.mobile.ads.impl.dh0
    public final void d() {
        if (a()) {
            return;
        }
        this.f388429b.b();
        v11 v11VarA = q21.b().a(this.f388431d);
        if (v11VarA == null || v11VarA.B()) {
            return;
        }
        this.f388430c.a();
        this.f388428a.a(this.f388433f);
    }

    @Override // com.yandex.mobile.ads.impl.yx0
    public final void e() {
        v11 v11VarA;
        if (!a() || (v11VarA = q21.b().a(this.f388431d)) == null || v11VarA.B()) {
            return;
        }
        this.f388430c.a();
        this.f388428a.a(this.f388433f);
    }

    @Override // com.yandex.mobile.ads.impl.s30
    public final void f() {
        if (a()) {
            v11 v11VarA = q21.b().a(this.f388431d);
            if (v11VarA == null || v11VarA.B()) {
                this.f388430c.a();
                this.f388428a.a(this.f388433f);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.mh1
    public final void g() {
        if (a()) {
            return;
        }
        this.f388429b.c();
        v11 v11VarA = q21.b().a(this.f388431d);
        if (v11VarA == null || v11VarA.B()) {
            this.f388430c.a();
            this.f388428a.a(this.f388433f);
        }
    }

    private boolean a() {
        List<q31> list = this.f388432e;
        return (list == null || list.isEmpty()) ? false : true;
    }
}
