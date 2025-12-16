package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.io.EOFException;

/* loaded from: classes.dex */
public final class hua {
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f;
    public final Object g;

    public hua(int i) {
        switch (i) {
            case 1:
                this.f = new int[255];
                this.g = new umb(255);
                break;
            default:
                this.f = new int[255];
                this.g = new qyg(255);
                break;
        }
    }

    public boolean a(hp5 hp5Var, boolean z) throws ParserException, EOFException {
        boolean zN;
        boolean zN2;
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        qyg qygVar = (qyg) this.g;
        qygVar.B(27);
        try {
            zN = hp5Var.n(qygVar.a, 0, 27, z);
        } catch (EOFException e) {
            if (!z) {
                throw e;
            }
            zN = false;
        }
        if (zN && qygVar.t() == 1332176723) {
            if (qygVar.s() == 0) {
                this.a = qygVar.s();
                this.b = qygVar.i();
                qygVar.j();
                qygVar.j();
                qygVar.j();
                int iS = qygVar.s();
                this.c = iS;
                this.d = iS + 27;
                qygVar.B(iS);
                try {
                    zN2 = hp5Var.n(qygVar.a, 0, this.c, z);
                } catch (EOFException e2) {
                    if (!z) {
                        throw e2;
                    }
                    zN2 = false;
                }
                if (zN2) {
                    for (int i = 0; i < this.c; i++) {
                        int iS2 = qygVar.s();
                        this.f[i] = iS2;
                        this.e += iS2;
                    }
                    return true;
                }
            } else if (!z) {
                throw ParserException.c("unsupported bit stream revision");
            }
        }
        return false;
    }

    public boolean b(ip5 ip5Var, boolean z) throws androidx.media3.common.ParserException, EOFException {
        boolean zN;
        boolean zN2;
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        umb umbVar = (umb) this.g;
        umbVar.G(27);
        try {
            zN = ip5Var.n(umbVar.a, 0, 27, z);
        } catch (EOFException e) {
            if (!z) {
                throw e;
            }
            zN = false;
        }
        if (zN && umbVar.z() == 1332176723) {
            if (umbVar.x() == 0) {
                this.a = umbVar.x();
                this.b = umbVar.m();
                umbVar.o();
                umbVar.o();
                umbVar.o();
                int iX = umbVar.x();
                this.c = iX;
                this.d = iX + 27;
                umbVar.G(iX);
                try {
                    zN2 = ip5Var.n(umbVar.a, 0, this.c, z);
                } catch (EOFException e2) {
                    if (!z) {
                        throw e2;
                    }
                    zN2 = false;
                }
                if (zN2) {
                    for (int i = 0; i < this.c; i++) {
                        int iX2 = umbVar.x();
                        this.f[i] = iX2;
                        this.e += iX2;
                    }
                    return true;
                }
            } else if (!z) {
                throw androidx.media3.common.ParserException.c("unsupported bit stream revision");
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if (r11 == (-1)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (r10.getPosition() >= r11) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        if (r10.G() == (-1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c(defpackage.hp5 r10, long r11) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.g
            qyg r0 = (defpackage.qyg) r0
            long r1 = r10.getPosition()
            long r3 = r10.o()
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L14
            r1 = r3
            goto L15
        L14:
            r1 = r2
        L15:
            defpackage.fsi.b(r1)
            r1 = 4
            r0.B(r1)
        L1c:
            r4 = -1
            int r4 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r4 == 0) goto L2d
            long r5 = r10.getPosition()
            r7 = 4
            long r5 = r5 + r7
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 >= 0) goto L4d
        L2d:
            byte[] r5 = r0.a
            boolean r5 = r10.n(r5, r2, r1, r3)     // Catch: java.io.EOFException -> L34
            goto L35
        L34:
            r5 = r2
        L35:
            if (r5 == 0) goto L4d
            r0.E(r2)
            long r4 = r0.t()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L49
            r10.y()
            return r3
        L49:
            r10.z(r3)
            goto L1c
        L4d:
            if (r4 == 0) goto L57
            long r0 = r10.getPosition()
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 >= 0) goto L5f
        L57:
            int r0 = r10.G()
            r1 = -1
            if (r0 == r1) goto L5f
            goto L4d
        L5f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hua.c(hp5, long):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if (r11 == (-1)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (r10.getPosition() >= r11) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        if (r10.v(1) == (-1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d(defpackage.ip5 r10, long r11) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.g
            umb r0 = (defpackage.umb) r0
            long r1 = r10.getPosition()
            long r3 = r10.o()
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L14
            r1 = r3
            goto L15
        L14:
            r1 = r2
        L15:
            defpackage.hsi.b(r1)
            r1 = 4
            r0.G(r1)
        L1c:
            r4 = -1
            int r4 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r4 == 0) goto L2d
            long r5 = r10.getPosition()
            r7 = 4
            long r5 = r5 + r7
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 >= 0) goto L4d
        L2d:
            byte[] r5 = r0.a
            boolean r5 = r10.n(r5, r2, r1, r3)     // Catch: java.io.EOFException -> L34
            goto L35
        L34:
            r5 = r2
        L35:
            if (r5 == 0) goto L4d
            r0.J(r2)
            long r4 = r0.z()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L49
            r10.y()
            return r3
        L49:
            r10.z(r3)
            goto L1c
        L4d:
            if (r4 == 0) goto L57
            long r0 = r10.getPosition()
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 >= 0) goto L5f
        L57:
            int r0 = r10.v(r3)
            r1 = -1
            if (r0 == r1) goto L5f
            goto L4d
        L5f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hua.d(ip5, long):boolean");
    }
}
