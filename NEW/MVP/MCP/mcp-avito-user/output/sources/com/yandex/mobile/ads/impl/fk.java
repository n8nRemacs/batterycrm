package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ik;
import com.yandex.mobile.ads.impl.w90;

/* loaded from: classes8.dex */
public final class fk implements dk, w90.a {

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    @Deprecated
    private static final Object f385385i = new Object();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final va1 f385386b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final va1 f385387c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    private String f385388d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    private String f385389e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f385390f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    private String f385391g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    private String f385392h;

    public fk(@Y61.k gk gkVar, @Y61.k hk hkVar, @Y61.k w90 w90Var) {
        this.f385386b = gkVar;
        this.f385387c = hkVar;
        for (bk bkVar : bk.values()) {
            a(w90Var, bkVar);
        }
        w90Var.a(this);
    }

    public final boolean a() {
        boolean z12;
        synchronized (f385385i) {
            z12 = this.f385390f;
        }
        return z12;
    }

    @Y61.l
    public final String b() {
        String str;
        synchronized (f385385i) {
            str = this.f385388d;
        }
        return str;
    }

    @Y61.l
    public final String c() {
        String str;
        synchronized (f385385i) {
            str = this.f385389e;
        }
        return str;
    }

    @Y61.l
    public final String d() {
        String str;
        synchronized (f385385i) {
            str = this.f385391g;
        }
        return str;
    }

    @Y61.l
    public final String e() {
        String str;
        synchronized (f385385i) {
            str = this.f385392h;
        }
        return str;
    }

    @Override // com.yandex.mobile.ads.impl.w90.a
    public final void a(@Y61.k w90 w90Var, @Y61.k String str) {
        synchronized (f385385i) {
            try {
                ik ikVarA = this.f385387c.a(w90Var, str);
                if (ikVarA == null) {
                    ikVarA = this.f385386b.a(w90Var, str);
                }
                if (ikVarA != null) {
                    a(ikVarA);
                }
                kotlin.G0 g02 = kotlin.G0.f406611a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void a(w90 w90Var, bk bkVar) {
        ik ikVarA = this.f385387c.a(w90Var, bkVar);
        if (ikVarA == null) {
            ikVarA = this.f385386b.a(w90Var, bkVar);
        }
        a(ikVarA);
    }

    private final void a(ik ikVar) {
        if (ikVar instanceof ik.a) {
            this.f385390f = ((ik.a) ikVar).a();
            return;
        }
        if (ikVar instanceof ik.b) {
            this.f385388d = ((ik.b) ikVar).a();
            return;
        }
        if (ikVar instanceof ik.c) {
            this.f385389e = ((ik.c) ikVar).a();
        } else if (ikVar instanceof ik.d) {
            this.f385391g = ((ik.d) ikVar).a();
        } else if (ikVar instanceof ik.e) {
            this.f385392h = ((ik.e) ikVar).a();
        }
    }
}
