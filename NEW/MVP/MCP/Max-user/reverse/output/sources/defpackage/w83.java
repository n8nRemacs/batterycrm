package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.MainDispatcherLoader;

/* loaded from: classes2.dex */
public final class w83 extends dtf implements sm6 {
    public /* synthetic */ int X;
    public final /* synthetic */ a93 Y;
    public final /* synthetic */ jl8 Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w83(a93 a93Var, jl8 jl8Var, Continuation continuation) {
        super(2, continuation);
        this.Y = a93Var;
        this.Z = jl8Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((w83) l(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        w83 w83Var = new w83(this.Y, this.Z, continuation);
        w83Var.X = ((Number) obj).intValue();
        return w83Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        qqg qqgVar = qqg.a;
        g84 g84Var = g84.a;
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            int i2 = this.X;
            String str = (String) this.Y.Z;
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.d;
                if (l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, str, ho7.f(i2, "onNewActivityFlow "), null);
                }
            }
            kz8 kz8Var = (kz8) this.Y.a;
            List list = (List) this.Z.invoke();
            this.o = 1;
            kz8Var.getClass();
            ep4 ep4Var = gy4.a;
            Object objI = svi.i(MainDispatcherLoader.dispatcher.getImmediate(), new r8(kz8Var, list, null), this);
            if (objI != g84Var) {
                objI = qqgVar;
            }
            if (objI == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        return qqgVar;
    }
}
