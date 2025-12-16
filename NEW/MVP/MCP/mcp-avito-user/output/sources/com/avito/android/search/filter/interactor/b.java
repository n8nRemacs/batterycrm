package com.avito.android.search.filter.interactor;

import Cp0.InterfaceC13340d;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.category_parameters.MultiselectParameter;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.search.filter.FiltersInteractor;
import com.avito.android.search.filter.ParametersTreeWithAdditional;
import com.avito.android.search.filter.converter.common.ParameterCard;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: UpdateOtherParametersByRecommendationCardsParameterInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/interactor/b;", "Lcom/avito/android/search/filter/interactor/a;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Bp0.c f263363a;

    @Inject
    public b(@k Bp0.c cVar) {
        this.f263363a = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v21, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    @Override // com.avito.android.search.filter.interactor.a
    public final void a(@k ParameterCard parameterCard, @k InterfaceC13340d interfaceC13340d, @l ParametersTreeWithAdditional parametersTreeWithAdditional, @k FiltersInteractor filtersInteractor) {
        ?? arrayList;
        String str;
        List listFindParametersOfType;
        ?? arrayList2;
        ArrayList arrayListC0;
        List listFindParametersOfType2;
        if (interfaceC13340d.equals(InterfaceC13340d.a.f2695a)) {
            this.f263363a.a(parameterCard);
        }
        if (!(parameterCard instanceof ParameterCard.MultiSelect)) {
            if (parameterCard instanceof ParameterCard.Select) {
                ParameterCard.Select select = (ParameterCard.Select) parameterCard;
                if (parametersTreeWithAdditional == null || (listFindParametersOfType = parametersTreeWithAdditional.findParametersOfType(SelectParameter.class)) == null) {
                    arrayList = 0;
                } else {
                    arrayList = new ArrayList();
                    for (Object obj : listFindParametersOfType) {
                        if (L.f(((EditableParameter) obj).getId(), select.f262923b)) {
                            arrayList.add(obj);
                        }
                    }
                }
                if (arrayList == 0) {
                    arrayList = C42784z0.f406748b;
                }
                for (SelectParameter selectParameter : (Iterable) arrayList) {
                    if (interfaceC13340d.equals(InterfaceC13340d.a.f2695a)) {
                        str = select.f262930i;
                    } else {
                        if (!interfaceC13340d.equals(InterfaceC13340d.b.f2696a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = null;
                    }
                    FiltersInteractor.a.a(filtersInteractor, selectParameter, str, null, 60);
                }
                return;
            }
            return;
        }
        ParameterCard.MultiSelect multiSelect = (ParameterCard.MultiSelect) parameterCard;
        if (parametersTreeWithAdditional == null || (listFindParametersOfType2 = parametersTreeWithAdditional.findParametersOfType(MultiselectParameter.class)) == null) {
            arrayList2 = 0;
        } else {
            arrayList2 = new ArrayList();
            for (Object obj2 : listFindParametersOfType2) {
                if (L.f(((EditableParameter) obj2).getId(), multiSelect.f262915b)) {
                    arrayList2.add(obj2);
                }
            }
        }
        if (arrayList2 == 0) {
            arrayList2 = C42784z0.f406748b;
        }
        for (MultiselectParameter multiselectParameter : (Iterable) arrayList2) {
            List<? extends String> value = multiselectParameter.getValue();
            if (value == null) {
                value = C42784z0.f406748b;
            }
            boolean zEquals = interfaceC13340d.equals(InterfaceC13340d.a.f2695a);
            String str2 = multiSelect.f262922i;
            if (zEquals) {
                arrayListC0 = C42745f0.i0(str2, value);
            } else {
                if (!interfaceC13340d.equals(InterfaceC13340d.b.f2696a)) {
                    throw new NoWhenBranchMatchedException();
                }
                arrayListC0 = C42745f0.c0(value, str2);
            }
            FiltersInteractor.a.a(filtersInteractor, multiselectParameter, arrayListC0, null, 60);
        }
    }
}
