package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class r5f extends dtf implements sm6 {
    public final /* synthetic */ int X;
    public final /* synthetic */ o5f Y;
    public final /* synthetic */ lm7 Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5f(int i, o5f o5fVar, lm7 lm7Var, Continuation continuation) {
        super(2, continuation);
        this.X = i;
        this.Y = o5fVar;
        this.Z = lm7Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((r5f) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new r5f(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            this.o = 1;
            Object objC = s8j.c(this.X * 100, this);
            g84 g84Var = g84.a;
            if (objC == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        this.Y.invoke(this.Z);
        return qqg.a;
    }
}
