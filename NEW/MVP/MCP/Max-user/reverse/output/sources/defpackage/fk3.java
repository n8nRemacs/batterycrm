package defpackage;

import android.os.CancellationSignal;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class fk3 extends dtf implements sm6 {
    public final /* synthetic */ gk3 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fk3(gk3 gk3Var, Continuation continuation) {
        super(2, continuation);
        this.X = gk3Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((fk3) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new fk3(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return obj;
        }
        g8j.b(obj);
        gk3 gk3Var = this.X;
        gx9 gx9Var = (gx9) gk3Var.t0.getValue();
        long jLongValue = gk3Var.c.longValue();
        List<Long> listC = ys.C(gk3Var.b);
        this.o = 1;
        lq9 lq9VarD = gx9Var.a.d();
        lq9VarD.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT server_id FROM messages WHERE chat_id = ? AND id in (");
        int size = listC.size();
        lc4.a(sb, size);
        sb.append(")");
        dsd dsdVarC = dsd.c(size + 1, sb.toString());
        dsdVarC.k(1, jLongValue);
        int i2 = 2;
        for (Long l : listC) {
            if (l == null) {
                dsdVarC.S(i2);
            } else {
                dsdVarC.k(i2, l.longValue());
            }
            i2++;
        }
        Object objA = k7j.a(lq9VarD.a, new CancellationSignal(), new jq9(lq9VarD, dsdVarC, 9), this);
        g84 g84Var = g84.a;
        return objA == g84Var ? g84Var : objA;
    }
}
