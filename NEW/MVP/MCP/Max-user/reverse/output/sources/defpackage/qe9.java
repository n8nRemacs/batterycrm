package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class qe9 extends dtf implements sm6 {
    public final /* synthetic */ s5i X;
    public final /* synthetic */ String Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qe9(s5i s5iVar, String str, Continuation continuation) {
        super(2, continuation);
        this.X = s5iVar;
        this.Y = str;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((qe9) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new qe9(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            s5i s5iVar = this.X;
            z41 z41Var = new z41(new d53((tcf) s5iVar.i, 20), (tcf) s5iVar.h, new uh1(s5iVar, this.Y, null, 3), 3);
            oe9 oe9Var = new oe9(s5iVar, null);
            this.o = 1;
            Object objH = gw0.h(z41Var, oe9Var, this);
            g84 g84Var = g84.a;
            if (objH == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        return qqg.a;
    }
}
