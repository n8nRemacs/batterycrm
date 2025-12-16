package defpackage;

import java.util.Collections;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ong extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ sng Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ong(sng sngVar, Continuation continuation) {
        super(2, continuation);
        this.Y = sngVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ong) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ong ongVar = new ong(this.Y, continuation);
        ongVar.X = obj;
        return ongVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object ipdVar;
        sng sngVar = this.Y;
        ci5 ci5Var = sngVar.t0;
        int i = this.o;
        try {
            if (i == 0) {
                g8j.b(obj);
                hwa hwaVar = (hwa) sngVar.d.getValue();
                wua wuaVar = new wua(sngVar.b, Collections.singletonList(xjg.REMOVE_2FA), (String) null, (String) null, 12);
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
            ipdVar = (l0g) obj;
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        if (!(ipdVar instanceof ipd)) {
            xfh.r(ci5Var, new alg(yud.A, new n5g(r4d.oneme_settings_twofa_configuration_disable_success)));
            ci5 ci5Var2 = sngVar.s0;
            omg.c.getClass();
            xfh.r(ci5Var2, new ei4(":settings/privacy"));
        }
        Throwable thA = kpd.a(ipdVar);
        if (thA != null) {
            xfh.r(ci5Var, new alg(ivd.a1, vmi.d(thA)));
        }
        return qqg.a;
    }
}
