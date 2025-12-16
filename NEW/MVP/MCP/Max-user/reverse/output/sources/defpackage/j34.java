package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class j34 {
    public HashMap a = new HashMap();
    public ArrayList b = new ArrayList();

    public void a(me7 me7Var, le7 le7Var, je7 je7Var) {
        if (this.b == null) {
            this.b = new ArrayList();
        }
        this.b.add(le7Var);
        if (this.a == null) {
            this.a = new HashMap();
        }
        this.a.put(me7Var, je7Var);
    }

    public void b(Object obj, String str) {
        HashMap map = this.a;
        obj.getClass();
        map.put(str, obj);
        this.b.remove(str);
    }
}
