package defpackage;

import java.util.LinkedList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class s8h extends dtf implements sm6 {
    public ehe X;
    public int Y;
    public final /* synthetic */ t8h Z;
    public LinkedList o;
    public final /* synthetic */ long s0;
    public final /* synthetic */ Long t0;
    public final /* synthetic */ x6h u0;
    public final /* synthetic */ vf6 v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s8h(t8h t8hVar, long j, Long l, x6h x6hVar, vf6 vf6Var, Continuation continuation) {
        super(2, continuation);
        this.Z = t8hVar;
        this.s0 = j;
        this.t0 = l;
        this.u0 = x6hVar;
        this.v0 = vf6Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((s8h) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new s8h(this.Z, this.s0, this.t0, this.u0, this.v0, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        ehe eheVar;
        LinkedList linkedList;
        int i = this.Y;
        long j = this.s0;
        t8h t8hVar = this.Z;
        g84 g84Var = g84.a;
        if (i == 0) {
            g8j.b(obj);
            uq9 uq9Var = (uq9) t8hVar.c.getValue();
            this.Y = 1;
            obj = uq9Var.a(j, this.t0, this);
            if (obj != g84Var) {
            }
            return g84Var;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eheVar = this.X;
            linkedList = this.o;
            g8j.b(obj);
            linkedList.add(eheVar);
            linkedList.addAll((List) obj);
            ((c6i) t8hVar.b.getValue()).b(new ihe(new lge(j, linkedList, 2)));
            return qqg.a;
        }
        g8j.b(obj);
        LinkedList linkedList2 = new LinkedList();
        x6h x6hVar = this.u0;
        mhe mheVar = new mhe(j, x6hVar);
        mheVar.k = x6hVar.Y;
        mheVar.b = (sk9) obj;
        ehe eheVarA = mheVar.a();
        zs6 zs6Var = (zs6) t8hVar.d.getValue();
        this.o = linkedList2;
        this.X = eheVarA;
        this.Y = 2;
        Object objB = zs6Var.b(this.v0, this);
        if (objB != g84Var) {
            eheVar = eheVarA;
            obj = objB;
            linkedList = linkedList2;
            linkedList.add(eheVar);
            linkedList.addAll((List) obj);
            ((c6i) t8hVar.b.getValue()).b(new ihe(new lge(j, linkedList, 2)));
            return qqg.a;
        }
        return g84Var;
    }
}
