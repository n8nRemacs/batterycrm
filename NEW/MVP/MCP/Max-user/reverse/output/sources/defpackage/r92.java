package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class r92 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ z26 Y;
    public final /* synthetic */ t92 Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r92(z26 z26Var, t92 t92Var, Continuation continuation) {
        super(2, continuation);
        this.Y = z26Var;
        this.Z = t92Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((r92) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        r92 r92Var = new r92(this.Y, this.Z, continuation);
        r92Var.X = obj;
        return r92Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        int i = this.o;
        qqg qqgVar = qqg.a;
        if (i == 0) {
            g8j.b(obj);
            ccd ccdVarM = this.Z.m((f84) this.X);
            this.o = 1;
            Object objA = mw0.a(this.Y, ccdVarM, true, this);
            g84 g84Var = g84.a;
            if (objA != g84Var) {
                objA = qqgVar;
            }
            if (objA == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        return qqgVar;
    }
}
