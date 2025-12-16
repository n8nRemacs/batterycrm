package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class ne7 {
    public static final Object d = ipi.b(1, new i77(3));
    public int a;
    public ArrayList b;
    public final ln4 c = new ln4();

    public ne7() {
        a();
    }

    public final void a() {
        this.a = this.c.a;
        ArrayList arrayList = this.b;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.a = Math.max(this.a, ((le7) it.next()).b());
            }
        }
    }
}
