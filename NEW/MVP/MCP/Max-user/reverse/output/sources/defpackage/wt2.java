package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class wt2 extends dtf implements sm6 {
    public final /* synthetic */ bu2 X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ boolean Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wt2(bu2 bu2Var, long j, boolean z, Continuation continuation) {
        super(2, continuation);
        this.X = bu2Var;
        this.Y = j;
        this.Z = z;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((wt2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new wt2(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        qqg qqgVar = qqg.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return qqgVar;
        }
        g8j.b(obj);
        bu2 bu2Var = this.X;
        Long lJ = bu2Var.j();
        if (lJ != null) {
            long jLongValue = lJ.longValue();
            kt4 kt4Var = (kt4) bu2Var.n.getValue();
            long j = bu2Var.a;
            List listSingletonList = Collections.singletonList(new Long(this.Y));
            this.o = 1;
            kt4Var.a(j, jLongValue, listSingletonList, this.Z);
            g84 g84Var = g84.a;
            if (qqgVar == g84Var) {
                return g84Var;
            }
        }
        return qqgVar;
    }
}
