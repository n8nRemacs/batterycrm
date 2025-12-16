package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ixb extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ jxb Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ixb(jxb jxbVar, Continuation continuation) {
        super(2, continuation);
        this.Y = jxbVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ixb) l((Set) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ixb ixbVar = new ixb(this.Y, continuation);
        ixbVar.X = obj;
        return ixbVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            Set set = (Set) this.X;
            boolean zIsEmpty = set.isEmpty();
            jxb jxbVar = this.Y;
            if (zIsEmpty) {
                jxbVar.d.m(null, id5.a);
            } else {
                CharSequence charSequence = (CharSequence) jxbVar.s0.getValue();
                if (charSequence != null && charSequence.length() != 0) {
                    xfh.r(jxbVar.Z, kxb.a);
                }
                lyb lybVar = jxbVar.b;
                ArrayList arrayList = new ArrayList(we3.q(set, 10));
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(lybVar.l(((Number) it.next()).longValue()));
                }
                ka4 ka4Var = new ka4((x26[]) ue3.d0(arrayList).toArray(new x26[0]), 4);
                ir9 ir9Var = new ir9(2, jxbVar.d, f9a.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 7);
                this.o = 1;
                Object objH = gw0.h(ka4Var, ir9Var, this);
                g84 g84Var = g84.a;
                if (objH == g84Var) {
                    return g84Var;
                }
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
