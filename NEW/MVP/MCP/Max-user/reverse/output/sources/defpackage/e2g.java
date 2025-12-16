package defpackage;

import bolts.Task;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class e2g implements p44 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e2g(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.p44
    public final Object a(Task task) {
        switch (this.a) {
            case 0:
                d2g d2gVar = (d2g) this.b;
                d2gVar.getClass();
                o2g o2gVar = d2gVar.b;
                if (task.isCancelled()) {
                    o2gVar.a();
                    return null;
                }
                if (task.isFaulted()) {
                    o2gVar.b(task.getError());
                    return null;
                }
                o2gVar.c(task.getResult());
                return null;
            default:
                Collection collection = (Collection) this.b;
                if (collection.size() == 0) {
                    return Collections.EMPTY_LIST;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Task) it.next()).getResult());
                }
                return arrayList;
        }
    }
}
