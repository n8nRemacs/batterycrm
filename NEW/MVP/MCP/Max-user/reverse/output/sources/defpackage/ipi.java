package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class ipi {
    public static long a(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public static k18 b(int i, cm6 cm6Var) {
        qha qhaVar = qha.G0;
        int i2 = o18.$EnumSwitchMapping$0[az1.v(i)];
        if (i2 == 1) {
            return new bwf(cm6Var);
        }
        if (i2 == 2) {
            xwd xwdVar = new xwd();
            xwdVar.a = cm6Var;
            xwdVar.b = qhaVar;
            return xwdVar;
        }
        if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        dsg dsgVar = new dsg();
        dsgVar.a = cm6Var;
        dsgVar.b = qhaVar;
        return dsgVar;
    }

    public static bwf c(cm6 cm6Var) {
        return new bwf(cm6Var);
    }
}
