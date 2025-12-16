package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class zjc extends dtf implements sm6 {
    public final /* synthetic */ long X;
    public final /* synthetic */ hkc Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zjc(long j, hkc hkcVar, Continuation continuation) {
        super(2, continuation);
        this.X = j;
        this.Y = hkcVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((zjc) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new zjc(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            if (this.X == r8b.o0) {
                ccb ccbVar = (ccb) this.Y.X.getValue();
                ccbVar.g(new n5g(u8b.q1));
                ccbVar.i();
            }
            this.o = 1;
            Object objC = s8j.c(250L, this);
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
        return qqg.a;
    }
}
