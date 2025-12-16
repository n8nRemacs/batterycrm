package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ur2 extends dtf implements sm6 {
    public final /* synthetic */ vr2 X;
    public final /* synthetic */ List Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ur2(vr2 vr2Var, List list, Continuation continuation) {
        super(2, continuation);
        this.X = vr2Var;
        this.Y = list;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ur2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ur2(this.X, this.Y, continuation);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, k18] */
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
        vr2 vr2Var = this.X;
        pb2 pb2VarT = vr2Var.t();
        if (pb2VarT != null) {
            kt4 kt4Var = (kt4) vr2Var.Y.getValue();
            long j = vr2Var.b;
            long j2 = pb2VarT.b.a;
            boolean z = vr2Var.u0.get();
            this.o = 1;
            kt4Var.a(j, j2, this.Y, z);
            g84 g84Var = g84.a;
            if (qqgVar == g84Var) {
                return g84Var;
            }
        }
        return qqgVar;
    }
}
