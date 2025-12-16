package com.yandex.mobile.ads.impl;

import android.text.Layout;

/* loaded from: classes8.dex */
final class lb1 {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private String f387421a;

    /* renamed from: b, reason: collision with root package name */
    private int f387422b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f387423c;

    /* renamed from: d, reason: collision with root package name */
    private int f387424d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f387425e;

    /* renamed from: k, reason: collision with root package name */
    private float f387431k;

    /* renamed from: l, reason: collision with root package name */
    @j.P
    private String f387432l;

    /* renamed from: o, reason: collision with root package name */
    @j.P
    private Layout.Alignment f387435o;

    /* renamed from: p, reason: collision with root package name */
    @j.P
    private Layout.Alignment f387436p;

    /* renamed from: r, reason: collision with root package name */
    @j.P
    private t81 f387438r;

    /* renamed from: f, reason: collision with root package name */
    private int f387426f = -1;

    /* renamed from: g, reason: collision with root package name */
    private int f387427g = -1;

    /* renamed from: h, reason: collision with root package name */
    private int f387428h = -1;

    /* renamed from: i, reason: collision with root package name */
    private int f387429i = -1;

    /* renamed from: j, reason: collision with root package name */
    private int f387430j = -1;

    /* renamed from: m, reason: collision with root package name */
    private int f387433m = -1;

    /* renamed from: n, reason: collision with root package name */
    private int f387434n = -1;

    /* renamed from: q, reason: collision with root package name */
    private int f387437q = -1;

    /* renamed from: s, reason: collision with root package name */
    private float f387439s = Float.MAX_VALUE;

    public final lb1 a(boolean z12) {
        this.f387428h = z12 ? 1 : 0;
        return this;
    }

    public final lb1 b(boolean z12) {
        this.f387429i = z12 ? 1 : 0;
        return this;
    }

    public final lb1 c(boolean z12) {
        this.f387426f = z12 ? 1 : 0;
        return this;
    }

    public final lb1 d(int i12) {
        this.f387434n = i12;
        return this;
    }

    public final lb1 e(boolean z12) {
        this.f387427g = z12 ? 1 : 0;
        return this;
    }

    @j.P
    public final String f() {
        return this.f387432l;
    }

    @j.P
    public final Layout.Alignment g() {
        return this.f387436p;
    }

    public final int h() {
        return this.f387434n;
    }

    public final int i() {
        return this.f387433m;
    }

    public final float j() {
        return this.f387439s;
    }

    public final int k() {
        int i12 = this.f387428h;
        if (i12 == -1 && this.f387429i == -1) {
            return -1;
        }
        return (i12 == 1 ? 1 : 0) | (this.f387429i == 1 ? 2 : 0);
    }

    @j.P
    public final Layout.Alignment l() {
        return this.f387435o;
    }

    public final boolean m() {
        return this.f387437q == 1;
    }

    @j.P
    public final t81 n() {
        return this.f387438r;
    }

    public final boolean o() {
        return this.f387425e;
    }

    public final boolean p() {
        return this.f387423c;
    }

    public final boolean q() {
        return this.f387426f == 1;
    }

    public final boolean r() {
        return this.f387427g == 1;
    }

    public final lb1 a(@j.P String str) {
        this.f387421a = str;
        return this;
    }

    public final int b() {
        if (this.f387423c) {
            return this.f387422b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    @j.P
    public final String c() {
        return this.f387421a;
    }

    public final lb1 d(boolean z12) {
        this.f387437q = z12 ? 1 : 0;
        return this;
    }

    public final lb1 e(int i12) {
        this.f387433m = i12;
        return this;
    }

    public final int a() {
        if (this.f387425e) {
            return this.f387424d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public final void c(int i12) {
        this.f387430j = i12;
    }

    public final float d() {
        return this.f387431k;
    }

    public final int e() {
        return this.f387430j;
    }

    public final void b(int i12) {
        this.f387422b = i12;
        this.f387423c = true;
    }

    public final void a(int i12) {
        this.f387424d = i12;
        this.f387425e = true;
    }

    public final lb1 b(float f12) {
        this.f387439s = f12;
        return this;
    }

    public final lb1 a(@j.P lb1 lb1Var) {
        int i12;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (lb1Var != null) {
            if (!this.f387423c && lb1Var.f387423c) {
                b(lb1Var.f387422b);
            }
            if (this.f387428h == -1) {
                this.f387428h = lb1Var.f387428h;
            }
            if (this.f387429i == -1) {
                this.f387429i = lb1Var.f387429i;
            }
            if (this.f387421a == null && (str = lb1Var.f387421a) != null) {
                this.f387421a = str;
            }
            if (this.f387426f == -1) {
                this.f387426f = lb1Var.f387426f;
            }
            if (this.f387427g == -1) {
                this.f387427g = lb1Var.f387427g;
            }
            if (this.f387434n == -1) {
                this.f387434n = lb1Var.f387434n;
            }
            if (this.f387435o == null && (alignment2 = lb1Var.f387435o) != null) {
                this.f387435o = alignment2;
            }
            if (this.f387436p == null && (alignment = lb1Var.f387436p) != null) {
                this.f387436p = alignment;
            }
            if (this.f387437q == -1) {
                this.f387437q = lb1Var.f387437q;
            }
            if (this.f387430j == -1) {
                this.f387430j = lb1Var.f387430j;
                this.f387431k = lb1Var.f387431k;
            }
            if (this.f387438r == null) {
                this.f387438r = lb1Var.f387438r;
            }
            if (this.f387439s == Float.MAX_VALUE) {
                this.f387439s = lb1Var.f387439s;
            }
            if (!this.f387425e && lb1Var.f387425e) {
                a(lb1Var.f387424d);
            }
            if (this.f387433m == -1 && (i12 = lb1Var.f387433m) != -1) {
                this.f387433m = i12;
            }
        }
        return this;
    }

    public final lb1 b(@j.P String str) {
        this.f387432l = str;
        return this;
    }

    public final lb1 b(@j.P Layout.Alignment alignment) {
        this.f387435o = alignment;
        return this;
    }

    public final lb1 a(@j.P Layout.Alignment alignment) {
        this.f387436p = alignment;
        return this;
    }

    public final lb1 a(@j.P t81 t81Var) {
        this.f387438r = t81Var;
        return this;
    }

    public final void a(float f12) {
        this.f387431k = f12;
    }
}
