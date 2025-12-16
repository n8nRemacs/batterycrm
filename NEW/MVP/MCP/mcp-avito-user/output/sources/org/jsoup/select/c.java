package org.jsoup.select;

import a71.C19693c;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Elements.java */
/* loaded from: classes7.dex */
public class c extends ArrayList<org.jsoup.nodes.g> {
    @Override // java.util.ArrayList
    public final Object clone() {
        c cVar = new c(size());
        Iterator<org.jsoup.nodes.g> it = iterator();
        while (it.hasNext()) {
            cVar.add(it.next().clone());
        }
        return cVar;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sbB = C19693c.b();
        Iterator<org.jsoup.nodes.g> it = iterator();
        while (it.hasNext()) {
            org.jsoup.nodes.g next = it.next();
            if (sbB.length() != 0) {
                sbB.append("\n");
            }
            sbB.append(next.w());
        }
        return C19693c.h(sbB);
    }
}
