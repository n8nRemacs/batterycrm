package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class d40 extends dtf implements sm6 {
    public final /* synthetic */ e40 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d40(e40 e40Var, Continuation continuation) {
        super(2, continuation);
        this.o = e40Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        d40 d40Var = (d40) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        d40Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new d40(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object value;
        Object value2;
        boolean z;
        Float f;
        Object value3;
        qqg qqgVar = qqg.a;
        g8j.b(obj);
        e40 e40Var = this.o;
        yy7[] yy7VarArr = e40.h;
        long j = ((b8a) e40Var.g()).j();
        Long l = this.o.e;
        if (l == null || j != l.longValue()) {
            tcf tcfVar = this.o.f;
            do {
                value = tcfVar.getValue();
                ((fa8) value).getClass();
            } while (!tcfVar.c(value, new fa8(null, false)));
        } else if (((b8a) this.o.g()).m()) {
            tcf tcfVar2 = this.o.f;
            do {
                value3 = tcfVar2.getValue();
            } while (!tcfVar2.c(value3, new fa8(null, false)));
        } else {
            e40 e40Var2 = this.o;
            tcf tcfVar3 = e40Var2.f;
            do {
                value2 = tcfVar3.getValue();
                fa8 fa8Var = (fa8) value2;
                z = ((b8a) e40Var2.g()).H0;
                f = fa8Var.a;
                fa8Var.getClass();
            } while (!tcfVar3.c(value2, new fa8(f, z)));
        }
        return qqgVar;
    }
}
