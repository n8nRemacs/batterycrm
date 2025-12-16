package com.yandex.mobile.ads.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;

/* loaded from: classes8.dex */
final class ph {

    /* renamed from: a, reason: collision with root package name */
    public final int f388832a;

    /* renamed from: b, reason: collision with root package name */
    public final String f388833b;

    /* renamed from: c, reason: collision with root package name */
    private final TreeSet<x31> f388834c = new TreeSet<>();

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList<a> f388835d = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    private oo f388836e;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f388837a;

        /* renamed from: b, reason: collision with root package name */
        public final long f388838b;

        public a(long j12, long j13) {
            this.f388837a = j12;
            this.f388838b = j13;
        }
    }

    public ph(int i12, String str, oo ooVar) {
        this.f388832a = i12;
        this.f388833b = str;
        this.f388836e = ooVar;
    }

    public final oo a() {
        return this.f388836e;
    }

    public final TreeSet<x31> b() {
        return this.f388834c;
    }

    public final boolean c(long j12, long j13) {
        for (int i12 = 0; i12 < this.f388835d.size(); i12++) {
            a aVar = this.f388835d.get(i12);
            long j14 = aVar.f388838b;
            if (j14 == -1) {
                if (j12 >= aVar.f388837a) {
                    return true;
                }
            } else if (j13 == -1) {
                continue;
            } else {
                long j15 = aVar.f388837a;
                if (j15 <= j12 && j12 + j13 <= j15 + j14) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean d() {
        return this.f388835d.isEmpty();
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ph.class != obj.getClass()) {
            return false;
        }
        ph phVar = (ph) obj;
        return this.f388832a == phVar.f388832a && this.f388833b.equals(phVar.f388833b) && this.f388834c.equals(phVar.f388834c) && this.f388836e.equals(phVar.f388836e);
    }

    public final int hashCode() {
        return this.f388836e.hashCode() + v2.a(this.f388833b, this.f388832a * 31, 31);
    }

    public final boolean a(tl tlVar) {
        this.f388836e = this.f388836e.a(tlVar);
        return !r2.equals(r0);
    }

    public final x31 b(long j12, long j13) {
        x31 x31VarA = x31.a(this.f388833b, j12);
        x31 x31VarFloor = this.f388834c.floor(x31VarA);
        if (x31VarFloor != null && x31VarFloor.f387479b + x31VarFloor.f387480c > j12) {
            return x31VarFloor;
        }
        x31 x31VarCeiling = this.f388834c.ceiling(x31VarA);
        if (x31VarCeiling != null) {
            long j14 = x31VarCeiling.f387479b - j12;
            j13 = j13 == -1 ? j14 : Math.min(j14, j13);
        }
        return x31.a(this.f388833b, j12, j13);
    }

    public final boolean d(long j12, long j13) {
        for (int i12 = 0; i12 < this.f388835d.size(); i12++) {
            a aVar = this.f388835d.get(i12);
            long j14 = aVar.f388837a;
            if (j14 <= j12) {
                long j15 = aVar.f388838b;
                if (j15 == -1 || j14 + j15 > j12) {
                    return false;
                }
            } else {
                if (j13 == -1 || j12 + j13 > j14) {
                    return false;
                }
            }
        }
        this.f388835d.add(new a(j12, j13));
        return true;
    }

    public final void a(long j12) {
        for (int i12 = 0; i12 < this.f388835d.size(); i12++) {
            if (this.f388835d.get(i12).f388837a == j12) {
                this.f388835d.remove(i12);
                return;
            }
        }
        throw new IllegalStateException();
    }

    public final boolean c() {
        return this.f388834c.isEmpty();
    }

    public final void a(x31 x31Var) {
        this.f388834c.add(x31Var);
    }

    public final long a(long j12, long j13) {
        db.a(j12 >= 0);
        db.a(j13 >= 0);
        x31 x31VarB = b(j12, j13);
        if (!x31VarB.f387481d) {
            long j14 = x31VarB.f387480c;
            return -Math.min(j14 != -1 ? j14 : Long.MAX_VALUE, j13);
        }
        long j15 = j12 + j13;
        long j16 = j15 >= 0 ? j15 : Long.MAX_VALUE;
        long jMax = x31VarB.f387479b + x31VarB.f387480c;
        if (jMax < j16) {
            for (x31 x31Var : this.f388834c.tailSet(x31VarB, false)) {
                long j17 = x31Var.f387479b;
                if (j17 > jMax) {
                    break;
                }
                jMax = Math.max(jMax, j17 + x31Var.f387480c);
                if (jMax >= j16) {
                    break;
                }
            }
        }
        return Math.min(jMax - j12, j13);
    }

    public final x31 a(x31 x31Var, long j12, boolean z12) {
        db.b(this.f388834c.remove(x31Var));
        File file = x31Var.f387482e;
        file.getClass();
        if (z12) {
            File parentFile = file.getParentFile();
            parentFile.getClass();
            long j13 = x31Var.f387479b;
            int i12 = this.f388832a;
            int i13 = x31.f391545j;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i12);
            sb2.append(".");
            sb2.append(j13);
            sb2.append(".");
            File file2 = new File(parentFile, AK.c.j(j12, ".v3.exo", sb2));
            if (file.renameTo(file2)) {
                file = file2;
            } else {
                ka0.d("CachedContent", "Failed to rename " + file + " to " + file2);
            }
        }
        x31 x31VarA = x31Var.a(file, j12);
        this.f388834c.add(x31VarA);
        return x31VarA;
    }

    public final boolean a(lh lhVar) {
        if (!this.f388834c.remove(lhVar)) {
            return false;
        }
        File file = lhVar.f387482e;
        if (file == null) {
            return true;
        }
        file.delete();
        return true;
    }
}
