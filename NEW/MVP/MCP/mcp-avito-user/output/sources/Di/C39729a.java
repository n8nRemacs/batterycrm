package di;

import Y61.k;
import Y61.l;
import com.avito.android.util.C35755b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import lj.InterfaceC43779a;
import lj.InterfaceC43780b;
import lj.c;

/* compiled from: ComponentsFormParamsFetcherImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldi/a;", "Llj/c;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: di.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C39729a implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC43780b f394025a;

    @Inject
    public C39729a(@k InterfaceC43780b interfaceC43780b) {
        this.f394025a = interfaceC43780b;
    }

    @Override // lj.c
    @k
    public final LinkedHashMap a(@l Map map) {
        LinkedHashMap linkedHashMapB;
        if (map == null) {
            map = P0.c();
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Map map2 = (Map) entry.getValue();
            InterfaceC43779a interfaceC43779a = this.f394025a.get(str);
            if (interfaceC43779a == null) {
                linkedHashMapB = null;
            } else if (map2.isEmpty()) {
                linkedHashMapB = interfaceC43779a.getParameters();
            } else {
                LinkedHashMap parameters = interfaceC43779a.getParameters();
                LinkedHashMap linkedHashMap = new LinkedHashMap(P0.f(parameters.size()));
                for (Map.Entry entry2 : parameters.entrySet()) {
                    linkedHashMap.put((String) map2.get((String) entry2.getKey()), entry2.getValue());
                }
                linkedHashMapB = C35755b0.b(linkedHashMap);
            }
            if (linkedHashMapB != null) {
                arrayList.add(linkedHashMapB);
            }
        }
        return C35755b0.d(arrayList);
    }

    @Override // lj.c
    @k
    public final Map<String, Object> b() {
        Object obj;
        List<InterfaceC43779a> all = this.f394025a.getAll();
        ArrayList arrayList = new ArrayList(C42745f0.q(all, 10));
        Iterator<T> it = all.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC43779a) it.next()).getParameters());
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            Object next = it2.next();
            while (it2.hasNext()) {
                next = P0.k((Map) next, (Map) it2.next());
            }
            obj = next;
        } else {
            obj = null;
        }
        Map<String, Object> map = (Map) obj;
        return map == null ? P0.c() : map;
    }

    @Override // lj.c
    @k
    public final Map c(@k List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC43779a interfaceC43779a = this.f394025a.get((String) it.next());
            if (interfaceC43779a != null) {
                arrayList.add(interfaceC43779a);
            }
        }
        return com.avito.android.beduin.common.form.k.a(arrayList, null);
    }

    @Override // lj.c
    @k
    public final Map<String, Object> d(@l List<String> list) {
        return com.avito.android.beduin.common.form.k.a(this.f394025a.getAll(), list);
    }
}
