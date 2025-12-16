package defpackage;

import kotlin.NoWhenBranchMatchedException;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public abstract class qzi {
    public static b44 a(rb2 rb2Var) {
        switch (tb2.$EnumSwitchMapping$0[rb2Var.ordinal()]) {
            case 1:
                return new b44(i1b.x, new n5g(avd.n), Integer.valueOf(yud.c), Integer.valueOf(w9b.R), 4);
            case 2:
                return new b44(i1b.L, new n5g(avd.A), Integer.valueOf(yud.c), Integer.valueOf(w9b.R), 4);
            case 3:
                return new b44(i1b.w, new n5g(avd.x), Integer.valueOf(yud.A1), Integer.valueOf(w9b.R), 4);
            case 4:
                return new b44(i1b.K, new n5g(avd.y), Integer.valueOf(yud.y1), Integer.valueOf(w9b.R), 4);
            case 5:
                return new b44(i1b.H, new n5g(avd.w), Integer.valueOf(yud.j1), Integer.valueOf(w9b.R), 4);
            case 6:
                return new b44(i1b.G, new n5g(avd.v), Integer.valueOf(yud.j1), Integer.valueOf(w9b.R), 4);
            case 7:
                return new b44(i1b.J, new n5g(avd.z), Integer.valueOf(yud.s1), Integer.valueOf(w9b.R), 4);
            case 8:
                return new b44(i1b.P, new n5g(avd.H), Integer.valueOf(yud.t1), Integer.valueOf(w9b.R), 4);
            case 9:
                return new b44(i1b.F, new n5g(avd.t), Integer.valueOf(w9b.V), Integer.valueOf(yud.C), Integer.valueOf(w9b.Q));
            case 10:
                return new b44(i1b.F, new n5g(avd.I), Integer.valueOf(w9b.V), Integer.valueOf(yud.C), Integer.valueOf(w9b.Q));
            case 11:
                return new b44(i1b.F, new n5g(avd.u), Integer.valueOf(w9b.V), Integer.valueOf(yud.C), Integer.valueOf(w9b.Q));
            case Protos.Attaches.Attach.PRESENT /* 12 */:
            case 13:
                return new b44(i1b.E, new n5g(avd.s), Integer.valueOf(w9b.V), Integer.valueOf(yud.x), Integer.valueOf(w9b.Q));
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new b44(i1b.D, new n5g(avd.r), Integer.valueOf(w9b.V), Integer.valueOf(yud.x), Integer.valueOf(w9b.Q));
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new b44(i1b.y, new n5g(avd.o), Integer.valueOf(w9b.V), Integer.valueOf(yud.T), Integer.valueOf(w9b.Q));
            case 16:
                return new b44(i1b.M, new n5g(avd.C), Integer.valueOf(yud.m), Integer.valueOf(w9b.R), 4);
            case LangUtils.HASH_SEED /* 17 */:
                return new b44(zud.a, new n5g(avd.B), Integer.valueOf(yud.J0), Integer.valueOf(w9b.R), 4);
            case 18:
                return new b44(i1b.z, new n5g(avd.p), Integer.valueOf(yud.n0), Integer.valueOf(w9b.R), 4);
            case 19:
                return new b44(i1b.O, new n5g(avd.G), Integer.valueOf(w9b.V), Integer.valueOf(yud.m1), Integer.valueOf(w9b.Q));
            case 20:
                return new b44(i1b.N, new n5g(avd.F), Integer.valueOf(w9b.V), Integer.valueOf(yud.x), Integer.valueOf(w9b.Q));
            case 21:
                return new b44(i1b.A, new n5g(avd.q), Integer.valueOf(w9b.V), Integer.valueOf(yud.x), Integer.valueOf(w9b.Q));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final boolean b(y08 y08Var) {
        return y08Var == null || vmf.F(y08Var.a);
    }
}
