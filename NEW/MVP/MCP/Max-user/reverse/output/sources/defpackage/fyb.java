package defpackage;

import java.util.Collections;
import java.util.EnumSet;

/* loaded from: classes2.dex */
public final class fyb extends xfh {
    public final hbd b;

    public fyb(k18 k18Var, c5b c5bVar, lzf lzfVar, g5b g5bVar) {
        tcf tcfVarA = ucf.a(Collections.singletonList(new pa6("all.chat.folder", g5bVar.a.getString(mvd.Y), null, u84.b, EnumSet.allOf(ra6.class))));
        this.b = new hbd(tcfVarA);
        va4 va4Var = (va4) k18Var.getValue();
        va4Var.getClass();
        q2b q2bVar = (q2b) lzfVar;
        gw0.w(gw0.u(new g56(gw0.u(new z41(new d53(va4Var.v0, 13), new xnb(c5bVar.g, 2), new s3(this, null, 22), 3), q2bVar.a()), new ir9(2, tcfVarA, f9a.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 10), 1), q2bVar.c()), this.a);
    }
}
