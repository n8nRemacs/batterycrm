package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class jj8 implements x26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d53 b;

    public /* synthetic */ jj8(d53 d53Var, int i) {
        this.a = i;
        this.b = d53Var;
    }

    @Override // defpackage.x26
    public final Object d(z26 z26Var, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object objD = this.b.d(new h28(z26Var, 3), continuation);
                if (objD != g84.a) {
                    break;
                }
                break;
            case 1:
                Object objD2 = this.b.d(new h28(z26Var, 7), continuation);
                if (objD2 != g84.a) {
                    break;
                }
                break;
            default:
                Object objD3 = this.b.d(new h28(z26Var, 8), continuation);
                if (objD3 != g84.a) {
                    break;
                }
                break;
        }
        return qqg.a;
    }
}
