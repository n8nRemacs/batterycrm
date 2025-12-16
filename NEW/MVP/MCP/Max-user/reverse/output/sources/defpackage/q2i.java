package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class q2i {
    public final ArrayList a;

    public q2i(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final s7c a() {
        Object next;
        s7c s7cVar;
        Iterator it = this.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            l2i l2iVar = (l2i) next;
            k2i k2iVar = l2iVar.a;
            s7c s7cVar2 = l2iVar.b;
            if ((k2iVar == k2i.c && s7cVar2 != null && ((String) s7cVar2.a).length() > 0) || (l2iVar.a == k2i.d && s7cVar2 != null && ((String) s7cVar2.a).length() > 0)) {
                break;
            }
        }
        l2i l2iVar2 = (l2i) next;
        return (l2iVar2 == null || (s7cVar = l2iVar2.b) == null) ? s7c.c : s7cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q2i) && this.a.equals(((q2i) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Widget(contents=" + this.a + ")";
    }
}
