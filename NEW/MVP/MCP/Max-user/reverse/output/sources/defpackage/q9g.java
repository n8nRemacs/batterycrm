package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class q9g {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final String F;
    public static final Object q = new Object();
    public static final Object r = new Object();
    public static final k09 s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public static final String z;
    public Object b;
    public Object d;
    public long e;
    public long f;
    public long g;
    public boolean h;
    public boolean i;
    public yz8 j;
    public boolean k;
    public long l;
    public long m;
    public int n;
    public int o;
    public long p;
    public Object a = q;
    public k09 c = s;

    static {
        a09 a09Var;
        oz8 oz8Var = new oz8();
        uz8 uz8Var = new uz8();
        List list = Collections.EMPTY_LIST;
        zjd zjdVar = zjd.o;
        wz8 wz8Var = new wz8();
        d09 d09Var = d09.d;
        Uri uri = Uri.EMPTY;
        hsi.g(uz8Var.b == null || uz8Var.a != null);
        vz8 vz8Var = null;
        if (uri != null) {
            if (uz8Var.a != null) {
                vz8Var = new vz8(uz8Var);
            }
            a09Var = new a09(uri, null, vz8Var, null, list, null, zjdVar, -9223372036854775807L);
        } else {
            a09Var = null;
        }
        s = new k09("androidx.media3.common.Timeline", new sz8(oz8Var), a09Var, new yz8(wz8Var), w19.K, d09Var);
        t = Integer.toString(1, 36);
        u = Integer.toString(2, 36);
        v = Integer.toString(3, 36);
        w = Integer.toString(4, 36);
        x = Integer.toString(5, 36);
        y = Integer.toString(6, 36);
        z = Integer.toString(7, 36);
        A = Integer.toString(8, 36);
        B = Integer.toString(9, 36);
        C = Integer.toString(10, 36);
        D = Integer.toString(11, 36);
        E = Integer.toString(12, 36);
        F = Integer.toString(13, 36);
    }

    public final boolean a() {
        return this.j != null;
    }

    public final void b(Object obj, k09 k09Var, Object obj2, long j, long j2, long j3, boolean z2, boolean z3, yz8 yz8Var, long j4, long j5, int i, int i2, long j6) {
        this.a = obj;
        this.c = k09Var != null ? k09Var : s;
        if (k09Var != null) {
            a09 a09Var = k09Var.b;
        }
        this.b = null;
        this.d = obj2;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = z2;
        this.i = z3;
        this.j = yz8Var;
        this.l = j4;
        this.m = j5;
        this.n = i;
        this.o = i2;
        this.p = j6;
        this.k = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q9g.class.equals(obj.getClass())) {
            q9g q9gVar = (q9g) obj;
            if (Objects.equals(this.a, q9gVar.a) && Objects.equals(this.c, q9gVar.c) && Objects.equals(this.d, q9gVar.d) && Objects.equals(this.j, q9gVar.j) && this.e == q9gVar.e && this.f == q9gVar.f && this.g == q9gVar.g && this.h == q9gVar.h && this.i == q9gVar.i && this.k == q9gVar.k && this.l == q9gVar.l && this.m == q9gVar.m && this.n == q9gVar.n && this.o == q9gVar.o && this.p == q9gVar.p) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.a.hashCode() + 217) * 31)) * 31;
        Object obj = this.d;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        yz8 yz8Var = this.j;
        int iHashCode3 = (iHashCode2 + (yz8Var != null ? yz8Var.hashCode() : 0)) * 31;
        long j = this.e;
        int i = (iHashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.g;
        int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.k ? 1 : 0)) * 31;
        long j4 = this.l;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.m;
        int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.n) * 31) + this.o) * 31;
        long j6 = this.p;
        return i5 + ((int) (j6 ^ (j6 >>> 32)));
    }
}
