package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: FakePureImplementationsProvider.kt */
@s0
/* loaded from: classes8.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final o f408295a = new o();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final LinkedHashMap f408296b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final Map<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.name.c> f408297c;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f408296b = linkedHashMap;
        kotlin.reflect.jvm.internal.impl.name.i.f409264a.getClass();
        b(kotlin.reflect.jvm.internal.impl.name.i.f409282s, a("java.util.ArrayList", "java.util.LinkedList"));
        b(kotlin.reflect.jvm.internal.impl.name.i.f409283t, a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        b(kotlin.reflect.jvm.internal.impl.name.i.f409284u, a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        b(kotlin.reflect.jvm.internal.impl.name.b.j(new kotlin.reflect.jvm.internal.impl.name.c("java.util.function.Function")), a("java.util.function.UnaryOperator"));
        b(kotlin.reflect.jvm.internal.impl.name.b.j(new kotlin.reflect.jvm.internal.impl.name.c("java.util.function.BiFunction")), a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new Q(((kotlin.reflect.jvm.internal.impl.name.b) entry.getKey()).b(), ((kotlin.reflect.jvm.internal.impl.name.b) entry.getValue()).b()));
        }
        f408297c = P0.p(arrayList);
    }

    public static ArrayList a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(kotlin.reflect.jvm.internal.impl.name.b.j(new kotlin.reflect.jvm.internal.impl.name.c(str)));
        }
        return arrayList;
    }

    public static void b(kotlin.reflect.jvm.internal.impl.name.b bVar, ArrayList arrayList) {
        for (Object obj : arrayList) {
            f408296b.put(obj, bVar);
        }
    }
}
