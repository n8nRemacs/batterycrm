package defpackage;

import android.net.Uri;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ci4 {
    public final LinkedHashMap a = new LinkedHashMap();

    public ci4(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            di4 di4Var = (di4) it.next();
            Iterator it2 = di4Var.a().a.iterator();
            while (it2.hasNext()) {
                this.a.put((gi4) it2.next(), di4Var);
            }
        }
    }

    public final imb a(Uri uri) {
        String strA = oi4.a(uri);
        for (Map.Entry entry : this.a.entrySet()) {
            gi4 gi4Var = (gi4) entry.getKey();
            di4 di4Var = (di4) entry.getValue();
            if (oi4.a(gi4Var.a).equals(strA)) {
                return new imb(gi4Var, di4Var);
            }
        }
        return null;
    }
}
