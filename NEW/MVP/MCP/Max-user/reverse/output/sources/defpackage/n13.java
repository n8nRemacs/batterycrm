package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class n13 extends dtf implements sm6 {
    public final /* synthetic */ z13 X;
    public final /* synthetic */ r03 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n13(z13 z13Var, r03 r03Var, Continuation continuation) {
        super(2, continuation);
        this.X = z13Var;
        this.Y = r03Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((n13) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new n13(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            p03 p03Var = (p03) this.Y;
            this.o = 1;
            Object objA = z13.a(this.X, p03Var, this);
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
