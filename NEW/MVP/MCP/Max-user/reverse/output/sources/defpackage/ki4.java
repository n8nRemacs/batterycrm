package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class ki4 {
    public final LinkedHashSet a = new LinkedHashSet(1);

    public static /* synthetic */ gi4 b(ki4 ki4Var, String str, String[] strArr, Set set, int i) {
        if ((i & 2) != 0) {
            set = null;
        }
        return ki4Var.a(str, strArr, set, (i & 4) != 0 ? 2 : 1, (i & 8) != 0);
    }

    public final gi4 a(String str, String[] strArr, Set set, int i, boolean z) {
        if (!vmf.V(str, ':')) {
            throw new IllegalStateException("invalid route ".concat(str).toString());
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str2 : strArr) {
            arrayList.add(str2.toLowerCase(Locale.ROOT));
        }
        gi4 gi4Var = new gi4(m8j.b(str.toLowerCase(Locale.ROOT)), i, new LinkedHashSet(arrayList), z, set);
        this.a.add(gi4Var);
        return gi4Var;
    }
}
