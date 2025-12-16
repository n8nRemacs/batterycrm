package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ydc extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ zdc Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ydc(zdc zdcVar, Continuation continuation) {
        super(2, continuation);
        this.Y = zdcVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ydc) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ydc ydcVar = new ydc(this.Y, continuation);
        ydcVar.X = obj;
        return ydcVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object ipdVar;
        n5g n5gVar;
        zdc zdcVar = this.Y;
        ci5 ci5Var = zdcVar.Z;
        int i = this.o;
        try {
            if (i == 0) {
                g8j.b(obj);
                hwa hwaVar = (hwa) zdcVar.d.getValue();
                zf8 zf8Var = new zf8(false, 0);
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
            ipdVar = (eld) obj;
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        Throwable thA = kpd.a(ipdVar);
        qqg qqgVar = qqg.a;
        if (thA != null) {
            wqi.e(zdcVar.b, "Can't cancel profile deletion", null);
            xfh.r(ci5Var, new lmg(0, 6, vmi.d(thA)));
            return qqgVar;
        }
        g8j.b(ipdVar);
        if (((eld) ipdVar).c == 0) {
            xfh.r(ci5Var, new lmg(yud.A, 4, new n5g(r4d.oneme_settings_twofa_delete_user_undo_delete_success)));
            xfh.r(zdcVar.s0, jc3.b);
        } else {
            Object obj2 = qzf.a;
            if (obj2.equals(obj2)) {
                n5gVar = new n5g(mvd.E);
            } else if (obj2.equals(rzf.a)) {
                n5gVar = new n5g(mvd.F);
            } else {
                if (!obj2.equals(szf.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                n5gVar = new n5g(mvd.I);
            }
            xfh.r(ci5Var, new lmg(0, 6, n5gVar));
        }
        return qqgVar;
    }
}
