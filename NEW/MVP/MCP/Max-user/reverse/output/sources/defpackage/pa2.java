package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class pa2 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ cde Y;
    public final /* synthetic */ Object Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa2(cde cdeVar, Object obj, Continuation continuation) {
        super(2, continuation);
        this.Y = cdeVar;
        this.Z = obj;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((pa2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        pa2 pa2Var = new pa2(this.Y, this.Z, continuation);
        pa2Var.X = obj;
        return pa2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object ipdVar;
        int i = this.o;
        Object la2Var = qqg.a;
        try {
            if (i == 0) {
                g8j.b(obj);
                cde cdeVar = this.Y;
                Object obj2 = this.Z;
                this.o = 1;
                Object objH = cdeVar.h(obj2, this);
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
            ipdVar = la2Var;
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        if (ipdVar instanceof ipd) {
            la2Var = new la2(kpd.a(ipdVar));
        }
        return new na2(la2Var);
    }
}
