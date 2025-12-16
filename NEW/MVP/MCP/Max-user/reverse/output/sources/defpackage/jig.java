package defpackage;

import java.util.Set;

/* loaded from: classes.dex */
public final class jig implements iig {
    public final Set a;
    public final ac0 b;
    public final mig c;

    public jig(Set set, ac0 ac0Var, mig migVar) {
        this.a = set;
        this.b = ac0Var;
        this.c = migVar;
    }

    public final kig a(String str, gf5 gf5Var, ghg ghgVar) {
        Set set = this.a;
        if (set.contains(gf5Var)) {
            return new kig(this.b, str, gf5Var, ghgVar, this.c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", gf5Var, set));
    }
}
