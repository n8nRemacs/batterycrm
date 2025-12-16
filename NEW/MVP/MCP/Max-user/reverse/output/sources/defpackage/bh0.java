package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class bh0 {
    public CopyOnWriteArrayList a;

    public static void a(List list) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            throw ctd.h(it);
        }
    }
}
