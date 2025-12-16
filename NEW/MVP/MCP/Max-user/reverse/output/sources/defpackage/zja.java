package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class zja extends dtf implements sm6 {
    public final /* synthetic */ cka X;
    public final /* synthetic */ long Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zja(cka ckaVar, long j, Continuation continuation) {
        super(2, continuation);
        this.X = ckaVar;
        this.Y = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((zja) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new zja(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        int i = this.o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return obj;
        }
        g8j.b(obj);
        is6 is6Var = (is6) this.X.f.getValue();
        this.o = 1;
        Comparable comparableA = is6Var.a(this.Y, false, this);
        g84 g84Var = g84.a;
        return comparableA == g84Var ? g84Var : comparableA;
    }
}
