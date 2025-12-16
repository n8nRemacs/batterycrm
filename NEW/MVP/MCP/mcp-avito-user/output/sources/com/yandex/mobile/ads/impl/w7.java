package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.fb1;
import com.yandex.mobile.ads.impl.vw;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class w7 implements is {

    /* renamed from: v, reason: collision with root package name */
    private static final byte[] f391300v = {73, 68, 51};

    /* renamed from: a, reason: collision with root package name */
    private final boolean f391301a;

    /* renamed from: b, reason: collision with root package name */
    private final or0 f391302b;

    /* renamed from: c, reason: collision with root package name */
    private final pr0 f391303c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    private final String f391304d;

    /* renamed from: e, reason: collision with root package name */
    private String f391305e;

    /* renamed from: f, reason: collision with root package name */
    private x91 f391306f;

    /* renamed from: g, reason: collision with root package name */
    private x91 f391307g;

    /* renamed from: h, reason: collision with root package name */
    private int f391308h;

    /* renamed from: i, reason: collision with root package name */
    private int f391309i;

    /* renamed from: j, reason: collision with root package name */
    private int f391310j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f391311k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f391312l;

    /* renamed from: m, reason: collision with root package name */
    private int f391313m;

    /* renamed from: n, reason: collision with root package name */
    private int f391314n;

    /* renamed from: o, reason: collision with root package name */
    private int f391315o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f391316p;

    /* renamed from: q, reason: collision with root package name */
    private long f391317q;

    /* renamed from: r, reason: collision with root package name */
    private int f391318r;

    /* renamed from: s, reason: collision with root package name */
    private long f391319s;

    /* renamed from: t, reason: collision with root package name */
    private x91 f391320t;

    /* renamed from: u, reason: collision with root package name */
    private long f391321u;

    public w7() {
        this(null, true);
    }

    private static boolean a(byte b12) {
        return (((b12 & 255) | 65280) & 65526) == 65520;
    }

    private void d() {
        this.f391308h = 0;
        this.f391309i = 0;
        this.f391310j = 256;
    }

    public final long c() {
        return this.f391317q;
    }

    public w7(@j.P String str, boolean z12) {
        this.f391302b = new or0(new byte[7]);
        this.f391303c = new pr0(Arrays.copyOf(f391300v, 10));
        d();
        this.f391313m = -1;
        this.f391314n = -1;
        this.f391317q = -9223372036854775807L;
        this.f391319s = -9223372036854775807L;
        this.f391301a = z12;
        this.f391304d = str;
    }

    @Override // com.yandex.mobile.ads.impl.is
    public final void a() {
        this.f391319s = -9223372036854775807L;
        this.f391312l = false;
        d();
    }

    @Override // com.yandex.mobile.ads.impl.is
    public final void a(tu tuVar, fb1.d dVar) {
        dVar.a();
        this.f391305e = dVar.b();
        x91 x91VarA = tuVar.a(dVar.c(), 1);
        this.f391306f = x91VarA;
        this.f391320t = x91VarA;
        if (this.f391301a) {
            dVar.a();
            x91 x91VarA2 = tuVar.a(dVar.c(), 5);
            this.f391307g = x91VarA2;
            x91VarA2.a(new vw.a().c(dVar.b()).f("application/id3").a());
            return;
        }
        this.f391307g = new yr();
    }

    @Override // com.yandex.mobile.ads.impl.is
    public final void b() {
    }

    @Override // com.yandex.mobile.ads.impl.is
    public final void a(int i12, long j12) {
        if (j12 != -9223372036854775807L) {
            this.f391319s = j12;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x022f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0315 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0257  */
    @Override // com.yandex.mobile.ads.impl.is
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.yandex.mobile.ads.impl.pr0 r18) {
        /*
            Method dump skipped, instructions count: 809
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.w7.a(com.yandex.mobile.ads.impl.pr0):void");
    }
}
