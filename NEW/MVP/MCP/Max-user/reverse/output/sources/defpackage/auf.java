package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class auf implements x26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d53 b;
    public final /* synthetic */ duf c;

    public /* synthetic */ auf(d53 d53Var, duf dufVar, int i) {
        this.a = i;
        this.b = d53Var;
        this.c = dufVar;
    }

    @Override // defpackage.x26
    public final Object d(z26 z26Var, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object objD = this.b.d(new yjf(z26Var, this.c), continuation);
                if (objD != g84.a) {
                    break;
                }
                break;
            default:
                Object objD2 = this.b.d(new hv7(z26Var, this.c, 25), continuation);
                if (objD2 != g84.a) {
                    break;
                }
                break;
        }
        return qqg.a;
    }
}
