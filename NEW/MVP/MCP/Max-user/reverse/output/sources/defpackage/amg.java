package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.errors.TamErrorException;

/* loaded from: classes2.dex */
public final class amg extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CharSequence Y;
    public final /* synthetic */ emg Z;
    public int o;
    public final /* synthetic */ CharSequence s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amg(CharSequence charSequence, emg emgVar, CharSequence charSequence2, Continuation continuation) {
        super(2, continuation);
        this.Y = charSequence;
        this.Z = emgVar;
        this.s0 = charSequence2;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((amg) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        amg amgVar = new amg(this.Y, this.Z, this.s0, continuation);
        amgVar.X = obj;
        return amgVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        Object ipdVar;
        n5g n5gVar;
        Object objF;
        emg emgVar = this.Z;
        String str = emgVar.o;
        ci5 ci5Var = emgVar.C0;
        tcf tcfVar = emgVar.w0;
        int i = this.o;
        qqg qqgVar = qqg.a;
        CharSequence charSequence = this.Y;
        try {
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        if (i == 0) {
            g8j.b(obj);
            if (charSequence != null) {
                yy7[] yy7VarArr = emg.O0;
                j5g j5gVar = (emgVar.v().a <= 0 || charSequence.length() >= emgVar.v().a) ? null : new j5g(w1d.oneme_settings_twofa_creation_password_error_symbols_count, emgVar.v().a);
                n5g n5gVar2 = !dnf.k(charSequence, this.s0) ? new n5g(r4d.oneme_settings_twofa_error_passwords_equals) : null;
                if (j5gVar == null && n5gVar2 == null) {
                    xfh.r(ci5Var, new mmg(true));
                    hwa hwaVar = (hwa) emgVar.t0.getValue();
                    String string = charSequence.toString();
                    wua wuaVar = new wua(xhb.H0, 19);
                    wuaVar.x("trackId", str);
                    wuaVar.x("password", string);
                    this.o = 1;
                    objF = hwaVar.F(wuaVar, this);
                    g84 g84Var = g84.a;
                    if (objF == g84Var) {
                        return g84Var;
                    }
                } else {
                    Object value = tcfVar.getValue();
                    iog iogVar = value instanceof iog ? (iog) value : null;
                    if (iogVar != null) {
                        tcfVar.m(null, iog.c(iogVar, jog.a(iogVar.b, j5gVar), jog.a(iogVar.c, n5gVar2), 3));
                    }
                }
            }
            return qqgVar;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        g8j.b(obj);
        objF = obj;
        ipdVar = (l0g) objF;
        if (!(ipdVar instanceof ipd)) {
            iog iogVar2 = (iog) tcfVar.getValue();
            tcfVar.m(null, iog.c(iogVar2, jog.a(iogVar2.b, null), jog.a(iogVar2.c, null), 3));
            up7 up7Var = emgVar.X;
            xfh.r(emgVar.D0, new qmg(str, up7Var != null ? up7.a(up7Var, charSequence.toString(), null, null, 30) : new up7(charSequence.toString(), null, null, null, null, 30)));
        }
        Throwable thA = kpd.a(ipdVar);
        if (thA != null) {
            wqi.e(emgVar.Y, "Create password step: can't create password", thA);
            if (thA instanceof CancellationException) {
                throw thA;
            }
            if (thA instanceof TamErrorException) {
                iog iogVar3 = (iog) tcfVar.getValue();
                pzf pzfVar = ((TamErrorException) thA).a;
                if (vmi.e(pzfVar)) {
                    tcfVar.m(null, iog.c(iogVar3, jog.a(iogVar3.b, vmi.c(pzfVar)), jog.a(iogVar3.c, null), 3));
                    xfh.r(ci5Var, new mmg(false));
                } else {
                    xfh.r(ci5Var, new lmg(0, 6, vmi.c(pzfVar)));
                }
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
        }
        return qqgVar;
    }
}
