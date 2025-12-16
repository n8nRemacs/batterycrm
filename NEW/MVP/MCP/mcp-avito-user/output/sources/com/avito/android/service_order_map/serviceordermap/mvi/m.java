package com.avito.android.service_order_map.serviceordermap.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.service_order_map.serviceordermap.mvi.entity.ServiceOrderMapInternalAction;
import com.avito.android.service_order_map.serviceordermap.mvi.entity.ServiceOrderMapState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ServiceOrderMapReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/mvi/m;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/ServiceOrderMapInternalAction;", "Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/ServiceOrderMapState;", "<init>", "()V", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m implements u<ServiceOrderMapInternalAction, ServiceOrderMapState> {
    @Inject
    public m() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final ServiceOrderMapState a(ServiceOrderMapInternalAction serviceOrderMapInternalAction, ServiceOrderMapState serviceOrderMapState) {
        ServiceOrderMapInternalAction serviceOrderMapInternalAction2 = serviceOrderMapInternalAction;
        ServiceOrderMapState serviceOrderMapState2 = serviceOrderMapState;
        if (serviceOrderMapInternalAction2 instanceof ServiceOrderMapInternalAction.LoadingStarted) {
            return ServiceOrderMapState.a(serviceOrderMapState2, null, null, null, null, true, null, null, null, null, 495);
        }
        if (serviceOrderMapInternalAction2 instanceof ServiceOrderMapInternalAction.AddressUpdate) {
            ServiceOrderMapInternalAction.AddressUpdate addressUpdate = (ServiceOrderMapInternalAction.AddressUpdate) serviceOrderMapInternalAction2;
            Double dValueOf = Double.valueOf(addressUpdate.f278755c);
            Double dValueOf2 = Double.valueOf(addressUpdate.f278756d);
            String str = addressUpdate.f278754b;
            return ServiceOrderMapState.a(serviceOrderMapState2, str, str, dValueOf, dValueOf2, false, null, null, null, null, 480);
        }
        if (serviceOrderMapInternalAction2 instanceof ServiceOrderMapInternalAction.UpdateTextResources) {
            ServiceOrderMapInternalAction.UpdateTextResources updateTextResources = (ServiceOrderMapInternalAction.UpdateTextResources) serviceOrderMapInternalAction2;
            return ServiceOrderMapState.a(serviceOrderMapState2, null, null, null, null, false, updateTextResources.f278770b, updateTextResources.f278771c, null, null, 415);
        }
        if (serviceOrderMapInternalAction2 instanceof ServiceOrderMapInternalAction.UpdatePinCoordinates ? true : serviceOrderMapInternalAction2 instanceof ServiceOrderMapInternalAction.NetworkError ? true : serviceOrderMapInternalAction2 instanceof ServiceOrderMapInternalAction.CloseWithResult ? true : serviceOrderMapInternalAction2 instanceof ServiceOrderMapInternalAction.UnknownError ? true : serviceOrderMapInternalAction2 instanceof ServiceOrderMapInternalAction.Back ? true : serviceOrderMapInternalAction2.equals(ServiceOrderMapInternalAction.RequestLocationPermission.f278763b)) {
            return ServiceOrderMapState.a(serviceOrderMapState2, null, null, null, null, false, null, null, null, null, 495);
        }
        if (serviceOrderMapInternalAction2 instanceof ServiceOrderMapInternalAction.UpdateSearchSuggestions) {
            ServiceOrderMapInternalAction.UpdateSearchSuggestions updateSearchSuggestions = (ServiceOrderMapInternalAction.UpdateSearchSuggestions) serviceOrderMapInternalAction2;
            return ServiceOrderMapState.a(serviceOrderMapState2, updateSearchSuggestions.f278768b, null, null, null, false, null, null, updateSearchSuggestions.f278769c, null, 366);
        }
        if (serviceOrderMapInternalAction2 instanceof ServiceOrderMapInternalAction.ChangeMode) {
            return ServiceOrderMapState.a(serviceOrderMapState2, null, null, null, null, false, null, null, null, ((ServiceOrderMapInternalAction.ChangeMode) serviceOrderMapInternalAction2).f278758b, 239);
        }
        throw new NoWhenBranchMatchedException();
    }
}
