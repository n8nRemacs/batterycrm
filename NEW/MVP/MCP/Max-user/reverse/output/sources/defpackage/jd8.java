package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class jd8 implements x26 {
    public final /* synthetic */ x26 a;
    public final /* synthetic */ int b;

    public jd8(tcf tcfVar, int i) {
        this.a = tcfVar;
        this.b = i;
    }

    @Override // defpackage.x26
    public final Object d(z26 z26Var, Continuation continuation) {
        Object objD = this.a.d(new uf3(z26Var, this.b, 1), continuation);
        return objD == g84.a ? objD : qqg.a;
    }
}
