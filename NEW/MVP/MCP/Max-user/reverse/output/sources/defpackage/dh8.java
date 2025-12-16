package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.errors.TamErrorException;

/* loaded from: classes2.dex */
public final class dh8 extends dtf implements sm6 {
    public final /* synthetic */ eh8 X;
    public final /* synthetic */ gh8 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dh8(eh8 eh8Var, gh8 gh8Var, Continuation continuation) {
        super(2, continuation);
        this.X = eh8Var;
        this.Y = gh8Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((dh8) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new dh8(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        dh8 dh8Var;
        TamErrorException tamErrorException;
        yh8 yh8Var;
        long j;
        gh8 gh8Var;
        long j2;
        g84 g84Var = g84.a;
        int i = this.o;
        try {
            if (i == 0) {
                g8j.b(obj);
                try {
                    tm tmVar = this.X.c;
                    if (tmVar == null) {
                        tmVar = null;
                    }
                    yh8Var = (yh8) tmVar.k.getValue();
                    eh8 eh8Var = this.X;
                    j = eh8Var.a;
                    gh8Var = this.Y;
                    j2 = eh8Var.o;
                    this.o = 1;
                    dh8Var = this;
                } catch (TamErrorException e) {
                    e = e;
                    dh8Var = this;
                }
                try {
                    if (yh8Var.e(j, gh8Var, j2, dh8Var) == g84Var) {
                        return g84Var;
                    }
                } catch (TamErrorException e2) {
                    e = e2;
                    tamErrorException = e;
                    dh8Var.X.e(tamErrorException.a);
                    return qqg.a;
                } catch (Throwable unused) {
                    String str = dh8Var.X.x0;
                    l6b l6bVar = wqi.a;
                    if (l6bVar != null) {
                        lg8 lg8Var = lg8.Y;
                        if (l6bVar.b(lg8Var)) {
                            l6bVar.c(lg8Var, str, "beans.loginLogic.onLogin fail", null);
                        }
                    }
                    tm tmVar2 = dh8Var.X.c;
                    di8 di8Var = (tmVar2 != null ? tmVar2 : null).a;
                    bi8 bi8Var = bi8.LOGIN_UNKNOWN;
                    di8Var.getClass();
                    di8.o(bi8Var);
                    return qqg.a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    g8j.b(obj);
                } catch (TamErrorException e3) {
                    tamErrorException = e3;
                    dh8Var = this;
                    dh8Var.X.e(tamErrorException.a);
                    return qqg.a;
                }
            }
        } catch (Throwable unused2) {
            dh8Var = this;
        }
        return qqg.a;
    }
}
