package org.joda.time.chrono;

/* compiled from: BasicGJChronology.java */
/* loaded from: classes7.dex */
abstract class g extends AbstractC44859c {

    /* renamed from: h0, reason: collision with root package name */
    public static final int[] f420592h0 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    /* renamed from: i0, reason: collision with root package name */
    public static final int[] f420593i0 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    /* renamed from: j0, reason: collision with root package name */
    public static final long[] f420594j0 = new long[12];

    /* renamed from: k0, reason: collision with root package name */
    public static final long[] f420595k0 = new long[12];
    private static final long serialVersionUID = 538276888268L;

    static {
        long j12 = 0;
        int i12 = 0;
        long j13 = 0;
        while (i12 < 11) {
            j12 += f420592h0[i12] * 86400000;
            int i13 = i12 + 1;
            f420594j0[i13] = j12;
            j13 += f420593i0[i12] * 86400000;
            f420595k0[i13] = j13;
            i12 = i13;
        }
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final boolean C0(long j12) {
        return this.f420496B.c(j12) == 29 && this.f420501G.z(j12);
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final long E0(int i12, long j12) {
        int iZ02 = z0(j12);
        int iF02 = f0(iZ02, j12);
        int iQ02 = AbstractC44859c.q0(j12);
        if (iF02 > 59) {
            if (D0(iZ02)) {
                if (!D0(i12)) {
                    iF02--;
                }
            } else if (D0(i12)) {
                iF02++;
            }
        }
        return B0(i12, 1, iF02) + iQ02;
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final int h0(int i12) {
        return f420593i0[i12 - 1];
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final int i0(int i12, long j12) {
        if (i12 <= 28 && i12 >= 1) {
            return 28;
        }
        int iZ02 = z0(j12);
        return m0(iZ02, t0(iZ02, j12));
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final int m0(int i12, int i13) {
        return D0(i12) ? f420593i0[i13 - 1] : f420592h0[i13 - 1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        if (r14 < 5062500) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
    
        if (r14 < 12825000) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005e, code lost:
    
        if (r14 < 20587500) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006d, code lost:
    
        if (r14 < 28265625) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0083, code lost:
    
        if (r14 < 4978125) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008f, code lost:
    
        if (r14 < 12740625) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a0, code lost:
    
        if (r14 < 20503125) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ac, code lost:
    
        if (r14 < 28181250) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:
    
        return 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:?, code lost:
    
        return 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:?, code lost:
    
        return 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:?, code lost:
    
        return 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:?, code lost:
    
        return 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:?, code lost:
    
        return 9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:?, code lost:
    
        return 11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:?, code lost:
    
        return 12;
     */
    @Override // org.joda.time.chrono.AbstractC44859c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int t0(int r13, long r14) {
        /*
            r12 = this;
            long r0 = r12.A0(r13)
            long r14 = r14 - r0
            r0 = 10
            long r14 = r14 >> r0
            int r14 = (int) r14
            boolean r13 = r12.D0(r13)
            r15 = 12
            r1 = 11
            r2 = 9
            r3 = 8
            r4 = 7
            r5 = 6
            r6 = 5
            r7 = 4
            r8 = 3
            r9 = 2
            r10 = 1
            r11 = 2615625(0x27e949, float:3.665271E-39)
            if (r13 == 0) goto L73
            r13 = 15356250(0xea515a, float:2.151869E-38)
            if (r14 >= r13) goto L4e
            r13 = 7678125(0x7528ad, float:1.0759345E-38)
            if (r14 >= r13) goto L3b
            if (r14 >= r11) goto L30
        L2d:
            r0 = r10
            goto Laf
        L30:
            r13 = 5062500(0x4d3f64, float:7.094073E-39)
            if (r14 >= r13) goto L38
        L35:
            r0 = r9
            goto Laf
        L38:
            r0 = r8
            goto Laf
        L3b:
            r13 = 10209375(0x9bc85f, float:1.4306382E-38)
            if (r14 >= r13) goto L43
        L40:
            r0 = r7
            goto Laf
        L43:
            r13 = 12825000(0xc3b1a8, float:1.7971653E-38)
            if (r14 >= r13) goto L4b
        L48:
            r0 = r6
            goto Laf
        L4b:
            r0 = r5
            goto Laf
        L4e:
            r13 = 23118750(0x160c39e, float:4.128265E-38)
            if (r14 >= r13) goto L64
            r13 = 17971875(0x1123aa3, float:2.6858035E-38)
            if (r14 >= r13) goto L5b
        L58:
            r0 = r4
            goto Laf
        L5b:
            r13 = 20587500(0x13a23ec, float:3.4188577E-38)
            if (r14 >= r13) goto L62
        L60:
            r0 = r3
            goto Laf
        L62:
            r0 = r2
            goto Laf
        L64:
            r13 = 25734375(0x188ace7, float:5.020661E-38)
            if (r14 >= r13) goto L6a
            goto Laf
        L6a:
            r13 = 28265625(0x1af4c99, float:6.439476E-38)
            if (r14 >= r13) goto L71
        L6f:
            r0 = r1
            goto Laf
        L71:
            r0 = r15
            goto Laf
        L73:
            r13 = 15271875(0xe907c3, float:2.1400455E-38)
            if (r14 >= r13) goto L92
            r13 = 7593750(0x73df16, float:1.064111E-38)
            if (r14 >= r13) goto L86
            if (r14 >= r11) goto L80
            goto L2d
        L80:
            r13 = 4978125(0x4bf5cd, float:6.975839E-39)
            if (r14 >= r13) goto L38
            goto L35
        L86:
            r13 = 10125000(0x9a7ec8, float:1.4188147E-38)
            if (r14 >= r13) goto L8c
            goto L40
        L8c:
            r13 = 12740625(0xc26811, float:1.7853418E-38)
            if (r14 >= r13) goto L4b
            goto L48
        L92:
            r13 = 23034375(0x15f7a07, float:4.1046182E-38)
            if (r14 >= r13) goto La3
            r13 = 17887500(0x110f10c, float:2.6621566E-38)
            if (r14 >= r13) goto L9d
            goto L58
        L9d:
            r13 = 20503125(0x138da55, float:3.3952108E-38)
            if (r14 >= r13) goto L62
            goto L60
        La3:
            r13 = 25650000(0x1876350, float:4.9733674E-38)
            if (r14 >= r13) goto La9
            goto Laf
        La9:
            r13 = 28181250(0x1ae0302, float:6.392182E-38)
            if (r14 >= r13) goto L71
            goto L6f
        Laf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.chrono.g.t0(int, long):int");
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final long v0(int i12, int i13) {
        return D0(i12) ? f420595k0[i13 - 1] : f420594j0[i13 - 1];
    }
}
