package com.avito.android.beduin.common.component.real_estate_filter;

import Ui.InterfaceC15523b;
import com.avito.android.beduin.common.action.BeduinLogEventAction;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.util.O2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinRealEstateFilterAnalyticsInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/real_estate_filter/a;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.beduin.common.component.real_estate_filter.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28800a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final BeduinRealEstateFilterModel f102284a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15523b<BeduinAction> f102285b;

    public C28800a(@Y61.k BeduinRealEstateFilterModel beduinRealEstateFilterModel, @Y61.k InterfaceC15523b<BeduinAction> interfaceC15523b) {
        this.f102284a = beduinRealEstateFilterModel;
        this.f102285b = interfaceC15523b;
    }

    public final void a(String str, RealEstateFilterState realEstateFilterState, ArrayList arrayList) {
        Object objA = C28801b.a(this.f102284a.getFilterState(), str);
        Object objA2 = C28801b.a(realEstateFilterState, str);
        if (L.f(objA, objA2)) {
            return;
        }
        if (objA2 instanceof String) {
            CharSequence charSequence = (CharSequence) objA2;
            zA = !(charSequence == null || charSequence.length() == 0);
        } else if (objA2 instanceof List) {
            zA = O2.a((List) objA2);
        } else if (objA2 != null) {
            zA = true;
        }
        if (zA) {
            arrayList.add(str);
        }
    }

    public final void b(@Y61.k RealEstateFilterState realEstateFilterState) {
        RealEstateCompletionDate realEstateCompletionDate;
        RealEstateRoomType realEstateRoomType;
        RealEstateFinishType realEstateFinishType;
        Object next;
        Object next2;
        Object next3;
        BeduinRealEstateFilterModel beduinRealEstateFilterModel = this.f102284a;
        List<RealEstateCompletionDate> completionDates = beduinRealEstateFilterModel.getFilters().getCompletionDates();
        if (completionDates != null) {
            Iterator<T> it = completionDates.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it.next();
                RealEstateCompletionDate realEstateCompletionDate2 = (RealEstateCompletionDate) next3;
                if (L.f(realEstateCompletionDate2.getFrom(), realEstateFilterState.getCompletionDateFrom()) && L.f(realEstateCompletionDate2.getTo(), realEstateFilterState.getCompletionDateTo())) {
                    break;
                }
            }
            realEstateCompletionDate = (RealEstateCompletionDate) next3;
        } else {
            realEstateCompletionDate = null;
        }
        List<RealEstateRoomType> roomsTypes = beduinRealEstateFilterModel.getFilters().getRoomsTypes();
        if (roomsTypes != null) {
            Iterator<T> it2 = roomsTypes.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                String id2 = ((RealEstateRoomType) next2).getId();
                List<String> roomsTypeIds = realEstateFilterState.getRoomsTypeIds();
                if (L.f(id2, roomsTypeIds != null ? (String) C42745f0.G(roomsTypeIds) : null)) {
                    break;
                }
            }
            realEstateRoomType = (RealEstateRoomType) next2;
        } else {
            realEstateRoomType = null;
        }
        List<RealEstateFinishType> finishTypes = beduinRealEstateFilterModel.getFilters().getFinishTypes();
        if (finishTypes != null) {
            Iterator<T> it3 = finishTypes.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next = it3.next();
                    if (L.f(((RealEstateFinishType) next).getId(), realEstateFilterState.getFinishTypeId())) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            realEstateFinishType = (RealEstateFinishType) next;
        } else {
            realEstateFinishType = null;
        }
        Map mapG = P0.g(new Q("Срок сдачи", realEstateCompletionDate != null ? realEstateCompletionDate.getName() : null), new Q("Количество комнат", realEstateRoomType != null ? realEstateRoomType.getName() : null), new Q("Отделка", realEstateFinishType != null ? realEstateFinishType.getName() : null), new Q("Площадь от", realEstateFilterState.getAreaFrom()), new Q("Площадь до", realEstateFilterState.getAreaTo()), new Q("Цена от", realEstateFilterState.getPriceFrom()), new Q("Цена до", realEstateFilterState.getPriceTo()));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapG.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        d(new com.google.gson.d().a().l(Collections.singletonMap("filter", linkedHashMap)));
    }

    public final void c(String str, String str2) {
        String str3;
        RealEstateFiltersLogEvent filtersLogEvent = this.f102284a.getFiltersLogEvent();
        if (filtersLogEvent == null) {
            return;
        }
        Map<String, String> params = filtersLogEvent.getParams();
        Map linkedHashMap = params != null ? new LinkedHashMap(params) : new HashMap();
        String filterParamName = filtersLogEvent.getFilterParamName();
        if (filterParamName != null) {
            Map<String, String> paramsMap = filtersLogEvent.getParamsMap();
            if (paramsMap != null && (str3 = paramsMap.get(str)) != null) {
                str = str3;
            }
        }
        String locationParamName = filtersLogEvent.getLocationParamName();
        if (locationParamName != null && str2 != null) {
        }
        this.f102285b.o(new BeduinLogEventAction(filtersLogEvent.getId(), filtersLogEvent.getVersion(), linkedHashMap, null, filtersLogEvent.getHasSensitiveData()));
    }

    public final void d(String str) {
        RealEstateRequestLogEvent requestLogEvent = this.f102284a.getRequestLogEvent();
        if (requestLogEvent == null) {
            return;
        }
        int id2 = requestLogEvent.getId();
        int version = requestLogEvent.getVersion();
        Map<String, String> params = requestLogEvent.getParams();
        if (params == null) {
            params = P0.c();
        }
        this.f102285b.o(new BeduinLogEventAction(id2, version, P0.k(params, Collections.singletonMap("bs_context", str)), null, requestLogEvent.getHasSensitiveData()));
    }
}
