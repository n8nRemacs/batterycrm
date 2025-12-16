package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class lo1 implements x26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u92 b;

    public /* synthetic */ lo1(u92 u92Var, int i) {
        this.a = i;
        this.b = u92Var;
    }

    @Override // defpackage.x26
    public final Object d(z26 z26Var, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object objD = this.b.d(new pg0(z26Var, 24), continuation);
                if (objD != g84.a) {
                    break;
                }
                break;
            case 1:
                Object objD2 = this.b.d(new a53(z26Var, 15), continuation);
                if (objD2 != g84.a) {
                    break;
                }
                break;
            case 2:
                Object objD3 = this.b.d(new a53(z26Var, 16), continuation);
                if (objD3 != g84.a) {
                    break;
                }
                break;
            case 3:
                Object objD4 = this.b.d(new f0a(z26Var, 10), continuation);
                if (objD4 != g84.a) {
                    break;
                }
                break;
            default:
                Object objD5 = this.b.d(new f0a(z26Var, 24), continuation);
                if (objD5 != g84.a) {
                    break;
                }
                break;
        }
        return qqg.a;
    }
}
