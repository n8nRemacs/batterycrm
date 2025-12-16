package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ht6 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ List Y;
    public final /* synthetic */ pb2 Z;
    public int o;
    public final /* synthetic */ jt6 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ht6(List list, pb2 pb2Var, jt6 jt6Var, Continuation continuation) {
        super(2, continuation);
        this.Y = list;
        this.Z = pb2Var;
        this.s0 = jt6Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ht6) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ht6 ht6Var = new ht6(this.Y, this.Z, this.s0, continuation);
        ht6Var.X = obj;
        return ht6Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws IOException {
        qqg qqgVar = qqg.a;
        g84 g84Var = g84.a;
        int i = this.o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return qqgVar;
        }
        g8j.b(obj);
        f84 f84Var = (f84) this.X;
        if (!this.Y.isEmpty() && this.Z.b.g()) {
            long jB = this.s0.b();
            List list = this.Y;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((si9) obj2).P0 < jB) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(we3.q(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new Long(((si9) it.next()).b));
            }
            d7j.e(f84Var);
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.d;
                if (l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, "jt6", "executeByServerIds " + arrayList2.size() + " " + ue3.N(arrayList2, "[", "]", null, null, 60), null);
                }
            }
            jt6 jt6Var = this.s0;
            pb2 pb2Var = this.Z;
            long j = pb2Var.a;
            long j2 = pb2Var.b.a;
            this.o = 1;
            Object objD = d7j.d(new it6(arrayList2, jt6Var, j, j2, null), this);
            if (objD != g84Var) {
                objD = qqgVar;
            }
            if (objD == g84Var) {
                return g84Var;
            }
        }
        return qqgVar;
    }
}
