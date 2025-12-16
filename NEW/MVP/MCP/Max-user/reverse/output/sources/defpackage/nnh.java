package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class nnh extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ aoh Y;
    public final /* synthetic */ jnh Z;
    public int o;
    public final /* synthetic */ jlh s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nnh(jlh jlhVar, jnh jnhVar, aoh aohVar, Continuation continuation) {
        super(2, continuation);
        this.Y = aohVar;
        this.Z = jnhVar;
        this.s0 = jlhVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((nnh) l((Throwable) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        nnh nnhVar = new nnh(this.s0, this.Z, this.Y, continuation);
        nnhVar.X = obj;
        return nnhVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            Throwable th = (Throwable) this.X;
            List list = aoh.i;
            aoh aohVar = this.Y;
            aohVar.getClass();
            aw7 aw7VarF = aoh.f(th);
            xh3 xh3VarG = aohVar.g();
            pv0 pv0Var = aohVar.g;
            String str = this.s0.b;
            this.o = 1;
            Object objA = xh3VarG.a(pv0Var, aw7VarF, this.Z, str, this);
            g84 g84Var = g84.a;
            if (objA == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        return qqg.a;
    }
}
