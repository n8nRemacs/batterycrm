package defpackage;

import java.lang.Thread;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class gei {
    public static final long[] a = {-9187201950435737345L, -1};
    public static final long[] b = new long[0];
    public static final Object[] c = new Object[0];

    public static final Map a(Map map) {
        Object ipdVar;
        try {
            ipdVar = map.keySet();
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        if (ipdVar instanceof ipd) {
            ipdVar = rd5.a;
        }
        zkb zkbVar = new zkb(9, (Iterable) ipdVar);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = ((Iterable) zkbVar.b).iterator();
        while (it.hasNext()) {
            Thread.State state = ((Thread) it.next()).getState();
            Object sidVar = linkedHashMap.get(state);
            if (sidVar == null && !linkedHashMap.containsKey(state)) {
                sidVar = new sid();
            }
            sid sidVar2 = (sid) sidVar;
            sidVar2.a++;
            linkedHashMap.put(state, sidVar2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if ((entry instanceof my7) && !(entry instanceof py7)) {
                uog.k(entry, "kotlin.collections.MutableMap.MutableEntry");
                throw null;
            }
            entry.setValue(Integer.valueOf(((sid) entry.getValue()).a));
        }
        uog.c(linkedHashMap);
        return linkedHashMap;
    }

    public static final j37 b(List list) {
        Object next;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(((j37) next) instanceof i37)) {
                break;
            }
        }
        return (j37) next;
    }

    public static final j37 c(List list) {
        Object objPrevious;
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            if (!(((j37) objPrevious) instanceof i37)) {
                break;
            }
        }
        return (j37) objPrevious;
    }
}
