package defpackage;

import java.util.Comparator;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class c1g implements Comparator {
    public final /* synthetic */ Iterable a;
    public final /* synthetic */ tm6 b;

    public /* synthetic */ c1g(List list, tm6 tm6Var) {
        this.a = list;
        this.b = tm6Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        tm6 tm6Var = this.b;
        int i = -1;
        int i2 = -1;
        int i3 = 0;
        for (Long l : this.a) {
            try {
                if (l.equals(tm6Var.apply(obj))) {
                    i = i3;
                } else if (l.equals(tm6Var.apply(obj2))) {
                    i2 = i3;
                }
                if (i != -1 && i2 != -1) {
                    break;
                }
                i3++;
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }
}
