package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class wi8 extends dtf implements sm6 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ xi8 Z;
    public long o;
    public final /* synthetic */ long s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wi8(xi8 xi8Var, long j, Continuation continuation) {
        super(2, continuation);
        this.Z = xi8Var;
        this.s0 = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((wi8) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        wi8 wi8Var = new wi8(this.Z, this.s0, continuation);
        wi8Var.Y = obj;
        return wi8Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        f84 f84Var;
        long j;
        lg8 lg8Var = lg8.d;
        g84 g84Var = g84.a;
        int i = this.X;
        if (i == 0) {
            g8j.b(obj);
            f84 f84Var2 = (f84) this.Y;
            int i2 = s65.d;
            long jI = v9j.i(System.nanoTime(), y65.NANOSECONDS);
            String name = f84Var2.getClass().getName();
            long j2 = this.s0;
            l6b l6bVar = wqi.a;
            if (l6bVar != null && l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, name, "process ".concat(s65.n(s65.k(jI, j2))), null);
            }
            ni8 ni8Var = (ni8) this.Z.c.getValue();
            this.Y = f84Var2;
            this.o = jI;
            this.X = 1;
            if (ni8Var.a(this) == g84Var) {
                return g84Var;
            }
            f84Var = f84Var2;
            j = jI;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.o;
            f84Var = (f84) this.Y;
            g8j.b(obj);
        }
        ((qi8) this.Z.d.getValue()).a.updateAndGet(new lk2(7));
        String name2 = f84Var.getClass().getName();
        l6b l6bVar2 = wqi.a;
        if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
            int i3 = s65.d;
            l6bVar2.c(lg8Var, name2, "process finish ".concat(s65.n(s65.k(v9j.i(System.nanoTime(), y65.NANOSECONDS), j))), null);
        }
        return qqg.a;
    }
}
