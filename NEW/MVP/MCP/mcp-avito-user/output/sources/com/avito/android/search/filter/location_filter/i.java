package com.avito.android.search.filter.location_filter;

import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.category_parameters.BooleanParameter;
import com.avito.android.remote.model.category_parameters.LocationParameter;
import com.avito.android.remote.model.category_parameters.MetroParameter;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.search.filter.FiltersInteractor;
import com.avito.android.search.filter.ParametersTreeWithAdditional;
import com.avito.android.search.filter.converter.ParameterElement;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: LocationFiltersPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Q;", "Lkotlin/G0;", "Lcom/avito/android/remote/model/Location;", "<name for destructuring parameter 0>", "invoke", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class i extends N implements Y41.l<Q<? extends G0, ? extends Location>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ r f263642l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ u f263643m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(r rVar, u uVar) {
        super(1);
        this.f263642l = rVar;
        this.f263643m = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final G0 invoke(Q<? extends G0, ? extends Location> q12) {
        ParameterSlot parameterSlotFindParameter;
        List<SelectParameter.Value> values;
        SelectParameter.Value value;
        Location location = (Location) q12.f406620c;
        r rVar = this.f263642l;
        rVar.f263667n = false;
        r.r(rVar);
        this.f263643m.a();
        UV0.c cVar = rVar.f263679z;
        if (cVar != null) {
            Iterator<T> it = com.avito.konveyor.util.g.b(cVar).iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                FiltersInteractor filtersInteractor = rVar.f263654a;
                if (!zHasNext) {
                    filtersInteractor.o();
                    break;
                }
                com.avito.conveyor_item.a aVar = (com.avito.conveyor_item.a) it.next();
                ParametersTreeWithAdditional parametersTreeWithAdditional = rVar.f263665l;
                if (parametersTreeWithAdditional == null || (parameterSlotFindParameter = parametersTreeWithAdditional.findParameter(aVar.getF294859b())) == null) {
                    break;
                }
                if (parameterSlotFindParameter instanceof MetroParameter) {
                    rVar.w();
                    FiltersInteractor.a.a(filtersInteractor, (EditableParameter) parameterSlotFindParameter, null, null, 56);
                } else if (parameterSlotFindParameter instanceof EditableParameter) {
                    if (parameterSlotFindParameter instanceof LocationParameter) {
                        FiltersInteractor.a.a(filtersInteractor, (EditableParameter) parameterSlotFindParameter, location, null, 56);
                    } else if ((aVar instanceof ParameterElement.v) && (((ParameterElement.v) aVar).f262845h instanceof ParameterElement.DisplayType.Chips)) {
                        SelectParameter.Flat flat = (SelectParameter.Flat) parameterSlotFindParameter;
                        SelectParameter.Flat flat2 = parameterSlotFindParameter instanceof SelectParameter.Flat ? flat : null;
                        FiltersInteractor.a.a(filtersInteractor, flat, (flat2 == null || (values = flat2.getValues()) == null || (value = values.get(0)) == null) ? null : value.getId(), null, 56);
                    } else if ((parameterSlotFindParameter instanceof BooleanParameter) && L.f(parameterSlotFindParameter.getId(), "localPriority")) {
                        FiltersInteractor.a.a(filtersInteractor, (EditableParameter) parameterSlotFindParameter, Boolean.valueOf(rVar.f263678y), null, 56);
                    } else {
                        FiltersInteractor.a.a(filtersInteractor, (EditableParameter) parameterSlotFindParameter, null, null, 56);
                    }
                }
            }
        }
        return G0.f406611a;
    }
}
