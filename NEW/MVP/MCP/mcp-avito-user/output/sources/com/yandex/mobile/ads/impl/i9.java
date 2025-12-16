package com.yandex.mobile.ads.impl;

import java.util.Arrays;

/* loaded from: classes8.dex */
public final class i9 implements ru {

    /* renamed from: q, reason: collision with root package name */
    private static final int[] f386367q;

    /* renamed from: t, reason: collision with root package name */
    private static final int f386370t;

    /* renamed from: c, reason: collision with root package name */
    private boolean f386373c;

    /* renamed from: d, reason: collision with root package name */
    private long f386374d;

    /* renamed from: e, reason: collision with root package name */
    private int f386375e;

    /* renamed from: f, reason: collision with root package name */
    private int f386376f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f386377g;

    /* renamed from: h, reason: collision with root package name */
    private long f386378h;

    /* renamed from: j, reason: collision with root package name */
    private int f386380j;

    /* renamed from: k, reason: collision with root package name */
    private long f386381k;

    /* renamed from: l, reason: collision with root package name */
    private tu f386382l;

    /* renamed from: m, reason: collision with root package name */
    private x91 f386383m;

    /* renamed from: n, reason: collision with root package name */
    private x21 f386384n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f386385o;

    /* renamed from: p, reason: collision with root package name */
    private static final int[] f386366p = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: r, reason: collision with root package name */
    private static final byte[] f386368r = pc1.b("#!AMR\n");

    /* renamed from: s, reason: collision with root package name */
    private static final byte[] f386369s = pc1.b("#!AMR-WB\n");

    /* renamed from: b, reason: collision with root package name */
    private final int f386372b = 0;

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f386371a = new byte[1];

    /* renamed from: i, reason: collision with root package name */
    private int f386379i = -1;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f386367q = iArr;
        f386370t = iArr[8];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ru[] a() {
        return new ru[]{new i9()};
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final boolean a(su suVar) {
        to toVar = (to) suVar;
        byte[] bArr = f386368r;
        toVar.c();
        byte[] bArr2 = new byte[bArr.length];
        toVar.b(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.f386373c = false;
            toVar.a(bArr.length);
        } else {
            byte[] bArr3 = f386369s;
            toVar.c();
            byte[] bArr4 = new byte[bArr3.length];
            toVar.b(bArr4, 0, bArr3.length, false);
            if (!Arrays.equals(bArr4, bArr3)) {
                return false;
            }
            this.f386373c = true;
            toVar.a(bArr3.length);
        }
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final void release() {
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final void a(tu tuVar) {
        this.f386382l = tuVar;
        this.f386383m = tuVar.a(0, 1);
        tuVar.a();
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final void a(long j12, long j13) {
        this.f386374d = 0L;
        this.f386375e = 0;
        this.f386376f = 0;
        if (j12 != 0) {
            x21 x21Var = this.f386384n;
            if (x21Var instanceof ml) {
                this.f386381k = ((ml) x21Var).c(j12);
                return;
            }
        }
        this.f386381k = 0L;
    }

    private int a(to toVar) throws tr0 {
        boolean z12;
        toVar.c();
        toVar.b(this.f386371a, 0, 1, false);
        byte b12 = this.f386371a[0];
        if ((b12 & 131) > 0) {
            throw tr0.a("Invalid padding bits for frame header " + ((int) b12), (Exception) null);
        }
        int i12 = (b12 >> 3) & 15;
        if (i12 >= 0 && i12 <= 15 && (((z12 = this.f386373c) && (i12 < 10 || i12 > 13)) || (!z12 && (i12 < 12 || i12 > 14)))) {
            return z12 ? f386367q[i12] : f386366p[i12];
        }
        StringBuilder sbA = Cif.a("Illegal AMR ");
        sbA.append(this.f386373c ? "WB" : "NB");
        sbA.append(" frame type ");
        sbA.append(i12);
        throw tr0.a(sbA.toString(), (Exception) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c1  */
    @Override // com.yandex.mobile.ads.impl.ru
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(com.yandex.mobile.ads.impl.su r20, com.yandex.mobile.ads.impl.fu0 r21) throws com.yandex.mobile.ads.impl.tr0 {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.i9.a(com.yandex.mobile.ads.impl.su, com.yandex.mobile.ads.impl.fu0):int");
    }
}
