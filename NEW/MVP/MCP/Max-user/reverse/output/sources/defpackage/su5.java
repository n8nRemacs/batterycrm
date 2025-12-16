package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class su5 {
    public final List a;

    public su5(List list) {
        this.a = list;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.a) {
            if (((qu5) obj).a == 3) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }
}
