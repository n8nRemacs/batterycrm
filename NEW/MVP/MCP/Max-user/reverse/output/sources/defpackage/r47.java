package defpackage;

import android.net.Uri;
import java.io.EOFException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class r47 extends zv8 {
    public static final AtomicInteger V0 = new AtomicInteger();
    public final ye4 A0;
    public final ka5 B0;
    public final boolean C0;
    public final boolean D0;
    public final y9g E0;
    public final p47 F0;
    public final List G0;
    public final x45 H0;
    public final kc7 I0;
    public final qyg J0;
    public final boolean K0;
    public final boolean L0;
    public ka5 M0;
    public h67 N0;
    public int O0;
    public boolean P0;
    public volatile boolean Q0;
    public boolean R0;
    public wg7 S0;
    public boolean T0;
    public boolean U0;
    public final int u0;
    public final int v0;
    public final Uri w0;
    public final boolean x0;
    public final int y0;
    public final qe4 z0;

    public r47(p47 p47Var, qe4 qe4Var, ye4 ye4Var, gf6 gf6Var, boolean z, qe4 qe4Var2, ye4 ye4Var2, boolean z2, Uri uri, List list, int i, Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, y9g y9gVar, x45 x45Var, ka5 ka5Var, kc7 kc7Var, qyg qygVar, boolean z6, m4c m4cVar) {
        super(qe4Var, ye4Var, gf6Var, i, obj, j, j2, j3);
        this.K0 = z;
        this.y0 = i2;
        this.U0 = z3;
        this.v0 = i3;
        this.A0 = ye4Var2;
        this.z0 = qe4Var2;
        this.P0 = ye4Var2 != null;
        this.L0 = z2;
        this.w0 = uri;
        this.C0 = z5;
        this.E0 = y9gVar;
        this.D0 = z4;
        this.F0 = p47Var;
        this.G0 = list;
        this.H0 = x45Var;
        this.B0 = ka5Var;
        this.I0 = kc7Var;
        this.J0 = qygVar;
        this.x0 = z6;
        t76 t76Var = wg7.b;
        this.S0 = zjd.o;
        this.u0 = V0.getAndIncrement();
    }

    public static byte[] e(String str) {
        if (dsi.g(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    @Override // defpackage.zv8
    public final boolean b() {
        throw null;
    }

    @Override // defpackage.dc8
    public final void c() {
        this.Q0 = true;
    }

    public final void d(qe4 qe4Var, ye4 ye4Var, boolean z, boolean z2) {
        ye4 ye4VarB;
        long j;
        long j2;
        if (z) {
            z = this.O0 != 0;
            ye4VarB = ye4Var;
        } else {
            ye4VarB = ye4Var.b(this.O0);
        }
        try {
            mm4 mm4VarG = g(qe4Var, ye4VarB, z2);
            if (z) {
                mm4VarG.z(this.O0);
            }
            while (!this.Q0 && ((fp5) this.M0.a).i(mm4VarG, ka5.d) == 0) {
                try {
                    try {
                    } catch (EOFException e) {
                        if ((this.d.o & 16384) == 0) {
                            throw e;
                        }
                        ((fp5) this.M0.a).d(0L, 0L);
                        j = mm4VarG.d;
                        j2 = ye4Var.f;
                    }
                } catch (Throwable th) {
                    this.O0 = (int) (mm4VarG.d - ye4Var.f);
                    throw th;
                }
            }
            j = mm4VarG.d;
            j2 = ye4Var.f;
            this.O0 = (int) (j - j2);
        } finally {
            y7j.b(qe4Var);
        }
    }

    public final int f(int i) {
        fsi.d(!this.x0);
        if (i >= this.S0.size()) {
            return 0;
        }
        return ((Integer) this.S0.get(i)).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.mm4 g(defpackage.qe4 r24, defpackage.ye4 r25, boolean r26) throws java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 961
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r47.g(qe4, ye4, boolean):mm4");
    }

    @Override // defpackage.dc8
    public final void load() {
        ka5 ka5Var;
        this.N0.getClass();
        if (this.M0 == null && (ka5Var = this.B0) != null) {
            fp5 fp5Var = (fp5) ka5Var.a;
            if ((fp5Var instanceof ijg) || (fp5Var instanceof jj6)) {
                this.M0 = ka5Var;
                this.P0 = false;
            }
        }
        ye4 ye4Var = this.A0;
        qe4 qe4Var = this.z0;
        if (this.P0) {
            qe4Var.getClass();
            ye4Var.getClass();
            d(qe4Var, ye4Var, this.L0, false);
            this.O0 = 0;
            this.P0 = false;
        }
        if (this.Q0) {
            return;
        }
        if (!this.D0) {
            d(this.s0, this.b, this.K0, true);
        }
        this.R0 = !this.Q0;
    }
}
