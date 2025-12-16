package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class umd extends ymd implements ud4 {
    public final y9e X;

    public umd(hf6 hf6Var, wg7 wg7Var, y9e y9eVar, ArrayList arrayList) {
        super(hf6Var, wg7Var, y9eVar, arrayList);
        this.X = y9eVar;
    }

    @Override // defpackage.ud4
    public final boolean A() {
        return this.X.j();
    }

    @Override // defpackage.ud4
    public final long C() {
        return this.X.d;
    }

    @Override // defpackage.ud4
    public final long D(long j) {
        return this.X.e(j);
    }

    @Override // defpackage.ud4
    public final long E(long j, long j2) {
        return this.X.c(j, j2);
    }

    @Override // defpackage.ymd
    public final String a() {
        return null;
    }

    @Override // defpackage.ud4
    public final long b(long j) {
        return this.X.h(j);
    }

    @Override // defpackage.ymd
    public final ud4 c() {
        return this;
    }

    @Override // defpackage.ymd
    public final r7d d() {
        return null;
    }

    @Override // defpackage.ud4
    public final long f(long j, long j2) {
        return this.X.f(j, j2);
    }

    @Override // defpackage.ud4
    public final long h(long j, long j2) {
        return this.X.d(j, j2);
    }

    @Override // defpackage.ud4
    public final long j(long j, long j2) {
        y9e y9eVar = this.X;
        if (y9eVar.f != null) {
            return -9223372036854775807L;
        }
        long jC = y9eVar.c(j, j2) + y9eVar.d(j, j2);
        return (y9eVar.f(jC, j) + y9eVar.h(jC)) - y9eVar.i;
    }

    @Override // defpackage.ud4
    /* renamed from: k */
    public final r7d mo164k(long j) {
        return this.X.i(this, j);
    }

    @Override // defpackage.ud4
    public final long u(long j, long j2) {
        return this.X.g(j, j2);
    }
}
