package com.avito.android.str_calendar.seller.calandar_parameters.domain.children;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.PretendErrorValue;
import com.avito.android.remote.model.PretendResult;
import com.avito.android.remote.model.category_parameters.ChildrenAgesGroup;
import com.avito.android.remote.model.category_parameters.ChildrenAgesParameter;
import com.avito.android.remote.model.category_parameters.IntParameter;
import com.avito.android.remote.model.category_parameters.PriceParameter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: ChildrenAgesGroupValidator.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/domain/children/k;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/domain/children/j;", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k implements j {
    @Inject
    public k() {
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.domain.children.j
    @Y61.k
    public final PretendResult a(@Y61.k ChildrenAgesGroup childrenAgesGroup) {
        String id2;
        String id3;
        Long value;
        Long value2;
        Long value3;
        Long value4;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator<T> it = childrenAgesGroup.getChildrenAgesParameters().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ChildrenAgesParameter childrenAgesParameter = (ChildrenAgesParameter) it.next();
            IntParameter fromAgeParameter = childrenAgesParameter.getFromAgeParameter();
            if (fromAgeParameter != null && fromAgeParameter.getValue() == null) {
                linkedHashMap2.put(fromAgeParameter.getId(), PretendErrorValue.WithoutMessage.INSTANCE);
            }
            IntParameter toAgeParameter = childrenAgesParameter.getToAgeParameter();
            if (toAgeParameter != null && toAgeParameter.getValue() == null) {
                linkedHashMap2.put(toAgeParameter.getId(), PretendErrorValue.WithoutMessage.INSTANCE);
            }
            PriceParameter priceParameter = childrenAgesParameter.getPriceParameter();
            if (priceParameter != null) {
                String value5 = priceParameter.getValue();
                if ((value5 != null ? C43066x.y0(value5) : null) == null) {
                    linkedHashMap2.put(priceParameter.getId(), PretendErrorValue.WithoutMessage.INSTANCE);
                }
            }
        }
        linkedHashMap.putAll(linkedHashMap2);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        List<ChildrenAgesParameter> childrenAgesParameters = childrenAgesGroup.getChildrenAgesParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : childrenAgesParameters) {
            ChildrenAgesParameter childrenAgesParameter2 = (ChildrenAgesParameter) obj;
            IntParameter fromAgeParameter2 = childrenAgesParameter2.getFromAgeParameter();
            if (((fromAgeParameter2 == null || (value4 = fromAgeParameter2.getValue()) == null) ? null : Integer.valueOf((int) value4.longValue())) != null) {
                IntParameter toAgeParameter2 = childrenAgesParameter2.getToAgeParameter();
                if (((toAgeParameter2 == null || (value3 = toAgeParameter2.getValue()) == null) ? null : Integer.valueOf((int) value3.longValue())) != null) {
                    arrayList.add(obj);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ChildrenAgesParameter childrenAgesParameter3 = (ChildrenAgesParameter) it2.next();
            IntParameter fromAgeParameter3 = childrenAgesParameter3.getFromAgeParameter();
            Integer numValueOf = (fromAgeParameter3 == null || (value2 = fromAgeParameter3.getValue()) == null) ? null : Integer.valueOf((int) value2.longValue());
            IntParameter toAgeParameter3 = childrenAgesParameter3.getToAgeParameter();
            Integer numValueOf2 = (toAgeParameter3 == null || (value = toAgeParameter3.getValue()) == null) ? null : Integer.valueOf((int) value.longValue());
            Set setP0 = (numValueOf == null || numValueOf2 == null) ? null : C42745f0.P0(new kotlin.ranges.l(numValueOf.intValue(), numValueOf2.intValue(), 1));
            if (setP0 != null) {
                arrayList2.add(setP0);
            }
        }
        int size = arrayList2.size();
        int i12 = 0;
        while (i12 < size) {
            int i13 = i12 + 1;
            int size2 = arrayList2.size();
            for (int i14 = i13; i14 < size2; i14++) {
                if (!C42745f0.M((Set) arrayList2.get(i12), (Set) arrayList2.get(i14)).isEmpty()) {
                    ChildrenAgesParameter childrenAgesParameter4 = (ChildrenAgesParameter) arrayList.get(i14);
                    IntParameter fromAgeParameter4 = childrenAgesParameter4.getFromAgeParameter();
                    if (fromAgeParameter4 != null && (id3 = fromAgeParameter4.getId()) != null) {
                        linkedHashMap3.put(id3, PretendErrorValue.WithoutMessage.INSTANCE);
                    }
                    IntParameter toAgeParameter4 = childrenAgesParameter4.getToAgeParameter();
                    if (toAgeParameter4 != null && (id2 = toAgeParameter4.getId()) != null) {
                        linkedHashMap3.put(id2, PretendErrorValue.WithoutMessage.INSTANCE);
                    }
                }
            }
            i12 = i13;
        }
        linkedHashMap.putAll(linkedHashMap3);
        return linkedHashMap.isEmpty() ? new PretendResult(true, null, 2, null) : new PretendResult(false, linkedHashMap);
    }
}
