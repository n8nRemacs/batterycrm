package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* loaded from: classes.dex */
public final class cae extends y9e {
    public final jkc j;
    public final jkc k;
    public final long l;

    public cae(r7d r7dVar, long j, long j2, long j3, long j4, long j5, List list, long j6, jkc jkcVar, jkc jkcVar2, long j7, long j8) {
        super(r7dVar, j, j2, j3, j5, list, j6, j7, j8);
        this.j = jkcVar;
        this.k = jkcVar2;
        this.l = j4;
    }

    @Override // defpackage.hae
    public final r7d b(ymd ymdVar) {
        jkc jkcVar = this.j;
        if (jkcVar == null) {
            return (r7d) this.c;
        }
        hf6 hf6Var = ymdVar.a;
        return new r7d(0L, -1L, jkcVar.m(hf6Var.j, 0L, 0L, hf6Var.a));
    }

    @Override // defpackage.y9e
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

    @Override // defpackage.y9e
    public final r7d i(umd umdVar, long j) {
        long j2 = this.d;
        List list = this.f;
        long j3 = list != null ? ((eae) list.get((int) (j - j2))).a : (j - j2) * this.e;
        hf6 hf6Var = umdVar.a;
        return new r7d(0L, -1L, this.k.m(hf6Var.j, j, j3, hf6Var.a));
    }
}
