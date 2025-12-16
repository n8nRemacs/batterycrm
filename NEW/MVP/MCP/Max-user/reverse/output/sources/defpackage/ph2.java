package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class ph2 implements iu3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ph2(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    @Override // defpackage.iu3
    public final void accept(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                qh2 qh2Var = (qh2) obj2;
                Collection collection = (Collection) obj;
                qh2Var.getClass();
                wqi.c("qh2", "ValidateMessagesTimeUseCase found some items for delete, size = %d", Integer.valueOf(collection.size()));
                qh2Var.h.b(new nh2(qh2Var, this.b, collection, 0));
                break;
            default:
                bsd bsdVar = (bsd) obj2;
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    bsdVar.g((wjb) it.next(), this.b);
                }
                break;
        }
    }
}
