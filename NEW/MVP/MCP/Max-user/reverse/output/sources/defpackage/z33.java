package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class z33 extends dtf implements sm6 {
    public final /* synthetic */ b43 X;
    public final /* synthetic */ long Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z33(b43 b43Var, long j, Continuation continuation) {
        super(2, continuation);
        this.X = b43Var;
        this.Y = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((z33) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new z33(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            vsf vsfVar = (vsf) this.X.E0.getValue();
            this.o = 1;
            Object objA = vsfVar.a(this.Y, this);
            g84 g84Var = g84.a;
            if (objA == g84Var) {
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
