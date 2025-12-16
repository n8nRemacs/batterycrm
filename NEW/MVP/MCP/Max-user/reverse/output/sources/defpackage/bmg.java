package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class bmg extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ emg Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bmg(emg emgVar, Continuation continuation) {
        super(2, continuation);
        this.Y = emgVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((bmg) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        bmg bmgVar = new bmg(this.Y, continuation);
        bmgVar.X = obj;
        return bmgVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        Object ipdVar;
        tp7 tp7Var;
        int i = this.o;
        qqg qqgVar = qqg.a;
        emg emgVar = this.Y;
        try {
            if (i == 0) {
                g8j.b(obj);
                up7 up7Var = emgVar.X;
                String str = (up7Var == null || (tp7Var = up7Var.c) == null) ? null : tp7Var.a;
                if (str == null || str.length() == 0) {
                    wqi.e(emgVar.Y, "Verify email step: Can't request new code because email is null", null);
                    return qqgVar;
                }
                hwa hwaVar = (hwa) emgVar.t0.getValue();
                wua wuaVar = new wua(emgVar.o, str);
                this.o = 1;
                obj = hwaVar.F(wuaVar, this);
                g84 g84Var = g84.a;
                if (obj == g84Var) {
                    return g84Var;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g8j.b(obj);
            }
            ipdVar = (c80) obj;
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        if (!(ipdVar instanceof ipd)) {
            emgVar.A0.m(null, new Long(((c80) ipdVar).o));
            x9f x9fVar = emgVar.F0;
            if (x9fVar != null) {
                x9fVar.cancel((CancellationException) null);
            }
            emgVar.F0 = null;
            emgVar.F0 = xfh.o(emgVar, null, new dmg(emgVar, null), 3);
        }
        Throwable thA = kpd.a(ipdVar);
        if (thA != null) {
            if (thA instanceof CancellationException) {
                throw thA;
            }
            xfh.r(emgVar.C0, new lmg(0, 6, vmi.d(thA)));
        }
        return qqgVar;
    }
}
