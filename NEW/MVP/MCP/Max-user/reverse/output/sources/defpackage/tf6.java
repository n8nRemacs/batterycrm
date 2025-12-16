package defpackage;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class tf6 extends dtf implements sm6 {
    public final /* synthetic */ uf6 X;
    public final /* synthetic */ vf6 Y;
    public final /* synthetic */ List Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf6(uf6 uf6Var, vf6 vf6Var, List list, Continuation continuation) {
        super(2, continuation);
        this.X = uf6Var;
        this.Y = vf6Var;
        this.Z = list;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((tf6) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new tf6(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        vf6 vf6Var = this.Y;
        uf6 uf6Var = this.X;
        if (i == 0) {
            g8j.b(obj);
            zs6 zs6Var = (zs6) uf6Var.a.getValue();
            this.o = 1;
            obj = zs6Var.b(vf6Var, this);
            g84 g84Var = g84.a;
            if (obj == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        List list = (List) obj;
        if (!list.isEmpty()) {
            CharSequence charSequence = vf6Var.d;
            o98 o98VarD = ve3.d();
            if (charSequence != null && !vmf.F(charSequence)) {
                o98VarD.add(new lhe(new jhe(0L, charSequence.toString(), true, ((ft6) uf6Var.c.getValue()).a(null, charSequence))));
            }
            o98VarD.addAll(list);
            o98 o98VarA = ve3.a(o98VarD);
            Iterator it = this.Z.iterator();
            while (it.hasNext()) {
                lge lgeVar = new lge(((Number) it.next()).longValue(), new LinkedList(o98VarA), 2);
                lgeVar.d = true;
                ((c6i) uf6Var.b.getValue()).b(new ihe(lgeVar));
            }
        }
        return qqg.a;
    }
}
