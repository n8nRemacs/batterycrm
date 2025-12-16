package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class egf implements tm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ igf b;
    public final /* synthetic */ List c;

    public /* synthetic */ egf(igf igfVar, List list, int i) {
        this.a = i;
        this.b = igfVar;
        this.c = list;
    }

    @Override // defpackage.tm6
    public final Object apply(Object obj) {
        int i = this.a;
        List list = this.c;
        igf igfVar = this.b;
        int i2 = 0;
        List list2 = (List) obj;
        switch (i) {
            case 0:
                if (list2.isEmpty()) {
                    return e2f.g(list);
                }
                i66 i66VarA = i66.a(e2f.g(list), igfVar.d(list2));
                ifi.c(Integer.MAX_VALUE, "maxConcurrency");
                return new m66(new w66(i66VarA), new kn6(new ArrayList(list2.size() + list.size())), new ycd(21));
            default:
                return new m2f(vqa.i(list).g(new oh2(22, list2)).s(), new egf(igfVar, list2, i2), 0);
        }
    }
}
