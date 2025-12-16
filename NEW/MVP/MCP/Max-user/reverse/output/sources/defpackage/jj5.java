package defpackage;

/* loaded from: classes2.dex */
public final class jj5 {
    public final String a;
    public final int b;
    public final int c;
    public final long d;
    public final boolean e;
    public final boolean f;
    public final int g;
    public final boolean h;
    public final boolean i;

    public jj5(String str, int i, int i2, long j, boolean z, boolean z2, int i3, boolean z3, boolean z4) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = z;
        this.f = z2;
        this.g = i3;
        this.h = z3;
        this.i = z4;
    }

    public static jj5 a(jj5 jj5Var, int i) {
        return new jj5((i & 1) != 0 ? jj5Var.a : "OneMeScheduler", jj5Var.b, jj5Var.c, jj5Var.d, jj5Var.e, jj5Var.f, jj5Var.g, (i & 128) != 0 ? jj5Var.h : true, jj5Var.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jj5)) {
            return false;
        }
        jj5 jj5Var = (jj5) obj;
        return fni.a(this.a, jj5Var.a) && this.b == jj5Var.b && this.c == jj5Var.c && this.d == jj5Var.d && this.e == jj5Var.e && this.f == jj5Var.f && this.g == jj5Var.g && this.h == jj5Var.h && this.i == jj5Var.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + a9h.b(xrf.k(this.g, a9h.b(a9h.b(a9h.a(xrf.k(this.c, xrf.k(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e), 31, this.f), 31), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbM = utb.m(this.b, "ExecutorConfig(threadName=", this.a, ", corePoolSize=", ", maxPoolSize=");
        sbM.append(this.c);
        sbM.append(", keepAliveTimeMs=");
        sbM.append(this.d);
        hf3.f(", allowCoreThreadTimeOut=", ", prestartCoreThreads=", sbM, this.e, this.f);
        sbM.append(", threadPriority=");
        sbM.append(this.g);
        sbM.append(", allowNetwork=");
        sbM.append(this.h);
        return vb9.f(sbM, ", allowDisk=", this.i, ")");
    }

    public /* synthetic */ jj5(String str, int i, long j, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this(str, 1, i, (i2 & 8) != 0 ? 0L : j, z, (i2 & 32) != 0 ? false : z2, (i2 & 64) != 0 ? 5 : 1, z3, z4);
    }
}
