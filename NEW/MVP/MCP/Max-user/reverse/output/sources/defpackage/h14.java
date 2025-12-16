package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class h14 extends dtf implements sm6 {
    public final /* synthetic */ yyb X;
    public final /* synthetic */ long Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h14(yyb yybVar, long j, Continuation continuation) {
        super(2, continuation);
        this.X = yybVar;
        this.Y = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((h14) l((nx3) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        h14 h14Var = new h14(this.X, this.Y, continuation);
        h14Var.o = obj;
        return h14Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        nx3 nx3Var = (nx3) this.o;
        int iV = az1.v(this.X.c);
        long j = this.Y;
        Object obj2 = null;
        if (iV != 1) {
            if (iV == 2) {
                List list = nx3Var.c;
                if (list == null) {
                    return null;
                }
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((xx3) next).a == j) {
                        obj2 = next;
                        break;
                    }
                }
                return (xx3) obj2;
            }
            if (iV != 3 && iV != 4) {
                return null;
            }
        }
        List list2 = nx3Var.a;
        if (list2 == null) {
            return null;
        }
        Iterator it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (((xx3) next2).a == j) {
                obj2 = next2;
                break;
            }
        }
        return (xx3) obj2;
    }
}
