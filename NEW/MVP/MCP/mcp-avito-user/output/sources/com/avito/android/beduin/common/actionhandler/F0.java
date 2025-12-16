package com.avito.android.beduin.common.actionhandler;

import Ui.InterfaceC15523b;
import com.avito.android.beduin.common.action.BeduinExecuteRequestAction;
import com.avito.android.beduin.common.action.BeduinRealEstateFilterReloadAction;
import com.avito.android.beduin.common.component.real_estate_filter.BeduinRealEstateFilterModel;
import com.avito.android.beduin.common.component.real_estate_filter.RealEstateFilterState;
import com.avito.android.beduin.common.component.real_estate_filter.RealEstateRequest;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.util.A4;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import lj.InterfaceC43779a;

/* compiled from: BeduinRealEstateFilterReloadActionHandler.kt */
@com.avito.android.di.B
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/F0;", "LUi/b;", "Lcom/avito/android/beduin/common/action/BeduinRealEstateFilterReloadAction;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class F0 implements InterfaceC15523b<BeduinRealEstateFilterReloadAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.beduin.common.form.store.b f100076a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC15523b<BeduinAction>> f100077b;

    @Inject
    public F0(@Y61.k com.avito.android.beduin.common.form.store.b bVar, @Y61.k h31.e<InterfaceC15523b<BeduinAction>> eVar) {
        this.f100076a = bVar;
        this.f100077b = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ui.InterfaceC15523b
    public final void o(BeduinAction beduinAction) {
        BeduinRealEstateFilterReloadAction beduinRealEstateFilterReloadAction = (BeduinRealEstateFilterReloadAction) beduinAction;
        RealEstateFilterState filterState = beduinRealEstateFilterReloadAction.getFilterState();
        RealEstateRequest request = beduinRealEstateFilterReloadAction.getRequest();
        if ((filterState == null || request == null) && beduinRealEstateFilterReloadAction.getTargetFormId() != null && beduinRealEstateFilterReloadAction.getModelId() != null) {
            InterfaceC43779a interfaceC43779a = this.f100076a.get(beduinRealEstateFilterReloadAction.getTargetFormId());
            BeduinModel beduinModelA = interfaceC43779a != null ? com.avito.android.beduin.ui.util.b.a(interfaceC43779a, beduinRealEstateFilterReloadAction.getModelId()) : null;
            BeduinRealEstateFilterModel beduinRealEstateFilterModel = beduinModelA instanceof BeduinRealEstateFilterModel ? (BeduinRealEstateFilterModel) beduinModelA : null;
            if (filterState == null) {
                filterState = beduinRealEstateFilterModel != null ? beduinRealEstateFilterModel.getFilterState() : null;
            }
            if (request == null) {
                request = beduinRealEstateFilterModel != null ? beduinRealEstateFilterModel.getRequest() : null;
            }
        }
        if (filterState == null || request == null) {
            return;
        }
        InterfaceC15523b<BeduinAction> interfaceC15523b = this.f100077b.get();
        List<BeduinAction> onLoadingActions = request.getOnLoadingActions();
        if (onLoadingActions != null) {
            Iterator<T> it = onLoadingActions.iterator();
            while (it.hasNext()) {
                interfaceC15523b.o((BeduinAction) it.next());
            }
        }
        kotlin.jvm.internal.t0 t0Var = new kotlin.jvm.internal.t0(14);
        t0Var.a(new kotlin.Q("id", request.getPageId()));
        t0Var.a(new kotlin.Q("session", request.getSession()));
        t0Var.a(new kotlin.Q("limit", String.valueOf(request.getLimit())));
        t0Var.a(new kotlin.Q("offset", String.valueOf(request.getOffset())));
        t0Var.a(new kotlin.Q("developmentId", filterState.getDevelopmentId()));
        t0Var.a(new kotlin.Q(SearchParamsConverterKt.LOCATION_ID, filterState.getLocationId()));
        t0Var.a(new kotlin.Q("areaFrom", filterState.getAreaFrom()));
        t0Var.a(new kotlin.Q("areaTo", filterState.getAreaTo()));
        t0Var.a(new kotlin.Q("priceFrom", filterState.getPriceFrom()));
        t0Var.a(new kotlin.Q("priceTo", filterState.getPriceTo()));
        t0Var.a(new kotlin.Q("completionDateFrom", filterState.getCompletionDateFrom()));
        t0Var.a(new kotlin.Q("completionDateTo", filterState.getCompletionDateTo()));
        t0Var.a(new kotlin.Q("finishTypeId", filterState.getFinishTypeId()));
        A4 a42 = A4.f318516a;
        List<String> roomsTypeIds = filterState.getRoomsTypeIds();
        Set setP0 = roomsTypeIds != null ? C42745f0.P0(roomsTypeIds) : null;
        a42.getClass();
        HashMap mapG = A4.g("roomsTypeIds", setP0);
        ArrayList arrayList = new ArrayList(mapG.size());
        for (Map.Entry entry : mapG.entrySet()) {
            arrayList.add(new kotlin.Q(entry.getKey(), entry.getValue()));
        }
        t0Var.b(arrayList.toArray(new kotlin.Q[0]));
        ArrayList<Object> arrayList2 = t0Var.f406850a;
        List listU = C42745f0.U(arrayList2.toArray(new kotlin.Q[arrayList2.size()]));
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : listU) {
            if (((kotlin.Q) obj).f406620c != 0) {
                arrayList3.add(obj);
            }
        }
        Iterator it2 = arrayList3.iterator();
        String string = "";
        while (it2.hasNext()) {
            kotlin.Q q12 = (kotlin.Q) it2.next();
            StringBuilder sbR = androidx.compose.foundation.H.r(string.length() == 0 ? "" : string.concat(ContainerUtils.FIELD_DELIMITER));
            sbR.append((String) q12.f406619b);
            sbR.append('=');
            sbR.append((String) q12.f406620c);
            string = sbR.toString();
        }
        interfaceC15523b.o(new BeduinExecuteRequestAction(BeduinExecuteRequestAction.HttpMethod.GET, request.getPath() + '?' + string, null, null, null, request.getOnFailActions(), Boolean.FALSE, null, null, null));
    }
}
