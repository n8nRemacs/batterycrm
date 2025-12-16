package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class k34 {
    public final HashMap a;
    public final ArrayList b;

    public k34(j34 j34Var) {
        this.a = j34Var.a;
        this.b = j34Var.b;
    }

    public void a(Object obj, String str) {
        obj.getClass();
        this.a.put(str, obj);
        this.b.remove(str);
    }

    public k34() {
        this.a = new HashMap();
        this.b = new ArrayList();
    }
}
