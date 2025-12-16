package org.mockito.internal.matchers.text;

import V71.i;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: MatchersPrinter.java */
/* loaded from: classes7.dex */
public class c {
    public static Iterator a(List list, W71.c cVar) {
        LinkedList linkedList = new LinkedList();
        Iterator it = list.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            org.mockito.d dVar = (org.mockito.d) it.next();
            if (dVar instanceof i) {
                i iVar = (i) dVar;
                Object objC = iVar.c();
                String simpleName = objC != null ? objC.getClass().getSimpleName() : "";
                String canonicalName = objC != null ? objC.getClass().getCanonicalName() : "";
                if (cVar.f17762a.contains(Integer.valueOf(i12))) {
                    linkedList.add(new a(iVar.a(simpleName)));
                } else if (cVar.f17763b.contains(simpleName)) {
                    linkedList.add(new a(iVar.a(canonicalName)));
                } else {
                    linkedList.add(new a(b.a(dVar)));
                }
            } else {
                linkedList.add(new a(b.a(dVar)));
            }
            i12++;
        }
        return linkedList.iterator();
    }
}
