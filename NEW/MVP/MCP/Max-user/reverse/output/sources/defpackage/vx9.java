package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class vx9 extends dtf implements sm6 {
    public final /* synthetic */ ay9 X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ int Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vx9(ay9 ay9Var, long j, int i, Continuation continuation) {
        super(2, continuation);
        this.X = ay9Var;
        this.Y = j;
        this.Z = i;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((vx9) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new vx9(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        qqg qqgVar = qqg.a;
        g84 g84Var = g84.a;
        int i = this.o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return qqgVar;
        }
        g8j.b(obj);
        String str = this.X.i;
        long j = this.Y;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, vb9.e(j, "Scrolling to requested message with sortTime="), null);
            }
        }
        ay9 ay9Var = this.X;
        long j2 = this.Y;
        int i2 = this.Z;
        this.o = 1;
        ay9.d(ay9Var, j2, 0L, i2, 6);
        return qqgVar == g84Var ? g84Var : qqgVar;
    }
}
