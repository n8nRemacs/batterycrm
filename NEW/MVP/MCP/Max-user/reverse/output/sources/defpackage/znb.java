package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class znb extends dtf implements sm6 {
    public final /* synthetic */ dob o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public znb(dob dobVar, Continuation continuation) {
        super(2, continuation);
        this.o = dobVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        znb znbVar = (znb) l((ww3) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        znbVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new znb(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        yy7[] yy7VarArr = dob.A0;
        this.o.c();
        return qqg.a;
    }
}
