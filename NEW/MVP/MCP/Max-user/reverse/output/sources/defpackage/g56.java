package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class g56 implements x26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x26 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g56(x26 x26Var, sm6 sm6Var, int i) {
        this.a = i;
        this.b = x26Var;
        this.c = sm6Var;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, sm6] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, sm6] */
    @Override // defpackage.x26
    public final Object d(z26 z26Var, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object objD = this.b.d(new f56(z26Var, this.c, 0), continuation);
                if (objD != g84.a) {
                    break;
                }
                break;
            default:
                Object objD2 = this.b.d(new f56(z26Var, this.c, 1), continuation);
                if (objD2 != g84.a) {
                    break;
                }
                break;
        }
        return qqg.a;
    }
}
