package defpackage;

import androidx.work.WorkRequest;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class ecf implements udf {
    public final y87 a;
    public final y6d b;
    public final boolean c;
    public ha5 d;
    public double e;
    public final hk8 f = new hk8();
    public BigInteger g;
    public BigInteger h;
    public final s6b i;
    public final CopyOnWriteArrayList j;

    public ecf(y87 y87Var, y6d y6dVar, boolean z) {
        this.a = y87Var;
        this.b = y6dVar;
        this.c = z;
        BigInteger bigInteger = BigInteger.ZERO;
        this.g = bigInteger;
        this.h = bigInteger;
        this.i = new s6b(8);
        this.j = new CopyOnWriteArrayList();
        ((HashMap) y87Var.c).put(this, new y9i(5L, TimeUnit.SECONDS));
    }

    @Override // defpackage.udf
    public final void a(a7d a7dVar) {
        String str;
        Double dF;
        double d = 0.0d;
        if (this.i.f(a7dVar.c)) {
            this.d = null;
            this.e = 0.0d;
            BigInteger bigInteger = BigInteger.ZERO;
            this.g = bigInteger;
            this.h = bigInteger;
            hk8 hk8Var = this.f;
            hk8Var.a = 0L;
            hk8Var.b = 0L;
        }
        u42 u42VarC = a7dVar.c();
        if (u42VarC != null && (str = u42VarC.h) != null && (dF = bnf.f(str)) != null) {
            double dDoubleValue = dF.doubleValue();
            ha5 ha5Var = this.d;
            if (ha5Var != null) {
                ha5Var.a(dDoubleValue);
            } else {
                this.d = new ha5(dDoubleValue);
            }
        }
        List<l9f> list = a7dVar.c;
        ArrayList arrayList = new ArrayList(list.size() / 2);
        for (l9f l9fVar : list) {
            if (l9fVar.b == 2 && l9fVar.a == 2) {
                arrayList.add((k9f) l9fVar);
            }
        }
        k9f k9fVar = (k9f) ue3.I(arrayList);
        if (k9fVar != null) {
            hk8 hk8Var2 = this.f;
            y6d y6dVar = this.b;
            BigInteger bigInteger2 = k9fVar.h;
            BigInteger bigInteger3 = k9fVar.i;
            if (bigInteger2 == null || bigInteger3 == null) {
                this.e = 0.0d;
                y6dVar.log("MediaAdaptation", "No packets were sent yet. Reset lost to 0");
            } else {
                if (this.c) {
                    this.e = hk8Var2.a(bigInteger3.longValue(), bigInteger2.longValue());
                    long j = hk8Var2.d;
                    long j2 = hk8Var2.c;
                    StringBuilder sb = new StringBuilder("Sent stats: sent=");
                    sb.append(j);
                    sb.append(" (total=");
                    sb.append(bigInteger2);
                    az1.r(j2, "), lost=", " (total=", sb);
                    sb.append(bigInteger3);
                    sb.append(")");
                    y6dVar.log("MediaAdaptation", sb.toString());
                    y6dVar.log("MediaAdaptation", "Lost packets fraction updated to " + this.e);
                } else {
                    if (bigInteger2.compareTo(this.g) < 0) {
                        this.g = bigInteger2;
                    }
                    if (bigInteger3.compareTo(this.h) < 0) {
                        this.h = bigInteger3;
                    }
                    BigInteger bigIntegerSubtract = bigInteger3.subtract(this.h);
                    BigInteger bigIntegerSubtract2 = bigInteger2.subtract(this.g);
                    y6dVar.log("MediaAdaptation", "Sent stats: sent=" + bigIntegerSubtract2 + " (total=" + bigInteger2 + "), lost=" + bigIntegerSubtract + " (total=" + bigInteger3 + ")");
                    BigInteger bigInteger4 = BigInteger.ZERO;
                    double dDoubleValue2 = (bigIntegerSubtract2.compareTo(bigInteger4) <= 0 || bigIntegerSubtract.compareTo(bigInteger4) <= 0) ? 0.0d : bigIntegerSubtract.doubleValue() / bigIntegerSubtract2.doubleValue();
                    this.e = dDoubleValue2;
                    y6dVar.log("MediaAdaptation", "Lost packets fraction updated to " + dDoubleValue2);
                    this.g = bigInteger2;
                    this.h = bigInteger3;
                }
                d = 0.0d;
            }
        }
        if (this.j.isEmpty()) {
            this.b.log("MediaAdaptation", "Ignore network state update because there are no listeners");
            return;
        }
        ha5 ha5Var2 = this.d;
        if (ha5Var2 != null) {
            d = ha5Var2.b;
        }
        ps8 ps8Var = new ps8(d, this.e);
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            us8 us8Var = (us8) it.next();
            y8g y8gVar = us8Var.b;
            y6d y6dVar2 = us8Var.c;
            double d2 = ps8Var.b;
            double d3 = ps8Var.a;
            qs8 qs8Var = us8Var.e.a;
            if ((d3 <= 120.0d && d2 >= 0.04d) || ((d3 > 120.0d && d2 >= 0.04d) || d3 >= 1000.0d)) {
                y6dVar2.log("MediaAdaptation", "Bad network detected. Current condition is " + ho7.t(us8Var.g) + ", state is " + ps8Var);
                int i = 3;
                if (d3 < 1000.0d) {
                    int i2 = us8Var.g;
                    i = (i2 != 3 || d3 < 700.0d) ? 2 : i2;
                }
                us8Var.d = y8gVar.getMsSinceBoot();
                if (us8Var.g != i) {
                    us8Var.b(i, ps8Var);
                }
            } else if ((d3 >= 90.0d || d2 > 0.02d) && (d3 >= 700.0d || d2 > 0.02d)) {
                y6dVar2.log("MediaAdaptation", "Ignore inbound state update " + ps8Var);
            } else {
                y6dVar2.log("MediaAdaptation", "Good network detected. Current condition is " + ho7.t(us8Var.g) + ", state is " + ps8Var);
                long msSinceBoot = y8gVar.getMsSinceBoot() - us8Var.d;
                if (msSinceBoot <= WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                    y6dVar2.log("MediaAdaptation", a9h.d(msSinceBoot, "Good network detected. Do not update to good networks state because of ", " < 30000"));
                } else if (us8Var.g != 1) {
                    y6dVar2.log("MediaAdaptation", "Good network detected. Reconfigure to good network mode. Timeout " + msSinceBoot);
                    us8Var.b(1, ps8Var);
                }
            }
        }
    }
}
