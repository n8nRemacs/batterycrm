package com.my.tracker.obfuscated;

import java.util.ArrayList;

/* renamed from: com.my.tracker.obfuscated.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C37827b extends l1 {
    public ArrayList<j1> a(long j12, boolean z12) {
        e2.a("TimeSpentCore: AnytimeTimeSpentsManager: " + a(z12) + "onTick: start collecting anytime TimeSpents");
        b(j12, z12);
        a(j12);
        ArrayList<j1> arrayListA = a();
        this.f365694b.clear();
        e2.a("TimeSpentCore: AnytimeTimeSpentsManager: " + a(z12) + "onTick: collected " + arrayListA.size() + " anytime TimeSpents");
        return arrayListA;
    }

    public void b(int i12, long j12, boolean z12) throws Exception {
        e1 e1Var = this.f365693a.get(i12);
        if (e1Var == null) {
            e2.c("TimeSpent: " + a(z12) + "can't stop anytime TimeSpent with id = " + i12 + " (reason: not found)");
            throw new Exception();
        }
        a(j12, e1Var, z12);
        this.f365693a.remove(i12);
        e2.c("TimeSpent: " + a(z12) + "stopped anytime TimeSpent, id = " + i12);
    }

    public void c(long j12) {
        e2.a("TimeSpentCore: AnytimeTimeSpentsManager: " + a(true) + "updating all running anytime TimeSpents timestamps (size = " + this.f365693a.size() + ", new timestamp = " + j12 + ")");
        a(j12);
    }

    public void d(long j12) {
        b(j12, true);
    }

    public void e(long j12) {
        b(j12, false);
    }

    public void a(int i12, long j12, boolean z12) {
        this.f365693a.put(i12, new f1(i12, j12));
        e2.c("TimeSpent: " + a(z12) + "registered new anytime TimeSpent with id = " + i12);
    }

    public void b(long j12) {
        e2.a("TimeSpentCore: AnytimeTimeSpentsManager: " + a(false) + "updating all running anytime TimeSpents timestamps (size = " + this.f365693a.size() + ", new timestamp = " + j12 + ")");
        a(j12);
    }

    public void a(long j12, e1 e1Var, boolean z12) {
        i1 i1VarA = a(e1Var.a());
        long jE2 = j12 - e1Var.e();
        if (e2.a()) {
            long jC2 = z12 ? i1VarA.c() : i1VarA.b();
            e2.a("TimeSpentCore: AnytimeTimeSpentsManager: " + a(z12) + "slicing anytime TimeSpent, id = " + e1Var.a() + ", " + jC2 + "(existed ms) + " + jE2 + "(add ms) = " + (jC2 + jE2) + "(total ms), timestamp = " + j12);
        }
        if (z12) {
            i1VarA.c(jE2);
        } else {
            i1VarA.a(jE2);
        }
    }

    public void b(long j12, boolean z12) {
        e2.a("TimeSpentCore: AnytimeTimeSpentsManager: " + a(z12) + "slicing all running anytime TimeSpents (size = " + this.f365693a.size() + ")");
        for (int i12 = 0; i12 < this.f365693a.size(); i12++) {
            a(j12, this.f365693a.valueAt(i12), z12);
        }
    }
}
