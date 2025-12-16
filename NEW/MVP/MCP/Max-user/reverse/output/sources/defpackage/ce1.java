package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ce1 extends dtf implements sm6 {
    public /* synthetic */ Object o;

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ce1) l((ku3[]) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ce1 ce1Var = new ce1(2, continuation);
        ce1Var.o = obj;
        return ce1Var;
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
            ku3 ku3Var = ku3VarArr[i];
            if (ku3Var == null || ku3Var.B()) {
                break;
            }
            i++;
        }
        return Boolean.valueOf(z);
    }
}
