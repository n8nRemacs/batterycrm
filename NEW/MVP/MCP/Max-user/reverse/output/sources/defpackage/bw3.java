package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class bw3 extends dtf implements sm6 {
    public final /* synthetic */ tw3 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw3(tw3 tw3Var, Continuation continuation) {
        super(2, continuation);
        this.X = tw3Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        bw3 bw3Var = (bw3) l((s85) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        bw3Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        bw3 bw3Var = new bw3(this.X, continuation);
        bw3Var.o = obj;
        return bw3Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object value;
        s85 s85Var;
        Object value2;
        Object value3;
        g8j.b(obj);
        s85 s85Var2 = (s85) this.o;
        tw3 tw3Var = this.X;
        tcf tcfVar = tw3Var.j;
        do {
            value = tcfVar.getValue();
            s85Var = (s85) value;
        } while (!tcfVar.c(value, s85Var != null ? s85.c(s85Var, null, null, null, null, null, s85Var2.i, null, false, null, 7935) : null));
        boolean z = tw3Var.B.get();
        String str = s85Var2.a;
        long j = s85Var2.b;
        String str2 = s85Var2.c;
        CharSequence charSequence = s85Var2.d;
        s85 s85Var3 = (s85) tw3Var.i.getValue();
        boolean z2 = false;
        if (s85Var3 != null && s85Var3.a((e95) tcfVar.getValue())) {
            z2 = true;
        }
        xec xecVar = new xec(str, j, str2, charSequence, z2, z, z ? 2 : 1);
        List listA = tw3Var.f().a(tw3Var);
        tcf tcfVar2 = tw3Var.b;
        do {
            value2 = tcfVar2.getValue();
        } while (!tcfVar2.c(value2, xecVar));
        tcf tcfVar3 = tw3Var.c;
        do {
            value3 = tcfVar3.getValue();
        } while (!tcfVar3.c(value3, listA));
        return qqg.a;
    }
}
