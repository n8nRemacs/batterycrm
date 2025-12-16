package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes.dex */
public final class e4f {
    public final ArrayList a = new ArrayList();

    public final void a(ca3 ca3Var) {
        c(ca3Var.a().getCanonicalName());
    }

    public final void b(jy7... jy7VarArr) {
        ArrayList arrayList = new ArrayList();
        for (jy7 jy7Var : jy7VarArr) {
            String canonicalName = ((aa3) jy7Var).a().getCanonicalName();
            if (canonicalName != null) {
                arrayList.add(canonicalName);
            }
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.a.add(ue3.E(ys.D((String[]) Arrays.copyOf(strArr, strArr.length))));
    }

    public final void c(String str) {
        if (str == null) {
            return;
        }
        this.a.add(Collections.singletonList(str));
    }
}
