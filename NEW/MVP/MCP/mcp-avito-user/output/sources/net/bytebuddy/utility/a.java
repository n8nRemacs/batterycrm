package net.bytebuddy.utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: CompoundList.java */
/* loaded from: classes7.dex */
public class a {
    public a() {
        throw new UnsupportedOperationException("This class is a utility class and not supposed to be instantiated");
    }

    public static ArrayList a(List list, List list2) {
        ArrayList arrayList = new ArrayList(list2.size() + list.size());
        arrayList.addAll(list);
        arrayList.addAll(list2);
        return arrayList;
    }

    public static ArrayList b(List list, List list2, List list3) {
        ArrayList arrayList = new ArrayList(list3.size() + list2.size() + list.size());
        arrayList.addAll(list);
        arrayList.addAll(list2);
        arrayList.addAll(list3);
        return arrayList;
    }

    public static <S> List<S> c(S s5, List<? extends S> list) {
        if (list.isEmpty()) {
            return Collections.singletonList(s5);
        }
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.add(s5);
        arrayList.addAll(list);
        return arrayList;
    }

    public static <S> List<S> d(List<? extends S> list, S s5) {
        if (list.isEmpty()) {
            return Collections.singletonList(s5);
        }
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(s5);
        return arrayList;
    }
}
