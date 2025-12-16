package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class dq6 implements x26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x26 b;
    public final /* synthetic */ tq6 c;

    public /* synthetic */ dq6(x26 x26Var, tq6 tq6Var, int i) {
        this.a = i;
        this.b = x26Var;
        this.c = tq6Var;
    }

    @Override // defpackage.x26
    public final Object d(z26 z26Var, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object objD = this.b.d(new cq6(z26Var, this.c, 0), continuation);
                if (objD != g84.a) {
                    break;
                }
                break;
            default:
                Object objD2 = this.b.d(new cq6(z26Var, this.c, 1), continuation);
                if (objD2 != g84.a) {
                    break;
                }
                break;
        }
        return qqg.a;
    }
}
