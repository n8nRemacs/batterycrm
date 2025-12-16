package com.avito.android.search.filter.location_filter;

import com.avito.android.remote.model.category_parameters.MetroParameter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.search.filter.FiltersInteractor;
import com.avito.android.search.filter.ParametersTreeWithAdditional;
import com.avito.android.search.filter.converter.ParameterElement;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: LocationFiltersPresenter.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class l extends H implements Y41.l<ParameterElement, G0> {
    @Override // Y41.l
    public final G0 invoke(ParameterElement parameterElement) {
        ParameterElement parameterElement2 = parameterElement;
        r rVar = (r) this.receiver;
        ParametersTreeWithAdditional parametersTreeWithAdditional = rVar.f263665l;
        ParameterSlot parameterSlotFindParameter = parametersTreeWithAdditional != null ? parametersTreeWithAdditional.findParameter(parameterElement2.getF267834b()) : null;
        boolean z12 = parameterSlotFindParameter instanceof MetroParameter;
        FiltersInteractor filtersInteractor = rVar.f263654a;
        if (z12) {
            rVar.w();
            FiltersInteractor.a.a(filtersInteractor, (EditableParameter) parameterSlotFindParameter, null, null, 60);
        } else if (parameterSlotFindParameter instanceof EditableParameter) {
            FiltersInteractor.a.a(filtersInteractor, (EditableParameter) parameterSlotFindParameter, null, null, 60);
        }
        return G0.f406611a;
    }
}
