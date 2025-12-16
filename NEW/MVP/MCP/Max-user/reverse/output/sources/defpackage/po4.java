package defpackage;

import androidx.work.WorkRequest;
import java.math.BigInteger;

/* loaded from: classes.dex */
public final class po4 implements i9e {
    public final /* synthetic */ qo4 a;

    public po4(qo4 qo4Var) {
        this.a = qo4Var;
    }

    @Override // defpackage.i9e
    public final boolean c() {
        return true;
    }

    @Override // defpackage.i9e
    public final g9e e(long j) {
        qo4 qo4Var = this.a;
        long j2 = qo4Var.b;
        BigInteger bigIntegerValueOf = BigInteger.valueOf((((ulf) qo4Var.w0).f * j) / 1000000);
        long j3 = qo4Var.c;
        m9e m9eVar = new m9e(j, zxg.j((bigIntegerValueOf.multiply(BigInteger.valueOf(j3 - j2)).divide(BigInteger.valueOf(qo4Var.o)).longValue() + j2) - WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, qo4Var.b, j3 - 1));
        return new g9e(m9eVar, m9eVar);
    }

    @Override // defpackage.i9e
    public final long f() {
        return (this.a.o * 1000000) / ((ulf) r0.w0).f;
    }
}
