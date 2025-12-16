package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class t46 extends dtf implements wm6 {
    public /* synthetic */ Throwable X;
    public /* synthetic */ long Y;
    public final /* synthetic */ long Z;
    public int o;
    public final /* synthetic */ dtf s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t46(long j, sm6 sm6Var, Continuation continuation) {
        super(4, continuation);
        this.Z = j;
        this.s0 = (dtf) sm6Var;
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [dtf, sm6] */
    @Override // defpackage.wm6
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj3).longValue();
        t46 t46Var = new t46(this.Z, this.s0, (Continuation) obj4);
        t46Var.X = (Throwable) obj2;
        t46Var.Y = jLongValue;
        return t46Var.n(qqg.a);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [dtf, sm6] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            Throwable th = this.X;
            if (this.Y < this.Z) {
                this.o = 1;
                obj = this.s0.invoke(th, this);
                g84 g84Var = g84.a;
                if (obj == g84Var) {
                    return g84Var;
                }
            }
            return Boolean.valueOf(z);
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        g8j.b(obj);
        boolean z = ((Boolean) obj).booleanValue();
        return Boolean.valueOf(z);
    }
}
