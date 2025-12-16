package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class yy6 extends dtf implements sm6 {
    public /* synthetic */ Object o;

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((yy6) l((ku3[]) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        yy6 yy6Var = new yy6(2, continuation);
        yy6Var.o = obj;
        return yy6Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        ku3[] ku3VarArr = (ku3[]) this.o;
        int length = ku3VarArr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = true;
                break;
            }
            if (u5j.h(ku3VarArr[i])) {
                break;
            }
            i++;
        }
        return Boolean.valueOf(z);
    }
}
