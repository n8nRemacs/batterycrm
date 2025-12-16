package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class lq6 extends dtf implements sm6 {
    public final /* synthetic */ fce X;
    public final /* synthetic */ tq6 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lq6(tq6 tq6Var, fce fceVar, Continuation continuation) {
        super(2, continuation);
        this.o = tq6Var;
        this.X = fceVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        lq6 lq6Var = (lq6) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        lq6Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new lq6(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        fce fceVar;
        int i;
        Uri uri;
        String path;
        g8j.b(obj);
        tq6 tq6Var = this.o;
        tcf tcfVar = tq6Var.v0;
        Iterator it = ((List) tcfVar.getValue()).iterator();
        int i2 = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            fceVar = this.X;
            if (!zHasNext) {
                i2 = -1;
                break;
            }
            if (goi.a(((op6) it.next()).c.b, fceVar.a.c())) {
                break;
            }
            i2++;
        }
        Integer num = new Integer(i2);
        if (num.intValue() < 0) {
            num = null;
        }
        qqg qqgVar = qqg.a;
        if (num != null) {
            int iIntValue = num.intValue();
            op6 op6Var = (op6) ((List) tcfVar.getValue()).get(iIntValue);
            zub zubVar = fceVar.c;
            p2h p2hVar = fceVar.b;
            ArrayList arrayList = new ArrayList((Collection) tcfVar.getValue());
            zub zubVar2 = fceVar.c;
            pd8 pd8Var = fceVar.a;
            Uri uri2 = zubVar2 != null ? zubVar2.o : null;
            int i3 = pd8Var.o;
            Uri uri3 = op6Var.l;
            if (zub.b(zubVar, pd8Var)) {
                Uri uriA = zub.a(zubVar, pd8Var);
                if (uriA == null || (path = uriA.getPath()) == null || path.equals(pd8Var.c)) {
                    i = 0;
                } else {
                    i = 0;
                    uri = uriA;
                    arrayList.set(iIntValue, op6.b(op6Var, zubVar, p2hVar, uri2, 0, false, i, uri, 455));
                    tcfVar.m(null, arrayList);
                    xfh.r(tq6Var.X.c, new gp6(pqi.b(tq6Var.E0)));
                }
            } else {
                i = i3;
            }
            uri = uri3;
            arrayList.set(iIntValue, op6.b(op6Var, zubVar, p2hVar, uri2, 0, false, i, uri, 455));
            tcfVar.m(null, arrayList);
            xfh.r(tq6Var.X.c, new gp6(pqi.b(tq6Var.E0)));
        }
        return qqgVar;
    }
}
