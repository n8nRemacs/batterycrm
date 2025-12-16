package defpackage;

/* loaded from: classes.dex */
public final class z4c extends s9g {
    public static final Object k = new Object();
    public final k09 e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final yz8 i;
    public final long j;

    public z4c(a5c a5cVar) {
        this.e = a5cVar.E();
        a5cVar.m0();
        this.f = a5cVar.a.y0();
        a5cVar.m0();
        this.g = a5cVar.a.w0();
        this.h = !a5cVar.v().p() && a5cVar.v().m(a5cVar.t(), new q9g(), 0L).k;
        this.i = a5cVar.O() ? yz8.f : null;
        this.j = zxg.U(a5cVar.D());
    }

    @Override // defpackage.s9g
    public final int b(Object obj) {
        return k.equals(obj) ? 0 : -1;
    }

    @Override // defpackage.s9g
    public final m9g f(int i, m9g m9gVar, boolean z) {
        m9gVar.getClass();
        v8 v8Var = v8.f;
        Object obj = k;
        m9gVar.i(obj, obj, 0, this.j, 0L, v8Var, false);
        m9gVar.f = this.h;
        return m9gVar;
    }

    @Override // defpackage.s9g
    public final int h() {
        return 1;
    }

    @Override // defpackage.s9g
    public final Object l(int i) {
        return k;
    }

    @Override // defpackage.s9g
    public final q9g m(int i, q9g q9gVar, long j) {
        q9gVar.b(k, this.e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f, this.g, this.i, 0L, this.j, 0, 0, 0L);
        q9gVar.k = this.h;
        return q9gVar;
    }

    @Override // defpackage.s9g
    public final int o() {
        return 1;
    }
}
