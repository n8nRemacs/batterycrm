package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class te9 extends dtf implements sm6 {
    public final /* synthetic */ s5i X;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public te9(Object obj, Continuation continuation, s5i s5iVar) {
        super(2, continuation);
        this.o = obj;
        this.X = s5iVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((te9) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new te9(this.o, continuation, this.X);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        pb2 pb2Var = (pb2) this.o;
        myb mybVar = (myb) ((bwf) this.X.e).getValue();
        ku3 ku3VarN = pb2Var.n();
        if (ku3VarN != null) {
            return mybVar.a(ku3VarN);
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
