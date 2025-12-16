package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class k78 implements x26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x26 b;
    public final /* synthetic */ String c;

    public /* synthetic */ k78(x26 x26Var, String str, int i) {
        this.a = i;
        this.b = x26Var;
        this.c = str;
    }

    @Override // defpackage.x26
    public final Object d(z26 z26Var, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object objD = this.b.d(new j78(z26Var, this.c, 0), continuation);
                if (objD != g84.a) {
                    break;
                }
                break;
            default:
                Object objD2 = this.b.d(new j78(z26Var, this.c, 1), continuation);
                if (objD2 != g84.a) {
                    break;
                }
                break;
        }
        return qqg.a;
    }
}
