package ci;

import Ui.InterfaceC15523b;
import Y61.k;
import com.avito.android.beduin.common.component.parameters_payload.BeduinParametersPayloadModel;
import com.avito.android.beduin.common.form.c;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_shared.model.utils.q;
import com.avito.android.util.C35755b0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import lj.InterfaceC43779a;
import oj.InterfaceC44784a;

/* compiled from: ComponentsFormAggregatorImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lci/b;", "Lci/a;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ci.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C27198b implements InterfaceC27197a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.beduin.common.form.store.b f58104a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC15523b<BeduinAction> f58105b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC44784a<BeduinModel> f58106c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final LinkedHashMap f58107d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    @k
    public final LinkedHashMap f58108e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    @k
    public final LinkedHashMap f58109f = new LinkedHashMap();

    public C27198b(@k com.avito.android.beduin.common.form.store.b bVar, @k InterfaceC15523b<BeduinAction> interfaceC15523b, @k InterfaceC44784a<BeduinModel> interfaceC44784a) {
        this.f58104a = bVar;
        this.f58105b = interfaceC15523b;
        this.f58106c = interfaceC44784a;
    }

    @Override // ci.InterfaceC27197a
    public final void a(@k c cVar) {
        this.f58107d.put(cVar.f103350r, P0.k(q.a(cVar.e(), this.f58106c), cVar.f103349q));
    }

    @Override // ci.InterfaceC27197a
    @k
    /* renamed from: b, reason: from getter */
    public final LinkedHashMap getF58109f() {
        return this.f58109f;
    }

    @Override // ci.InterfaceC27197a
    public final void c(@k c cVar) {
        InterfaceC44784a<BeduinModel> interfaceC44784a;
        LinkedHashMap linkedHashMap;
        Iterator it;
        Iterator it2;
        List arrayList;
        Set<String> setKeySet;
        ArrayList arrayListE = cVar.e();
        LinkedHashMap linkedHashMap2 = this.f58108e;
        String str = cVar.f103350r;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayListE) {
            if (obj instanceof BeduinParametersPayloadModel) {
                arrayList2.add(obj);
            }
        }
        linkedHashMap2.put(str, arrayList2);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        String str2 = cVar.f103350r;
        com.avito.android.beduin.common.form.store.b bVar = this.f58104a;
        Iterator<T> it3 = bVar.getAll().iterator();
        while (true) {
            boolean zHasNext = it3.hasNext();
            interfaceC44784a = this.f58106c;
            if (!zHasNext) {
                break;
            }
            InterfaceC43779a interfaceC43779a = (InterfaceC43779a) it3.next();
            linkedHashMap3.put(interfaceC43779a.getF103350r(), P0.k(q.a(L.f(interfaceC43779a.getF103350r(), str2) ? arrayListE : interfaceC43779a.e(), interfaceC44784a), interfaceC43779a.getF103349q()));
        }
        ArrayList arrayList3 = new ArrayList(linkedHashMap3.size());
        Iterator it4 = linkedHashMap3.entrySet().iterator();
        while (it4.hasNext()) {
            arrayList3.add((Map) ((Map.Entry) it4.next()).getValue());
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(C35755b0.d(arrayList3));
        boolean z12 = false;
        while (true) {
            linkedHashMap = this.f58109f;
            if (L.f(linkedHashMap, linkedHashMap4)) {
                break;
            }
            linkedHashMap.clear();
            linkedHashMap.putAll(linkedHashMap4);
            linkedHashMap4.clear();
            for (InterfaceC43779a interfaceC43779a2 : bVar.getAll()) {
                LinkedHashMap linkedHashMapK = P0.k(q.a(interfaceC43779a2.e(), interfaceC44784a), interfaceC43779a2.getF103349q());
                linkedHashMap3.put(interfaceC43779a2.getF103350r(), linkedHashMapK);
                linkedHashMap4.putAll(linkedHashMapK);
            }
            z12 = true;
        }
        Collection collectionValues = linkedHashMap2.values();
        boolean z13 = collectionValues instanceof Collection;
        LinkedHashMap linkedHashMap5 = this.f58107d;
        if (!z13 || !collectionValues.isEmpty()) {
            Iterator it5 = collectionValues.iterator();
            while (it5.hasNext()) {
                if (!((List) it5.next()).isEmpty()) {
                    ArrayList arrayList4 = new ArrayList(linkedHashMap5.size());
                    Iterator it6 = linkedHashMap5.entrySet().iterator();
                    while (it6.hasNext()) {
                        arrayList4.add((Map) ((Map.Entry) it6.next()).getValue());
                    }
                    LinkedHashMap linkedHashMapD = C35755b0.d(arrayList4);
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it7 = linkedHashMap2.entrySet().iterator();
                    while (it7.hasNext()) {
                        Iterable iterable = (Iterable) ((Map.Entry) it7.next()).getValue();
                        ArrayList arrayList6 = new ArrayList();
                        for (Object obj2 : iterable) {
                            if (obj2 instanceof BeduinParametersPayloadModel) {
                                arrayList6.add(obj2);
                            }
                        }
                        ArrayList arrayList7 = new ArrayList();
                        Iterator it8 = arrayList6.iterator();
                        while (it8.hasNext()) {
                            BeduinParametersPayloadModel beduinParametersPayloadModel = (BeduinParametersPayloadModel) it8.next();
                            Map<String, List<BeduinAction>> onParametersUpdateActions = beduinParametersPayloadModel.getOnParametersUpdateActions();
                            if (onParametersUpdateActions == null || (setKeySet = onParametersUpdateActions.keySet()) == null) {
                                it = it7;
                                it2 = it8;
                                arrayList = C42784z0.f406748b;
                            } else {
                                ArrayList arrayList8 = new ArrayList();
                                for (Object obj3 : setKeySet) {
                                    Iterator it9 = it7;
                                    String str3 = (String) obj3;
                                    Iterator it10 = it8;
                                    if (!L.f(linkedHashMap.get(str3), linkedHashMapD.get(str3))) {
                                        arrayList8.add(obj3);
                                    }
                                    it7 = it9;
                                    it8 = it10;
                                }
                                it = it7;
                                it2 = it8;
                                arrayList = new ArrayList();
                                Iterator it11 = arrayList8.iterator();
                                while (it11.hasNext()) {
                                    List<BeduinAction> list = beduinParametersPayloadModel.getOnParametersUpdateActions().get((String) it11.next());
                                    if (list == null) {
                                        list = C42784z0.f406748b;
                                    }
                                    C42745f0.h(list, arrayList);
                                }
                            }
                            C42745f0.h(arrayList, arrayList7);
                            it7 = it;
                            it8 = it2;
                        }
                        C42745f0.h(arrayList7, arrayList5);
                    }
                    String str4 = cVar.f103350r;
                    Map mapC = (Map) linkedHashMap3.get(str4);
                    if (mapC == null) {
                        mapC = P0.c();
                    }
                    linkedHashMap5.put(str4, mapC);
                    if (z12) {
                        Iterator<T> it12 = bVar.getAll().iterator();
                        while (it12.hasNext()) {
                            ((InterfaceC43779a) it12.next()).k();
                        }
                    }
                    Iterator it13 = arrayList5.iterator();
                    while (it13.hasNext()) {
                        this.f58105b.o((BeduinAction) it13.next());
                    }
                    return;
                }
            }
        }
        String str5 = cVar.f103350r;
        Map mapC2 = (Map) linkedHashMap3.get(str5);
        if (mapC2 == null) {
            mapC2 = P0.c();
        }
        linkedHashMap5.put(str5, mapC2);
        if (z12) {
            Iterator<T> it14 = bVar.getAll().iterator();
            while (it14.hasNext()) {
                ((InterfaceC43779a) it14.next()).k();
            }
        }
    }
}
