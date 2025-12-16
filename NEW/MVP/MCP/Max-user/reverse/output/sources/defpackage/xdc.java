package defpackage;

import java.util.Arrays;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class xdc extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ zdc Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xdc(zdc zdcVar, Continuation continuation) {
        super(2, continuation);
        this.Y = zdcVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((xdc) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        xdc xdcVar = new xdc(this.Y, continuation);
        xdcVar.X = obj;
        return xdcVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object ipdVar;
        zdc zdcVar = this.Y;
        ci5 ci5Var = zdcVar.Z;
        int i = this.o;
        try {
            if (i == 0) {
                g8j.b(obj);
                xfh.r(ci5Var, new mmg(true));
                hwa hwaVar = (hwa) zdcVar.d.getValue();
                zf8 zf8Var = new zf8();
                this.o = 1;
                obj = hwaVar.F(zf8Var, this);
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
            ipdVar = (fld) obj;
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        Throwable thA = kpd.a(ipdVar);
        qqg qqgVar = qqg.a;
        if (thA != null) {
            wqi.e(zdcVar.b, "Can't get info about profile deletion", null);
            xfh.r(ci5Var, new lmg(0, 6, vmi.d(thA)));
            return qqgVar;
        }
        xfh.r(ci5Var, new mmg(false));
        g8j.b(ipdVar);
        int iA = e8j.a(((fld) ipdVar).c, (pb3) zdcVar.c.getValue());
        zdcVar.X.m(null, new wdc(new l5g(ys.D(Arrays.copyOf(new Object[]{new Integer(iA)}, 1)), w1d.oneme_settings_twofa_delete_user_days_left_description, iA)));
        return qqgVar;
    }
}
