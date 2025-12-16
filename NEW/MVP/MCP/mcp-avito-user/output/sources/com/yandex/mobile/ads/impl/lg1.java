package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.fg1;
import com.yandex.mobile.ads.impl.ky0;
import com.yandex.mobile.ads.impl.og1;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class lg1 implements og1.a, fg1.a {

    /* renamed from: k, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.n<Object>[] f387464k;

    /* renamed from: l, reason: collision with root package name */
    @Deprecated
    private static final long f387465l;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final a4 f387466a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final ri1 f387467b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final og1 f387468c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final fg1 f387469d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    private final ng1 f387470e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    private final uh1 f387471f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    private final as0 f387472g = new as0(false);

    /* renamed from: h, reason: collision with root package name */
    private boolean f387473h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    private final a f387474i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    private final b f387475j;

    public static final class a extends kotlin.properties.e<ky0.a> {
        public a() {
            super(null);
        }

        @Override // kotlin.properties.e
        public final void afterChange(@Y61.k kotlin.reflect.n<?> nVar, ky0.a aVar, ky0.a aVar2) {
            lg1.this.f387470e.a(aVar2);
        }
    }

    public static final class b extends kotlin.properties.e<ky0.a> {
        public b() {
            super(null);
        }

        @Override // kotlin.properties.e
        public final void afterChange(@Y61.k kotlin.reflect.n<?> nVar, ky0.a aVar, ky0.a aVar2) {
            lg1.this.f387470e.b(aVar2);
        }
    }

    static {
        kotlin.jvm.internal.Y y12 = new kotlin.jvm.internal.Y(lg1.class, "adParameterManager", "getAdParameterManager()Lcom/yandex/mobile/ads/core/report/Report$ReportParameterManager;", 0);
        kotlin.jvm.internal.n0 n0Var = kotlin.jvm.internal.m0.f406844a;
        f387464k = new kotlin.reflect.n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(lg1.class, "requestParameterManager", "getRequestParameterManager()Lcom/yandex/mobile/ads/core/report/Report$ReportParameterManager;", 0, n0Var)};
        f387465l = TimeUnit.SECONDS.toMillis(10L);
    }

    public lg1(@Y61.k Context context, @Y61.k ff1<?> ff1Var, @Y61.k a4 a4Var, @Y61.k qg1 qg1Var, @Y61.k yi1 yi1Var, @Y61.k ei1 ei1Var, @Y61.k ri1 ri1Var) {
        this.f387466a = a4Var;
        this.f387467b = ri1Var;
        this.f387468c = new og1(ei1Var, this);
        this.f387469d = new fg1(qg1Var, this);
        this.f387470e = new ng1(context, a4Var);
        this.f387471f = new uh1(ff1Var, yi1Var);
        kotlin.properties.c cVar = kotlin.properties.c.f406879a;
        this.f387474i = new a();
        this.f387475j = new b();
    }

    public final void b(@Y61.l ky0.a aVar) {
        this.f387475j.setValue(this, f387464k[1], aVar);
    }

    public final void d() {
        this.f387468c.b();
        this.f387469d.b();
        this.f387472g.a();
    }

    public final void e() {
        this.f387473h = false;
        this.f387470e.a((Map<String, ? extends Object>) null);
        this.f387468c.b();
        this.f387469d.b();
        this.f387472g.a();
    }

    public final void f() {
        this.f387468c.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(lg1 lg1Var) {
        lg1Var.a(new cg1(8, new op()));
    }

    public final void a(@Y61.l ky0.a aVar) {
        this.f387474i.setValue(this, f387464k[0], aVar);
    }

    public final void c() {
        this.f387468c.b();
        this.f387469d.b();
        this.f387472g.a();
    }

    @Override // com.yandex.mobile.ads.impl.og1.a
    public final void a() {
        this.f387468c.b();
        this.f387466a.b(z3.f392172l);
        this.f387467b.i();
        this.f387469d.a();
        this.f387472g.a(f387465l, new G0(this, 11));
    }

    @Override // com.yandex.mobile.ads.impl.fg1.a
    public final void b() {
        this.f387470e.a((Map<String, ? extends Object>) this.f387471f.a());
        this.f387466a.a(z3.f392172l);
        if (this.f387473h) {
            return;
        }
        this.f387473h = true;
        this.f387470e.a();
    }

    public final void a(@Y61.k cg1 cg1Var) {
        this.f387468c.b();
        this.f387469d.b();
        this.f387472g.a();
        if (this.f387473h) {
            return;
        }
        this.f387473h = true;
        String lowerCase = bg1.a(cg1Var.a()).toLowerCase(Locale.ROOT);
        String message = cg1Var.b().getMessage();
        if (message == null) {
            message = "";
        }
        this.f387470e.a(lowerCase, message);
    }
}
