package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class qef implements tm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tef b;
    public final /* synthetic */ List c;

    public /* synthetic */ qef(tef tefVar, List list, int i) {
        this.a = i;
        this.b = tefVar;
        this.c = list;
    }

    @Override // defpackage.tm6
    public final Object apply(Object obj) {
        int i = this.a;
        List list = this.c;
        tef tefVar = this.b;
        int i2 = 0;
        List list2 = (List) obj;
        switch (i) {
            case 0:
                if (list2.isEmpty()) {
                    return e2f.g(list);
                }
                i66 i66VarA = i66.a(e2f.g(list), tefVar.d(list2));
                ifi.c(Integer.MAX_VALUE, "maxConcurrency");
                return new m66(new w66(i66VarA), new kn6(new ArrayList()), new ycd(21));
            default:
                return new m2f(vqa.i(list).g(new oh2(20, list2)).s(), new qef(tefVar, list2, i2), 0);
        }
    }
}
