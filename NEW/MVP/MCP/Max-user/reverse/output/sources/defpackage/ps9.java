package defpackage;

import java.util.Collections;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ps9 extends dtf implements sm6 {
    public final /* synthetic */ vu9 X;
    public final /* synthetic */ sj3 Y;
    public final /* synthetic */ long Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ps9(vu9 vu9Var, sj3 sj3Var, long j, Continuation continuation) {
        super(2, continuation);
        this.X = vu9Var;
        this.Y = sj3Var;
        this.Z = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ps9) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ps9(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        qqg qqgVar = qqg.a;
        vu9 vu9Var = this.X;
        g84 g84Var = g84.a;
        if (i == 0) {
            g8j.b(obj);
            ei9 ei9Var = (ei9) vu9Var.O0.getValue();
            this.o = 1;
            ei9Var.getClass();
            Object objA = ei9Var.a(this.Y, Collections.singletonList(new Long(this.Z)), this);
            if (objA != g84Var) {
                objA = qqgVar;
            }
            if (objA != g84Var) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return qqgVar;
        }
        g8j.b(obj);
        wl8 wl8VarC = ((q2b) vu9Var.X).c();
        os9 os9Var = new os9(vu9Var, null);
        this.o = 2;
        return svi.i(wl8VarC, os9Var, this) == g84Var ? g84Var : qqgVar;
    }
}
