package com.my.tracker.obfuscated;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes7.dex */
public final class n1 {

    /* renamed from: a, reason: collision with root package name */
    final InterfaceC37839m<w1> f365699a;

    /* renamed from: b, reason: collision with root package name */
    final d2 f365700b;

    /* renamed from: c, reason: collision with root package name */
    final a f365701c = b();

    /* renamed from: d, reason: collision with root package name */
    final C37851z f365702d = new C37851z();

    /* renamed from: e, reason: collision with root package name */
    final C37827b f365703e = new C37827b();

    /* renamed from: f, reason: collision with root package name */
    final r f365704f = new r();

    /* renamed from: g, reason: collision with root package name */
    final C37833g f365705g = new C37833g();

    /* renamed from: h, reason: collision with root package name */
    String f365706h;

    public final class a {

        /* renamed from: a, reason: collision with root package name */
        final int[] f365707a = {0};

        /* renamed from: b, reason: collision with root package name */
        final int[] f365708b = {0};

        public a() {
        }

        private boolean d(int i12) {
            for (int i13 : this.f365708b) {
                if (i12 == i13) {
                    e2.c("TimeSpentCore: you can't create timespent with id = " + i12 + " (reason: reserved for internal use)");
                    return true;
                }
            }
            return false;
        }

        private boolean e(int i12) {
            for (int i13 : this.f365707a) {
                if (i12 == i13) {
                    e2.c("TimeSpentCore: you can't create timespent with id = " + i12 + " (reason: reserved for internal use)");
                    return true;
                }
            }
            return false;
        }

        public boolean a(int i12) {
            StringBuilder sb2;
            String str;
            if (e(i12)) {
                return false;
            }
            if (n1.this.f365703e.b(i12)) {
                sb2 = new StringBuilder("TimeSpent: you can't create timespent with id = ");
                sb2.append(i12);
                str = " (reason: already have same type timespent with this id)";
            } else {
                if (!n1.this.f365702d.b(i12) && !n1.this.f365704f.a(i12)) {
                    return true;
                }
                sb2 = new StringBuilder("TimeSpent: you can't create timespent with id = ");
                sb2.append(i12);
                str = " (reason: already have another type timespent with this id)";
            }
            sb2.append(str);
            e2.c(sb2.toString());
            return false;
        }

        public boolean b(int i12) {
            StringBuilder sb2;
            String str;
            if (e(i12)) {
                return false;
            }
            if (n1.this.f365702d.b(i12)) {
                sb2 = new StringBuilder("TimeSpent: you can't create timespent with id = ");
                sb2.append(i12);
                str = " (reason: already have same type timespent with this id)";
            } else {
                if (!n1.this.f365703e.b(i12) && !n1.this.f365704f.a(i12)) {
                    return true;
                }
                sb2 = new StringBuilder("TimeSpent: you can't create timespent with id = ");
                sb2.append(i12);
                str = " (reason: already have another type timespent with this id)";
            }
            sb2.append(str);
            e2.c(sb2.toString());
            return false;
        }

        public boolean c(int i12) {
            if (d(i12)) {
                return false;
            }
            if (!n1.this.f365702d.b(i12) && !n1.this.f365703e.b(i12)) {
                return true;
            }
            e2.c("TimeSpent: you can't create timespent with id = " + i12 + " (reason: already have another type timespent with this id)");
            return false;
        }
    }

    public n1(long j12, InterfaceC37839m<w1> interfaceC37839m) {
        this.f365699a = interfaceC37839m;
        this.f365700b = d2.a(j12, new N(this, 0));
        e2.a("TimeSpentCore: created");
    }

    public synchronized w1 a(long j12, long j13, String str) {
        w1 w1Var;
        e2.a("TimeSpentCore: start collecting DTO data, tickTimestamp = " + j13 + ", customUserId = " + str);
        boolean zC2 = this.f365705g.c();
        ArrayList<InterfaceC37842p> arrayListA = this.f365704f.a();
        ArrayList<j1> arrayListA2 = this.f365703e.a(j12, zC2);
        ArrayList<j1> arrayListA3 = this.f365702d.a(j12, zC2);
        j1 j1VarA = this.f365705g.a(j12);
        ArrayList arrayList = new ArrayList(arrayListA2.size() + arrayListA3.size());
        arrayList.addAll(arrayListA2);
        arrayList.addAll(arrayListA3);
        w1Var = new w1(j13, j1VarA, str, (j1[]) arrayList.toArray(new j1[0]), (InterfaceC37842p[]) arrayListA.toArray(new InterfaceC37842p[0]));
        if (e2.a()) {
            e2.a("TimeSpentCore: collected DTO data:\n" + w1Var);
        }
        return w1Var;
    }

    public a b() {
        return new a();
    }

    public synchronized void c() {
        e2.a("TimeSpentCore: ***** start generating zero tick *****");
        long jUptimeMillis = SystemClock.uptimeMillis();
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f365704f.b(0);
        b(jUptimeMillis, jCurrentTimeMillis);
        e2.a("TimeSpentCore: ***** zero tick generated *****");
    }

    public void d() {
        C37835i.c(new O(this, SystemClock.uptimeMillis(), 0));
    }

