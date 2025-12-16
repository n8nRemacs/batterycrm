package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class pmh extends dtf implements sm6 {
    public final /* synthetic */ tmh X;
    public final /* synthetic */ po0 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pmh(tmh tmhVar, po0 po0Var, Continuation continuation) {
        super(2, continuation);
        this.X = tmhVar;
        this.Y = po0Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((pmh) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new pmh(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        pmh pmhVar;
        tmh tmhVar = this.X;
        k18 k18Var = tmhVar.h;
        int i = this.o;
        qqg qqgVar = qqg.a;
        g84 g84Var = g84.a;
        if (i == 0) {
            g8j.b(obj);
            qlh qlhVar = (qlh) k18Var.getValue();
            long j = tmhVar.a;
            long j2 = tmhVar.b;
            this.o = 1;
            pmhVar = this;
            obj = qlhVar.a(j, j2, pmhVar);
            if (obj != g84Var) {
            }
            return g84Var;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return qqgVar;
        }
        g8j.b(obj);
        pmhVar = this;
        umh umhVar = (umh) obj;
        String str = umhVar != null ? umhVar.d : null;
        if (str == null || str.length() == 0) {
            pmhVar.Y.b(new anh());
            return qqgVar;
        }
        if (umhVar != null) {
            umh umhVarA = umh.a(umhVar, false, false, 55);
            qlh qlhVar2 = (qlh) k18Var.getValue();
            pmhVar.o = 2;
            if (k7j.b(qlhVar2.a, new plh(qlhVar2, umhVarA, 1), this) == g84Var) {
                return g84Var;
            }
        }
        return qqgVar;
    }
}
