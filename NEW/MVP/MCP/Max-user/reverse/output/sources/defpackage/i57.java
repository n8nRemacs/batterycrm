package defpackage;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class i57 extends s57 {
    public final int d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final boolean i;
    public final int j;
    public final long k;
    public final int l;
    public final long m;
    public final long n;
    public final boolean o;
    public final boolean p;
    public final y45 q;
    public final wg7 r;
    public final wg7 s;
    public final ah7 t;
    public final long u;
    public final g57 v;
    public final wg7 w;

    public i57(int i, String str, List list, long j, boolean z, long j2, boolean z2, int i2, long j3, int i3, long j4, long j5, boolean z3, boolean z4, boolean z5, y45 y45Var, List list2, List list3, g57 g57Var, Map map, List list4) {
        super(str, list, z3);
        this.d = i;
        this.h = j2;
        this.g = z;
        this.i = z2;
        this.j = i2;
        this.k = j3;
        this.l = i3;
        this.m = j4;
        this.n = j5;
        this.o = z4;
        this.p = z5;
        this.q = y45Var;
        this.r = wg7.j(list2);
        this.s = wg7.j(list3);
        this.t = ah7.a(map);
        this.w = wg7.j(list4);
        if (!list3.isEmpty()) {
            z47 z47Var = (z47) uni.c(list3);
            this.u = z47Var.o + z47Var.c;
        } else if (list2.isEmpty()) {
            this.u = 0L;
        } else {
            d57 d57Var = (d57) uni.c(list2);
            this.u = d57Var.o + d57Var.c;
        }
        this.e = j != -9223372036854775807L ? j >= 0 ? Math.min(this.u, j) : Math.max(0L, this.u + j) : -9223372036854775807L;
        this.f = j >= 0;
        this.v = g57Var;
    }

    @Override // defpackage.mz5
    public final Object a(List list) {
        return this;
    }
}
