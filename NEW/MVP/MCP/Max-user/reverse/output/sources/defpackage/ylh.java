package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ylh extends dtf implements sm6 {
    public final /* synthetic */ tmh o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ylh(tmh tmhVar, Continuation continuation) {
        super(2, continuation);
        this.o = tmhVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ylh ylhVar = (ylh) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ylhVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ylh(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        g8j.b(obj);
        qv7 qv7Var = this.o.m;
        if (qv7Var instanceof lo0) {
            ((lo0) qv7Var).b(new ymh(jnh.o));
        } else if (qv7Var instanceof po0) {
            ((po0) qv7Var).b(new ymh(jnh.X));
        } else if (qv7Var instanceof mo0) {
            ((mo0) qv7Var).b(new vmh());
        }
        this.o.m = null;
        return qqg.a;
    }
}
