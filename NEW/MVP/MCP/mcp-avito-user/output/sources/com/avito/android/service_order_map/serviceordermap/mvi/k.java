package com.avito.android.service_order_map.serviceordermap.mvi;

import com.avito.android.arch.mvi.t;
import com.avito.android.service_order_map.serviceordermap.mvi.entity.ServiceOrderMapInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import vu0.InterfaceC49384a;

/* compiled from: ServiceOrderMapOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/mvi/k;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/ServiceOrderMapInternalAction;", "Lvu0/a;", "<init>", "()V", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k implements t<ServiceOrderMapInternalAction, InterfaceC49384a> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC49384a b(ServiceOrderMapInternalAction serviceOrderMapInternalAction) {
        ServiceOrderMapInternalAction serviceOrderMapInternalAction2 = serviceOrderMapInternalAction;
        if (serviceOrderMapInternalAction2 instanceof ServiceOrderMapInternalAction.UpdatePinCoordinates) {
            ServiceOrderMapInternalAction.UpdatePinCoordinates updatePinCoordinates = (ServiceOrderMapInternalAction.UpdatePinCoordinates) serviceOrderMapInternalAction2;
            return new InterfaceC49384a.e(updatePinCoordinates.f278765b, updatePinCoordinates.f278766c, updatePinCoordinates.f278767d);
        }
        if (serviceOrderMapInternalAction2 instanceof ServiceOrderMapInternalAction.RequestLocationPermission) {
            return InterfaceC49384a.d.f441043a;
        }
        if (serviceOrderMapInternalAction2 instanceof ServiceOrderMapInternalAction.CloseWithResult) {
            ServiceOrderMapInternalAction.CloseWithResult closeWithResult = (ServiceOrderMapInternalAction.CloseWithResult) serviceOrderMapInternalAction2;
            return new InterfaceC49384a.b(closeWithResult.f278760c, closeWithResult.f278761d, closeWithResult.f278759b);
        }
        if (serviceOrderMapInternalAction2 instanceof ServiceOrderMapInternalAction.UnknownError ? true : serviceOrderMapInternalAction2 instanceof ServiceOrderMapInternalAction.NetworkError) {
            return InterfaceC49384a.c.f441042a;
        }
        if (serviceOrderMapInternalAction2 instanceof ServiceOrderMapInternalAction.Back) {
            return InterfaceC49384a.C12798a.f441038a;
        }
        return null;
    }
}
