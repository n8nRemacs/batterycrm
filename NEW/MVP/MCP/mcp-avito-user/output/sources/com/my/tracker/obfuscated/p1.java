package com.my.tracker.obfuscated;

import android.content.Context;

/* loaded from: classes7.dex */
public final class p1 implements b2, a2 {

    /* renamed from: d, reason: collision with root package name */
    private static volatile p1 f365730d;

    /* renamed from: a, reason: collision with root package name */
    final n1 f365731a = new n1(m1.f365695y, new G(this));

    /* renamed from: b, reason: collision with root package name */
    u1 f365732b;

    /* renamed from: c, reason: collision with root package name */
    q1 f365733c;

    private p1() {
    }

    public static p1 c() {
        p1 p1Var = f365730d;
        if (p1Var == null) {
            synchronized (p1.class) {
                try {
                    p1Var = f365730d;
                    if (p1Var == null) {
                        p1Var = new p1();
                        f365730d = p1Var;
                    }
                } finally {
                }
            }
        }
        return p1Var;
    }

    public static a2 d() {
        return c();
    }

    public static b2 e() {
        return c();
    }

    @Override // com.my.tracker.obfuscated.a2
    public synchronized void b() {
        e2.a("TimeSpentModule: onAppGoingForeground");
        if (this.f365732b == null) {
            e2.a("TimeSpentModule: An error occurred during initialization, TimeSpent functionality is not available");
        } else {
            this.f365731a.e();
        }
    }

    @Override // com.my.tracker.obfuscated.a2
    public synchronized void a() {
        e2.a("TimeSpentModule: onAppGoingBackground");
        if (this.f365732b == null) {
            e2.a("TimeSpentModule: An error occurred during initialization, TimeSpent functionality is not available");
        } else {
            this.f365731a.d();
        }
    }

    @Override // com.my.tracker.obfuscated.b2
    public synchronized void b(int i12, boolean z12) {
        e2.a("TimeSpentModule: stopTimeSpent id = " + i12 + ", canUseInBackground = " + z12);
        if (this.f365732b != null) {
            this.f365731a.b(i12, z12);
            return;
        }
        e2.c("TimeSpent: An error occurred during initialization, TimeSpent functionality is not available (called stopTimeSpent id = " + i12 + ")");
    }

    @Override // com.my.tracker.obfuscated.b2
    public synchronized void a(int i12) {
        e2.a("TimeSpentModule: incrementEventTimeSpent id = " + i12);
        if (this.f365732b != null) {
            this.f365731a.a(i12);
            return;
        }
        e2.c("TimeSpent: An error occurred during initialization, TimeSpent functionality is not available (called incrementEventTimeSpent id = " + i12 + ")");
    }

    public void b(w1 w1Var) {
        e2.a("TimeSpentModule: core tick DTO collected, sending to repository...");
        if (this.f365732b == null) {
            e2.b("TimeSpentModule: repository was not created, can't store and send this packet, drop");
        } else {
            C37835i.d(new H(9, this, w1Var));
        }
    }

    @Override // com.my.tracker.obfuscated.b2
    public synchronized void a(int i12, boolean z12) {
        e2.a("TimeSpentModule: startTimeSpent id = " + i12 + ", canUseInBackground = " + z12);
        if (this.f365732b != null) {
            this.f365731a.a(i12, z12);
            return;
        }
        e2.c("TimeSpent: An error occurred during initialization, TimeSpent functionality is not available (called startTimeSpent id = " + i12 + ")");
    }

    @Override // com.my.tracker.obfuscated.a2
    public void a(f2 f2Var, Context context) {
        v1 v1VarA = v1.a(700, f2Var, context);
        this.f365732b = v1VarA;
        if (v1VarA == null) {
            e2.b("TimeSpentModule: something went wrong in repository init, time spent feature will not work");
            e2.c("TimeSpent: An error occurred during initialization, TimeSpent functionality is not available");
            return;
        }
        v1VarA.a();
        String customUserId = f2Var.j().getCustomUserId();
        this.f365733c = q1.a(10, f2Var, this.f365732b);
        this.f365731a.a(customUserId);
        this.f365731a.a();
        e2.a("TimeSpentModule: TimeSpentModule initialized");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(w1 w1Var) {
        if (!x1.a(w1Var)) {
            e2.a("TimeSpentModule: collected dto data is empty, no need to send");
            return;
        }
        if (!x1.c(w1Var)) {
            e2.a("TimeSpentModule: collected dto data is corrupted, sending anyway");
        }
        try {
            this.f365732b.a(w1Var);
            e2.a("TimeSpentModule: successfully stored new time spent tick in repository, notifying sender...");
            this.f365733c.c();
        } catch (Exception unused) {
            e2.b("TimeSpentModule: something went wrong while storing new timeSpentTick in repository, this tick didn't stored and wouldn't be sent");
        }
    }

    @Override // com.my.tracker.obfuscated.a2
    public synchronized void a(String str) {
        e2.a("TimeSpentModule: onCustomUserIdChanged, newCustomUserId = " + str);
        if (this.f365732b == null) {
            e2.a("TimeSpentModule: An error occurred during initialization, TimeSpent functionality is not available");
        } else {
            this.f365731a.b(str);
        }
    }
}
