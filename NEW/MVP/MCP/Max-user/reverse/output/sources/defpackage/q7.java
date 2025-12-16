package defpackage;

import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class q7 {
    public final u5i a;
    public final String b;

    public q7(u5i u5iVar) {
        String lowerCase;
        List list = r7.d;
        if (u5iVar == null) {
            lowerCase = "null";
        } else {
            lowerCase = ((String) u5iVar.b).toLowerCase(Locale.ROOT);
            if (r7.d.contains(lowerCase)) {
                lowerCase = u45.k((String) u5iVar.a, ":", lowerCase);
            }
        }
        this.a = u5iVar;
        this.b = lowerCase;
    }
}
