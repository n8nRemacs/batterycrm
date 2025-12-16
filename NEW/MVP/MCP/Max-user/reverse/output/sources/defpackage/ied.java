package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ied extends dtf implements sm6 {
    public final /* synthetic */ zed X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ied(zed zedVar, Continuation continuation) {
        super(2, continuation);
        this.X = zedVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ied iedVar = (ied) l((red) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        iedVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ied iedVar = new ied(this.X, continuation);
        iedVar.o = obj;
        return iedVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object value;
        Object value2;
        Object value3;
        g8j.b(obj);
        red redVar = (red) this.o;
        zed zedVar = this.X;
        fed fedVar = zedVar.c;
        boolean z = (redVar instanceof ped) || (redVar instanceof ned);
        tcf tcfVar = fedVar.o;
        do {
            value = tcfVar.getValue();
            ((Boolean) value).getClass();
        } while (!tcfVar.c(value, Boolean.valueOf(z)));
        boolean zE = zedVar.E();
        tcf tcfVar2 = fedVar.Y;
        do {
            value2 = tcfVar2.getValue();
            ((Boolean) value2).getClass();
        } while (!tcfVar2.c(value2, Boolean.valueOf(zE)));
        if (zedVar.b == tdd.a) {
            boolean z2 = !(redVar instanceof qed);
            tcf tcfVar3 = fedVar.s0;
            do {
                value3 = tcfVar3.getValue();
                ((Boolean) value3).getClass();
            } while (!tcfVar3.c(value3, Boolean.valueOf(z2)));
        }
        return qqg.a;
    }
}
