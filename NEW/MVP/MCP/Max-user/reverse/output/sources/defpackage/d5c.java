package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class d5c {
    public final ArrayList a;

    public d5c(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        af3.v(arrayList, iterable);
        this.a = arrayList;
    }

    public final uch a(int i) {
        ArrayList arrayList = this.a;
        if (i < arrayList.size()) {
            return (uch) arrayList.get(i);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d5c) {
            ArrayList arrayList = this.a;
            d5c d5cVar = (d5c) obj;
            if (arrayList.size() == d5cVar.a.size()) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (fni.a(arrayList.get(i), d5cVar.a.get(i))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = this.a.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((uch) it.next()).hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        ArrayList arrayList = this.a;
        return wy1.e(arrayList.size(), "Playlist size: ", ue3.N(arrayList, ", ", " [", "]", new dga(24), 24));
    }
}
