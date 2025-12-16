package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.jd0;
import j.InterfaceC42154j;
import java.util.List;

/* loaded from: classes8.dex */
final class at0 {

    /* renamed from: s, reason: collision with root package name */
    private static final jd0.b f383640s = new jd0.b(new Object());

    /* renamed from: a, reason: collision with root package name */
    public final i91 f383641a;

    /* renamed from: b, reason: collision with root package name */
    public final jd0.b f383642b;

    /* renamed from: c, reason: collision with root package name */
    public final long f383643c;

    /* renamed from: d, reason: collision with root package name */
    public final long f383644d;

    /* renamed from: e, reason: collision with root package name */
    public final int f383645e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    public final lt f383646f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f383647g;

    /* renamed from: h, reason: collision with root package name */
    public final w91 f383648h;

    /* renamed from: i, reason: collision with root package name */
    public final da1 f383649i;

    /* renamed from: j, reason: collision with root package name */
    public final List<Metadata> f383650j;

    /* renamed from: k, reason: collision with root package name */
    public final jd0.b f383651k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f383652l;

    /* renamed from: m, reason: collision with root package name */
    public final int f383653m;

    /* renamed from: n, reason: collision with root package name */
    public final ct0 f383654n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f383655o;

    /* renamed from: p, reason: collision with root package name */
    public volatile long f383656p;

    /* renamed from: q, reason: collision with root package name */
    public volatile long f383657q;

    /* renamed from: r, reason: collision with root package name */
    public volatile long f383658r;

    public at0(i91 i91Var, jd0.b bVar, long j12, long j13, int i12, @j.P lt ltVar, boolean z12, w91 w91Var, da1 da1Var, List<Metadata> list, jd0.b bVar2, boolean z13, int i13, ct0 ct0Var, long j14, long j15, long j16, boolean z14) {
        this.f383641a = i91Var;
        this.f383642b = bVar;
        this.f383643c = j12;
        this.f383644d = j13;
        this.f383645e = i12;
        this.f383646f = ltVar;
        this.f383647g = z12;
        this.f383648h = w91Var;
        this.f383649i = da1Var;
        this.f383650j = list;
        this.f383651k = bVar2;
        this.f383652l = z13;
        this.f383653m = i13;
        this.f383654n = ct0Var;
        this.f383656p = j14;
        this.f383657q = j15;
        this.f383658r = j16;
        this.f383655o = z14;
    }

    public static at0 a(da1 da1Var) {
        i91 i91Var = i91.f386387a;
        jd0.b bVar = f383640s;
        return new at0(i91Var, bVar, -9223372036854775807L, 0L, 1, null, false, w91.f391352d, da1Var, com.yandex.mobile.ads.embedded.guava.collect.p.i(), bVar, false, 0, ct0.f384452d, 0L, 0L, 0L, false);
    }

    public static jd0.b a() {
        return f383640s;
    }

    @InterfaceC42154j
    public final at0 a(jd0.b bVar, long j12, long j13, long j14, long j15, w91 w91Var, da1 da1Var, List<Metadata> list) {
        return new at0(this.f383641a, bVar, j13, j14, this.f383645e, this.f383646f, this.f383647g, w91Var, da1Var, list, this.f383651k, this.f383652l, this.f383653m, this.f383654n, this.f383656p, j15, j12, this.f383655o);
    }

    @InterfaceC42154j
    public final at0 a(i91 i91Var) {
        return new at0(i91Var, this.f383642b, this.f383643c, this.f383644d, this.f383645e, this.f383646f, this.f383647g, this.f383648h, this.f383649i, this.f383650j, this.f383651k, this.f383652l, this.f383653m, this.f383654n, this.f383656p, this.f383657q, this.f383658r, this.f383655o);
    }

    @InterfaceC42154j
    public final at0 a(int i12) {
        return new at0(this.f383641a, this.f383642b, this.f383643c, this.f383644d, i12, this.f383646f, this.f383647g, this.f383648h, this.f383649i, this.f383650j, this.f383651k, this.f383652l, this.f383653m, this.f383654n, this.f383656p, this.f383657q, this.f383658r, this.f383655o);
    }

    @InterfaceC42154j
    public final at0 a(@j.P lt ltVar) {
        return new at0(this.f383641a, this.f383642b, this.f383643c, this.f383644d, this.f383645e, ltVar, this.f383647g, this.f383648h, this.f383649i, this.f383650j, this.f383651k, this.f383652l, this.f383653m, this.f383654n, this.f383656p, this.f383657q, this.f383658r, this.f383655o);
    }

    @InterfaceC42154j
    public final at0 a(jd0.b bVar) {
        return new at0(this.f383641a, this.f383642b, this.f383643c, this.f383644d, this.f383645e, this.f383646f, this.f383647g, this.f383648h, this.f383649i, this.f383650j, bVar, this.f383652l, this.f383653m, this.f383654n, this.f383656p, this.f383657q, this.f383658r, this.f383655o);
    }
}
