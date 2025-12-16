package com.my.tracker.obfuscated;

import java.util.ArrayList;

/* renamed from: com.my.tracker.obfuscated.z, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C37851z extends l1 {
    public ArrayList<j1> a(long j12, boolean z12) {
        e2.a("TimeSpentCore: ForegroundTimeSpentsManager: " + a(z12) + "onTick: start collecting foreground TimeSpents");
        if (z12) {
            f(j12);
            a(j12);
        }
        ArrayList<j1> arrayListA = a();
        this.f365694b.clear();
        e2.a("TimeSpentCore: ForegroundTimeSpentsManager: " + a(z12) + "onTick: collected " + arrayListA.size() + " foreground TimeSpents");
        return arrayListA;
    }

    public void b(int i12, long j12, boolean z12) throws Exception {
        e1 e1Var = this.f365693a.get(i12);
        if (e1Var == null) {
            e2.c("TimeSpent: " + a(z12) + " can't stop foreground TimeSpent with id = " + i12 + " (reason: not found)");
            throw new Exception();
        }
        if (z12) {
            a(j12, e1Var);
        }
        this.f365693a.remove(i12);
        e2.c("TimeSpent: " + a(z12) + "stopped foreground TimeSpent, id = " + i12);
    }

    public void c(long j12) {
        e2.a("TimeSpentCore: ForegroundTimeSpentsManager: " + a(true) + "updating all running foreground TimeSpents timestamps (size = " + this.f365693a.size() + ", new timestamp = " + j12 + ")");
        a(j12);
    }

    public void d(long j12) {
        f(j12);
    }

    public void f(long j12) {
        e2.a("TimeSpentCore: ForegroundTimeSpentsManager: " + a(true) + "slicing all running foreground TimeSpents (size = " + this.f365693a.size() + ")");
        for (int i12 = 0; i12 < this.f365693a.size(); i12++) {
            a(j12, this.f365693a.valueAt(i12));
        }
    }

    public void a(int i12, long j12, boolean z12) {
        if (!z12) {
            j12 = -2147483648L;
        }
        this.f365693a.put(i12, new f1(i12, j12));
        e2.c("TimeSpent: " + a(z12) + "registered new foreground TimeSpent with id = " + i12);
    }

    public void b(long j12) {
    }

    public void a(long j12, e1 e1Var) {
        i1 i1VarA = a(e1Var.a());
        long jE2 = j12 - e1Var.e();
        if (e2.a()) {
            long jC2 = i1VarA.c();
            e2.a("TimeSpentCore: ForegroundTimeSpentsManager: " + a(true) + "slicing foreground TimeSpent, id = " + e1Var.a() + ", " + jC2 + "(existed ms) + " + jE2 + "(add ms) = " + (jC2 + jE2) + "(total ms), timestamp = " + j12);
        }
        i1VarA.c(jE2);
    }

    public void e(long j12) {
    }
}
