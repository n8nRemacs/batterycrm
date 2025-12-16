package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class d00 implements x26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x26 b;
    public final /* synthetic */ long c;

    public /* synthetic */ d00(x26 x26Var, long j, int i) {
        this.a = i;
        this.b = x26Var;
        this.c = j;
    }

    @Override // defpackage.x26
    public final Object d(z26 z26Var, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object objD = this.b.d(new b00(z26Var, this.c, 1), continuation);
                if (objD != g84.a) {
                    break;
                }
                break;
            case 1:
                Object objD2 = this.b.d(new b00(z26Var, this.c, 2), continuation);
                if (objD2 != g84.a) {
                    break;
                }
                break;
            case 2:
                Object objD3 = this.b.d(new b00(z26Var, this.c, 3), continuation);
                if (objD3 != g84.a) {
                    break;
                }
                break;
            case 3:
                Object objD4 = this.b.d(new b00(z26Var, this.c, 4), continuation);
                if (objD4 != g84.a) {
                    break;
                }
                break;
            default:
                Object objD5 = ((d53) this.b).d(new b00(z26Var, this.c, 0), continuation);
                if (objD5 != g84.a) {
                    break;
                }
                break;
        }
        return qqg.a;
    }
}
