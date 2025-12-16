package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class rw9 extends dtf implements em6 {
    public final /* synthetic */ yw9 X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ long o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rw9(long j, yw9 yw9Var, long j2, Continuation continuation) {
        super(1, continuation);
        this.o = j;
        this.X = yw9Var;
        this.Y = j2;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        yw9 yw9Var = this.X;
        long j = this.Y;
        return new rw9(this.o, yw9Var, j, (Continuation) obj).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        long j = this.o;
        long j2 = this.Y;
        yw9 yw9Var = this.X;
        if (j == -1) {
            return yw9Var.n.g(j2);
        }
        n8a n8aVar = (n8a) yw9Var.n.d(j2);
        if (n8aVar != null) {
            return Boolean.valueOf(n8aVar.l(j));
        }
        return null;
    }
}
