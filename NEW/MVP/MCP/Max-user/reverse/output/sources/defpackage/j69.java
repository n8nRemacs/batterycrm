package defpackage;

import android.content.ComponentName;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j69 {
    public final b69 a;
    public final ArrayList b = new ArrayList();
    public final a3b c;
    public c69 d;

    public j69(b69 b69Var) {
        this.a = b69Var;
        this.c = b69Var.b;
    }

    public final k69 a(String str) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((k69) arrayList.get(i)).b.equals(str)) {
                return (k69) arrayList.get(i);
            }
        }
        return null;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + ((ComponentName) this.c.b).getPackageName() + " }";
    }
}
