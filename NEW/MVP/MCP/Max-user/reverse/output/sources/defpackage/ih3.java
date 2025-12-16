package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ih3 extends dtf implements sm6 {
    public final /* synthetic */ kh3 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ih3(kh3 kh3Var, Continuation continuation) {
        super(2, continuation);
        this.X = kh3Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ih3) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ih3(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            this.o = 1;
            Object objB = kh3.b(this.X, this);
            g84 g84Var = g84.a;
            if (objB == g84Var) {
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
