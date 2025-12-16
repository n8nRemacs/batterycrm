package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* loaded from: classes.dex */
public final class bae extends x9e {
    public final pea j;
    public final pea k;
    public final long l;

    public bae(q7d q7dVar, long j, long j2, long j3, long j4, long j5, List list, long j6, pea peaVar, pea peaVar2, long j7, long j8) {
        super(q7dVar, j, j2, j3, j5, list, j6, j7, j8);
        this.j = peaVar;
        this.k = peaVar2;
        this.l = j4;
    }

    @Override // defpackage.hae
    public final q7d a(xmd xmdVar) {
        pea peaVar = this.j;
        if (peaVar == null) {
            return (q7d) this.c;
        }
        gf6 gf6Var = xmdVar.a;
        return new q7d(0L, -1L, peaVar.b(gf6Var.Z, 0L, 0L, gf6Var.a));
    }

    @Override // defpackage.x9e
    public final long e(long j) {
        if (this.f != null) {
            return r0.size();
        }
        long j2 = this.l;
        if (j2 != -1) {
            return (j2 - this.d) + 1;
        }
        if (j == -9223372036854775807L) {
            return -1L;
        }
        BigInteger bigIntegerMultiply = BigInteger.valueOf(j).multiply(BigInteger.valueOf(this.a));
        BigInteger bigIntegerMultiply2 = BigInteger.valueOf(this.e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i = fn0.a;
        return new BigDecimal(bigIntegerMultiply).divide(new BigDecimal(bigIntegerMultiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override // defpackage.x9e
    public final q7d i(tmd tmdVar, long j) {
        long j2 = this.d;
        List list = this.f;
        long j3 = list != null ? ((dae) list.get((int) (j - j2))).a : (j - j2) * this.e;
        gf6 gf6Var = tmdVar.a;
        return new q7d(0L, -1L, this.k.b(gf6Var.Z, j, j3, gf6Var.a));
    }
}
