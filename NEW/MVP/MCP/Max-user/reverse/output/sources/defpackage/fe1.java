package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class fe1 implements x26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object o;

    public /* synthetic */ fe1(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.o = obj4;
    }

    @Override // defpackage.x26
    public final Object d(z26 z26Var, Continuation continuation) throws Throwable {
        switch (this.a) {
            case 0:
                x26[] x26VarArr = (x26[]) this.b;
                Object objA = x4j.a(z26Var, new de1(x26VarArr, 0), new ee1(null, (f84) this.c, (List) this.d, (he1) this.o), continuation, x26VarArr);
                return objA == g84.a ? objA : qqg.a;
            case 1:
                Object objD = ((z41) this.b).d(new x92(z26Var, (vi5) this.c, (k53) this.d, (Long) this.o, 3), continuation);
                return objD == g84.a ? objD : qqg.a;
            case 2:
                ((tcf) this.b).d(new sn7(z26Var, (yn7) this.c, (k18) this.d, (k18) this.o), continuation);
                return g84.a;
            case 3:
                ((tcf) this.b).d(new x92(z26Var, (wr7) this.c, (k18) this.d, (k18) this.o, 5), continuation);
                return g84.a;
            default:
                Object objD2 = ((z41) this.b).d(new x92(z26Var, (vi5) this.c, (wxb) this.d, (Long) this.o, 6), continuation);
                return objD2 == g84.a ? objD2 : qqg.a;
        }
    }
}
