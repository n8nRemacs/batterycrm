package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes.dex */
public final class y extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ a0 Y;
    public pb2 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(a0 a0Var, Continuation continuation) {
        super(2, continuation);
        this.Y = a0Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((y) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new y(this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        pb2 pb2VarN;
        int i = this.X;
        qqg qqgVar = qqg.a;
        a0 a0Var = this.Y;
        if (i == 0) {
            g8j.b(obj);
            w63 w63Var = a0Var.c;
            l5c l5cVar = (l5c) a0Var.b;
            l5cVar.getClass();
            pb2VarN = w63Var.n(l5cVar.m(PmsKey.f148userdebugreport, 0L));
            if (pb2VarN == null) {
                return qqgVar;
            }
            this.o = pb2VarN;
            this.X = 1;
            Object objT = a0.t(a0Var, pb2VarN, this);
            g84 g84Var = g84.a;
            if (objT == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pb2VarN = this.o;
            g8j.b(obj);
        }
        xfh.r(a0Var.X, new t(pb2VarN.a));
        return qqgVar;
    }
}
