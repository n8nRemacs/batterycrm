package defpackage;

import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class ddd {
    public final q9b a;
    public final pb3 b;

    public ddd(q9b q9bVar, pb3 pb3Var) {
        this.a = q9bVar;
        this.b = pb3Var;
    }

    public static yr8 d(ocd ocdVar, scd scdVar) {
        long j = scdVar.b;
        hdd hddVar = scdVar.a;
        int i = hddVar.a;
        if (j > 0) {
            ocdVar.getClass();
            dsd dsdVarC = dsd.c(2, "SELECT * FROM recent WHERE recent_type=? AND server_id=?");
            dsdVarC.k(1, i);
            dsdVarC.k(2, j);
            return new yr8(new ncd(ocdVar, dsdVarC, 3));
        }
        int iOrdinal = hddVar.ordinal();
        if (iOrdinal == 1) {
            String str = ((wb5) scdVar).c;
            ocdVar.getClass();
            dsd dsdVarC2 = dsd.c(2, "SELECT * FROM recent WHERE recent_type=? AND emoji=?");
            dsdVarC2.k(1, i);
            if (str == null) {
                dsdVarC2.S(2);
            } else {
                dsdVarC2.f(2, str);
            }
            return new yr8(new ncd(ocdVar, dsdVarC2, 1));
        }
        if (iOrdinal == 2) {
            long j2 = ((pff) scdVar).c;
            ocdVar.getClass();
            dsd dsdVarC3 = dsd.c(2, "SELECT * FROM recent WHERE recent_type=? AND sticker_id=?");
            dsdVarC3.k(1, i);
            dsdVarC3.k(2, j2);
            return new yr8(new ncd(ocdVar, dsdVarC3, 0));
        }
        if (iOrdinal != 3) {
            Locale locale = Locale.ENGLISH;
            throw new IllegalStateException("Unexpected value: " + hddVar);
        }
        long j3 = ((gu6) scdVar).c.Z;
        ocdVar.getClass();
        dsd dsdVarC4 = dsd.c(2, "SELECT * FROM recent WHERE recent_type=? AND gif_id=?");
        dsdVarC4.k(1, i);
        dsdVarC4.k(2, j3);
        return new yr8(new ncd(ocdVar, dsdVarC4, 2));
    }

    public final vqa a(List list) {
        return new vr8(b(), new oh2(18, list), 3).h(new oh2(19, list), Integer.MAX_VALUE);
    }

    public final m2f b() {
        return this.a.w().h(new ycd(0));
    }

    public final ik3 c(List list) {
        return new ik3(this.a.w(), 2, new z9a(this, 13, list));
    }
}
