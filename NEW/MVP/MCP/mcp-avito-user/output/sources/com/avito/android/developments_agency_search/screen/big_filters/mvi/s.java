package com.avito.android.developments_agency_search.screen.big_filters.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.developments_agency_search.screen.big_filters.mvi.entity.BigFiltersInternalAction;
import com.avito.android.remote.model.SearchParam;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SplitSearchParam;
import com.avito.android.remote.model.category_parameters.BooleanParameter;
import com.avito.android.remote.model.category_parameters.IntParameter;
import com.avito.android.remote.model.category_parameters.MultiselectParameter;
import com.avito.android.remote.model.category_parameters.PriceParameter;
import com.avito.android.remote.model.category_parameters.QuartersParameter;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.search.filter.ParametersTreeWithAdditionalImpl;
import com.avito.android.search.filter.converter.ParameterElement;
import com.avito.android.util.P2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;
import ww.C49692c;
import ww.d;

/* compiled from: BigFiltersReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/s;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/developments_agency_search/screen/big_filters/mvi/entity/BigFiltersInternalAction;", "Lww/c;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class s implements u<BigFiltersInternalAction, C49692c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.developments_agency_search.screen.big_filters.converter.e f136753b;

    @Inject
    public s(@Y61.k com.avito.android.developments_agency_search.screen.big_filters.converter.e eVar) {
        this.f136753b = eVar;
    }

    public static List b(List list, InlineFilterValue.InlineFilterDeveloperDevelopmentValue inlineFilterDeveloperDevelopmentValue) {
        Iterator it = list.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            }
            if (L.f(((com.avito.conveyor_item.a) it.next()).getF302126x(), "developerDevelopments")) {
                break;
            }
            i12++;
        }
        if (i12 == -1) {
            return list;
        }
        ParameterElement.v.b bVar = (ParameterElement.v.b) list.get(i12);
        ParameterElement.v.b bVar2 = new ParameterElement.v.b(bVar.f262689b, bVar.f262840c, bVar.f262841d, inlineFilterDeveloperDevelopmentValue.getName(), bVar.f262843f, bVar.f262855r, bVar.f262844g, bVar.f262862t, bVar.f262845h, bVar.f262846i, bVar.f262847j, bVar.f262848k, bVar.f262849l, bVar.f262850m, null, bVar.f262852o, bVar.f262853p, bVar.f262854q, bVar.f262856s, bVar.f262863u, Http2.INITIAL_MAX_FRAME_SIZE, null);
        ArrayList arrayList = new ArrayList(list);
        arrayList.set(i12, bVar2);
        return arrayList;
    }

    @Override // com.avito.android.arch.mvi.u
    public final C49692c a(BigFiltersInternalAction bigFiltersInternalAction, C49692c c49692c) {
        C49692c c49692cA;
        QuartersParameter quartersParameter;
        BigFiltersInternalAction bigFiltersInternalAction2 = bigFiltersInternalAction;
        C49692c c49692c2 = c49692c;
        boolean z12 = bigFiltersInternalAction2 instanceof BigFiltersInternalAction.FiltersLoading;
        SearchParams searchParams = c49692c2.f441877c;
        com.avito.android.developments_agency_search.screen.big_filters.converter.e eVar = this.f136753b;
        QuartersParameter.Value value = null;
        InlineFilterValue.InlineFilterDeveloperDevelopmentValue inlineFilterDeveloperDevelopmentValue = c49692c2.f441879e;
        if (z12) {
            BigFiltersInternalAction.FiltersLoading filtersLoading = (BigFiltersInternalAction.FiltersLoading) bigFiltersInternalAction2;
            if (filtersLoading instanceof BigFiltersInternalAction.FiltersLoading.StartLoading) {
                c49692cA = C49692c.a(c49692c2, null, null, null, null, null, d.b.f441884a, 63);
            } else if (filtersLoading instanceof BigFiltersInternalAction.FiltersLoading.LoadingError) {
                c49692cA = C49692c.a(c49692c2, null, null, null, null, null, d.c.f441885a, 63);
            } else {
                if (!(filtersLoading instanceof BigFiltersInternalAction.FiltersLoading.Loaded)) {
                    throw new NoWhenBranchMatchedException();
                }
                ParametersTreeWithAdditionalImpl parametersTreeWithAdditionalImpl = new ParametersTreeWithAdditionalImpl(((BigFiltersInternalAction.FiltersLoading.Loaded) filtersLoading).f136698b.getParameters(), null);
                Map<String, SearchParam<?>> params = searchParams.getParams();
                if (params == null) {
                    params = P0.c();
                }
                SearchParam<?> searchParam = params.get("110684");
                SplitSearchParam splitSearchParam = searchParam instanceof SplitSearchParam ? (SplitSearchParam) searchParam : null;
                if (splitSearchParam != null && (quartersParameter = (QuartersParameter) parametersTreeWithAdditionalImpl.f261893e.getFirstParameterOfType(QuartersParameter.class)) != null) {
                    String to2 = splitSearchParam.getValue().getTo();
                    Integer numValueOf = to2 != null ? Integer.valueOf(Integer.parseInt(to2)) : null;
                    String from = splitSearchParam.getValue().getFrom();
                    quartersParameter.setValue(new QuartersParameter.Value(numValueOf, from != null ? Integer.valueOf(Integer.parseInt(from)) : null));
                }
                c49692cA = C49692c.a(c49692c2, null, null, parametersTreeWithAdditionalImpl, null, null, new d.a(b(eVar.a(parametersTreeWithAdditionalImpl), inlineFilterDeveloperDevelopmentValue)), 59);
            }
            return c49692cA;
        }
        if (bigFiltersInternalAction2 instanceof BigFiltersInternalAction.SearchResultCountLoading.StartLoading) {
            return C49692c.a(c49692c2, null, null, null, null, P2.c.f318721a, null, 95);
        }
        if (bigFiltersInternalAction2 instanceof BigFiltersInternalAction.SearchResultCountLoading.Loaded) {
            return C49692c.a(c49692c2, null, null, null, null, new P2.b(Long.valueOf(((BigFiltersInternalAction.SearchResultCountLoading.Loaded) bigFiltersInternalAction2).f136703b)), null, 95);
        }
        if (bigFiltersInternalAction2 instanceof BigFiltersInternalAction.UpdateInitSearchParams) {
            return C49692c.a(c49692c2, ((BigFiltersInternalAction.UpdateInitSearchParams) bigFiltersInternalAction2).f136708b, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
        }
        if (bigFiltersInternalAction2 instanceof BigFiltersInternalAction.UpdateLastSearchParams) {
            return C49692c.a(c49692c2, null, ((BigFiltersInternalAction.UpdateLastSearchParams) bigFiltersInternalAction2).f136709b, null, null, null, null, 125);
        }
        boolean z13 = bigFiltersInternalAction2 instanceof BigFiltersInternalAction.UpdateParameterValue;
        ParametersTreeWithAdditionalImpl parametersTreeWithAdditionalImpl2 = c49692c2.f441878d;
        if (!z13) {
            if (bigFiltersInternalAction2 instanceof BigFiltersInternalAction.UpdateSelectedDeveloperDevelopmentValue) {
                com.avito.android.developments_agency_search.screen.big_filters.k.a(searchParams, inlineFilterDeveloperDevelopmentValue);
                ww.d dVar = c49692c2.f441882h;
                return C49692c.a(c49692c2, null, null, null, ((BigFiltersInternalAction.UpdateSelectedDeveloperDevelopmentValue) bigFiltersInternalAction2).f136711b, null, !(dVar instanceof d.a) ? dVar : new d.a(b(((d.a) dVar).f441883a, ((BigFiltersInternalAction.UpdateSelectedDeveloperDevelopmentValue) bigFiltersInternalAction2).f136711b)), 55);
            }
            if (!(bigFiltersInternalAction2 instanceof BigFiltersInternalAction.UpdateSelectedQuarterValue)) {
                return c49692c2;
            }
            BigFiltersInternalAction.UpdateSelectedQuarterValue updateSelectedQuarterValue = (BigFiltersInternalAction.UpdateSelectedQuarterValue) bigFiltersInternalAction2;
            QuartersParameter quartersParameter2 = (QuartersParameter) parametersTreeWithAdditionalImpl2.f261893e.getFirstParameterOfType(QuartersParameter.class);
            if (quartersParameter2 != null) {
                InlineFilterValue.InlineFilterNumericRangeValue inlineFilterNumericRangeValue = updateSelectedQuarterValue.f136712b;
                if (inlineFilterNumericRangeValue.getFrom() != null || inlineFilterNumericRangeValue.getTo() != null) {
                    Long to3 = inlineFilterNumericRangeValue.getTo();
                    Integer numValueOf2 = to3 != null ? Integer.valueOf((int) to3.longValue()) : null;
                    Long from2 = inlineFilterNumericRangeValue.getFrom();
                    value = new QuartersParameter.Value(numValueOf2, from2 != null ? Integer.valueOf((int) from2.longValue()) : null);
                }
                quartersParameter2.setValue(value);
            }
            return C49692c.a(c49692c2, null, null, null, null, null, new d.a(b(eVar.a(parametersTreeWithAdditionalImpl2), inlineFilterDeveloperDevelopmentValue)), 63);
        }
        com.avito.conveyor_item.a aVar = ((BigFiltersInternalAction.UpdateParameterValue) bigFiltersInternalAction2).f136710b;
        ParameterSlot parameterSlotFindParameter = parametersTreeWithAdditionalImpl2.f261893e.findParameter(aVar.getF302126x());
        if (aVar instanceof ParameterElement.o) {
            if (parameterSlotFindParameter instanceof PriceParameter) {
                PriceParameter priceParameter = (PriceParameter) parameterSlotFindParameter;
                priceParameter.setOldValue(priceParameter.getValue());
                String str = ((ParameterElement.o) aVar).f262786e;
                priceParameter.setValue(str != null ? com.avito.android.developments_agency_search.screen.big_filters.k.b(str) : null);
                return c49692c2;
            }
            if (!(parameterSlotFindParameter instanceof IntParameter)) {
                return c49692c2;
            }
            IntParameter intParameter = (IntParameter) parameterSlotFindParameter;
            intParameter.setOldValue(intParameter.getValue());
            String str2 = ((ParameterElement.o) aVar).f262786e;
            intParameter.setValue(str2 != null ? C43066x.z0(com.avito.android.developments_agency_search.screen.big_filters.k.b(str2)) : null);
            return c49692c2;
        }
        if ((aVar instanceof com.avito.android.search.filter.converter.common.b) && (parameterSlotFindParameter instanceof BooleanParameter)) {
            BooleanParameter booleanParameter = (BooleanParameter) parameterSlotFindParameter;
            booleanParameter.setOldValue(booleanParameter.getValue());
            booleanParameter.setValue(Boolean.valueOf(((com.avito.android.search.filter.converter.common.b) aVar).f262953d));
            return c49692c2;
        }
        if ((aVar instanceof ParameterElement.v) && (parameterSlotFindParameter instanceof SelectParameter)) {
            SelectParameter selectParameter = (SelectParameter) parameterSlotFindParameter;
            selectParameter.setOldValue(selectParameter.getValue());
            Cp0.e eVar2 = ((ParameterElement.v) aVar).f262844g;
            selectParameter.setValue(eVar2 != null ? eVar2.f2697b : null);
            return c49692c2;
        }
        if (!(aVar instanceof ParameterElement.s) || !(parameterSlotFindParameter instanceof MultiselectParameter)) {
            return c49692c2;
        }
        MultiselectParameter multiselectParameter = (MultiselectParameter) parameterSlotFindParameter;
        multiselectParameter.setOldValue(multiselectParameter.getValue());
        List<Cp0.e> list = ((ParameterElement.s) aVar).f262819e;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Cp0.e) obj).f2700e) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Cp0.e) it.next()).f2697b);
        }
        multiselectParameter.setValue(arrayList2);
        return c49692c2;
    }
}
