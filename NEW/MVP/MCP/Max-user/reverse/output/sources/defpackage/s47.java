package defpackage;

import android.net.Uri;
import java.io.EOFException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class s47 extends aw8 {
    public static final AtomicInteger W0 = new AtomicInteger();
    public final ze4 A0;
    public final we B0;
    public final boolean C0;
    public final boolean D0;
    public final z9g E0;
    public final wm4 F0;
    public final List G0;
    public final y45 H0;
    public final lc7 I0;
    public final umb J0;
    public final boolean K0;
    public final boolean L0;
    public we M0;
    public i67 N0;
    public int O0;
    public boolean P0;
    public volatile boolean Q0;
    public boolean R0;
    public wg7 S0;
    public boolean T0;
    public long U0;
    public boolean V0;
    public final int u0;
    public final int v0;
    public final Uri w0;
    public final boolean x0;
    public final int y0;
    public final se4 z0;

    public s47(wm4 wm4Var, se4 se4Var, ze4 ze4Var, hf6 hf6Var, boolean z, se4 se4Var2, ze4 ze4Var2, boolean z2, Uri uri, List list, int i, Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, z9g z9gVar, y45 y45Var, we weVar, lc7 lc7Var, umb umbVar, boolean z6, boolean z7, n4c n4cVar) {
        super(se4Var, ze4Var, hf6Var, i, obj, j, j2, j3);
        this.K0 = z;
        this.y0 = i2;
        this.U0 = z3 ? j2 - j : -9223372036854775807L;
        this.v0 = i3;
        this.A0 = ze4Var2;
        this.z0 = se4Var2;
        this.P0 = ze4Var2 != null;
        this.L0 = z2;
        this.w0 = uri;
        this.C0 = z5;
        this.E0 = z9gVar;
        this.D0 = z4;
        this.F0 = wm4Var;
        this.G0 = list;
        this.H0 = y45Var;
        this.B0 = weVar;
        this.I0 = lc7Var;
        this.J0 = umbVar;
        this.V0 = z6;
        this.x0 = z7;
        t76 t76Var = wg7.b;
        this.S0 = zjd.o;
        this.u0 = W0.getAndIncrement();
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

    @Override // defpackage.aw8
    public final boolean b() {
        throw null;
    }

    @Override // defpackage.ec8
    public final void c() {
        this.Q0 = true;
    }

    public final void d(se4 se4Var, ze4 ze4Var, boolean z, boolean z2) {
        ze4 ze4VarC;
        boolean z3;
        long j;
        long j2;
        if (z) {
            z3 = this.O0 != 0;
            ze4VarC = ze4Var;
        } else {
            ze4VarC = ze4Var.c(this.O0);
            z3 = false;
        }
        try {
            nm4 nm4VarH = h(se4Var, ze4VarC, z2);
            if (z3) {
                nm4VarH.K(this.O0, false);
            }
            while (!this.Q0 && ((gp5) this.M0.b).y(nm4VarH, we.X) == 0) {
                try {
                    try {
                    } catch (Throwable th) {
                        this.O0 = (int) (nm4VarH.d - ze4Var.f);
                        throw th;
                    }
                } catch (EOFException e) {
                    if ((this.d.f & 16384) == 0) {
                        throw e;
                    }
                    ((gp5) this.M0.b).d(0L, 0L);
                    j = nm4VarH.d;
                    j2 = ze4Var.f;
                }
            }
            j = nm4VarH.d;
            j2 = ze4Var.f;
            this.O0 = (int) (j - j2);
        } finally {
            z7j.a(se4Var);
        }
    }

    public final int f(int i) {
        hsi.g(!this.V0);
        if (i >= this.S0.size()) {
            return 0;
        }
        return ((Integer) this.S0.get(i)).intValue();
    }

    public final boolean g() {
        return this.U0 != -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.nm4 h(defpackage.se4 r34, defpackage.ze4 r35, boolean r36) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1008
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s47.h(se4, ze4, boolean):nm4");
    }

    @Override // defpackage.ec8
    public final void load() {
        we weVar;
        this.N0.getClass();
        if (this.M0 == null && (weVar = this.B0) != null) {
            gp5 gp5Var = (gp5) weVar.b;
            if ((gp5Var instanceof jjg) || (gp5Var instanceof kj6)) {
                this.M0 = weVar;
                this.P0 = false;
            }
        }
        ze4 ze4Var = this.A0;
        se4 se4Var = this.z0;
        if (this.P0) {
            se4Var.getClass();
            ze4Var.getClass();
            d(se4Var, ze4Var, this.L0, false);
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
