package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class e40 implements ga8 {
    public static final /* synthetic */ yy7[] h;
    public final k18 a;
    public final ContextScope b;
    public final t9f c = c7j.c();
    public final h08 d = new h08(4, this);
    public volatile Long e;
    public final tcf f;
    public final m36 g;

    static {
        z8a z8aVar = new z8a(e40.class, "updatePlayer", "getUpdatePlayer()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        h = new yy7[]{z8aVar};
    }

    public e40(k18 k18Var, k18 k18Var2) {
        this.a = k18Var2;
        this.b = d7j.a(((q2b) ((lzf) k18Var.getValue())).c().getImmediate().plus(eoi.a()));
        tcf tcfVarA = ucf.a(new fa8(null, false));
        this.f = tcfVarA;
        this.g = new m36(new c40(k18Var2, this, null), tcfVarA);
    }

    public static final void f(e40 e40Var) {
        e40Var.c.O(e40Var, h[0], svi.e(e40Var.b, null, i84.b, new d40(e40Var, null), 1));
    }

    @Override // defpackage.ga8
    public final void a() {
        if (((b8a) g()).H0) {
            ((b8a) g()).s();
        }
    }

    @Override // defpackage.ga8
    public final void b(Long l) {
        this.e = l;
    }

    @Override // defpackage.ga8
    public final void c() {
        tcf tcfVar = this.f;
        ((fa8) tcfVar.getValue()).getClass();
        tcfVar.m(null, new fa8(null, false));
    }

    @Override // defpackage.ga8
    public final x26 d() {
        return this.g;
    }

    @Override // defpackage.ga8
    public final void e() {
        b8a b8aVar = (b8a) g();
        svi.e(b8aVar.Z, null, null, new y7a(b8aVar, 1.0f, null), 3);
        long j = ((b8a) g()).j();
        Long l = this.e;
        boolean z = l != null && j == l.longValue();
        if (((b8a) g()).H0 && z) {
            ((b8a) g()).o();
            return;
        }
        if (((b8a) g()).G0 && z) {
            ((b8a) g()).p();
            return;
        }
        Long l2 = this.e;
        if (l2 != null) {
            long jLongValue = l2.longValue();
            b8a b8aVar2 = (b8a) g();
            svi.e(b8aVar2.Z, ((q2b) b8aVar2.b).b(), null, new v7a(new i7a(jLongValue), b8aVar2, null), 2);
        }
    }

    public final l7a g() {
        return (l7a) this.a.getValue();
    }

    @Override // defpackage.ga8
    public final void release() {
        d7j.c(this.b, null);
        ((b8a) g()).r(this.d);
    }

    @Override // defpackage.ga8
    public final void seekTo(long j) {
        b8a b8aVar = (b8a) g();
        svi.e(b8aVar.Z, null, null, new x7a(j, b8aVar, null), 3);
    }
}
