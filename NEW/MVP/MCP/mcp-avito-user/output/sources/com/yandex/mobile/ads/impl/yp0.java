package com.yandex.mobile.ads.impl;

import java.io.EOFException;

/* loaded from: classes8.dex */
final class yp0 {

    /* renamed from: a, reason: collision with root package name */
    public int f392048a;

    /* renamed from: b, reason: collision with root package name */
    public long f392049b;

    /* renamed from: c, reason: collision with root package name */
    public int f392050c;

    /* renamed from: d, reason: collision with root package name */
    public int f392051d;

    /* renamed from: e, reason: collision with root package name */
    public int f392052e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f392053f = new int[255];

    /* renamed from: g, reason: collision with root package name */
    private final pr0 f392054g = new pr0(255);

    public final boolean a(to toVar, boolean z12) throws tr0, EOFException {
        boolean zB2;
        boolean zB3;
        this.f392048a = 0;
        this.f392049b = 0L;
        this.f392050c = 0;
        this.f392051d = 0;
        this.f392052e = 0;
        this.f392054g.c(27);
        try {
            zB2 = toVar.b(this.f392054g.c(), 0, 27, z12);
        } catch (EOFException e12) {
            if (!z12) {
                throw e12;
            }
            zB2 = false;
        }
        if (!zB2 || this.f392054g.v() != 1332176723) {
            return false;
        }
        if (this.f392054g.t() != 0) {
            if (z12) {
                return false;
            }
            throw tr0.a("unsupported bit stream revision");
        }
        this.f392048a = this.f392054g.t();
        this.f392049b = this.f392054g.l();
        this.f392054g.n();
        this.f392054g.n();
        this.f392054g.n();
        int iT2 = this.f392054g.t();
        this.f392050c = iT2;
        this.f392051d = iT2 + 27;
        this.f392054g.c(iT2);
        try {
            zB3 = toVar.b(this.f392054g.c(), 0, this.f392050c, z12);
        } catch (EOFException e13) {
            if (!z12) {
                throw e13;
            }
            zB3 = false;
        }
        if (!zB3) {
            return false;
        }
        for (int i12 = 0; i12 < this.f392050c; i12++) {
            this.f392053f[i12] = this.f392054g.t();
            this.f392052e += this.f392053f[i12];
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        if (r10 == (-1)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        if (r9.getPosition() >= r10) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
    
        if (r9.c(1) == (-1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0065, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(com.yandex.mobile.ads.impl.to r9, long r10) {
        /*
            r8 = this;
            long r0 = r9.getPosition()
            long r2 = r9.e()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L10
            r0 = r2
            goto L11
        L10:
            r0 = r1
        L11:
            com.yandex.mobile.ads.impl.db.a(r0)
            com.yandex.mobile.ads.impl.pr0 r0 = r8.f392054g
            r3 = 4
            r0.c(r3)
        L1a:
            r4 = -1
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 == 0) goto L2b
            long r4 = r9.getPosition()
            r6 = 4
            long r4 = r4 + r6
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 >= 0) goto L53
        L2b:
            com.yandex.mobile.ads.impl.pr0 r4 = r8.f392054g
            byte[] r4 = r4.c()
            boolean r4 = r9.b(r4, r1, r3, r2)     // Catch: java.io.EOFException -> L36
            goto L37
        L36:
            r4 = r1
        L37:
            if (r4 == 0) goto L53
            com.yandex.mobile.ads.impl.pr0 r0 = r8.f392054g
            r0.e(r1)
            com.yandex.mobile.ads.impl.pr0 r0 = r8.f392054g
            long r4 = r0.v()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L4f
            r9.c()
            return r2
        L4f:
            r9.a(r2)
            goto L1a
        L53:
            if (r0 == 0) goto L5d
            long r3 = r9.getPosition()
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 >= 0) goto L65
        L5d:
            int r3 = r9.c(r2)
            r4 = -1
            if (r3 == r4) goto L65
            goto L53
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.yp0.a(com.yandex.mobile.ads.impl.to, long):boolean");
    }
}
