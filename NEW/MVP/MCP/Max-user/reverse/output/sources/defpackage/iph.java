package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class iph extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ jph Y;
    public final /* synthetic */ eph Z;
    public int o;
    public final /* synthetic */ tsh s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iph(eph ephVar, jph jphVar, tsh tshVar, Continuation continuation) {
        super(2, continuation);
        this.Y = jphVar;
        this.Z = ephVar;
        this.s0 = tshVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((iph) l((Throwable) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        iph iphVar = new iph(this.Z, this.Y, this.s0, continuation);
        iphVar.X = obj;
        return iphVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            Throwable th = (Throwable) this.X;
            jph jphVar = this.Y;
            jphVar.getClass();
            dph dphVar = th instanceof dph ? (dph) th : null;
            aw7 yv7Var = dphVar == null ? zv7.d : new yv7(new bw7(dphVar.a, dphVar.b));
            xh3 xh3Var = (xh3) jphVar.b.getValue();
            pv0 pv0Var = jphVar.d;
            String str = this.s0.a;
            this.o = 1;
            Object objA = xh3Var.a(pv0Var, yv7Var, this.Z, str, this);
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
