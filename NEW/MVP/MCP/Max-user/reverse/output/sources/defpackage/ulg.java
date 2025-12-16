package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ulg extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ emg Y;
    public final /* synthetic */ up7 Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ulg(emg emgVar, up7 up7Var, Continuation continuation) {
        super(2, continuation);
        this.Y = emgVar;
        this.Z = up7Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ulg) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ulg ulgVar = new ulg(this.Y, this.Z, continuation);
        ulgVar.X = obj;
        return ulgVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        Object ipdVar;
        int i = this.o;
        emg emgVar = this.Y;
        try {
            if (i == 0) {
                g8j.b(obj);
                o98 o98VarD = ve3.d();
                o98VarD.add(xjg.RESTORE_PASSWORD);
                up7 up7Var = this.Z;
                String str = up7Var.b;
                if (str != null && str.length() != 0) {
                    o98VarD.add(xjg.HINT);
                }
                o98 o98VarA = ve3.a(o98VarD);
                String str2 = up7Var.a;
                if (str2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                hwa hwaVar = (hwa) emgVar.t0.getValue();
                wua wuaVar = new wua(emgVar.o, o98VarA, str2, up7Var.b, 16);
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
        Throwable thA = kpd.a(ipdVar);
        qqg qqgVar = qqg.a;
        if (thA == null) {
            emgVar.N0 = null;
            xfh.r(emgVar.D0, rmg.a);
            return qqgVar;
        }
        emgVar.N0 = null;
        if (thA instanceof CancellationException) {
            throw thA;
        }
        wqi.p(emgVar.Y, "Can't finish restore twoFA", thA);
        xfh.r(emgVar.C0, new lmg(0, 6, vmi.d(thA)));
        return qqgVar;
    }
}
