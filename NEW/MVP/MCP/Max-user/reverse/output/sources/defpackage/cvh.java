package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class cvh extends dtf implements sm6 {
    public final /* synthetic */ uvh X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvh(uvh uvhVar, Continuation continuation) {
        super(2, continuation);
        this.X = uvhVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((cvh) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new cvh(this.X, continuation);
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
        this.o = 1;
        uvh uvhVar = this.X;
        tcf tcfVar = uvhVar.L0;
        Boolean bool = Boolean.FALSE;
        tcfVar.m(null, bool);
        uvhVar.M0.m(null, bool);
        uvhVar.G0 = null;
        Iterator it = ((List) uvhVar.J0.d).iterator();
        while (it.hasNext()) {
            ((cw7) it.next()).d(null);
        }
        Object objI = svi.i(((q2b) uvhVar.w()).b(), new evh(uvhVar, null), this);
        g84 g84Var = g84.a;
        if (objI != g84Var) {
            objI = qqgVar;
        }
        return objI == g84Var ? g84Var : qqgVar;
    }
}
