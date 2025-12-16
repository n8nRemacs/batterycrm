package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class qg0 implements x26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m36 b;

    public /* synthetic */ qg0(m36 m36Var, int i) {
        this.a = i;
        this.b = m36Var;
    }

    @Override // defpackage.x26
    public final Object d(z26 z26Var, Continuation continuation) throws Throwable {
        switch (this.a) {
            case 0:
                Object objD = this.b.d(new pg0(z26Var, 0), continuation);
                if (objD != g84.a) {
                    break;
                }
                break;
            default:
                Object objD2 = this.b.d(new f0a(z26Var, 27), continuation);
                if (objD2 != g84.a) {
                    break;
                }
                break;
        }
        return qqg.a;
    }
}
