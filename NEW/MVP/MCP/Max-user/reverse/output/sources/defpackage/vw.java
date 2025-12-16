package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.messages.list.loader.MessageModel;

/* loaded from: classes2.dex */
public final class vw extends dtf implements sm6 {
    public final /* synthetic */ xw X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vw(xw xwVar, Continuation continuation) {
        super(2, continuation);
        this.X = xwVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((vw) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new vw(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        xw xwVar = this.X;
        bwf bwfVar = xwVar.f;
        bwf bwfVar2 = xwVar.e;
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            if (bwfVar2.e()) {
                ((tde) bwfVar2.getValue()).c();
            }
            if (bwfVar.e()) {
                ((tde) bwfVar.getValue()).c();
            }
            List list = ((hr9) xwVar.y.getValue()).a;
            ArrayList arrayList = new ArrayList(we3.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new Long(((MessageModel) it.next()).a));
            }
            nj9 nj9Var = new nj9(arrayList);
            this.o = 1;
            Object objK = xwVar.k(nj9Var, this);
            g84 g84Var = g84.a;
            if (objK == g84Var) {
                return g84Var;
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
