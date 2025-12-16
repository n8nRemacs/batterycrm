package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class sx2 implements x26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gbd b;

    public /* synthetic */ sx2(gbd gbdVar, int i) {
        this.a = i;
        this.b = gbdVar;
    }

    @Override // defpackage.x26
    public final Object d(z26 z26Var, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object objD = this.b.a.d(new to1(z26Var, 24), continuation);
                if (objD != g84.a) {
                    break;
                }
                break;
            case 1:
                Object objD2 = this.b.a.d(new h28(z26Var, 21), continuation);
                if (objD2 != g84.a) {
                    break;
                }
                break;
            case 2:
                Object objD3 = this.b.a.d(new h28(z26Var, 22), continuation);
                if (objD3 != g84.a) {
                    break;
                }
                break;
            default:
                Object objD4 = this.b.a.d(new h28(z26Var, 23), continuation);
                if (objD4 != g84.a) {
                    break;
                }
                break;
        }
        return qqg.a;
    }
}
