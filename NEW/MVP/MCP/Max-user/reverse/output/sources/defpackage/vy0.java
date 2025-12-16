package defpackage;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;

/* loaded from: classes2.dex */
public abstract class vy0 {
    public static final LinkedHashSet a;

    static {
        LinkedList linkedList = new LinkedList(Arrays.asList(zy0.values()));
        linkedList.remove(zy0.a);
        a = new LinkedHashSet(linkedList);
    }
}
