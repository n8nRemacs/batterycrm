package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class zp6 extends dtf implements sm6 {
    public final /* synthetic */ Set X;
    public final /* synthetic */ tq6 Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zp6(tq6 tq6Var, Set set, Continuation continuation) {
        super(2, continuation);
        this.X = set;
        this.Y = tq6Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        zp6 zp6Var = (zp6) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        zp6Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        zp6 zp6Var = new zp6(this.Y, this.X, continuation);
        zp6Var.o = obj;
        return zp6Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        qqg qqgVar;
        g8j.b(obj);
        f84 f84Var = (f84) this.o;
        ArrayList arrayList = new ArrayList(this.X);
        tq6 tq6Var = this.Y;
        tcf tcfVar = tq6Var.v0;
        Iterable iterable = (Iterable) tcfVar.getValue();
        ArrayList arrayList2 = new ArrayList(we3.q(iterable, 10));
        Iterator it = iterable.iterator();
        boolean z = false;
        while (true) {
            boolean zHasNext = it.hasNext();
            qqgVar = qqg.a;
            if (zHasNext) {
                op6 op6VarB = (op6) it.next();
                if (!d7j.f(f84Var)) {
                    break;
                }
                if (!arrayList.isEmpty()) {
                    Uri uri = op6VarB.c.b;
                    Iterator it2 = arrayList.iterator();
                    int i = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            i = -1;
                            break;
                        }
                        Uri uriC = ((fce) it2.next()).a.c();
                        if (goi.a(uri, uriC) || String.valueOf(uriC).length() > 0) {
                            break;
                        }
                        i++;
                    }
                    if (i != -1) {
                        arrayList.remove(i);
                        int iW = tq6Var.w(op6VarB.c);
                        if (op6VarB.h != iW) {
                            op6VarB = op6.b(op6VarB, null, null, null, iW, false, 0, null, 1983);
                            z = true;
                        }
                    }
                }
                arrayList2.add(op6VarB);
            } else if (d7j.f(f84Var) && z) {
                tcfVar.m(null, arrayList2);
            }
        }
        return qqgVar;
    }
}
