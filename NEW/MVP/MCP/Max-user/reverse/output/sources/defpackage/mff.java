package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class mff extends dtf implements sm6 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ fff Z;
    public int o;
    public final /* synthetic */ off s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mff(fff fffVar, off offVar, Continuation continuation) {
        super(2, continuation);
        this.Z = fffVar;
        this.s0 = offVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((mff) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        mff mffVar = new mff(this.Z, this.s0, continuation);
        mffVar.Y = obj;
        return mffVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v9, types: [boolean, int] */
    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        Object ipdVar;
        int i;
        f84 f84Var;
        off offVar = this.s0;
        ci5 ci5Var = offVar.u0;
        int i2 = this.X;
        fff fffVar = this.Z;
        qqg qqgVar = qqg.a;
        try {
            if (i2 == 0) {
                g8j.b(obj);
                f84Var = (f84) this.Y;
                ?? r2 = !fffVar.s0;
                uk3 uk3VarD = ((ps5) offVar.X.getValue()).d(fffVar.a, r2);
                this.Y = f84Var;
                this.o = r2;
                this.X = 1;
                Object objA = n8j.a(uk3VarD, this);
                g84 g84Var = g84.a;
                i2 = r2;
                if (objA == g84Var) {
                    return g84Var;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i3 = this.o;
                f84Var = (f84) this.Y;
                g8j.b(obj);
                i2 = i3;
            }
            ipdVar = qqgVar;
            i = i2;
        } catch (Throwable th) {
            ipdVar = new ipd(th);
            i = i2;
        }
        if (!(ipdVar instanceof ipd)) {
            offVar.v0.m(null, fff.l(fffVar, i != 0, false, 7167));
            boolean z = i != 0;
            xfh.r(ci5Var, new sye(z ? yud.o : yud.x, z ? new n5g(qdb.e) : new n5g(qdb.f)));
        }
        Throwable thA = kpd.a(ipdVar);
        if (thA != null) {
            if (thA instanceof CancellationException) {
                throw thA;
            }
            wqi.e(f84Var.getClass().getName(), "Can't toggle favorite for selected sticker", thA);
            xfh.r(ci5Var, off.t(offVar, thA));
        }
        offVar.D0 = null;
        return qqgVar;
    }
}
