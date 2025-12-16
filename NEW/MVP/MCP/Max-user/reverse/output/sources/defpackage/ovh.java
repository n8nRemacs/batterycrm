package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ovh implements x26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ovh(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.x26
    public final Object d(z26 z26Var, Continuation continuation) {
        switch (this.a) {
            case 0:
                x26[] x26VarArr = (x26[]) this.b;
                Object objA = x4j.a(z26Var, new de1(x26VarArr, 7), new mo1((Continuation) null, (uvh) this.c, 12), continuation, x26VarArr);
                if (objA != g84.a) {
                    break;
                }
                break;
            default:
                Object objD = ((d53) this.b).d(new q83(z26Var, (a93) this.c, 0), continuation);
                if (objD != g84.a) {
                    break;
                }
                break;
        }
        return qqg.a;
    }
}
