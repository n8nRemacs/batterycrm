package defpackage;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.serialization.MissingFieldException;

/* loaded from: classes.dex */
public abstract class g5j {
    public static final boolean a(ssb ssbVar, String str) {
        Long l = (Long) ((Map) ((AtomicReference) ((bwf) ssbVar.c).getValue()).get()).get(str);
        return l != null && System.currentTimeMillis() < l.longValue();
    }

    public static final void b(nn8 nn8Var, String str, Long l) {
        Long lValueOf;
        if (l.longValue() <= 0) {
            lValueOf = null;
        } else {
            lValueOf = Long.valueOf(l.longValue() + System.currentTimeMillis());
        }
        nn8Var.put(str, lValueOf);
    }

    public static final void c(int i, int i2, ree reeVar) {
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(reeVar.g(i4));
            }
            i3 >>>= 1;
        }
        String strA = reeVar.a();
        throw new MissingFieldException(arrayList, arrayList.size() == 1 ? "Field '" + ((String) arrayList.get(0)) + "' is required for type with serial name '" + strA + "', but it was missing" : "Fields " + arrayList + " are required for type with serial name '" + strA + "', but they were missing", null);
    }
}
