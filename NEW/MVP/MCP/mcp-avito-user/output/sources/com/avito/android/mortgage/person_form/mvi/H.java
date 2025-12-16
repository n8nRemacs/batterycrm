package com.avito.android.mortgage.person_form.mvi;

import com.avito.android.mortgage.api.model.items.form.FormContentItemType;
import com.avito.android.mortgage.api.model.items.form.InputFormContentItemValue;
import com.avito.android.mortgage.api.model.items.form.SuggestFormContentItemValue;
import com.avito.android.mortgage.api.model.suggestions.AddressSuggestion;
import com.avito.android.mortgage.api.model.suggestions.FioSuggestion;
import com.avito.android.mortgage.api.model.suggestions.FmsUnitSuggestion;
import com.avito.android.mortgage.api.model.suggestions.OrganizationSuggestion;
import com.avito.android.mortgage.api.model.suggestions.Suggestion;
import com.avito.android.printable_text.PrintableText;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: PersonFormContentUpdater.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/person_form/mvi/H;", "", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class H {

    /* compiled from: PersonFormContentUpdater.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/mortgage/api/model/items/form/d;", "it", "invoke", "(Lcom/avito/android/mortgage/api/model/items/form/d;)Lcom/avito/android/mortgage/api/model/items/form/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.mortgage.api.model.items.form.d, com.avito.android.mortgage.api.model.items.form.d> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f200875m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(1);
            this.f200875m = str;
        }

        @Override // Y41.l
        public final com.avito.android.mortgage.api.model.items.form.d invoke(com.avito.android.mortgage.api.model.items.form.d dVar) {
            H.this.getClass();
            return H.k(dVar, this.f200875m, true);
        }
    }

    @Inject
    public H() {
    }

    public static final com.avito.android.mortgage.api.model.items.form.d a(H h12, com.avito.android.mortgage.api.model.items.form.d dVar, boolean z12) {
        h12.getClass();
        return dVar instanceof com.avito.android.mortgage.api.model.items.form.c ? com.avito.android.mortgage.api.model.items.form.c.a((com.avito.android.mortgage.api.model.items.form.c) dVar, false, z12, null, false, false, null, null, 131039) : dVar instanceof InputFormContentItemValue ? InputFormContentItemValue.a((InputFormContentItemValue) dVar, false, z12, null, false, false, null, null, 1048511) : dVar instanceof com.avito.android.mortgage.api.model.items.form.e ? com.avito.android.mortgage.api.model.items.form.e.a((com.avito.android.mortgage.api.model.items.form.e) dVar, false, z12, null, false, false, null, null, 262079) : dVar instanceof SuggestFormContentItemValue ? SuggestFormContentItemValue.a((SuggestFormContentItemValue) dVar, false, z12, null, false, false, false, null, null, 16777151) : dVar;
    }

    public static void d(LinkedHashMap linkedHashMap, List list) {
        Iterator it = C42745f0.H(list).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            LZ.c cVar = (LZ.c) linkedHashMap.get(str);
            if (cVar != null) {
                LZ.c cVarA = LZ.c.a(cVar, cVar.f9996b.H2(true));
                linkedHashMap.put(str, cVarA);
                com.avito.android.mortgage.api.model.items.form.d dVar = cVarA.f9996b;
                if (!dVar.L2().isEmpty()) {
                    d(linkedHashMap, dVar.L2());
                }
            }
        }
    }

    @Y61.k
    public static ArrayList e(@Y61.l String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4, @Y61.k List list) {
        List<LZ.c> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (LZ.c cVarA : list2) {
            com.avito.android.mortgage.api.model.items.form.d dVar = cVarA.f9996b;
            if (dVar.getF198254b()) {
                cVarA = LZ.c.a(cVarA, dVar.Q2(str));
            }
            if ((dVar instanceof LZ.b) && kotlin.jvm.internal.L.f(dVar.getId(), str2)) {
                cVarA = LZ.c.a(cVarA, ((LZ.b) dVar).h(str3, str4, str));
            }
            arrayList.add(cVarA);
        }
        return arrayList;
    }

    public static ArrayList h(LinkedHashMap linkedHashMap, List list) {
        List<LZ.c> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (LZ.c cVarA : list2) {
            PrintableText printableText = (PrintableText) linkedHashMap.get(cVarA.f9996b.getName());
            com.avito.android.mortgage.api.model.items.form.d dVar = cVarA.f9996b;
            if (dVar instanceof LZ.b) {
                cVarA = LZ.c.a(cVarA, ((LZ.b) dVar).g(linkedHashMap));
            } else if (printableText != null) {
                cVarA = LZ.c.a(cVarA, dVar.G2(printableText).M2(true));
            } else if (dVar.getF198254b()) {
                cVarA = LZ.c.a(cVarA, dVar.M2(false));
            }
            arrayList.add(cVarA);
        }
        return arrayList;
    }

    @Y61.k
    public static ArrayList j(@Y61.l String str, @Y61.l String str2, @Y61.k List list) {
        List<LZ.c> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (LZ.c cVarA : list2) {
            com.avito.android.mortgage.api.model.items.form.d dVar = cVarA.f9996b;
            if (kotlin.jvm.internal.L.f(dVar.getId(), str2) || dVar.getF198254b()) {
                cVarA = LZ.c.a(cVarA, dVar.Q2(str));
            }
            arrayList.add(cVarA);
        }
        return arrayList;
    }

    public static com.avito.android.mortgage.api.model.items.form.d k(com.avito.android.mortgage.api.model.items.form.d dVar, String str, boolean z12) {
        if (!z12 && (str == null || str.length() == 0)) {
            return dVar;
        }
        if (dVar instanceof com.avito.android.mortgage.api.model.items.form.c) {
            com.avito.android.mortgage.api.model.items.form.c cVar = (com.avito.android.mortgage.api.model.items.form.c) dVar;
            if (str == null) {
                str = "";
            }
            return cVar.i(str, z12);
        }
        if (dVar instanceof InputFormContentItemValue) {
            InputFormContentItemValue inputFormContentItemValue = (InputFormContentItemValue) dVar;
            if (str == null) {
                str = "";
            }
            return inputFormContentItemValue.f(str, z12);
        }
        if (!(dVar instanceof com.avito.android.mortgage.api.model.items.form.e)) {
            return dVar;
        }
        com.avito.android.mortgage.api.model.items.form.e eVar = (com.avito.android.mortgage.api.model.items.form.e) dVar;
        if (str == null) {
            str = "";
        }
        return eVar.j(str, z12);
    }

    public static List l(Y41.l lVar, String str, List list) {
        com.avito.android.mortgage.api.model.items.form.d dVar;
        Iterator it = list.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            }
            if (kotlin.jvm.internal.L.f(((LZ.c) it.next()).f9996b.getId(), str)) {
                break;
            }
            i12++;
        }
        LZ.c cVar = (LZ.c) C42745f0.K(i12, list);
        if (cVar == null) {
            return list;
        }
        List<LZ.c> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (LZ.c cVarA : list2) {
            if (kotlin.jvm.internal.L.f(cVarA.f9996b.getName(), cVar.f9996b.getName()) && (dVar = cVarA.f9996b) != null) {
                cVarA = LZ.c.a(cVar, (com.avito.android.mortgage.api.model.items.form.d) lVar.invoke(dVar));
            }
            arrayList.add(cVarA);
        }
        return arrayList;
    }

    public final ArrayList b(List list, List list2, List list3) {
        List<LZ.c> list4 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list4, 10));
        int i12 = 0;
        for (LZ.c cVarA : list4) {
            FormContentItemType formContentItemType = cVarA.f9995a;
            if (formContentItemType != FormContentItemType.TEXT && formContentItemType != FormContentItemType.BANNER) {
                com.avito.android.mortgage.api.model.items.form.d dVar = cVarA.f9996b;
                if (list3.contains(dVar.getId()) && i12 >= 0 && i12 < list2.size()) {
                    cVarA = LZ.c.a(cVarA, k(dVar, (String) list2.get(i12), true));
                    i12++;
                }
            }
            arrayList.add(cVarA);
        }
        return arrayList;
    }

    public final List<LZ.c> c(List<LZ.c> list, Suggestion suggestion, List<String> list2) {
        if (suggestion instanceof FioSuggestion) {
            FioSuggestion fioSuggestion = (FioSuggestion) suggestion;
            String lastName = fioSuggestion.getLastName();
            if (lastName == null) {
                lastName = "";
            }
            String firstName = fioSuggestion.getFirstName();
            if (firstName == null) {
                firstName = "";
            }
            String middleName = fioSuggestion.getMiddleName();
            return b(list, C42745f0.U(lastName, firstName, middleName != null ? middleName : ""), list2);
        }
        if (suggestion instanceof FmsUnitSuggestion) {
            FmsUnitSuggestion fmsUnitSuggestion = (FmsUnitSuggestion) suggestion;
            String code = fmsUnitSuggestion.getCode();
            if (code == null) {
                code = "";
            }
            String name = fmsUnitSuggestion.getName();
            return b(list, C42745f0.U(code, name != null ? name : ""), list2);
        }
        if (!(suggestion instanceof AddressSuggestion)) {
            if (!(suggestion instanceof OrganizationSuggestion)) {
                if (suggestion == null) {
                    return list;
                }
                throw new NoWhenBranchMatchedException();
            }
            OrganizationSuggestion organizationSuggestion = (OrganizationSuggestion) suggestion;
            String inn = organizationSuggestion.getInn();
            if (inn == null) {
                inn = "";
            }
            String name2 = organizationSuggestion.getName();
            return b(list, C42745f0.U(inn, name2 != null ? name2 : ""), list2);
        }
        AddressSuggestion addressSuggestion = (AddressSuggestion) suggestion;
        String regionId = addressSuggestion.getRegionId();
        String str = regionId == null ? "" : regionId;
        String city = addressSuggestion.getCity();
        String str2 = city == null ? "" : city;
        String settlement = addressSuggestion.getSettlement();
        String str3 = settlement == null ? "" : settlement;
        String street = addressSuggestion.getStreet();
        String str4 = street == null ? "" : street;
        String house = addressSuggestion.getHouse();
        String str5 = house == null ? "" : house;
        String block = addressSuggestion.getBlock();
        String str6 = block == null ? "" : block;
        String flat = addressSuggestion.getFlat();
        String str7 = flat == null ? "" : flat;
        String zip = addressSuggestion.getZip();
        return b(list, C42745f0.U(str, str2, str3, str4, str5, str6, str7, zip == null ? "" : zip), list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.k
    public final List f(@Y61.k ArrayList arrayList) {
        Object obj;
        Object next;
        Iterator<T> it = I.f200876a.iterator();
        while (it.hasNext()) {
            kotlin.Q q12 = (kotlin.Q) it.next();
            String str = (String) q12.f406619b;
            String str2 = (String) q12.f406620c;
            Iterable iterable = arrayList;
            Iterator it2 = iterable.iterator();
            while (true) {
                obj = null;
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (kotlin.jvm.internal.L.f(((LZ.c) next).f9996b.getId(), str)) {
                    break;
                }
            }
            LZ.c cVar = (LZ.c) next;
            if (cVar != null) {
                Iterator it3 = iterable.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next2 = it3.next();
                    if (kotlin.jvm.internal.L.f(((LZ.c) next2).f9996b.getId(), str2)) {
                        obj = next2;
                        break;
                    }
                }
                LZ.c cVar2 = (LZ.c) obj;
                if (cVar2 != null) {
                    com.avito.android.mortgage.api.model.items.form.d dVar = cVar.f9996b;
                    boolean zIsEmpty = dVar.isEmpty();
                    com.avito.android.mortgage.api.model.items.form.d dVar2 = cVar2.f9996b;
                    if (!zIsEmpty) {
                        arrayList = l(new B(this, cVar2), dVar2.getId(), arrayList);
                    } else if (dVar2.isEmpty()) {
                        arrayList = l(new E(this, cVar2), dVar2.getId(), l(new D(this, cVar), dVar.getId(), arrayList));
                    } else {
                        arrayList = l(new C(this, cVar), dVar.getId(), arrayList);
                    }
                }
            }
        }
        return arrayList;
    }

    @Y61.k
    public final ArrayList g(@Y61.k List list, boolean z12) {
        com.avito.android.mortgage.api.model.items.form.d dVar;
        List<LZ.c> list2 = list;
        int iF2 = P0.f(C42745f0.q(list2, 10));
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        for (Object obj : list2) {
            linkedHashMap.put(((LZ.c) obj).f9996b.getId(), obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        ArrayList arrayList = new ArrayList(linkedHashMap2.size());
        Iterator it = linkedHashMap2.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(((LZ.c) ((Map.Entry) it.next()).getValue()).f9996b);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (next instanceof SuggestFormContentItemValue) {
                arrayList2.add(next);
            }
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            SuggestFormContentItemValue suggestFormContentItemValue = (SuggestFormContentItemValue) it3.next();
            List<String> listE = suggestFormContentItemValue.e();
            if (listE != null) {
                List<String> list3 = listE;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator<T> it4 = list3.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        LZ.c cVar = (LZ.c) linkedHashMap2.get((String) it4.next());
                        if (((cVar == null || (dVar = cVar.f9996b) == null) ? null : dVar.getError()) != null) {
                            LZ.c cVar2 = (LZ.c) linkedHashMap2.get(suggestFormContentItemValue.getId());
                            if (cVar2 != null) {
                                linkedHashMap2.put(suggestFormContentItemValue.getId(), LZ.c.a(cVar2, suggestFormContentItemValue.c()));
                            }
                        }
                    }
                }
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap2);
        Iterator it5 = linkedHashMap3.entrySet().iterator();
        while (it5.hasNext()) {
            d(linkedHashMap3, ((LZ.c) ((Map.Entry) it5.next()).getValue()).f9996b.L2());
        }
        Iterator it6 = linkedHashMap3.entrySet().iterator();
        while (it6.hasNext()) {
            LZ.c cVar3 = (LZ.c) ((Map.Entry) it6.next()).getValue();
            String id2 = cVar3.f9996b.getId();
            List<String> listI2 = cVar3.f9996b.I2();
            if (!listI2.isEmpty()) {
                ArrayList arrayList3 = new ArrayList();
                Collection collectionValues = linkedHashMap3.values();
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : collectionValues) {
                    LZ.c cVar4 = (LZ.c) obj2;
                    if (!kotlin.jvm.internal.L.f(cVar4.f9996b.getId(), id2) && !cVar4.f9996b.getIsHidden()) {
                        arrayList4.add(obj2);
                    }
                }
                ArrayList arrayList5 = new ArrayList();
                Iterator it7 = arrayList4.iterator();
                while (it7.hasNext()) {
                    C42745f0.h(((LZ.c) it7.next()).f9996b.L2(), arrayList5);
                }
                ArrayList arrayList6 = new ArrayList(arrayList5);
                for (String str : listI2) {
                    LZ.c cVar5 = (LZ.c) linkedHashMap3.get(str);
                    if (cVar5 != null) {
                        Iterator it8 = arrayList6.iterator();
                        while (true) {
                            if (!it8.hasNext()) {
                                LZ.c cVarA = LZ.c.a(cVar5, cVar5.f9996b.H2(false));
                                linkedHashMap3.put(str, cVarA);
                                List<List<String>> listL2 = cVarA.f9996b.L2();
                                arrayList6.addAll(listL2);
                                arrayList3.addAll(listL2);
                                break;
                            }
                            List list4 = (List) it8.next();
                            if (!list4.contains(str) || !list4.contains(id2)) {
                            }
                        }
                    }
                }
                ArrayList arrayList7 = new ArrayList();
                Iterator it9 = arrayList3.iterator();
                while (it9.hasNext()) {
                    Object next2 = it9.next();
                    if (!((List) next2).isEmpty()) {
                        arrayList7.add(next2);
                    }
                }
                d(linkedHashMap3, arrayList7);
            }
        }
        if (z12) {
            ArrayList arrayList8 = new ArrayList();
            for (Object obj3 : list2) {
                if (((LZ.c) obj3).f9996b.getIsHidden()) {
                    arrayList8.add(obj3);
                }
            }
            ArrayList arrayList9 = new ArrayList(C42745f0.q(arrayList8, 10));
            Iterator it10 = arrayList8.iterator();
            while (it10.hasNext()) {
                arrayList9.add(((LZ.c) it10.next()).f9996b.getId());
            }
            Set setP0 = C42745f0.P0(arrayList9);
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap3.entrySet()) {
                if (!((LZ.c) entry.getValue()).f9996b.getIsHidden()) {
                    linkedHashMap4.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList10 = new ArrayList(linkedHashMap4.size());
            Iterator it11 = linkedHashMap4.entrySet().iterator();
            while (it11.hasNext()) {
                arrayList10.add(((LZ.c) ((Map.Entry) it11.next()).getValue()).f9996b.getName());
            }
            Set setP02 = C42745f0.P0(arrayList10);
            for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                String str2 = (String) entry2.getKey();
                LZ.c cVar6 = (LZ.c) entry2.getValue();
                if (cVar6.f9996b.getIsHidden() && !setP0.contains(str2)) {
                    com.avito.android.mortgage.api.model.items.form.d dVarA = cVar6.f9996b;
                    if (!setP02.contains(dVarA.getName())) {
                        if (dVarA instanceof com.avito.android.mortgage.api.model.items.form.b) {
                            com.avito.android.mortgage.api.model.items.form.b bVar = (com.avito.android.mortgage.api.model.items.form.b) dVarA;
                            bVar.getClass();
                            dVarA = com.avito.android.mortgage.api.model.items.form.b.a(bVar, false, false, true, null, null, 4319);
                        }
                        com.avito.android.mortgage.api.model.items.form.d dVarK = k(dVarA, "", true);
                        if (dVarK instanceof SuggestFormContentItemValue) {
                            dVarK = ((SuggestFormContentItemValue) dVarK).l("", null, true);
                        }
                        linkedHashMap3.put(str2, LZ.c.a(cVar6, dVarK));
                    }
                }
            }
        }
        ArrayList arrayList11 = new ArrayList(C42745f0.q(list2, 10));
        for (LZ.c cVar7 : list2) {
            LZ.c cVar8 = (LZ.c) linkedHashMap3.get(cVar7.f9996b.getId());
            if (cVar8 != null) {
                cVar7 = cVar8;
            }
            arrayList11.add(cVar7);
        }
        return arrayList11;
    }

    @Y61.k
    public final List i(@Y61.k String str, @Y61.l String str2, @Y61.k List list) {
        return f(g(l(new a(str2), str, list), (str.equals("occupation") && kotlin.jvm.internal.L.f(str2, "self_employed")) ? false : true));
    }
}
