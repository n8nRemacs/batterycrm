package org.mockito.internal.invocation;

import com.avito.android.advert.item.blocks.items_factories.C28081y0;
import e81.InterfaceC39968b;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* compiled from: InvocationsFinder.java */
/* loaded from: classes7.dex */
public class j {
    public static List<InterfaceC39968b> a(List<InterfaceC39968b> list, e81.g gVar) {
        Stream<InterfaceC39968b> stream = list.stream();
        Objects.requireNonNull(gVar);
        return (List) stream.filter(new C28081y0(gVar, 21)).collect(Collectors.toList());
    }

    public static LinkedList b(List list) {
        LinkedList linkedList = new LinkedList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedList.add(((InterfaceC39968b) it.next()).j());
        }
        return linkedList;
    }
}
