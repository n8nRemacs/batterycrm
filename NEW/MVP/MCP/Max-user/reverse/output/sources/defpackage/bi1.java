package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class bi1 implements x26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x26 b;
    public final /* synthetic */ k18 c;

    public /* synthetic */ bi1(x26 x26Var, k18 k18Var, int i) {
        this.a = i;
        this.b = x26Var;
        this.c = k18Var;
    }

    @Override // defpackage.x26
    public final Object d(z26 z26Var, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object objD = this.b.d(new u31(z26Var, this.c, 1), continuation);
                if (objD != g84.a) {
                    break;
                }
                break;
            default:
                Object objD2 = this.b.d(new u31(z26Var, this.c, 2), continuation);
                if (objD2 != g84.a) {
                    break;
                }
                break;
        }
        return qqg.a;
    }
}
