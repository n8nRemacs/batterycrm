package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class nu2 implements x26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g56 b;

    public /* synthetic */ nu2(g56 g56Var, int i) {
        this.a = i;
        this.b = g56Var;
    }

    @Override // defpackage.x26
    public final Object d(z26 z26Var, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object objD = this.b.d(new to1(z26Var, 14), continuation);
                if (objD != g84.a) {
                    break;
                }
                break;
            case 1:
                Object objD2 = this.b.d(new to1(z26Var, 15), continuation);
                if (objD2 != g84.a) {
                    break;
                }
                break;
            default:
                Object objD3 = this.b.d(new to1(z26Var, 17), continuation);
                if (objD3 != g84.a) {
                    break;
                }
                break;
        }
        return qqg.a;
    }
}
