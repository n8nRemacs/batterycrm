package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class j1a extends dtf implements sm6 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ long[] Z;
    public cs4 o;
    public final /* synthetic */ k1a s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1a(k1a k1aVar, Continuation continuation, long[] jArr) {
        super(2, continuation);
        this.Z = jArr;
        this.s0 = k1aVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((j1a) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        j1a j1aVar = new j1a(this.s0, continuation, this.Z);
        j1aVar.Y = obj;
        return j1aVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        cs4 cs4VarB;
        f84 f84Var;
        int i = this.X;
        if (i == 0) {
            g8j.b(obj);
            f84 f84Var2 = (f84) this.Y;
            long[] jArr = this.Z;
            if (jArr.length != 0) {
                k1a k1aVar = this.s0;
                if (k1aVar.i() && d7j.f(f84Var2)) {
                    cs4VarB = svi.b(f84Var2, null, new i1a(k1aVar, null, jArr), 3);
                    ArrayList arrayListT = ys.t(new bs4[]{cs4VarB, null});
                    this.Y = f84Var2;
                    this.o = cs4VarB;
                    this.X = 1;
                    Object objB = hui.b(arrayListT, this);
                    g84 g84Var = g84.a;
                    if (objB == g84Var) {
                        return g84Var;
                    }
                    f84Var = f84Var2;
                }
            }
            return null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        cs4VarB = this.o;
        f84Var = (f84) this.Y;
        g8j.b(obj);
        d7j.e(f84Var);
        jx3 jx3Var = (jx3) cs4VarB.l();
        if (jx3Var != null) {
            return new imb(jx3Var, null);
        }
        return null;
    }
}
