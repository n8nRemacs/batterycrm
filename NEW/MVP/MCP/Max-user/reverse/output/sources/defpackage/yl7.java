package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class yl7 implements kz7 {
    public final ArrayList a;
    public final String b;

    public yl7(xl7 xl7Var) {
        this.a = xl7Var.a;
        this.b = xl7Var.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(kz7 kz7Var) {
        if (kz7Var != null) {
            yl7 yl7Var = (yl7) kz7Var;
            if (l8g.a(yl7Var.b, this.b)) {
                ArrayList arrayList = yl7Var.a;
                ArrayList arrayList2 = this.a;
                if (arrayList2.size() == arrayList.size()) {
                    for (int i = 0; i < arrayList2.size(); i++) {
                        ex0 ex0Var = (ex0) arrayList2.get(i);
                        if (ex0Var.size() == ((ex0) arrayList.get(i)).size()) {
                            for (int i2 = 0; i2 < ex0Var.size(); i2++) {
                                if (((yw0) ex0Var.get(i2)).equals(((ex0) arrayList.get(i)).get(i2))) {
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
