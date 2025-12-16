package androidx.media3.extractor.ogg;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.z;
import androidx.media3.extractor.C23191j;
import java.io.EOFException;

/* compiled from: OggPageHeader.java */
/* loaded from: classes.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    public int f51110a;

    /* renamed from: b, reason: collision with root package name */
    public long f51111b;

    /* renamed from: c, reason: collision with root package name */
    public int f51112c;

    /* renamed from: d, reason: collision with root package name */
    public int f51113d;

    /* renamed from: e, reason: collision with root package name */
    public int f51114e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f51115f = new int[255];

    /* renamed from: g, reason: collision with root package name */
    public final z f51116g = new z(255);

    public final boolean a(C23191j c23191j, boolean z12) throws ParserException, EOFException {
        boolean zA2;
        boolean zA3;
        this.f51110a = 0;
        this.f51111b = 0L;
        this.f51112c = 0;
        this.f51113d = 0;
        this.f51114e = 0;
        z zVar = this.f51116g;
        zVar.C(27);
        try {
            zA2 = c23191j.a(zVar.f47962a, 0, 27, z12);
        } catch (EOFException e12) {
            if (!z12) {
                throw e12;
            }
            zA2 = false;
        }
        if (!zA2 || zVar.v() != 1332176723) {
            return false;
        }
        if (zVar.u() != 0) {
            if (z12) {
                return false;
            }
            throw ParserException.b("unsupported bit stream revision");
        }
        this.f51110a = zVar.u();
        this.f51111b = zVar.j();
        zVar.l();
        zVar.l();
        zVar.l();
        int iU2 = zVar.u();
        this.f51112c = iU2;
        this.f51113d = iU2 + 27;
        zVar.C(iU2);
        try {
            zA3 = c23191j.a(zVar.f47962a, 0, this.f51112c, z12);
        } catch (EOFException e13) {
            if (!z12) {
                throw e13;
            }
            zA3 = false;
        }
        if (!zA3) {
            return false;
        }
        for (int i12 = 0; i12 < this.f51112c; i12++) {
            int iU3 = zVar.u();
            this.f51115f[i12] = iU3;
            this.f51114e += iU3;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (r11 == (-1)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
    
        if (r10.f50583d >= r11) goto L33;
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
    public final boolean b(androidx.media3.extractor.C23191j r10, long r11) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            r9 = this;
            long r0 = r10.f50583d
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
            androidx.media3.common.util.C23110a.b(r0)
            androidx.media3.common.util.z r0 = r9.f51116g
            r3 = 4
            r0.C(r3)
        L18:
            r4 = -1
            int r4 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r4 == 0) goto L27
            long r5 = r10.f50583d
            r7 = 4
            long r5 = r5 + r7
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 >= 0) goto L46
        L27:
            byte[] r5 = r0.f47962a
            boolean r5 = r10.a(r5, r1, r3, r2)     // Catch: java.io.EOFException -> L2e
            goto L2f
        L2e:
            r5 = r1
        L2f:
            if (r5 == 0) goto L46
            r0.F(r1)
            long r4 = r0.v()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L42
            r10.f50585f = r1
            return r2
        L42:
            r10.i(r2)
            goto L18
        L46:
            if (r4 == 0) goto L4e
            long r5 = r10.f50583d
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.ogg.e.b(androidx.media3.extractor.j, long):boolean");
    }
}
