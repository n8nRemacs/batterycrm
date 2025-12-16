package defpackage;

import java.util.List;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final class lm3 implements jee {
    public final zjd a;
    public long b;

    public lm3(List list, List list2) {
        tg7 tg7VarI = wg7.i();
        hsi.b(list.size() == list2.size());
        for (int i = 0; i < list.size(); i++) {
            tg7VarI.a(new km3((jee) list.get(i), (List) list2.get(i)));
        }
        this.a = tg7VarI.i();
        this.b = -9223372036854775807L;
    }

    @Override // defpackage.jee
    public final long d() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            zjd zjdVar = this.a;
            if (i >= zjdVar.d) {
                break;
            }
            long jD = ((km3) zjdVar.get(i)).a.d();
            if (jD != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jD);
            }
            i++;
        }
        if (jMin == BuildConfig.MAX_TIME_TO_UPLOAD) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // defpackage.jee
    public final boolean j() {
        int i = 0;
        while (true) {
            zjd zjdVar = this.a;
            if (i >= zjdVar.d) {
                return false;
            }
            if (((km3) zjdVar.get(i)).a.j()) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.jee
    public final long o() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            zjd zjdVar = this.a;
            if (i >= zjdVar.d) {
                break;
            }
            km3 km3Var = (km3) zjdVar.get(i);
            long jO = km3Var.a.o();
            wg7 wg7Var = km3Var.b;
            if ((wg7Var.contains(1) || wg7Var.contains(2) || wg7Var.contains(4)) && jO != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jO);
            }
            if (jO != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jO);
            }
            i++;
        }
        if (jMin != BuildConfig.MAX_TIME_TO_UPLOAD) {
            this.b = jMin;
            return jMin;
        }
        if (jMin2 == BuildConfig.MAX_TIME_TO_UPLOAD) {
            return Long.MIN_VALUE;
        }
        long j = this.b;
        return j != -9223372036854775807L ? j : jMin2;
    }

    @Override // defpackage.jee
    public final void p(long j) {
        int i = 0;
        while (true) {
            zjd zjdVar = this.a;
            if (i >= zjdVar.d) {
                return;
            }
            ((km3) zjdVar.get(i)).p(j);
            i++;
        }
    }

    @Override // defpackage.jee
    public final boolean r(oc8 oc8Var) {
        boolean zR;
        boolean z = false;
        do {
            long jD = d();
            if (jD == Long.MIN_VALUE) {
                return z;
            }
            int i = 0;
            zR = false;
            while (true) {
                zjd zjdVar = this.a;
                if (i >= zjdVar.d) {
                    break;
                }
                long jD2 = ((km3) zjdVar.get(i)).a.d();
                boolean z2 = jD2 != Long.MIN_VALUE && jD2 <= oc8Var.a;
                if (jD2 == jD || z2) {
                    zR |= ((km3) zjdVar.get(i)).a.r(oc8Var);
                }
                i++;
            }
            z |= zR;
        } while (zR);
        return z;
    }
}
