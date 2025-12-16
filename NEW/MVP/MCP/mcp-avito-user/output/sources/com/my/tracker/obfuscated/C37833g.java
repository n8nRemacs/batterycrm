package com.my.tracker.obfuscated;

/* renamed from: com.my.tracker.obfuscated.g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37833g {

    /* renamed from: a, reason: collision with root package name */
    final e1 f365631a = new f1(0, -2147483648L);

    /* renamed from: b, reason: collision with root package name */
    final i1 f365632b = new k1(0);

    /* renamed from: c, reason: collision with root package name */
    int f365633c = 0;

    public j1 a(long j12) {
        e2.a("TimeSpentCore: AppTimeManager: " + a() + "onTick: start collecting app TimeSpent");
        if (this.f365633c != 0) {
            f(j12);
            this.f365631a.b(j12);
        }
        i1 i1VarClone = this.f365632b.clone();
        this.f365632b.h();
        e2.a("TimeSpentCore: AppTimeManager: " + a() + "onTick: collected app TimeSpent (foregroundMs = " + i1VarClone.c() + ", usefulBackgroundMs = " + i1VarClone.b() + ")");
        if (i1VarClone.c() == 0 && i1VarClone.b() == 0) {
            return null;
        }
        return i1VarClone;
    }

    public void b(long j12) {
        if (this.f365633c == 1) {
            this.f365631a.b(j12);
        }
    }

    public void c(long j12) {
        this.f365631a.b(j12);
    }

    public void d() {
        e2.a("TimeSpentCore: AppTimeManager: " + a(a(), "[FOREGROUND]"));
        this.f365633c = 3;
    }

    public void e(long j12) {
        if (this.f365633c == 1) {
            f(j12);
        }
    }

    public void f(long j12) {
        long jE2 = j12 - this.f365631a.e();
        if (e2.a()) {
            long jC2 = this.f365633c == 3 ? this.f365632b.c() : this.f365632b.b();
            e2.a("TimeSpentCore: AppTimeManager: " + a() + "slicing app TimeSpent, " + jC2 + "(existed ms) + " + jE2 + "(add ms) = " + (jC2 + jE2) + "(total ms), timestamp = " + j12);
        }
        int i12 = this.f365633c;
        if (i12 == 1) {
            this.f365632b.a(jE2);
        } else if (i12 != 3) {
            e2.a("TimeSpentCore: AppTimeManager: trying to slice app time, but now is useless background state - skip");
        } else {
            this.f365632b.c(jE2);
        }
    }

    public void g(long j12) {
        f(j12);
        e2.a("TimeSpentCore: AppTimeManager: " + a(a(), "[BACKGROUND(useless)]"));
        this.f365633c = 0;
    }

    public void h(long j12) {
        this.f365631a.b(j12);
        e2.a("TimeSpentCore: AppTimeManager: " + a(a(), "[BACKGROUND(useful)]"));
        this.f365633c = 1;
    }

    public String a() {
        int i12 = this.f365633c;
        return i12 != 0 ? i12 != 1 ? i12 != 3 ? "" : "[FOREGROUND] " : "[BACKGROUND(useful)] " : "[BACKGROUND(useless)] ";
    }

    public boolean b() {
        int i12 = this.f365633c;
        return i12 == 1 || i12 == 0;
    }

    public boolean c() {
        return this.f365633c == 3;
    }

    public void d(long j12) {
        f(j12);
    }

    public String a(String str, String str2) {
        return androidx.compose.ui.graphics.colorspace.e.n("app state changed ", str, "-> ", str2);
    }

    public void a(int i12) {
        int i13;
        if (i12 == 0) {
            e2.a("TimeSpentCore: AppTimeManager: " + a(a(), "[BACKGROUND(useless)]"));
            i13 = 0;
        } else {
            e2.a("TimeSpentCore: AppTimeManager: " + a(a(), "[BACKGROUND(useful)]"));
            i13 = 1;
        }
        this.f365633c = i13;
    }
}
