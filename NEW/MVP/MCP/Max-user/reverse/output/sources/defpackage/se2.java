package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.BiConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class se2 implements BiConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ se2(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                n8a n8aVar = (n8a) this.c;
                ArrayList arrayList = (ArrayList) this.b;
                pb2 pb2Var = (pb2) obj2;
                if (n8aVar.d(((Long) obj).longValue())) {
                    arrayList.add(pb2Var);
                    break;
                }
                break;
            case 1:
                Collection collection = (Collection) this.c;
                ArrayList arrayList2 = (ArrayList) this.b;
                pb2 pb2Var2 = (pb2) obj2;
                if (collection.contains((Long) obj)) {
                    arrayList2.add(pb2Var2);
                    break;
                }
                break;
            default:
                Collection collection2 = (Collection) this.c;
                us usVar = (us) this.b;
                Long l = (Long) obj;
                ku3 ku3Var = (ku3) obj2;
                if (collection2.contains(l)) {
                    usVar.put(l, ku3Var);
                    break;
                }
                break;
        }
    }
}
