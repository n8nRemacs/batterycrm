package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class gvh extends dtf implements sm6 {
    public final /* synthetic */ uvh X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gvh(uvh uvhVar, Continuation continuation) {
        super(2, continuation);
        this.X = uvhVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((gvh) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new gvh(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        uvh uvhVar = this.X;
        ci5 ci5Var = uvhVar.Z0;
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            if (!((Boolean) uvhVar.M0.getValue()).booleanValue()) {
                xfh.r(ci5Var, new fuh(false));
                return qqg.a;
            }
            tcf tcfVar = uvhVar.P0;
            this.o = 1;
            obj = gw0.p(tcfVar, this);
            g84 g84Var = g84.a;
            if (obj == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        xfh.r(ci5Var, new ouh((String) obj));
        return qqg.a;
    }
}
