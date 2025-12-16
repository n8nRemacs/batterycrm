package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class yy4 implements x26 {
    public final x26 a;
    public final sm6 b;

    public yy4(x26 x26Var, sm6 sm6Var) {
        this.a = x26Var;
        this.b = sm6Var;
    }

    @Override // defpackage.x26
    public final Object d(z26 z26Var, Continuation continuation) {
        uid uidVar = new uid();
        uidVar.a = bqa.a;
        Object objD = this.a.d(new a40(this, uidVar, z26Var), continuation);
        return objD == g84.a ? objD : qqg.a;
    }
}
