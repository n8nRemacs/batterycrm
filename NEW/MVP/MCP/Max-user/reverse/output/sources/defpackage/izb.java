package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class izb extends xfh {
    public static final /* synthetic */ yy7[] Z;
    public final tcf X = ucf.a(null);
    public final t9f Y = c7j.c();
    public final long b;
    public final s5i c;
    public final s5i d;
    public final k18 o;

    static {
        z8a z8aVar = new z8a(izb.class, "searchJob", "getSearchJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        Z = new yy7[]{z8aVar};
    }

    public izb(long j, s5i s5iVar, s5i s5iVar2, k18 k18Var) {
        this.b = j;
        this.c = s5iVar;
        this.d = s5iVar2;
        this.o = k18Var;
        if (((AtomicBoolean) s5iVar.g).compareAndSet(false, true)) {
            svi.e((ContextScope) s5iVar.f, null, null, new ve9(s5iVar, null), 3);
        }
        gw0.w(new g56((jve) s5iVar2.l, new fzb(this, null), 1), this.a);
    }

    public static final ArrayList t(izb izbVar, List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            fxb fxbVar = (fxb) obj;
            pb2 pb2Var = (pb2) ((w63) izbVar.o.getValue()).j(izbVar.b).a.getValue();
            if (pb2Var != null) {
                ArrayList arrayListL = pb2Var.l();
                if (!arrayListL.isEmpty()) {
                    Iterator it = arrayListL.iterator();
                    while (it.hasNext()) {
                        if (((ku3) it.next()).p() == fxbVar.a) {
                            break;
                        }
                    }
                }
            }
            arrayList.add(obj);
        }
        return arrayList;
    }
}
