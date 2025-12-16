package com.my.tracker.obfuscated;

/* loaded from: classes7.dex */
public class x1 {
    private static boolean a(long j12) {
        if (j12 > 0) {
            return true;
        }
        e2.a("TimeSpentTickDtoValidator: dto timestamp should be > 0, actual = " + j12);
        return false;
    }

    private static boolean b(w1 w1Var) {
        j1 j1VarA = w1Var.a();
        if (j1VarA == null) {
            return true;
        }
        return !(((j1VarA.b() > 0L ? 1 : (j1VarA.b() == 0L ? 0 : -1)) > 0) && (w1Var.e() == null || w1Var.e().length == 0)) && j1VarA.a() == 0;
    }

    public static boolean c(w1 w1Var) {
        if (a(w1Var.d())) {
            return b(w1Var);
        }
        return false;
    }

    public static boolean a(w1 w1Var) {
        j1 j1VarA = w1Var.a();
        if (j1VarA != null && j1VarA.c() > 0) {
            return true;
        }
        j1[] j1VarArrE = w1Var.e();
        if (j1VarArrE != null && j1VarArrE.length > 0) {
            return true;
        }
        InterfaceC37842p[] interfaceC37842pArrB = w1Var.b();
        return interfaceC37842pArrB != null && interfaceC37842pArrB.length > 0;
    }
}
