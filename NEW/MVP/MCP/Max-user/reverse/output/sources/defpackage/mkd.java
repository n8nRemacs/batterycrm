package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class mkd implements uj6 {
    public final df7 a;
    public final String b = mkd.class.getName();
    public rj6 c = rj6.d;
    public r0 d;
    public pe4 e;

    public mkd(df7 df7Var) {
        this.a = df7Var;
    }

    @Override // defpackage.uj6
    public final boolean a() {
        g2h g2hVar = this.c.a;
        return (g2hVar != null ? g2hVar.f() : null) != null;
    }

    @Override // defpackage.uj6
    public final Object b(long j, Continuation continuation) {
        pe4 pe4Var = this.e;
        if (pe4Var != null) {
            pe4Var.close();
        }
        this.e = null;
        g2h g2hVar = this.c.a;
        ry ryVarF = g2hVar != null ? g2hVar.f() : null;
        if (g2hVar == null || ryVarF == null) {
            wqi.e(this.b, "Video collage is null", null);
            return null;
        }
        l42 l42Var = new l42(1, hni.f(continuation));
        l42Var.o();
        sf7 sf7VarD = sf7.d(Uri.parse((String) ryVarF.X));
        sf7VarD.n = v25.c;
        sf7VarD.k = new ck6(g2hVar, j);
        pe4 pe4VarB = this.a.b(sf7VarD.a(), null);
        this.e = pe4VarB;
        ((r0) pe4VarB).l(new we7(l42Var, pe4VarB, this), yu1.a);
        return l42Var.n();
    }

    @Override // defpackage.uj6
    public final rj6 getData() {
        return this.c;
    }

    @Override // defpackage.uj6
    public final void prepare() {
        g2h g2hVar = this.c.a;
        String str = this.b;
        if (g2hVar == null) {
            wqi.e(str, "You should call init before prepare!", null);
            return;
        }
        ry ryVarF = g2hVar.f();
        if (ryVarF == null) {
            wqi.e(str, "Video collage is null", null);
            return;
        }
        sf7 sf7VarD = sf7.d(Uri.parse((String) ryVarF.X));
        sf7VarD.n = v25.c;
        r0 r0Var = this.d;
        if (r0Var != null) {
            r0Var.close();
        }
        this.d = null;
        this.d = this.a.e(sf7VarD.a(), null);
    }
}
