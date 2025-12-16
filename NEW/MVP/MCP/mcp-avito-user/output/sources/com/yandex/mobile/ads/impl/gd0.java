package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.jd0;

/* loaded from: classes8.dex */
final class gd0 {

    /* renamed from: a, reason: collision with root package name */
    public final jd0.b f385717a;

    /* renamed from: b, reason: collision with root package name */
    public final long f385718b;

    /* renamed from: c, reason: collision with root package name */
    public final long f385719c;

    /* renamed from: d, reason: collision with root package name */
    public final long f385720d;

    /* renamed from: e, reason: collision with root package name */
    public final long f385721e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f385722f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f385723g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f385724h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f385725i;

    public gd0(jd0.b bVar, long j12, long j13, long j14, long j15, boolean z12, boolean z13, boolean z14, boolean z15) {
        boolean z16 = true;
        db.a(!z15 || z13);
        db.a(!z14 || z13);
        if (z12 && (z13 || z14 || z15)) {
            z16 = false;
        }
        db.a(z16);
        this.f385717a = bVar;
        this.f385718b = j12;
        this.f385719c = j13;
        this.f385720d = j14;
        this.f385721e = j15;
        this.f385722f = z12;
        this.f385723g = z13;
        this.f385724h = z14;
        this.f385725i = z15;
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gd0.class != obj.getClass()) {
            return false;
        }
        gd0 gd0Var = (gd0) obj;
        return this.f385718b == gd0Var.f385718b && this.f385719c == gd0Var.f385719c && this.f385720d == gd0Var.f385720d && this.f385721e == gd0Var.f385721e && this.f385722f == gd0Var.f385722f && this.f385723g == gd0Var.f385723g && this.f385724h == gd0Var.f385724h && this.f385725i == gd0Var.f385725i && pc1.a(this.f385717a, gd0Var.f385717a);
    }

    public final int hashCode() {
        return ((((((((((((((((this.f385717a.hashCode() + 527) * 31) + ((int) this.f385718b)) * 31) + ((int) this.f385719c)) * 31) + ((int) this.f385720d)) * 31) + ((int) this.f385721e)) * 31) + (this.f385722f ? 1 : 0)) * 31) + (this.f385723g ? 1 : 0)) * 31) + (this.f385724h ? 1 : 0)) * 31) + (this.f385725i ? 1 : 0);
    }
}
