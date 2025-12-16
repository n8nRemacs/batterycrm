package com.avito.android.search.filter.interactor;

import Y61.k;
import com.avito.android.remote.model.category_parameters.MultiselectParameter;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.recommendation_cards.RecommendationCardsParameter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: UpdateRecommendationCardsParameterInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search/filter/interactor/e;", "Lcom/avito/android/search/filter/interactor/d;", "<init>", "()V", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements d {
    @Inject
    public e() {
    }

    @Override // com.avito.android.search.filter.interactor.d
    public final <T> void a(@k EditableParameter<T> editableParameter, @k RecommendationCardsParameter recommendationCardsParameter) {
        boolean zContains;
        if (!(editableParameter instanceof MultiselectParameter)) {
            if (editableParameter instanceof SelectParameter) {
                String id2 = editableParameter.getId();
                SelectParameter.Value chosenOrCurrentSelectedValue = ((SelectParameter) editableParameter).getChosenOrCurrentSelectedValue();
                String id3 = chosenOrCurrentSelectedValue != null ? chosenOrCurrentSelectedValue.getId() : null;
                for (RecommendationCardsParameter.ParameterCard parameterCard : recommendationCardsParameter.getValues()) {
                    if (L.f(parameterCard.getParameterId(), id2)) {
                        parameterCard.setSelected(id3 != null);
                    }
                }
                return;
            }
            return;
        }
        MultiselectParameter multiselectParameter = (MultiselectParameter) editableParameter;
        List<? extends String> value = multiselectParameter.getValue();
        if (value == null) {
            value = C42784z0.f406748b;
        }
        List<MultiselectParameter.Value> values = multiselectParameter.getValues();
        ArrayList arrayList = new ArrayList();
        for (T t12 : values) {
            if (value.contains(((MultiselectParameter.Value) t12).getId())) {
                arrayList.add(t12);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t13 : arrayList) {
            String parentId = ((MultiselectParameter.Value) t13).getParentId();
            if (parentId == null) {
                parentId = editableParameter.getId();
            }
            Object objR = linkedHashMap.get(parentId);
            if (objR == null) {
                objR = androidx.compose.ui.graphics.colorspace.e.r(linkedHashMap, parentId);
            }
            ((List) objR).add(t13);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(P0.f(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            List list = (List) entry.getValue();
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(((MultiselectParameter.Value) it.next()).getId());
            }
            linkedHashMap2.put(key, arrayList2);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap2);
        List<MultiselectParameter.Value> values2 = multiselectParameter.getValues();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        for (T t14 : values2) {
            String parentId2 = ((MultiselectParameter.Value) t14).getParentId();
            if (parentId2 == null) {
                parentId2 = editableParameter.getId();
            }
            Object objR2 = linkedHashMap4.get(parentId2);
            if (objR2 == null) {
                objR2 = androidx.compose.ui.graphics.colorspace.e.r(linkedHashMap4, parentId2);
            }
            ((List) objR2).add(t14);
        }
        Iterator it2 = linkedHashMap4.entrySet().iterator();
        while (it2.hasNext()) {
            String str = (String) ((Map.Entry) it2.next()).getKey();
            if (linkedHashMap3.get(str) == null) {
                linkedHashMap3.put(str, C42784z0.f406748b);
            }
        }
        for (RecommendationCardsParameter.ParameterCard parameterCard2 : recommendationCardsParameter.getValues()) {
            String parameterId = parameterCard2.getParameterId();
            if (parameterId == null) {
                parameterId = parameterCard2.getFormParameterId();
            }
            List list2 = (List) linkedHashMap3.get(parameterId);
            if (list2 != null) {
                if (parameterCard2 instanceof RecommendationCardsParameter.ParameterCard.MultiSelect) {
                    zContains = list2.contains(((RecommendationCardsParameter.ParameterCard.MultiSelect) parameterCard2).getValues());
                } else {
                    if (!(parameterCard2 instanceof RecommendationCardsParameter.ParameterCard.Select)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zContains = list2.contains(((RecommendationCardsParameter.ParameterCard.Select) parameterCard2).getValue());
                }
                parameterCard2.setSelected(zContains);
            }
        }
    }
}
