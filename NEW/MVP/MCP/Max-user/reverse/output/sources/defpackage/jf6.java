package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class jf6 {
    public static final vsb a;

    static {
        vsb vsbVarB = bbj.b(new imb(4, if6.a), new imb(3, if6.b), new imb(2, if6.c), new imb(1, if6.d), new imb(0, if6.o));
        a = vsbVarB;
        Set setEntrySet = vsbVarB.entrySet();
        int i = to8.i(we3.q(setEntrySet, 10));
        if (i < 16) {
            i = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(i);
        Iterator it = ((ctb) setEntrySet).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put((if6) entry.getValue(), zxg.C(((Number) entry.getKey()).intValue()));
        }
    }
}
