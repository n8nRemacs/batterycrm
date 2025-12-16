package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class lz7 implements Serializable {
    public final Serializable a;

    public lz7(String str) {
        this.a = str;
    }

    public void a(Object obj, Object obj2) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.a;
        List arrayList = (List) linkedHashMap.get(obj);
        if (arrayList == null) {
            arrayList = new ArrayList();
            linkedHashMap.put(obj, arrayList);
        }
        arrayList.add(obj2);
    }

    public int b() {
        Iterator it = ((LinkedHashMap) this.a).values().iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((List) it.next()).size();
        }
        return size;
    }

    public lz7(jz7 jz7Var) {
        this.a = jz7Var.a;
    }

    public lz7() {
        this.a = new LinkedHashMap();
    }
}
