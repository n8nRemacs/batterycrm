package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class rnb implements x26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y83 b;
    public final /* synthetic */ dob c;

    public /* synthetic */ rnb(y83 y83Var, dob dobVar, int i) {
        this.a = i;
        this.b = y83Var;
        this.c = dobVar;
    }

    @Override // defpackage.x26
    public final Object d(z26 z26Var, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object objD = this.b.d(new qnb(z26Var, this.c, 0), continuation);
                if (objD != g84.a) {
                    break;
                }
                break;
            default:
                Object objD2 = this.b.d(new qnb(z26Var, this.c, 2), continuation);
                if (objD2 != g84.a) {
                    break;
                }
                break;
        }
        return qqg.a;
    }
}
