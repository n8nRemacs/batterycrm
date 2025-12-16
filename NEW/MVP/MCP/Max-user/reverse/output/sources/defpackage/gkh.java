package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.math.RoundingMode;

/* loaded from: classes.dex */
public final class gkh implements ekh, fkh {
    public final /* synthetic */ int a = 0;
    public final int b;
    public long c;
    public int d;
    public long e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;

    public gkh(jp5 jp5Var, rfg rfgVar, jkh jkhVar, String str, int i) throws ParserException {
        this.f = jp5Var;
        this.g = rfgVar;
        this.h = jkhVar;
        int i2 = jkhVar.a;
        int i3 = jkhVar.b;
        int i4 = (jkhVar.d * i2) / 8;
        int i5 = jkhVar.c;
        if (i5 != i4) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Expected block size: ");
            sb.append(i4);
            sb.append("; got: ");
            sb.append(i5);
            throw ParserException.a(null, sb.toString());
        }
        int i6 = i3 * i4;
        int i7 = i6 * 8;
        int iMax = Math.max(i4, i6 / 10);
        this.b = iMax;
        ef6 ef6Var = new ef6();
        ef6Var.k = str;
        ef6Var.f = i7;
        ef6Var.g = i7;
        ef6Var.l = iMax;
        ef6Var.x = i2;
        ef6Var.y = i3;
        ef6Var.z = i;
        this.i = new gf6(ef6Var);
    }

    @Override // defpackage.ekh, defpackage.fkh
    public final void a(long j) {
        switch (this.a) {
            case 0:
                this.c = j;
                this.d = 0;
                this.e = 0L;
                break;
            default:
                this.c = j;
                this.d = 0;
                this.e = 0L;
                break;
        }
    }

    @Override // defpackage.ekh, defpackage.fkh
    public final void b(int i, long j) {
        switch (this.a) {
            case 0:
                ((jp5) this.f).N(new kkh((jkh) this.h, 1, i, j));
                ((rfg) this.g).d((gf6) this.i);
                break;
            default:
                ((kp5) this.f).Q(new lkh((jkh) this.h, 1, i, j));
                sfg sfgVar = (sfg) this.g;
                sfgVar.d((hf6) this.i);
                sfgVar.getClass();
                break;
        }
    }

    @Override // defpackage.fkh
    public boolean c(ip5 ip5Var, long j) {
        Object obj;
        int i;
        int i2;
        long j2 = j;
        while (true) {
            obj = this.g;
            if (j2 <= 0 || (i = this.d) >= (i2 = this.b)) {
                break;
            }
            int iC = ((sfg) obj).c(ip5Var, (int) Math.min(i2 - i, j2), true);
            if (iC == -1) {
                j2 = 0;
            } else {
                this.d += iC;
                j2 -= iC;
            }
        }
        jkh jkhVar = (jkh) this.h;
        int i3 = jkhVar.c;
        int i4 = this.d / i3;
        if (i4 > 0) {
            long j3 = this.c;
            long j4 = this.e;
            long j5 = jkhVar.b;
            String str = zxg.a;
            long jE0 = j3 + zxg.e0(j4, 1000000L, j5, RoundingMode.DOWN);
            int i5 = i4 * i3;
            int i6 = this.d - i5;
            ((sfg) obj).a(jE0, 1, i5, i6, null);
            this.e += i4;
            this.d = i6;
        }
        return j2 <= 0;
    }

    @Override // defpackage.ekh
    public boolean d(hp5 hp5Var, long j) {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.d) < (i2 = this.b)) {
            int iA = ((rfg) this.g).a(hp5Var, (int) Math.min(i2 - i, j2), true);
            if (iA == -1) {
                j2 = 0;
            } else {
                this.d += iA;
                j2 -= iA;
            }
        }
        int i3 = ((jkh) this.h).c;
        int i4 = this.d / i3;
        if (i4 > 0) {
            long jH = this.c + xxg.H(this.e, 1000000L, r1.b);
            int i5 = i4 * i3;
            int i6 = this.d - i5;
            ((rfg) this.g).b(jH, 1, i5, i6, null);
            this.e += i4;
            this.d = i6;
        }
        return j2 <= 0;
    }

    public gkh(kp5 kp5Var, sfg sfgVar, jkh jkhVar, String str, int i) throws androidx.media3.common.ParserException {
        this.f = kp5Var;
        this.g = sfgVar;
        this.h = jkhVar;
        int i2 = jkhVar.a;
        int i3 = jkhVar.b;
        int i4 = (jkhVar.d * i2) / 8;
        int i5 = jkhVar.c;
        if (i5 == i4) {
            int i6 = i3 * i4;
            int i7 = i6 * 8;
            int iMax = Math.max(i4, i6 / 10);
            this.b = iMax;
            ff6 ff6Var = new ff6();
            ff6Var.l = xz9.n("audio/wav");
            ff6Var.m = xz9.n(str);
            ff6Var.h = i7;
            ff6Var.i = i7;
            ff6Var.n = iMax;
            ff6Var.E = i2;
            ff6Var.F = i3;
            ff6Var.G = i;
            this.i = new hf6(ff6Var);
            return;
        }
        throw androidx.media3.common.ParserException.a(null, "Expected block size: " + i4 + "; got: " + i5);
    }
}
