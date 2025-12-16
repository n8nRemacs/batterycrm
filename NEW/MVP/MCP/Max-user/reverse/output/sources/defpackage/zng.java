package defpackage;

import java.util.Arrays;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class zng extends dtf implements sm6 {
    public final /* synthetic */ eog X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zng(eog eogVar, Continuation continuation) {
        super(2, continuation);
        this.X = eogVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((zng) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new zng(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object objA;
        eog eogVar = this.X;
        ci5 ci5Var = eogVar.x0;
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            xfh.r(ci5Var, new mmg(true));
            w7b w7bVar = eogVar.o;
            String str = eogVar.b;
            rp7 rp7Var = eogVar.d;
            this.o = 1;
            objA = w7bVar.a(str, rp7Var, this);
            g84 g84Var = g84.a;
            if (objA == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            objA = ((kpd) obj).a;
        }
        Throwable thA = kpd.a(objA);
        qqg qqgVar = qqg.a;
        if (thA != null) {
            xfh.r(ci5Var, new lmg(0, 6, vmi.d(thA)));
            return qqgVar;
        }
        g8j.b(objA);
        int iA = e8j.a(((Number) objA).longValue(), (pb3) eogVar.Y.getValue());
        xfh.r(ci5Var, new lmg(ivd.m, 4, new l5g(ys.D(Arrays.copyOf(new Object[]{new Integer(iA)}, 1)), w1d.oneme_settings_twofa_delete_user_days_notif, iA)));
        return qqgVar;
    }
}
