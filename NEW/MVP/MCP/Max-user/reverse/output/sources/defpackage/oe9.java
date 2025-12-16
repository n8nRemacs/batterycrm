package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class oe9 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ s5i Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oe9(s5i s5iVar, Continuation continuation) {
        super(2, continuation);
        this.Y = s5iVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((oe9) l((List) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        oe9 oe9Var = new oe9(this.Y, continuation);
        oe9Var.X = obj;
        return oe9Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        s5i s5iVar;
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            List list = (List) this.X;
            n8a n8aVar = new n8a(list.size());
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                s5iVar = this.Y;
                if (!zHasNext) {
                    break;
                }
                ku3 ku3Var = (ku3) it.next();
                fxb fxbVarA = (!n8aVar.a(ku3Var.p()) || ku3Var.X) ? null : ((myb) ((bwf) s5iVar.e).getValue()).a(ku3Var);
                if (fxbVarA != null) {
                    arrayList.add(fxbVarA);
                }
            }
            ((v04) ((k18) s5iVar.c).getValue()).c(arrayList, new wm7(17));
            jve jveVar = (jve) s5iVar.l;
            this.o = 1;
            Object objA = jveVar.a(arrayList, this);
            g84 g84Var = g84.a;
            if (objA == g84Var) {
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
