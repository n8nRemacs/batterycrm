package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.F;
import java.io.EOFException;

/* compiled from: OggPageHeader.java */
/* loaded from: classes6.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    public int f344937a;

    /* renamed from: b, reason: collision with root package name */
    public long f344938b;

    /* renamed from: c, reason: collision with root package name */
    public int f344939c;

    /* renamed from: d, reason: collision with root package name */
    public int f344940d;

    /* renamed from: e, reason: collision with root package name */
    public int f344941e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f344942f = new int[255];

    /* renamed from: g, reason: collision with root package name */
    public final F f344943g = new F(255);

    public final boolean a(com.google.android.exoplayer2.extractor.f fVar, boolean z12) throws ParserException, EOFException {
        boolean zA2;
        boolean zA3;
        this.f344937a = 0;
        this.f344938b = 0L;
        this.f344939c = 0;
        this.f344940d = 0;
        this.f344941e = 0;
        F f12 = this.f344943g;
        f12.y(27);
        try {
            zA2 = fVar.a(f12.f348070a, 0, 27, z12);
        } catch (EOFException e12) {
            if (!z12) {
                throw e12;
            }
            zA2 = false;
        }
        if (!zA2 || f12.s() != 1332176723) {
            return false;
        }
        if (f12.r() != 0) {
            if (z12) {
                return false;
            }
            throw ParserException.c("unsupported bit stream revision");
        }
        this.f344937a = f12.r();
        this.f344938b = f12.g();
        f12.i();
        f12.i();
        f12.i();
        int iR2 = f12.r();
        this.f344939c = iR2;
        this.f344940d = iR2 + 27;
        f12.y(iR2);
        try {
            zA3 = fVar.a(f12.f348070a, 0, this.f344939c, z12);
        } catch (EOFException e13) {
            if (!z12) {
                throw e13;
            }
            zA3 = false;
        }
        if (!zA3) {
            return false;
        }
        for (int i12 = 0; i12 < this.f344939c; i12++) {
            int iR3 = f12.r();
            this.f344942f[i12] = iR3;
            this.f344941e += iR3;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (r11 == (-1)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
    
        if (r10.f344495d >= r11) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        if (r10.o(1) == (-1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(com.google.android.exoplayer2.extractor.f r10, long r11) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            r9 = this;
            long r0 = r10.f344495d
            long r2 = r10.g()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 != 0) goto Le
            r0 = r2
            goto Lf
        Le:
            r0 = r1
        Lf:
            com.google.android.exoplayer2.util.C36585a.b(r0)
            com.google.android.exoplayer2.util.F r0 = r9.f344943g
            r3 = 4
            r0.y(r3)
        L18:
            r4 = -1
            int r4 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r4 == 0) goto L27
            long r5 = r10.f344495d
            r7 = 4
            long r5 = r5 + r7
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 >= 0) goto L46
        L27:
            byte[] r5 = r0.f348070a
            boolean r5 = r10.a(r5, r1, r3, r2)     // Catch: java.io.EOFException -> L2e
            goto L2f
        L2e:
            r5 = r1
        L2f:
            if (r5 == 0) goto L46
            r0.B(r1)
            long r4 = r0.s()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L42
            r10.f344497f = r1
            return r2
        L42:
            r10.i(r2)
            goto L18
        L46:
            if (r4 == 0) goto L4e
            long r5 = r10.f344495d
            int r0 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r0 >= 0) goto L56
        L4e:
            int r0 = r10.o(r2)
            r3 = -1
            if (r0 == r3) goto L56
            goto L46
        L56:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.ogg.e.b(com.google.android.exoplayer2.extractor.f, long):boolean");
    }
}
