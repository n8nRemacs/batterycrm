package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class jy5 extends dtf implements sm6 {
    public /* synthetic */ float X;
    public final /* synthetic */ sac Y;
    public final /* synthetic */ ty5 Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jy5(sac sacVar, ty5 ty5Var, Continuation continuation) {
        super(2, continuation);
        this.Y = sacVar;
        this.Z = ty5Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((jy5) l(Float.valueOf(((Number) obj).floatValue()), (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        jy5 jy5Var = new jy5(this.Y, this.Z, continuation);
        jy5Var.X = ((Number) obj).floatValue();
        return jy5Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            kpd kpdVar = new kpd(new hvg(this.X * 100.0f, this.Z.k, null));
            this.o = 1;
            Object objH = ((pac) this.Y).a.h(kpdVar, this);
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
