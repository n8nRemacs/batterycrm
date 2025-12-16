package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class gc2 extends dtf implements sm6 {
    public final /* synthetic */ hc2 X;
    public final /* synthetic */ List Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc2(hc2 hc2Var, List list, Continuation continuation) {
        super(2, continuation);
        this.X = hc2Var;
        this.Y = list;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((gc2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new gc2(this.X, this.Y, continuation);
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
        pb2 pb2VarT = this.X.t();
        if (pb2VarT != null) {
            ContextScope contextScopeA = d7j.a(this.b);
            List list = this.Y;
            ArrayList arrayList = new ArrayList(we3.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(svi.b(contextScopeA, null, new fc2(it.next(), null, this.X, pb2VarT, list), 3));
            }
            this.o = 1;
            Object objB = hui.b(arrayList, this);
            g84 g84Var = g84.a;
            if (objB == g84Var) {
                return g84Var;
            }
        }
        return qqgVar;
    }
}
