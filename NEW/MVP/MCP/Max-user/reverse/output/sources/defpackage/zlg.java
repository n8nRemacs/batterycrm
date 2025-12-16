package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.errors.TamErrorException;

/* loaded from: classes2.dex */
public final class zlg extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ emg Y;
    public final /* synthetic */ CharSequence Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zlg(emg emgVar, CharSequence charSequence, Continuation continuation) {
        super(2, continuation);
        this.Y = emgVar;
        this.Z = charSequence;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((zlg) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        zlg zlgVar = new zlg(this.Y, this.Z, continuation);
        zlgVar.X = obj;
        return zlgVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        Object ipdVar;
        n5g n5gVar;
        up7 up7Var;
        Object objF;
        emg emgVar = this.Y;
        ci5 ci5Var = emgVar.D0;
        jlg jlgVar = emgVar.b;
        ci5 ci5Var2 = emgVar.C0;
        String str = emgVar.Y;
        String str2 = emgVar.o;
        int i = this.o;
        qqg qqgVar = qqg.a;
        CharSequence charSequence = this.Z;
        try {
            if (i == 0) {
                g8j.b(obj);
                up7Var = emgVar.X;
                if (up7Var == null) {
                    wqi.e(str, "Create hint step: Can't finish creation because current navData is null", null);
                    return qqgVar;
                }
                if (charSequence == null || charSequence.length() == 0) {
                    int iOrdinal = jlgVar.ordinal();
                    if (iOrdinal == 0) {
                        xfh.r(ci5Var, new pmg(str2, up7.a(up7Var, null, null, null, 29)));
                        return qqgVar;
                    }
                    if (iOrdinal == 1) {
                        emgVar.t(null);
                        return qqgVar;
                    }
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    emgVar.u(null);
                    return qqgVar;
                }
                xfh.r(ci5Var2, new mmg(true));
                hwa hwaVar = (hwa) emgVar.t0.getValue();
                String string = charSequence.toString();
                wua wuaVar = new wua(xhb.I0, 18);
                wuaVar.x("trackId", str2);
                wuaVar.x("hint", string);
                this.X = up7Var;
                this.o = 1;
                objF = hwaVar.F(wuaVar, this);
                g84 g84Var = g84.a;
                if (objF == g84Var) {
                    return g84Var;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                up7Var = (up7) this.X;
                g8j.b(obj);
                objF = obj;
            }
            ipdVar = (l0g) objF;
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        if (!(ipdVar instanceof ipd)) {
            int iOrdinal2 = jlgVar.ordinal();
            if (iOrdinal2 == 0) {
                xfh.r(ci5Var, new pmg(str2, up7.a(up7Var, null, charSequence.toString(), null, 29)));
            } else if (iOrdinal2 == 1) {
                emgVar.t(up7.a(up7Var, null, charSequence.toString(), null, 29));
            } else {
                if (iOrdinal2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                emgVar.u(up7.a(up7Var, null, charSequence.toString(), null, 29));
            }
        }
        Throwable thA = kpd.a(ipdVar);
        if (thA != null) {
            tcf tcfVar = emgVar.w0;
            wqi.e(str, "Create hint step: can't create hint", thA);
            if (thA instanceof CancellationException) {
                throw thA;
            }
            if (thA instanceof TamErrorException) {
                hog hogVar = (hog) tcfVar.getValue();
                pzf pzfVar = ((TamErrorException) thA).a;
                if (vmi.e(pzfVar)) {
                    tcfVar.m(null, hog.c(hogVar, jog.a(hogVar.c, vmi.c(pzfVar))));
                    xfh.r(ci5Var2, new mmg(false));
                } else {
                    xfh.r(ci5Var2, new lmg(0, 6, vmi.c(pzfVar)));
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
                xfh.r(ci5Var2, new lmg(0, 6, n5gVar));
            }
        }
        return qqgVar;
    }
}
