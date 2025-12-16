package defpackage;

import java.util.Collections;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes2.dex */
public abstract class sb2 {
    public static final pq3 a = new pq3(i1b.R, new n5g(k1b.a), 2, 56);
    public static final bwf b = new bwf(new jl1(27));

    public static mxe a(pb2 pb2Var) {
        long j = pb2Var.a;
        int i = k1b.B;
        ku3 ku3VarN = pb2Var.n();
        String strE = ku3VarN != null ? ku3VarN.e() : null;
        if (strE != null) {
            return new mxe(j, new p5g(i, ys.D(new Object[]{strE})), new n5g(mvd.N), ve3.j(new pq3(i1b.Q, new n5g(k1b.x), 1, 56), a));
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static mxe b(long j) {
        return new mxe(j, new n5g(k1b.b), null, ve3.j(new pq3(i1b.T, new n5g(k1b.y), 1, 56), a));
    }

    public static mxe c(long j) {
        return new mxe(j, new n5g(k1b.j), null, ve3.j(new pq3(i1b.T, new n5g(k1b.i), 1, 56), a));
    }

    public static mxe d(pb2 pb2Var) {
        long j = pb2Var.a;
        int i = k1b.d;
        pb2Var.p0();
        return new mxe(j, new p5g(i, ys.D(new Object[]{pb2Var.t0})), new n5g(mvd.u), ve3.j(new pq3(i1b.I, new n5g(k1b.f), 1, 56), new pq3(i1b.B, new n5g(k1b.c), 1, 56), a));
    }

    public static mxe e(pb2 pb2Var) {
        long j = pb2Var.a;
        int i = k1b.m;
        pb2Var.p0();
        return new mxe(j, new p5g(i, ys.D(new Object[]{pb2Var.t0})), null, ve3.j(new pq3(i1b.S, new n5g(k1b.h), 1, 56), a));
    }

    public static mxe f(pb2 pb2Var) {
        long j = pb2Var.a;
        int i = k1b.m;
        pb2Var.p0();
        return new mxe(j, new p5g(i, ys.D(new Object[]{pb2Var.t0})), new n5g(mvd.B), ve3.j(new pq3(i1b.I, new n5g(k1b.r), 1, 56), new pq3(i1b.C, new n5g(k1b.k), 1, 56), a));
    }

    public static mxe g(pb2 pb2Var) {
        long j = pb2Var.a;
        int i = k1b.H;
        pb2Var.p0();
        p5g p5gVar = new p5g(i, ys.D(new Object[]{pb2Var.t0}));
        n5g n5gVar = new n5g(mvd.w);
        o98 o98VarD = ve3.d();
        o98VarD.add(new pq3(i1b.S, new n5g(k1b.l), 1, 56));
        if (pb2Var.N() && pb2Var.b.d == pb2Var.X) {
            o98VarD.add(new pq3(i1b.T, new n5g(k1b.k), 1, 56));
        }
        o98VarD.add(a);
        return new mxe(j, p5gVar, n5gVar, ve3.a(o98VarD));
    }

    public static mxe h(pb2 pb2Var) {
        long j = pb2Var.a;
        int i = k1b.e;
        pb2Var.p0();
        return new mxe(j, new p5g(i, ys.D(new Object[]{pb2Var.t0})), null, ve3.j(new pq3(i1b.U, new n5g(k1b.z), 1, 56), a));
    }

    public static mxe i(pb2 pb2Var) {
        long j = pb2Var.a;
        int i = k1b.e;
        pb2Var.p0();
        return new mxe(j, new p5g(i, ys.D(new Object[]{pb2Var.t0})), null, ve3.j(new pq3(i1b.I, new n5g(k1b.f), 1, 56), a));
    }

    public static mxe j(pb2 pb2Var) {
        long j = pb2Var.a;
        int i = k1b.o;
        pb2Var.p0();
        return new mxe(j, new p5g(i, ys.D(new Object[]{pb2Var.t0})), null, ve3.j(new pq3(i1b.U, new n5g(k1b.A), 1, 56), (pq3) b.getValue()));
    }

    public static mxe k(pb2 pb2Var) {
        long j = pb2Var.a;
        int i = k1b.o;
        pb2Var.p0();
        return new mxe(j, new p5g(i, ys.D(new Object[]{pb2Var.t0})), null, ve3.j(new pq3(i1b.I, new n5g(k1b.r), 1, 56), (pq3) b.getValue()));
    }

    public static mxe l(pb2 pb2Var) {
        return new mxe(pb2Var.a, new n5g(k1b.L), null, ve3.j(new pq3(i1b.W, new n5g(k1b.J), 3, 56), new pq3(i1b.X, new n5g(k1b.K), 3, 56), new pq3(i1b.V, new n5g(k1b.I), 3, 56), new pq3(i1b.Y, new n5g(k1b.M), 1, 56), a));
    }

    public static mxe m() {
        return new mxe(BuildConfig.MAX_TIME_TO_UPLOAD, new r5g("Действие находится в разработке!"), new r5g("Возвращайтесь позже :)"), Collections.singletonList(new pq3(Integer.MIN_VALUE, new r5g("Вернусь позже"), 3, 56)));
    }
}
