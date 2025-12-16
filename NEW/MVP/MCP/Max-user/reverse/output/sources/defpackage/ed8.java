package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class ed8 implements iv4 {
    public final s5g a;
    public final nu1 b;
    public final em6 c;
    public final int d;
    public final long e;
    public final tcf f;
    public final hbd g;

    /* JADX WARN: Multi-variable type inference failed */
    public ed8(s5g s5gVar, cm6 cm6Var, em6 em6Var, int i, int i2) {
        i = (i2 & 8) != 0 ? 0 : i;
        this.a = s5gVar;
        this.b = (nu1) cm6Var;
        this.c = em6Var;
        this.d = i;
        this.e = pu4.b.incrementAndGet();
        tcf tcfVarA = ucf.a(e());
        this.f = tcfVarA;
        this.g = new hbd(tcfVarA);
    }

    @Override // defpackage.iv4
    public final mcf b() {
        return this.g;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [cm6, nu1] */
    @Override // defpackage.iv4
    public final void d(yg4 yg4Var) {
        if (pu4.a(yg4Var.a, this.e)) {
            this.c.invoke(Boolean.valueOf(!((Boolean) this.b.invoke()).booleanValue()));
            this.f.m(null, e());
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [cm6, nu1] */
    public final List e() {
        return Collections.singletonList(new yg4(this.e, this.a, this.d, null, new xg4(((Boolean) this.b.invoke()).booleanValue()), 8));
    }
}
