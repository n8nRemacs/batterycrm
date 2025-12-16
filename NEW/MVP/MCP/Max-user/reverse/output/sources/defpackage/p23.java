package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class p23 implements x26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ su1 b;

    public /* synthetic */ p23(su1 su1Var, int i) {
        this.a = i;
        this.b = su1Var;
    }

    @Override // defpackage.x26
    public final Object d(z26 z26Var, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object objD = this.b.d(new to1(z26Var, 27), continuation);
                if (objD != g84.a) {
                    break;
                }
                break;
            case 1:
                Object objD2 = this.b.d(new a53(z26Var, 9), continuation);
                if (objD2 != g84.a) {
                    break;
                }
                break;
            case 2:
                Object objD3 = this.b.d(new a53(z26Var, 28), continuation);
                if (objD3 != g84.a) {
                    break;
                }
                break;
            case 3:
                Object objD4 = this.b.d(new h28(z26Var, 0), continuation);
                if (objD4 != g84.a) {
                    break;
                }
                break;
            default:
                Object objD5 = this.b.d(new yjf(z26Var, 0), continuation);
                if (objD5 != g84.a) {
                    break;
                }
                break;
        }
        return qqg.a;
    }
}
