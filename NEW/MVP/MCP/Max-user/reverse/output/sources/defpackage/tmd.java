package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class tmd extends xmd implements td4 {
    public final x9e X;

    public tmd(gf6 gf6Var, wg7 wg7Var, x9e x9eVar, ArrayList arrayList) {
        super(gf6Var, wg7Var, x9eVar, arrayList);
        this.X = x9eVar;
    }

    @Override // defpackage.td4
    public final boolean A() {
        return this.X.j();
    }

    @Override // defpackage.td4
    public final long C() {
        return this.X.d;
    }

    @Override // defpackage.td4
    public final long D(long j) {
        return this.X.e(j);
    }

    @Override // defpackage.td4
    public final long E(long j, long j2) {
        return this.X.c(j, j2);
    }

    @Override // defpackage.xmd
    public final String a() {
        return null;
    }

    @Override // defpackage.td4
    public final long b(long j) {
        return this.X.h(j);
    }

    @Override // defpackage.xmd
    public final td4 c() {
        return this;
    }

    @Override // defpackage.xmd
    public final q7d d() {
        return null;
    }

    @Override // defpackage.td4
    public final long f(long j, long j2) {
        return this.X.f(j, j2);
    }

    @Override // defpackage.td4
    public final long h(long j, long j2) {
        return this.X.d(j, j2);
    }

    @Override // defpackage.td4
    public final long j(long j, long j2) {
        x9e x9eVar = this.X;
        if (x9eVar.f != null) {
            return -9223372036854775807L;
        }
        long jC = x9eVar.c(j, j2) + x9eVar.d(j, j2);
        return (x9eVar.f(jC, j) + x9eVar.h(jC)) - x9eVar.i;
    }

    @Override // defpackage.td4
    public final q7d k(long j) {
        return this.X.i(this, j);
    }

    @Override // defpackage.td4
    public final long u(long j, long j2) {
        return this.X.g(j, j2);
    }
}
