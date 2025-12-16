package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class w43 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ k53 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w43(k53 k53Var, Continuation continuation) {
        super(2, continuation);
        this.Y = k53Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((w43) l((ArrayList) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        w43 w43Var = new w43(this.Y, continuation);
        w43Var.X = obj;
        return w43Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        k53 k53Var = this.Y;
        if (i == 0) {
            g8j.b(obj);
            ArrayList arrayList = (ArrayList) this.X;
            k53Var.N0.setValue(arrayList);
            if (k53.t(k53Var, (v03) k53Var.M0.a.getValue())) {
                k53Var.O0.setValue(arrayList);
            }
            int i2 = s65.d;
            long jH = v9j.h(1, y65.MINUTES);
            this.o = 1;
            Object objD = s8j.d(jH, this);
            g84 g84Var = g84.a;
            if (objD == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        k53Var.y();
        return qqg.a;
    }
}
