package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ea6 extends dtf implements sm6 {
    public final /* synthetic */ fa6 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea6(fa6 fa6Var, Continuation continuation) {
        super(2, continuation);
        this.X = fa6Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ea6) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ea6(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        qqg qqgVar = qqg.a;
        g84 g84Var = g84.a;
        int i = this.o;
        try {
            if (i == 0) {
                g8j.b(obj);
                fa6 fa6Var = this.X;
                String str = (String) fa6Var.a;
                l6b l6bVar = wqi.a;
                if (l6bVar != null) {
                    lg8 lg8Var = lg8.d;
                    if (l6bVar.b(lg8Var)) {
                        l6bVar.c(lg8Var, str, vb9.e(((pe8) ((va4) ((k18) fa6Var.c).getValue()).g()).H(), "Started retrieving folders from server, current sync="), null);
                    }
                }
                bc6 bc6Var = new bc6(((pe8) ((va4) ((k18) this.X.c).getValue()).g()).H());
                hwa hwaVar = (hwa) ((k18) this.X.b).getValue();
                this.o = 1;
                obj = hwaVar.F(bc6Var, this);
                if (obj == g84Var) {
                    return g84Var;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g8j.b(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            obj = new ipd(th);
        }
        fa6 fa6Var2 = this.X;
        if (kpd.a(obj) != null) {
            String str2 = (String) fa6Var2.a;
            l6b l6bVar2 = wqi.a;
            if (l6bVar2 != null) {
                lg8 lg8Var2 = lg8.Y;
                if (l6bVar2.b(lg8Var2)) {
                    l6bVar2.c(lg8Var2, str2, "Got error on retrieving folders", null);
                }
            }
        }
        if (obj instanceof ipd) {
            obj = null;
        }
        cc6 cc6Var = (cc6) obj;
        if (cc6Var == null) {
            return qqgVar;
        }
        va4 va4Var = (va4) ((k18) this.X.c).getValue();
        svi.e(va4Var.Z, null, null, new ma4(va4Var, cc6Var.c, cc6Var.o, cc6Var.d, null), 3);
        return qqgVar;
    }
}
