package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class o43 implements x26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z41 b;
    public final /* synthetic */ k53 c;

    public /* synthetic */ o43(z41 z41Var, k53 k53Var, int i) {
        this.a = i;
        this.b = z41Var;
        this.c = k53Var;
    }

    @Override // defpackage.x26
    public final Object d(z26 z26Var, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object objD = this.b.d(new n43(z26Var, this.c, 0), continuation);
                if (objD != g84.a) {
                    break;
                }
                break;
            default:
                Object objD2 = this.b.d(new n43(z26Var, this.c, 3), continuation);
                if (objD2 != g84.a) {
                    break;
                }
                break;
        }
        return qqg.a;
    }
}
