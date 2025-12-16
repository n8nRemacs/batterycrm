package defpackage;

import androidx.media3.common.ParserException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class cd implements gp5 {
    public static final int[] C0 = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] D0 = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    public static final byte[] E0;
    public static final byte[] F0;
    public long A0;
    public boolean B0;
    public int X;
    public int Y;
    public long Z;
    public final int b;
    public final jx4 c;
    public boolean d;
    public long o;
    public int t0;
    public long u0;
    public kp5 v0;
    public sfg w0;
    public sfg x0;
    public i9e y0;
    public boolean z0;
    public final byte[] a = new byte[1];
    public int s0 = -1;

    static {
        String str = zxg.a;
        Charset charset = StandardCharsets.UTF_8;
        E0 = "#!AMR\n".getBytes(charset);
        F0 = "#!AMR-WB\n".getBytes(charset);
    }

    public cd(int i) {
        this.b = i;
        jx4 jx4Var = new jx4();
        this.c = jx4Var;
        this.x0 = jx4Var;
    }

    public final int a(ip5 ip5Var) throws ParserException {
        boolean z;
        ip5Var.y();
        byte[] bArr = this.a;
        ip5Var.i(0, bArr, 1);
        byte b = bArr[0];
        if ((b & 131) > 0) {
            throw ParserException.a(null, "Invalid padding bits for frame header " + ((int) b));
        }
        int i = (b >> 3) & 15;
        if (i >= 0 && i <= 15 && (((z = this.d) && (i < 10 || i > 13)) || (!z && (i < 12 || i > 14)))) {
            return z ? D0[i] : C0[i];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.d ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw ParserException.a(null, sb.toString());
    }

    public final boolean b(ip5 ip5Var) {
        ip5Var.y();
        byte[] bArr = E0;
        byte[] bArr2 = new byte[bArr.length];
        ip5Var.i(0, bArr2, bArr.length);
        if (Arrays.equals(bArr2, bArr)) {
            this.d = false;
            ip5Var.z(bArr.length);
            return true;
        }
        ip5Var.y();
        byte[] bArr3 = F0;
        byte[] bArr4 = new byte[bArr3.length];
        ip5Var.i(0, bArr4, bArr3.length);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.d = true;
        ip5Var.z(bArr3.length);
        return true;
    }

    @Override // defpackage.gp5
    public final void d(long j, long j2) {
        this.o = 0L;
        this.X = 0;
        this.Y = 0;
        this.A0 = j2;
        i9e i9eVar = this.y0;
        if (!(i9eVar instanceof rj7)) {
            if (j == 0 || !(i9eVar instanceof ys3)) {
                this.u0 = 0L;
                return;
            } else {
                this.u0 = (Math.max(0L, j - ((ys3) i9eVar).b) * 8000000) / r7.o;
                return;
            }
        }
        rj7 rj7Var = (rj7) i9eVar;
        r55 r55Var = rj7Var.b;
        long jC = r55Var.b == 0 ? -9223372036854775807L : r55Var.c(zxg.b(rj7Var.a, j));
        this.u0 = jC;
        if (Math.abs(this.A0 - jC) < 20000) {
            return;
        }
        this.z0 = true;
        this.x0 = this.c;
    }

    @Override // defpackage.gp5
    public final boolean i(ip5 ip5Var) {
        return b(ip5Var);
    }

    @Override // defpackage.gp5
    public final void release() {
    }

    @Override // defpackage.gp5
    public final void w(kp5 kp5Var) {
        this.v0 = kp5Var;
        sfg sfgVarMo163B = kp5Var.mo163B(0, 1);
        this.w0 = sfgVarMo163B;
        this.x0 = sfgVarMo163B;
        kp5Var.w();
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00ee A[PHI: r4
  0x00ee: PHI (r4v1 ip5) = (r4v0 ip5), (r4v5 ip5) binds: [B:53:0x00ec, B:56:0x00fa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fd  */
    @Override // defpackage.gp5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int y(defpackage.ip5 r18, defpackage.n7 r19) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cd.y(ip5, n7):int");
    }
}
