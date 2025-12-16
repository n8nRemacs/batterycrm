package defpackage;

import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class qu3 {
    public final k18 a;
    public final k18 b;

    public qu3(k18 k18Var, k18 k18Var2) {
        this.a = k18Var;
        this.b = k18Var2;
    }

    public final String a(ku3 ku3Var, a10 a10Var) {
        String str = a10Var.h;
        String str2 = a10Var.g;
        if (ku3Var != null) {
            return ku3Var.s(((w4e) ((pb3) this.b.getValue())).n(), il0.c);
        }
        if (a10Var.d.length() <= 0) {
            return null;
        }
        if (str2.length() <= 0 && str.length() <= 0) {
            return null;
        }
        if (str.length() == 0) {
            str = str2;
        }
        return tfi.h(str);
    }

    public final ku3 b(a10 a10Var) {
        long j = a10Var.b;
        if (j == 0) {
            return null;
        }
        qv3 qv3Var = ((l24) this.a.getValue()).a;
        ku3 ku3VarI = (ku3) qv3Var.a.get(Long.valueOf(j));
        if (ku3VarI == null) {
            ku3VarI = qv3Var.i(j, false);
        }
        if (ku3VarI == null || ku3VarI.B() || ku3VarI.m() != 0) {
            return null;
        }
        return ku3VarI;
    }

    public final CharSequence c(a10 a10Var) {
        String str = a10Var.d;
        ku3 ku3VarB = b(a10Var);
        if (ku3VarB != null && ((String) ku3VarB.o()).length() > 0) {
            return ku3VarB.o();
        }
        if (str.length() <= 0) {
            return r5b.b("Unknown", null);
        }
        Pattern pattern = r5b.a;
        return r5b.b(str, a10Var.e);
    }
}
