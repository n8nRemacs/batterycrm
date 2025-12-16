package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class s96 extends dtf implements sm6 {
    public final /* synthetic */ ca6 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s96(ca6 ca6Var, Continuation continuation) {
        super(2, continuation);
        this.X = ca6Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((s96) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new s96(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g84 g84Var = g84.a;
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            f86 f86Var = this.X.E0;
            Iterable iterable = (Iterable) this.X.C0.get();
            ArrayList arrayList = new ArrayList(we3.q(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(new Long(((pb2) it.next()).b.a));
            }
            AbstractCollection abstractCollectionG = arrayList;
            abstractCollectionG = arrayList;
            if (this.X.b != null && f86Var != null) {
                abstractCollectionG = gke.g(f86Var.o, arrayList);
            }
            z74 z74VarB = ((q2b) this.X.d).b();
            r96 r96Var = new r96(abstractCollectionG, this.X, null);
            this.o = 1;
            obj = svi.i(z74VarB, r96Var, this);
            if (obj == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        xfh.r(this.X.B0, new d96((List) obj));
        return qqg.a;
    }
}
