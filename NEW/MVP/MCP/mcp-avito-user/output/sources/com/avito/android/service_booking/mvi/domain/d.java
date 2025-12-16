package com.avito.android.service_booking.mvi.domain;

import Y61.k;
import Y61.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: Steps.kt */
@s0
@Metadata(d1 = {"\u0000.\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010#\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*0\b\u0000\u0010\u0004\"\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00002\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000*:\b\u0000\u0010\u0006\"\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002`\u00050\u00002$\u0012\u0004\u0012\u00020\u0001\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000j\u0002`\u00050\u0000*0\b\u0000\u0010\t\"\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\u00072\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\u0007*D\b\u0000\u0010\f\"\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002`\n0\u0007¢\u0006\u0002\b\u000b2)\u0012\u0004\u0012\u00020\u0001\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\u0007j\u0002`\n0\u0007¢\u0006\u0002\b\u000b¨\u0006\r"}, d2 = {"", "", "", "", "MutableStepParametersValues", "Lcom/avito/android/service_booking/mvi/domain/MutableStepParametersValues;", "MutableSteps", "", "", "StepParametersValues", "Lcom/avito/android/service_booking/mvi/domain/StepParametersValues;", "LX41/o;", "Steps", "_avito_service-booking_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d {
    @k
    public static final void a(@k LinkedHashMap linkedHashMap, @k String str, @k Object obj) {
        Object linkedHashSet = linkedHashMap.get(str);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet();
            linkedHashMap.put(str, linkedHashSet);
        }
        ((Set) linkedHashSet).add(obj);
    }

    @l
    public static final String b(@k String str, @k Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        List listM0 = C42745f0.M0(map.keySet());
        int iL2 = C42745f0.L(map.keySet(), str) - 1;
        if (iL2 < 0) {
            return null;
        }
        return (String) listM0.get(iL2);
    }

    @k
    public static final LinkedHashMap c(@k Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : ((Map) ((Map.Entry) it.next()).getValue()).entrySet()) {
                String str = (String) entry.getKey();
                Set set = (Set) entry.getValue();
                ArrayList arrayList = new ArrayList(C42745f0.q(set, 10));
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().toString());
                }
                linkedHashMap.put(str, arrayList);
            }
        }
        return linkedHashMap;
    }

    @k
    public static final LinkedHashMap d(@k Map map) {
        Set<Map.Entry> setEntrySet = map.entrySet();
        int iF2 = P0.f(C42745f0.q(setEntrySet, 10));
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap.put(entry.getKey(), C42745f0.O0((Iterable) entry.getValue()));
        }
        return new LinkedHashMap(linkedHashMap);
    }

    @k
    public static final LinkedHashMap e(@k Map map) {
        Set<Map.Entry> setEntrySet = map.entrySet();
        int iF2 = P0.f(C42745f0.q(setEntrySet, 10));
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap.put(entry.getKey(), d((Map) entry.getValue()));
        }
        return new LinkedHashMap(linkedHashMap);
    }
}
