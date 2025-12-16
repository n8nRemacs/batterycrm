package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class mcc {
    public final bwf a = new bwf(new zfb(26));

    public final fmc a(int i, CharSequence charSequence, boolean z) {
        int i2;
        int i3;
        s5g n5gVar;
        int iV = az1.v(i);
        if (iV == 0 || iV == 1) {
            p5g p5gVar = new p5g(x8b.o1, ys.D(new Object[]{charSequence}));
            o98 o98VarD = ve3.d();
            o98VarD.add(new pq3(v8b.U, new n5g(x8b.n1), 1, 56));
            o98VarD.add(new pq3(v8b.z, new n5g(x8b.m1), 3, 56));
            return new fmc(p5gVar, null, ve3.a(o98VarD), null);
        }
        if (iV != 2) {
            if (iV == 3) {
                return c();
            }
            throw new NoWhenBranchMatchedException();
        }
        if (z) {
            n5gVar = new n5g(x8b.k1);
            i2 = x8b.i1;
            i3 = x8b.m1;
        } else {
            p5g p5gVar2 = new p5g(x8b.G2, ys.D(new Object[]{charSequence}));
            i2 = x8b.F2;
            i3 = mvd.p;
            n5gVar = p5gVar2;
        }
        n5g n5gVar2 = z ? new n5g(x8b.h1) : null;
        o98 o98VarD2 = ve3.d();
        o98VarD2.add(new pq3(v8b.U, new n5g(i2), 1, 56));
        o98VarD2.add(new pq3(v8b.z, new n5g(i3), 3, 56));
        return new fmc(n5gVar, n5gVar2, ve3.a(o98VarD2), null);
    }

    public final pq3 b() {
        return (pq3) this.a.getValue();
    }

    public final fmc c() {
        r5g r5gVar = new r5g("Unsupported chat type");
        o98 o98VarD = ve3.d();
        o98VarD.add(new pq3(v8b.C, new n5g(x8b.N0), 1, 56));
        o98VarD.add(b());
        return new fmc(r5gVar, null, ve3.a(o98VarD), null);
    }
}
