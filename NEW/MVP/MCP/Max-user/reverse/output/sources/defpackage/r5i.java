package defpackage;

import androidx.work.WorkRequest;

/* loaded from: classes.dex */
public final class r5i {
    public static final String u = cei.m("WorkSpec");
    public static final lz1 v = new lz1(17);
    public final String a;
    public w4i b;
    public final String c;
    public String d;
    public yd4 e;
    public final yd4 f;
    public long g;
    public long h;
    public long i;
    public bu3 j;
    public int k;
    public eg0 l;
    public long m;
    public long n;
    public long o;
    public long p;
    public boolean q;
    public ujb r;
    public final int s;
    public final int t;

    public r5i(String str, w4i w4iVar, String str2, String str3, yd4 yd4Var, yd4 yd4Var2, long j, long j2, long j3, bu3 bu3Var, int i, eg0 eg0Var, long j4, long j5, long j6, long j7, boolean z, ujb ujbVar, int i2, int i3) {
        this.a = str;
        this.b = w4iVar;
        this.c = str2;
        this.d = str3;
        this.e = yd4Var;
        this.f = yd4Var2;
        this.g = j;
        this.h = j2;
        this.i = j3;
        this.j = bu3Var;
        this.k = i;
        this.l = eg0Var;
        this.m = j4;
        this.n = j5;
        this.o = j6;
        this.p = j7;
        this.q = z;
        this.r = ujbVar;
        this.s = i2;
        this.t = i3;
    }

    public static r5i b(r5i r5iVar, String str, w4i w4iVar, String str2, yd4 yd4Var, int i, long j, int i2, int i3) {
        String str3 = (i3 & 1) != 0 ? r5iVar.a : str;
        w4i w4iVar2 = (i3 & 2) != 0 ? r5iVar.b : w4iVar;
        String str4 = (i3 & 4) != 0 ? r5iVar.c : str2;
        String str5 = r5iVar.d;
        yd4 yd4Var2 = (i3 & 16) != 0 ? r5iVar.e : yd4Var;
        yd4 yd4Var3 = r5iVar.f;
        long j2 = r5iVar.g;
        long j3 = r5iVar.h;
        long j4 = r5iVar.i;
        bu3 bu3Var = r5iVar.j;
        int i4 = (i3 & 1024) != 0 ? r5iVar.k : i;
        eg0 eg0Var = r5iVar.l;
        long j5 = r5iVar.m;
        long j6 = (i3 & 8192) != 0 ? r5iVar.n : j;
        long j7 = r5iVar.o;
        long j8 = r5iVar.p;
        boolean z = r5iVar.q;
        ujb ujbVar = r5iVar.r;
        int i5 = r5iVar.s;
        int i6 = (i3 & 524288) != 0 ? r5iVar.t : i2;
        r5iVar.getClass();
        return new r5i(str3, w4iVar2, str4, str5, yd4Var2, yd4Var3, j2, j3, j4, bu3Var, i4, eg0Var, j5, j6, j7, j8, z, ujbVar, i5, i6);
    }

    public final long a() {
        int i;
        if (this.b == w4i.a && (i = this.k) > 0) {
            long jScalb = this.l == eg0.b ? this.m * i : (long) Math.scalb(this.m, i - 1);
            long j = this.n;
            if (jScalb > WorkRequest.MAX_BACKOFF_MILLIS) {
                jScalb = 18000000;
            }
            return j + jScalb;
        }
        if (!d()) {
            long jCurrentTimeMillis = this.n;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return jCurrentTimeMillis + this.g;
        }
        int i2 = this.s;
        long j2 = this.n;
        if (i2 == 0) {
            j2 += this.g;
        }
        long j3 = this.i;
        long j4 = this.h;
        if (j3 != j4) {
            return j2 + j4 + (i2 == 0 ? (-1) * j3 : 0L);
        }
        return j2 + (i2 != 0 ? j4 : 0L);
    }

    public final boolean c() {
        return !bu3.i.equals(this.j);
    }

    public final boolean d() {
        return this.h != 0;
    }

    public final void e(long j) {
        String str = u;
        if (j > WorkRequest.MAX_BACKOFF_MILLIS) {
            cei.g().o(str, "Backoff delay duration exceeds maximum value");
        }
        if (j < WorkRequest.MIN_BACKOFF_MILLIS) {
            cei.g().o(str, "Backoff delay duration less than minimum value");
        }
        this.m = n7j.e(j, WorkRequest.MIN_BACKOFF_MILLIS, WorkRequest.MAX_BACKOFF_MILLIS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r5i)) {
            return false;
        }
        r5i r5iVar = (r5i) obj;
        return fni.a(this.a, r5iVar.a) && this.b == r5iVar.b && fni.a(this.c, r5iVar.c) && fni.a(this.d, r5iVar.d) && fni.a(this.e, r5iVar.e) && fni.a(this.f, r5iVar.f) && this.g == r5iVar.g && this.h == r5iVar.h && this.i == r5iVar.i && fni.a(this.j, r5iVar.j) && this.k == r5iVar.k && this.l == r5iVar.l && this.m == r5iVar.m && this.n == r5iVar.n && this.o == r5iVar.o && this.p == r5iVar.p && this.q == r5iVar.q && this.r == r5iVar.r && this.s == r5iVar.s && this.t == r5iVar.t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iE = u45.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        String str = this.d;
        int iA = a9h.a(a9h.a(a9h.a(a9h.a((this.l.hashCode() + xrf.k(this.k, (this.j.hashCode() + a9h.a(a9h.a(a9h.a((this.f.hashCode() + ((this.e.hashCode() + ((iE + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31, this.g), 31, this.h), 31, this.i)) * 31, 31)) * 31, 31, this.m), 31, this.n), 31, this.o), 31, this.p);
        boolean z = this.q;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return Integer.hashCode(this.t) + xrf.k(this.s, (this.r.hashCode() + ((iA + i) * 31)) * 31, 31);
    }

    public final String toString() {
        return u45.l(new StringBuilder("{WorkSpec: "), this.a, '}');
    }

    public /* synthetic */ r5i(String str, w4i w4iVar, String str2, String str3, yd4 yd4Var, yd4 yd4Var2, long j, long j2, long j3, bu3 bu3Var, int i, eg0 eg0Var, long j4, long j5, long j6, long j7, boolean z, ujb ujbVar, int i2, int i3, int i4) {
        this(str, (i3 & 2) != 0 ? w4i.a : w4iVar, str2, (i3 & 8) != 0 ? null : str3, (i3 & 16) != 0 ? yd4.c : yd4Var, (i3 & 32) != 0 ? yd4.c : yd4Var2, (i3 & 64) != 0 ? 0L : j, (i3 & 128) != 0 ? 0L : j2, (i3 & 256) != 0 ? 0L : j3, (i3 & 512) != 0 ? bu3.i : bu3Var, (i3 & 1024) != 0 ? 0 : i, (i3 & 2048) != 0 ? eg0.a : eg0Var, (i3 & 4096) != 0 ? WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS : j4, (i3 & 8192) != 0 ? 0L : j5, (i3 & 16384) != 0 ? 0L : j6, (32768 & i3) != 0 ? -1L : j7, (65536 & i3) != 0 ? false : z, (131072 & i3) != 0 ? ujb.a : ujbVar, (i3 & 262144) != 0 ? 0 : i2, 0);
    }
}
