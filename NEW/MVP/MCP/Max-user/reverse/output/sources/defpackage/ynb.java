package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ynb extends dtf implements sm6 {
    public final /* synthetic */ dob o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ynb(dob dobVar, Continuation continuation) {
        super(2, continuation);
        this.o = dobVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        ynb ynbVar = (ynb) l(bool, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ynbVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ynb(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        yy7[] yy7VarArr = dob.A0;
        this.o.c();
        return qqg.a;
    }
}
