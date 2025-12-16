package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class v5j {
    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final List b(qtb qtbVar) throws IOException {
        Object next;
        List list = qtbVar.f;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Long) next).longValue() > 0) {
                break;
            }
        }
        if (next != null) {
            return list;
        }
        List<String> list2 = qtbVar.e;
        ArrayList arrayList = new ArrayList(we3.q(list2, 10));
        for (String str : list2) {
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (Character.isDigit(cCharAt)) {
                    sb.append(cCharAt);
                }
            }
            Long lI = cnf.i(sb.toString());
            arrayList.add(Long.valueOf(lI != null ? lI.longValue() : 0L));
        }
        return arrayList;
    }
}
