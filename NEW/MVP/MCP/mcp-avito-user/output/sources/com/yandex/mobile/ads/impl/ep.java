package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.x21;

/* loaded from: classes8.dex */
final class ep implements zp0 {

    /* renamed from: a, reason: collision with root package name */
    private final yp0 f385053a;

    /* renamed from: b, reason: collision with root package name */
    private final long f385054b;

    /* renamed from: c, reason: collision with root package name */
    private final long f385055c;

    /* renamed from: d, reason: collision with root package name */
    private final e71 f385056d;

    /* renamed from: e, reason: collision with root package name */
    private int f385057e;

    /* renamed from: f, reason: collision with root package name */
    private long f385058f;

    /* renamed from: g, reason: collision with root package name */
    private long f385059g;

    /* renamed from: h, reason: collision with root package name */
    private long f385060h;

    /* renamed from: i, reason: collision with root package name */
    private long f385061i;

    /* renamed from: j, reason: collision with root package name */
    private long f385062j;

    /* renamed from: k, reason: collision with root package name */
    private long f385063k;

    /* renamed from: l, reason: collision with root package name */
    private long f385064l;

    public final class a implements x21 {
        private a() {
        }

        @Override // com.yandex.mobile.ads.impl.x21
        public final boolean b() {
            return true;
        }

        @Override // com.yandex.mobile.ads.impl.x21
        public final long c() {
            return ep.this.f385056d.a(ep.this.f385058f);
        }

        public /* synthetic */ a(ep epVar, int i12) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.x21
        public final x21.a b(long j12) {
            long jB2 = ep.this.f385056d.b(j12);
            long j13 = ((((ep.this.f385055c - ep.this.f385054b) * jB2) / ep.this.f385058f) + ep.this.f385054b) - 30000;
            long j14 = ep.this.f385054b;
            long j15 = ep.this.f385055c - 1;
            int i12 = pc1.f388768a;
            z21 z21Var = new z21(j12, Math.max(j14, Math.min(j13, j15)));
            return new x21.a(z21Var, z21Var);
        }
    }

    public ep(e71 e71Var, long j12, long j13, long j14, long j15, boolean z12) {
        db.a(j12 >= 0 && j13 > j12);
        this.f385056d = e71Var;
        this.f385054b = j12;
        this.f385055c = j13;
        if (j14 == j13 - j12 || z12) {
            this.f385058f = j15;
            this.f385057e = 4;
        } else {
            this.f385057e = 0;
        }
        this.f385053a = new yp0();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8  */
    @Override // com.yandex.mobile.ads.impl.zp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(com.yandex.mobile.ads.impl.to r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ep.a(com.yandex.mobile.ads.impl.to):long");
    }

    @Override // com.yandex.mobile.ads.impl.zp0
    @j.P
    public final x21 a() {
        if (this.f385058f != 0) {
            return new a(this, 0);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.zp0
    public final void a(long j12) {
        long j13 = this.f385058f - 1;
        int i12 = pc1.f388768a;
        this.f385060h = Math.max(0L, Math.min(j12, j13));
        this.f385057e = 2;
        this.f385061i = this.f385054b;
        this.f385062j = this.f385055c;
        this.f385063k = 0L;
        this.f385064l = this.f385058f;
    }
}
