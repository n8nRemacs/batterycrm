package HX0;

import AK.c;
import android.util.SparseArray;
import com.google.android.datatransport.Priority;
import j.N;
import java.util.HashMap;

/* compiled from: PriorityMapping.java */
/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseArray<Priority> f7135a = new SparseArray<>();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap<Priority, Integer> f7136b;

    static {
        HashMap<Priority, Integer> map = new HashMap<>();
        f7136b = map;
        map.put(Priority.f342916b, 0);
        map.put(Priority.f342917c, 1);
        map.put(Priority.f342918d, 2);
        for (Priority priority : map.keySet()) {
            f7135a.append(f7136b.get(priority).intValue(), priority);
        }
    }

    public static int a(@N Priority priority) {
        Integer num = f7136b.get(priority);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + priority);
    }

    @N
    public static Priority b(int i12) {
        Priority priority = f7135a.get(i12);
        if (priority != null) {
            return priority;
        }
        throw new IllegalArgumentException(c.g(i12, "Unknown Priority for value "));
    }
}
