package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.fb1;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class xy implements is {

    /* renamed from: q, reason: collision with root package name */
    private static final double[] f391821q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a, reason: collision with root package name */
    private String f391822a;

    /* renamed from: b, reason: collision with root package name */
    private x91 f391823b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private final oc1 f391824c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    private final pr0 f391825d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    private final kj0 f391826e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean[] f391827f = new boolean[4];

    /* renamed from: g, reason: collision with root package name */
    private final a f391828g = new a();

    /* renamed from: h, reason: collision with root package name */
    private long f391829h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f391830i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f391831j;

    /* renamed from: k, reason: collision with root package name */
    private long f391832k;

    /* renamed from: l, reason: collision with root package name */
    private long f391833l;

    /* renamed from: m, reason: collision with root package name */
    private long f391834m;

    /* renamed from: n, reason: collision with root package name */
    private long f391835n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f391836o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f391837p;

    public xy(@j.P oc1 oc1Var) {
        this.f391824c = oc1Var;
        if (oc1Var != null) {
            this.f391826e = new kj0(178);
            this.f391825d = new pr0();
        } else {
            this.f391826e = null;
            this.f391825d = null;
        }
        this.f391833l = -9223372036854775807L;
        this.f391835n = -9223372036854775807L;
    }

    @Override // com.yandex.mobile.ads.impl.is
    public final void a() {
        lj0.a(this.f391827f);
        this.f391828g.a();
        kj0 kj0Var = this.f391826e;
        if (kj0Var != null) {
            kj0Var.b();
        }
        this.f391829h = 0L;
        this.f391830i = false;
        this.f391833l = -9223372036854775807L;
        this.f391835n = -9223372036854775807L;
    }

    public static final class a {

        /* renamed from: e, reason: collision with root package name */
        private static final byte[] f391838e = {0, 0, 1};

        /* renamed from: a, reason: collision with root package name */
        private boolean f391839a;

        /* renamed from: b, reason: collision with root package name */
        public int f391840b;

        /* renamed from: c, reason: collision with root package name */
        public int f391841c;

        /* renamed from: d, reason: collision with root package name */
        public byte[] f391842d = new byte[128];

        public final void a() {
            this.f391839a = false;
            this.f391840b = 0;
            this.f391841c = 0;
        }

        public final boolean a(int i12, int i13) {
            if (this.f391839a) {
                int i14 = this.f391840b - i13;
                this.f391840b = i14;
                if (this.f391841c == 0 && i12 == 181) {
                    this.f391841c = i14;
                } else {
                    this.f391839a = false;
                    return true;
                }
            } else if (i12 == 179) {
                this.f391839a = true;
            }
            a(f391838e, 0, 3);
            return false;
        }

        public final void a(byte[] bArr, int i12, int i13) {
            if (this.f391839a) {
                int i14 = i13 - i12;
                byte[] bArr2 = this.f391842d;
                int length = bArr2.length;
                int i15 = this.f391840b + i14;
                if (length < i15) {
                    this.f391842d = Arrays.copyOf(bArr2, i15 * 2);
                }
                System.arraycopy(bArr, i12, this.f391842d, this.f391840b, i14);
                this.f391840b += i14;
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.is
    public final void a(tu tuVar, fb1.d dVar) {
        dVar.a();
        this.f391822a = dVar.b();
        this.f391823b = tuVar.a(dVar.c(), 2);
        oc1 oc1Var = this.f391824c;
        if (oc1Var != null) {
            oc1Var.a(tuVar, dVar);
        }
    }

    @Override // com.yandex.mobile.ads.impl.is
    public final void a(int i12, long j12) {
        this.f391833l = j12;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01f3  */
    @Override // com.yandex.mobile.ads.impl.is
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.yandex.mobile.ads.impl.pr0 r25) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.xy.a(com.yandex.mobile.ads.impl.pr0):void");
    }

    @Override // com.yandex.mobile.ads.impl.is
    public final void b() {
    }
}
