package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes8.dex */
public final class p21 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f388708a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final Executor f388709b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final a4 f388710c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final C39331h1 f388711d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final i20 f388712e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final h20 f388713f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final x8 f388714g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    private final z11 f388715h;

    /* renamed from: i, reason: collision with root package name */
    @j.N
    private final q8 f388716i;

    /* renamed from: j, reason: collision with root package name */
    @j.N
    private final e31 f388717j;

    /* renamed from: k, reason: collision with root package name */
    @j.N
    private final s2 f388718k;

    /* renamed from: l, reason: collision with root package name */
    @j.N
    private final us f388719l;

    /* renamed from: m, reason: collision with root package name */
    @j.N
    private final u21 f388720m;

    public interface a {
        void a(@j.N q8 q8Var, @j.N ts tsVar);

        void a(@j.N w2 w2Var);
    }

    public p21(@j.N Context context, @j.N Executor executor, @j.N a4 a4Var) {
        Context applicationContext = context.getApplicationContext();
        this.f388708a = applicationContext;
        this.f388709b = executor;
        this.f388710c = a4Var;
        q8 q8Var = new q8();
        this.f388716i = q8Var;
        us usVarA = us.a(applicationContext);
        this.f388719l = usVarA;
        this.f388712e = new i20(usVarA);
        this.f388713f = new h20(usVarA.a(), q21.b());
        this.f388711d = C39309c.a(context);
        this.f388714g = new x8();
        this.f388715h = new z11(context, q8Var, usVarA);
        this.f388717j = new e31();
        this.f388718k = new s2();
        this.f388720m = new u21(context);
    }

    public static void h(p21 p21Var) {
        p21Var.f388709b.execute(new o21(p21Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(a aVar) {
        this.f388711d.a(new l21(this, aVar));
    }

    public static void b(p21 p21Var, a aVar) {
        p21Var.f388709b.execute(new n21(p21Var, aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(a aVar) {
        this.f388712e.a(new O(14, this, aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(@j.N a aVar) {
        this.f388710c.b(z3.f392167g);
        this.f388709b.execute(new F1(this, aVar, 0));
    }

    public final void a(@j.N a aVar) {
        this.f388709b.execute(new F1(this, aVar, 1));
    }

    public final void a() {
        this.f388711d.a();
        this.f388714g.a(this.f388708a);
        this.f388715h.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(a aVar, g20 g20Var) {
        this.f388713f.a(this.f388708a, g20Var);
        this.f388710c.a(z3.f392167g);
        this.f388710c.b(z3.f392162b);
        this.f388709b.execute(new m21(this, aVar));
    }
}
