package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class ssc extends s9g {
    public static final ssc g;
    public static final Object h;
    public final wg7 e;
    public final rsc f;

    static {
        t76 t76Var = wg7.b;
        g = new ssc(zjd.o, null);
        h = new Object();
    }

    public ssc(wg7 wg7Var, rsc rscVar) {
        this.e = wg7Var;
        this.f = rscVar;
    }

    @Override // defpackage.s9g
    public final int b(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.s9g
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ssc)) {
            return false;
        }
        ssc sscVar = (ssc) obj;
        return Objects.equals(this.e, sscVar.e) && Objects.equals(this.f, sscVar.f);
    }

    @Override // defpackage.s9g
    public final m9g f(int i, m9g m9gVar, boolean z) {
        rsc rscVarR = r(i);
        Long lValueOf = Long.valueOf(rscVarR.b);
        long jU = zxg.U(rscVarR.c);
        m9gVar.getClass();
        m9gVar.i(lValueOf, null, i, jU, 0L, v8.f, false);
        return m9gVar;
    }

    @Override // defpackage.s9g
    public final int h() {
        return o();
    }

    @Override // defpackage.s9g
    public final int hashCode() {
        return Objects.hash(this.e, this.f);
    }

    @Override // defpackage.s9g
    public final Object l(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.s9g
    public final q9g m(int i, q9g q9gVar, long j) {
        rsc rscVarR = r(i);
        q9gVar.b(h, rscVarR.a, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, true, false, null, 0L, zxg.U(rscVarR.c), i, i, 0L);
        return q9gVar;
    }

    @Override // defpackage.s9g
    public final int o() {
        return this.e.size() + (this.f == null ? 0 : 1);
    }

    public final long q(int i) {
        if (i < 0) {
            return -1L;
        }
        wg7 wg7Var = this.e;
        if (i < wg7Var.size()) {
            return ((rsc) wg7Var.get(i)).b;
        }
        return -1L;
    }

    public final rsc r(int i) {
        rsc rscVar;
        wg7 wg7Var = this.e;
        return (i != wg7Var.size() || (rscVar = this.f) == null) ? (rsc) wg7Var.get(i) : rscVar;
    }
}
