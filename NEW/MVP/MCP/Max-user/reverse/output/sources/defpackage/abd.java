package defpackage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class abd {
    public static final /* synthetic */ int j = 0;
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final k18 e;
    public final k18 f;
    public final bwf g;
    public final k18 h;
    public final ConcurrentHashMap i = new ConcurrentHashMap();

    public abd(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5, k18 k18Var6, k18 k18Var7, k18 k18Var8) {
        this.a = k18Var3;
        this.b = k18Var7;
        this.c = k18Var8;
        this.d = k18Var2;
        this.e = k18Var6;
        this.f = k18Var;
        this.g = new bwf(new zad(k18Var4, 0));
        this.h = k18Var5;
    }

    public static /* synthetic */ long e(abd abdVar, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 8) != 0) {
            z = false;
        }
        if ((i & 16) != 0) {
            z2 = true;
        }
        if ((i & 32) != 0) {
            z3 = false;
        }
        return abdVar.d(j2, j3, j4, z, z2, z3, false);
    }

    public final ve2 a() {
        return (ve2) this.a.getValue();
    }

    public final void b(pb2 pb2Var) {
        eh9 eh9Var = pb2Var.c;
        if (eh9Var == null) {
            return;
        }
        long j2 = pb2Var.b.a;
        si9 si9Var = eh9Var.a;
        e(this, j2, si9Var.c, si9Var.b, false, false, false, 88);
        ((y7b) this.b.getValue()).a(j2);
    }

    public final void c(pb2 pb2Var) {
        si9 si9Var;
        eh9 eh9Var = pb2Var.c;
        if (eh9Var == null || (si9Var = eh9Var.a) == null) {
            return;
        }
        long j2 = si9Var.c;
        if (j2 <= 0) {
            return;
        }
        e(this, pb2Var.b.a, j2, si9Var.b, true, false, false, 112);
    }

    public final long d(long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        Integer numValueOf;
        boolean z5;
        long j5 = z ? j3 - 1 : j3;
        StringBuilder sbL = az1.l(j2, "sendReadMark: chatServerId = ", ", mark = ");
        sbL.append(j3);
        sbL.append(", messageServerId = ");
        sbL.append(j4);
        wqi.c("abd", sbL.toString(), new Object[0]);
        pb2 pb2VarJ = a().J(j2);
        int i = 0;
        if (pb2VarJ == null) {
            loa loaVar = (loa) this.c.getValue();
            if (loaVar != null) {
                loaVar.f(j2, j5);
            }
            z5 = false;
        } else {
            long j6 = pb2VarJ.a;
            final ve2 ve2VarA = a();
            final long j7 = j5;
            final long j8 = pb2VarJ.a;
            final long jS = ((z7c) this.d.getValue()).a.s();
            ve2VarA.getClass();
            iu3 iu3Var = new iu3() { // from class: oe2
                @Override // defpackage.iu3
                public final void accept(Object obj) {
                    ve2 ve2Var = ve2VarA;
                    kz4 kz4Var = ve2Var.A;
                    Map mapC = ((af2) obj).c();
                    long j9 = jS;
                    Long l = (Long) mapC.get(Long.valueOf(j9));
                    if (l == null) {
                        return;
                    }
                    long jLongValue = l.longValue();
                    long j10 = j7;
                    boolean z6 = jLongValue != j10;
                    if (z6) {
                        mapC.put(Long.valueOf(j9), Long.valueOf(j10));
                    }
                    if (z6 && j9 == ve2Var.U() && kz4Var.get() != null) {
                        ((loa) kz4Var.get()).e(j8, j10);
                    }
                }
            };
            iu3 de2Var = new de2(2);
            if (z || z2) {
                int iA = z ? (int) ((qi9) this.e.getValue()).a(j6, j7) : 0;
                numValueOf = Integer.valueOf(iA);
                a().getClass();
                de2Var = new me2(iA);
            } else {
                numValueOf = null;
            }
            a().getClass();
            ke2 ke2Var = new ke2(z, i);
            wqi.c("abd", "update chat %d, setAsUnread = %b, count = %s", Long.valueOf(j6), Boolean.valueOf(z), numValueOf);
            ve2 ve2VarA2 = a();
            ve2VarA2.getClass();
            z5 = false;
            if (!ve2VarA2.r(j6, false, new g6(3, new iu3[]{iu3Var, de2Var, ke2Var})).j0()) {
                return 0L;
            }
        }
        hwa hwaVar = (hwa) this.f.getValue();
        long jC = hwaVar.l(j4) ? hwaVar.u().c(new lj2(hwaVar.t().a.k(), j2, j3, j4, z, z3, z4), z5, 0L, (12 & 8) != 0 ? 0 : 1) : 0L;
        Long lValueOf = Long.valueOf(j2);
        ConcurrentHashMap concurrentHashMap = this.i;
        py4 py4Var = (py4) concurrentHashMap.get(lValueOf);
        if (py4Var != null) {
            py4Var.dispose();
        }
        concurrentHashMap.remove(Long.valueOf(j2));
        concurrentHashMap.put(Long.valueOf(j2), ((j0e) this.g.getValue()).b(new re5(2, jC, j2, this)));
        return jC;
    }
}
