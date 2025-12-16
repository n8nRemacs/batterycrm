package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class a5a extends dtf implements sm6 {
    public final /* synthetic */ b5a X;
    public final /* synthetic */ m8a Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5a(b5a b5aVar, m8a m8aVar, Continuation continuation) {
        super(2, continuation);
        this.X = b5aVar;
        this.Y = m8aVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((a5a) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new a5a(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            b5a b5aVar = this.X;
            tm tmVar = b5aVar.c;
            if (tmVar == null) {
                tmVar = null;
            }
            em9 em9Var = (em9) tmVar.J.getValue();
            long j = b5aVar.d;
            this.o = 1;
            Object objE = em9Var.e(j, this.Y, this);
            g84 g84Var = g84.a;
            if (objE == g84Var) {
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
