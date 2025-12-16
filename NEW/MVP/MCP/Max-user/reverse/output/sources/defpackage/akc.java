package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class akc extends dtf implements sm6 {
    public final /* synthetic */ hkc X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akc(hkc hkcVar, Continuation continuation) {
        super(2, continuation);
        this.X = hkcVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((akc) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new akc(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            hkc hkcVar = this.X;
            ujc ujcVar = (ujc) hkcVar.y0.getValue();
            this.o = 1;
            Object objT = hkc.t(hkcVar, ujcVar, this);
            g84 g84Var = g84.a;
            if (objT == g84Var) {
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
