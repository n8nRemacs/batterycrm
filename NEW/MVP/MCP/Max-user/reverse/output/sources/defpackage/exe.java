package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class exe extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ fxe Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public exe(fxe fxeVar, Continuation continuation) {
        super(2, continuation);
        this.Y = fxeVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((exe) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        exe exeVar = new exe(this.Y, continuation);
        exeVar.X = obj;
        return exeVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        f84 f84Var;
        fxe fxeVar = this.Y;
        String str = fxeVar.t0;
        int i = this.o;
        qqg qqgVar = qqg.a;
        if (i == 0) {
            g8j.b(obj);
            f84Var = (f84) this.X;
            if (((fxa) fxeVar.b.getValue()).b() && d7j.f(f84Var)) {
                this.X = f84Var;
                this.o = 1;
                obj = d7j.d(new cxe(fxeVar, null), this);
                g84 g84Var = g84.a;
                if (obj == g84Var) {
                    return g84Var;
                }
            }
            return qqgVar;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f84Var = (f84) this.X;
        g8j.b(obj);
        List list = (List) obj;
        d7j.e(f84Var);
        if (list.isEmpty()) {
            fxeVar.b();
        } else {
            try {
                bxe.j(fxeVar.a, list);
                return qqgVar;
            } catch (IllegalArgumentException e) {
                wqi.e(str, "max count is exceeded or updating immutable shortcuts", e);
            } catch (IllegalStateException e2) {
                wqi.e(str, "user is locked", e2);
            }
        }
        return qqgVar;
    }
}
