package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
public final /* synthetic */ class m7e implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Collection c;
    public final /* synthetic */ Collection d;

    public /* synthetic */ m7e(List list, Collection collection, Collection collection2, int i) {
        this.a = i;
        this.b = list;
        this.c = collection;
        this.d = collection2;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean zContains;
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.b;
                Set set = (Set) this.c;
                Set set2 = (Set) this.d;
                u6e u6eVar = (u6e) obj;
                pb2 pb2Var = u6eVar.d;
                ku3 ku3Var = u6eVar.o;
                if (pb2Var != null) {
                    zContains = set.contains(Long.valueOf(pb2Var.a));
                } else {
                    if (ku3Var == null) {
                        return true;
                    }
                    if (jqi.a(arrayList, new t00(ku3Var.p(), 14))) {
                        return false;
                    }
                    zContains = set2.contains(Long.valueOf(ku3Var.p()));
                }
                return true ^ zContains;
            default:
                return o7e.f((jqc) obj, this.b, (List) this.c, (List) this.d);
        }
    }
}
