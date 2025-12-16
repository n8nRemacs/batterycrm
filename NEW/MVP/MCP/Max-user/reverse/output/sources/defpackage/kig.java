package defpackage;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class kig {
    public final ac0 a;
    public final String b;
    public final gf5 c;
    public final ghg d;
    public final mig e;

    public kig(ac0 ac0Var, String str, gf5 gf5Var, ghg ghgVar, mig migVar) {
        this.a = ac0Var;
        this.b = str;
        this.c = gf5Var;
        this.d = ghgVar;
        this.e = migVar;
    }

    public final void a(aa0 aa0Var) {
        o9g o9gVar = new o9g(17);
        mig migVar = this.e;
        i0e i0eVar = migVar.c;
        l9c l9cVar = aa0Var.b;
        ka5 ka5VarA = ac0.a();
        ac0 ac0Var = this.a;
        ka5VarA.p(ac0Var.a);
        ka5VarA.c = l9cVar;
        ka5VarA.b = ac0Var.b;
        ac0 ac0VarE = ka5VarA.e();
        goh gohVar = new goh();
        gohVar.f = new HashMap();
        gohVar.d = Long.valueOf(migVar.a.getTime());
        gohVar.e = Long.valueOf(migVar.b.getTime());
        gohVar.a = this.b;
        gohVar.c = new ee5(this.c, (byte[]) this.d.apply(aa0Var.a));
        gohVar.b = null;
        fp4 fp4Var = (fp4) i0eVar;
        fp4Var.b.execute(new cj(fp4Var, ac0VarE, o9gVar, gohVar.c()));
    }
}