    public void e() {
        C37835i.c(new O(this, SystemClock.uptimeMillis(), 1));
    }

    public void f() {
        final long jUptimeMillis = SystemClock.uptimeMillis();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        C37835i.c(new Runnable() { // from class: com.my.tracker.obfuscated.P
            @Override // java.lang.Runnable
            public final void run() {
                this.f365307b.b(jUptimeMillis, jCurrentTimeMillis);
            }
        });
    }

    public void a() {
        C37835i.c(new N(this, 1));
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public synchronized void c(int i12) {
        if (this.f365701c.c(i12)) {
            this.f365704f.b(i12);
            if (this.f365700b.b()) {
                e2.a("TimeSpentCore: starting ticker... (reason: incremented count based TimeSpent)");
                this.f365700b.e();
            }
        }
    }

    public void a(int i12) {
        C37835i.c(new androidx.camera.video.internal.audio.q(i12, 19, this));
    }

    public void b(int i12, boolean z12) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        C37835i.c(z12 ? new M(this, jUptimeMillis, i12, 2) : new M(this, jUptimeMillis, i12, 3));
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public synchronized void h(long j12, int i12) {
        try {
            this.f365702d.b(i12, j12, this.f365705g.c());
        } catch (Exception unused) {
        }
    }

    public void a(int i12, boolean z12) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        C37835i.c(z12 ? new M(this, jUptimeMillis, i12, 0) : new M(this, jUptimeMillis, i12, 1));
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public synchronized void d(long j12) {
        e2.a("TimeSpentCore: ***** app is going to foreground *****");
        if (this.f365705g.c()) {
            e2.a("TimeSpentCore: something went wrong, already in FOREGROUND state. Skip");
            return;
        }
        this.f365702d.e(j12);
        this.f365703e.e(j12);
        this.f365705g.e(j12);
        this.f365705g.d();
        this.f365702d.c(j12);
        this.f365703e.c(j12);
        this.f365705g.c(j12);
        if (this.f365700b.b()) {
            e2.a("TimeSpentCore: starting ticker... (reason: app going to foreground)");
            this.f365700b.e();
        }
        e2.a("TimeSpentCore: ***** app is on foreground *****");
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public synchronized void g(long j12, int i12) {
        try {
            this.f365703e.b(i12, j12, this.f365705g.c());
            if (this.f365705g.b() && this.f365703e.b() == 0) {
                this.f365705g.g(j12);
                e2.a("TimeSpentCore: there was last anytime TimeSpent during background state, stop tracking app useful background");
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public synchronized void c(long j12) {
        e2.a("TimeSpentCore: ***** app is going to background *****");
        if (this.f365705g.b()) {
            e2.a("TimeSpentCore: something went wrong, already in BACKGROUND state. Skip");
            return;
        }
        this.f365702d.d(j12);
        this.f365703e.d(j12);
        this.f365705g.d(j12);
        this.f365705g.a(this.f365703e.b());
        this.f365702d.b(j12);
        this.f365703e.b(j12);
        this.f365705g.b(j12);
        e2.a("TimeSpentCore: ***** app is on background *****");
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public synchronized void f(long j12, int i12) {
        if (this.f365701c.b(i12)) {
            this.f365702d.a(i12, j12, this.f365705g.c());
        }
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public synchronized void e(long j12, int i12) {
        if (this.f365701c.a(i12)) {
            this.f365703e.a(i12, j12, this.f365705g.c());
            if (this.f365705g.b() && this.f365703e.b() == 1) {
                this.f365705g.h(j12);
                e2.a("TimeSpentCore: this is first anytime TimeSpent during background state, start tracking app useful background");
                this.f365700b.e();
                e2.a("TimeSpentCore: starting ticker... (reason: first anytime timeSpent during background state)");
            }
        }
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public synchronized void b(long j12, long j13) {
        try {
            e2.a("TimeSpentCore: ***** onTick started ***** timestamp = " + j13);
            if (this.f365705g.b() && this.f365703e.b() == 0 && this.f365700b.a()) {
                e2.a("TimeSpentCore: onTick: stopping ticker... (reason: no useful background)");
                this.f365700b.f();
            }
            w1 w1VarA = a(j12, j13, this.f365706h);
            e2.a("TimeSpentCore: ***** onTick finished *****");
            this.f365699a.a(w1VarA);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public synchronized void c(long j12, long j13, String str) {
        if (Objects.equals(this.f365706h, str)) {
            e2.a("customUserIdChanged called, but custom user id didn't change, skip");
            return;
        }
        e2.a("TimeSpentCore: before change customUserId: " + this.f365706h + " -> " + str + ", force call onTick for collect data");
        this.f365700b.d();
        b(j12, j13);
        e2.a("TimeSpentCore: customUserId changed: " + this.f365706h + " -> " + str);
        this.f365706h = str;
    }

    public void a(String str) {
        this.f365706h = str;
        e2.a("TimeSpentCore: initialized");
    }

    public void b(String str) {
        C37835i.c(new androidx.media3.exoplayer.audio.e(this, SystemClock.uptimeMillis(), System.currentTimeMillis(), str));
    }
}
