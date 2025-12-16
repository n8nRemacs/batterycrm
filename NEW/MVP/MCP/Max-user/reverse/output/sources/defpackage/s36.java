package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class s36 extends dtf implements sm6 {
    public final /* synthetic */ sac X;
    public final /* synthetic */ Object Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s36(sac sacVar, Object obj, Continuation continuation) {
        super(2, continuation);
        this.X = sacVar;
        this.Y = obj;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((s36) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new s36(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            this.o = 1;
            Object objH = ((pac) this.X).a.h(this.Y, this);
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
