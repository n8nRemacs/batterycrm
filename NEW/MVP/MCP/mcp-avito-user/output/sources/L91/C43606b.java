package l91;

import Y61.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import m91.InterfaceC43936c;

/* compiled from: GsonFactory.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ll91/b;", "", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: l91.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C43606b {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final InterfaceC43936c f413571a;

    public C43606b() {
        this(null, 1, null);
    }

    public static void a(com.google.gson.d dVar, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C43608d c43608d = (C43608d) it.next();
            Object obj = c43608d.f413575b;
            if (obj != null) {
                dVar.b(c43608d.f413574a, obj);
            }
        }
    }

    public static LinkedHashMap b(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(P0.f(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((C43608d) entry.getValue()).f413574a);
        }
        return linkedHashMap;
    }

    public C43606b(InterfaceC43936c interfaceC43936c, int i12, C42822w c42822w) {
        this.f413571a = (i12 & 1) != 0 ? null : interfaceC43936c;
    }
}
