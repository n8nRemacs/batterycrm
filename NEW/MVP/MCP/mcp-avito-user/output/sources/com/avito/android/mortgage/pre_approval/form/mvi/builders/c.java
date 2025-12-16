package com.avito.android.mortgage.pre_approval.form.mvi.builders;

import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.api.model.DictionariesResult;
import com.avito.android.mortgage.api.model.dictionary.ProgramParameter;
import com.avito.android.mortgage.api.model.dictionary.StringNumberParameter;
import com.avito.android.mortgage.api.model.dictionary.UsualParameter;
import com.avito.android.mortgage.api.model.landing.items.LabelValueParameter;
import com.avito.android.mortgage.pre_approval.model.PreApprovalArguments;
import com.huawei.hms.framework.common.ExceptionCode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;
import kotlin.text.C43066x;

/* compiled from: PreApprovalFormDataBuilder.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/form/mvi/builders/c;", "Lcom/avito/android/mortgage/pre_approval/form/mvi/builders/b;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c implements b {
    @Inject
    public c() {
    }

    public static Map g(Map map, DictionariesResult dictionariesResult) {
        String f12770a;
        Map map2 = map;
        Object obj = map2.get("propertyCost");
        if (!(obj instanceof P00.b)) {
            obj = null;
        }
        P00.b bVar = (P00.b) obj;
        if (bVar == null) {
            return map2;
        }
        Object obj2 = map2.get("landCost");
        if (!(obj2 instanceof P00.b)) {
            obj2 = null;
        }
        P00.b bVar2 = (P00.b) obj2;
        Object obj3 = map2.get("downPayment");
        if (!(obj3 instanceof P00.b)) {
            obj3 = null;
        }
        P00.b bVar3 = (P00.b) obj3;
        if (bVar3 == null) {
            return map2;
        }
        P00.a aVar = (P00.a) map2.get("mortgageProgram");
        if (aVar == null || (f12770a = aVar.getF12770a()) == null) {
            f12770a = "standart";
        }
        int iIntValue = 100000000;
        Integer num = bVar.f12762a;
        int iIntValue2 = (num == null || num.intValue() < 500000) ? 500000 : num.intValue() > 100000000 ? 100000000 : num.intValue();
        if (bVar2 != null) {
            Integer num2 = bVar2.f12762a;
            if (num2 == null || num2.intValue() < 500000) {
                iIntValue = 500000;
            } else if (num2.intValue() <= 100000000) {
                iIntValue = num2.intValue();
            }
        } else {
            iIntValue = 0;
        }
        Integer num3 = bVar3.f12762a;
        P00.b bVarL = l(bVar3, iIntValue2 + iIntValue, num3 != null ? num3.intValue() : 0, f12770a, dictionariesResult);
        Object obj4 = map2.get("downPayment");
        if (!(obj4 instanceof P00.a)) {
            obj4 = null;
        }
        if (((P00.a) obj4) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
            linkedHashMap.put("downPayment", bVarL);
            map2 = linkedHashMap;
        }
        Object obj5 = map2.get("propertyCost");
        if (!(obj5 instanceof P00.b)) {
            obj5 = null;
        }
        P00.b bVar4 = (P00.b) obj5;
        if (bVar4 != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(map2);
            double dI2 = i(iIntValue2, k());
            O00.a aVar2 = bVar4.f12764c;
            linkedHashMap2.put("propertyCost", P00.b.b(bVar4, Integer.valueOf(iIntValue2), aVar2 != null ? O00.a.a(aVar2, dI2) : null, null, null, 26));
            map2 = linkedHashMap2;
        }
        Object obj6 = map2.get("landCost");
        if (!(obj6 instanceof P00.b)) {
            obj6 = null;
        }
        P00.b bVar5 = (P00.b) obj6;
        if (bVar5 == null) {
            return map2;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(map2);
        double dI3 = i(iIntValue, k());
        O00.a aVar3 = bVar5.f12764c;
        linkedHashMap3.put("landCost", P00.b.b(bVar5, Integer.valueOf(iIntValue), aVar3 != null ? O00.a.a(aVar3, dI3) : null, null, null, 26));
        return linkedHashMap3;
    }

    public static List h(String str, DictionariesResult dictionariesResult) {
        if (L.f(str, "hired")) {
            return dictionariesResult.f();
        }
        if (C42745f0.r(e.f201860a, str)) {
            return dictionariesResult.d();
        }
        if (!L.f(str, "self_employed")) {
            return dictionariesResult.f();
        }
        List<UsualParameter> listK = dictionariesResult.k();
        return listK == null ? C42784z0.f406748b : listK;
    }

    public static double i(int i12, List list) {
        Object next;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            o oVar = (o) next;
            int i13 = oVar.f201868c;
            if (i12 <= oVar.f201869d && i13 <= i12) {
                break;
            }
        }
        o oVar2 = (o) next;
        if (oVar2 == null) {
            return 0.0d;
        }
        int i14 = oVar2.f201869d;
        int i15 = oVar2.f201868c;
        double d12 = (i12 - i15) / (i14 - i15);
        double d13 = oVar2.f201867b;
        double d14 = oVar2.f201866a;
        return ((d13 - d14) * d12) + d14;
    }

    public static P00.b j(Integer num) {
        return new P00.b(Integer.valueOf(num != null ? num.intValue() : 500000), null, new O00.a(num != null ? i(num.intValue(), k()) : 0.0d), null, null, 24, null);
    }

    public static List k() {
        return C42745f0.U(new o(0.0d, 0.25d, 500000, ExceptionCode.CRASH_EXCEPTION), new o(0.25d, 0.5d, ExceptionCode.CRASH_EXCEPTION, 15000000), new o(0.5d, 0.75d, 15000000, 30000000), new o(0.75d, 0.875d, 30000000, 50000000), new o(0.875d, 1.0d, 50000000, 100000000));
    }

    public static P00.b l(P00.b bVar, int i12, int i13, String str, DictionariesResult dictionariesResult) {
        Float fValueOf;
        Object next;
        StringNumberParameter downPayment;
        Iterator<T> it = dictionariesResult.h().iterator();
        while (true) {
            fValueOf = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((ProgramParameter) next).getValue(), str)) {
                break;
            }
        }
        ProgramParameter programParameter = (ProgramParameter) next;
        if (programParameter != null && (downPayment = programParameter.getDownPayment()) != null) {
            fValueOf = Float.valueOf(downPayment.getValue());
        }
        if (fValueOf == null) {
            return bVar;
        }
        int iCeil = (int) Math.ceil(i12 * (fValueOf.floatValue() / 100));
        double d12 = i12;
        int i14 = (int) (0.9d * d12);
        if (i14 < iCeil) {
            i14 = iCeil;
        }
        int iG2 = s.g(i13, iCeil, i14);
        return P00.b.b(bVar, Integer.valueOf(iG2), null, Double.valueOf((iG2 / d12) * 100), null, 6);
    }

    public static P00.a m(P00.a aVar, Integer num) {
        if (aVar instanceof P00.b) {
            return P00.b.b((P00.b) aVar, num, null, null, null, 14);
        }
        if (aVar instanceof P00.c) {
            return P00.c.b((P00.c) aVar, null, num != null ? num.toString() : null, null, 1);
        }
        if (!(aVar instanceof P00.d)) {
            throw new NoWhenBranchMatchedException();
        }
        String string = num != null ? num.toString() : null;
        if (string == null) {
            string = "";
        }
        return new P00.d(string, null);
    }

    @Override // com.avito.android.mortgage.pre_approval.form.mvi.builders.b
    @Y61.k
    public final Map a(@Y61.k String str, @Y61.k String str2, @Y61.k Map map) {
        Object objB;
        Object obj = map.get(str);
        if (!(obj instanceof P00.a)) {
            obj = null;
        }
        P00.a aVar = (P00.a) obj;
        if (aVar == null) {
            return map;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        boolean z12 = aVar instanceof P00.b;
        if (z12) {
            objB = m(aVar, C43066x.y0(C43066x.A0(str2).toString()));
        } else if (aVar instanceof P00.c) {
            objB = P00.c.b((P00.c) aVar, null, str2, null, 1);
        } else if (aVar instanceof P00.d) {
            objB = new P00.d(str2, null);
        } else {
            if (!z12) {
                throw new NoWhenBranchMatchedException();
            }
            objB = P00.b.b((P00.b) aVar, C43066x.y0(str2), null, null, null, 14);
        }
        linkedHashMap.put(str, objB);
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [P00.a] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object] */
    @Override // com.avito.android.mortgage.pre_approval.form.mvi.builders.b
    @Y61.k
    public final Map b(@Y61.k Map map, @Y61.k String str, float f12) {
        int iCeil;
        if (!str.equals("propertyCost") && !str.equals("landCost")) {
            return map;
        }
        Object obj = map.get(str);
        o oVar = null;
        if (!(obj instanceof P00.b)) {
            obj = null;
        }
        P00.b bVar = (P00.b) obj;
        if (bVar == null) {
            return map;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        O00.a aVar = bVar.f12764c;
        P00.b bVarM = bVar;
        if (aVar != null) {
            double d12 = f12;
            Iterator it = k().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ?? next = it.next();
                o oVar2 = (o) next;
                if (d12 >= oVar2.f201866a && d12 <= oVar2.f201867b) {
                    oVar = next;
                    break;
                }
            }
            o oVar3 = oVar;
            if (oVar3 == null) {
                iCeil = 0;
            } else {
                double d13 = oVar3.f201867b;
                double d14 = oVar3.f201866a;
                int i12 = oVar3.f201869d;
                iCeil = ((int) Math.ceil(((d12 - d14) / (d13 - d14)) * (i12 - r12))) + oVar3.f201868c;
            }
            bVarM = m(bVar, Integer.valueOf(iCeil));
        }
        linkedHashMap.put(str, bVarM);
        return linkedHashMap;
    }

    @Override // com.avito.android.mortgage.pre_approval.form.mvi.builders.b
    @Y61.k
    public final Map c(int i12, @Y61.k String str, @Y61.k Map map) {
        LinkedHashMap linkedHashMap;
        Integer num;
        Integer num2;
        if (str.equals("downPayment")) {
            Object obj = map.get("downPayment");
            if (!(obj instanceof P00.b)) {
                obj = null;
            }
            P00.b bVar = (P00.b) obj;
            if (bVar == null) {
                return map;
            }
            Object obj2 = map.get("propertyCost");
            if (!(obj2 instanceof P00.b)) {
                obj2 = null;
            }
            P00.b bVar2 = (P00.b) obj2;
            int iIntValue = 0;
            int iIntValue2 = (bVar2 == null || (num2 = bVar2.f12762a) == null) ? 0 : num2.intValue();
            Object obj3 = map.get("landCost");
            if (!(obj3 instanceof P00.b)) {
                obj3 = null;
            }
            P00.b bVar3 = (P00.b) obj3;
            if (bVar3 != null && (num = bVar3.f12762a) != null) {
                iIntValue = num.intValue();
            }
            double d12 = i12;
            P00.b bVarB = P00.b.b(bVar, Integer.valueOf((int) Math.ceil((d12 / 100.0d) * (iIntValue2 + iIntValue))), null, Double.valueOf(d12), null, 22);
            Object obj4 = map.get("downPayment");
            if (((P00.a) (obj4 instanceof P00.a ? obj4 : null)) == null) {
                return map;
            }
            linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.put("downPayment", bVarB);
        } else {
            if (!str.equals("creditTerm")) {
                return map;
            }
            Object obj5 = map.get("creditTerm");
            if (!(obj5 instanceof P00.b)) {
                obj5 = null;
            }
            P00.b bVar4 = (P00.b) obj5;
            if (bVar4 == null) {
                return map;
            }
            P00.b bVarB2 = P00.b.b(bVar4, Integer.valueOf(i12), null, null, null, 30);
            Object obj6 = map.get("creditTerm");
            if (((P00.b) (obj6 instanceof P00.b ? obj6 : null)) == null) {
                return map;
            }
            linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.put("creditTerm", bVarB2);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.mortgage.pre_approval.form.mvi.builders.b
    @Y61.k
    public final HashMap d(@Y61.k PreApprovalArguments preApprovalArguments, @Y61.k DictionariesResult dictionariesResult) {
        Integer num;
        HashMap map = new HashMap();
        map.put("purposeId", new P00.c(dictionariesResult.g(), preApprovalArguments.f201965b, null, 4, null));
        map.put("regionId", new P00.c(dictionariesResult.j(), preApprovalArguments.f201966c, null, 4, null));
        String str = preApprovalArguments.f201976m;
        if (str == null) {
            str = "standart";
        }
        P00.d dVar = new P00.d(str, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
        P00.b bVarJ = j(preApprovalArguments.f201967d);
        P00.b bVarJ2 = L.f(preApprovalArguments.f201965b, "building_house") ? j(preApprovalArguments.f201968e) : null;
        P00.b bVar = new P00.b(preApprovalArguments.f201969f, C42745f0.U(new LabelValueParameter("10%", 10), new LabelValueParameter("15%", 15), new LabelValueParameter("20%", 20), new LabelValueParameter("25%", 25), new LabelValueParameter("30%", 30)), null, null, null, 24, null);
        map.put("mortgageProgram", dVar);
        map.put("propertyCost", bVarJ);
        if (bVarJ2 != null) {
            map.put("landCost", bVarJ2);
        }
        Integer num2 = bVarJ.f12762a;
        int iIntValue = (num2 != null ? num2.intValue() : 0) + ((bVarJ2 == null || (num = bVarJ2.f12762a) == null) ? 0 : num.intValue());
        Integer num3 = preApprovalArguments.f201969f;
        map.put("downPayment", l(bVar, iIntValue, num3 != null ? num3.intValue() : 0, dVar.f12770a, dictionariesResult));
        map.put("creditTerm", new P00.b(preApprovalArguments.f201970g, C42745f0.U(new LabelValueParameter("5", 5), new LabelValueParameter("10", 10), new LabelValueParameter("15", 15), new LabelValueParameter("20", 20), new LabelValueParameter("25", 25), new LabelValueParameter("30", 30)), null, null, null, 24, null));
        map.put("age", new P00.c(dictionariesResult.c(), preApprovalArguments.f201971h, null, 4, null));
        map.put("occupation", new P00.c(dictionariesResult.i(), preApprovalArguments.f201972i, null, 4, null));
        map.put("currentExperience", new P00.c(dictionariesResult.e(), preApprovalArguments.f201973j, null, 4, null));
        map.put("income", new P00.b(preApprovalArguments.f201974k, null, null, null, null, 24, null));
        map.put("proofOfIncome", new P00.c(h(preApprovalArguments.f201972i, dictionariesResult), preApprovalArguments.f201975l, null, 4, null));
        return map;
    }

    @Override // com.avito.android.mortgage.pre_approval.form.mvi.builders.b
    @Y61.k
    public final LinkedHashMap e(@Y61.k Map map, @Y61.k LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(map);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put((String) entry.getKey(), (P00.a) entry.getValue());
        }
        return linkedHashMap2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.mortgage.pre_approval.form.mvi.builders.b
    @Y61.k
    public final Map<String, P00.a> f(@Y61.k Map<String, ? extends P00.a> map, @Y61.k String str, @Y61.k DictionariesResult dictionariesResult) {
        LinkedHashMap linkedHashMap;
        Integer num;
        switch (str.hashCode()) {
            case -1617835944:
                return !str.equals("landCost") ? map : g(map, dictionariesResult);
            case -1412352295:
                if (!str.equals("purposeId")) {
                    return map;
                }
                P00.a aVar = (P00.a) map.get("purposeId");
                String f12770a = aVar != null ? aVar.getF12770a() : null;
                linkedHashMap = new LinkedHashMap(map);
                if (L.f(f12770a, "building_house")) {
                    if (!linkedHashMap.containsKey("landCost")) {
                        linkedHashMap.put("landCost", j(null));
                    }
                    return g(linkedHashMap, dictionariesResult);
                }
                if (((P00.a) linkedHashMap.remove("landCost")) != null) {
                    return g(linkedHashMap, dictionariesResult);
                }
                break;
            case -865005758:
                return !str.equals("propertyCost") ? map : g(map, dictionariesResult);
            case -669807868:
                return !str.equals("downPayment") ? map : g(map, dictionariesResult);
            case -564314363:
                if (!str.equals("creditTerm")) {
                    return map;
                }
                Object obj = map.get("creditTerm");
                P00.b bVar = (P00.b) (obj instanceof P00.b ? obj : null);
                if (bVar != null && (num = bVar.f12762a) != null) {
                    int iG2 = s.g(num.intValue(), 1, 30);
                    linkedHashMap = new LinkedHashMap(map);
                    linkedHashMap.put("creditTerm", m(bVar, Integer.valueOf(iG2)));
                    break;
                } else {
                    return map;
                }
                break;
            case 1615358283:
                if (!str.equals("occupation")) {
                    return map;
                }
                P00.a aVar2 = (P00.a) map.get("occupation");
                String f12770a2 = aVar2 != null ? aVar2.getF12770a() : null;
                Object obj2 = map.get("proofOfIncome");
                if (!(obj2 instanceof P00.c)) {
                    obj2 = null;
                }
                P00.c cVar = (P00.c) obj2;
                if (cVar == null) {
                    return map;
                }
                P00.c cVarB = P00.c.b(cVar, h(f12770a2, dictionariesResult), null, null, 4);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(map);
                linkedHashMap2.put("proofOfIncome", cVarB);
                return linkedHashMap2;
            default:
                return map;
        }
        return linkedHashMap;
    }
}
