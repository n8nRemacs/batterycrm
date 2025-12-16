package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class nn7 extends dtf implements sm6 {
    public final /* synthetic */ x2b X;
    public final /* synthetic */ k18 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nn7(k18 k18Var, x2b x2bVar, Continuation continuation) {
        super(2, continuation);
        this.o = k18Var;
        this.X = x2bVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((nn7) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new nn7(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        String strE = b5j.e((aub) this.o.getValue(), this.X.a);
        if (strE == null) {
            strE = "";
        }
        return new r5g(strE);
    }
}
