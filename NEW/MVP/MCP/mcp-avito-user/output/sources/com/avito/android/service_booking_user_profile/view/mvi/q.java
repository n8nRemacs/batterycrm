package com.avito.android.service_booking_user_profile.view.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.service_booking_user_profile.view.item.b;
import com.avito.android.service_booking_user_profile.view.model.ServiceBookingBlockParams;
import com.avito.android.service_booking_user_profile.view.mvi.entity.ServiceBookingBlockState;
import du0.C39805a;
import eu0.InterfaceC40160c;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ServiceBookingBlockReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_user_profile/view/mvi/q;", "Lcom/avito/android/arch/mvi/u;", "Leu0/c;", "Lcom/avito/android/service_booking_user_profile/view/mvi/entity/ServiceBookingBlockState;", "_avito_service-booking-user-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class q implements u<InterfaceC40160c, ServiceBookingBlockState> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking_user_profile.view.item.c f278276b;

    @Inject
    public q(@Y61.k com.avito.android.service_booking_user_profile.view.item.c cVar) {
        this.f278276b = cVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final ServiceBookingBlockState a(InterfaceC40160c interfaceC40160c, ServiceBookingBlockState serviceBookingBlockState) {
        ServiceBookingBlockState serviceBookingBlockState2;
        ServiceBookingBlockState serviceBookingBlockStateA;
        InterfaceC40160c interfaceC40160c2 = interfaceC40160c;
        ServiceBookingBlockState serviceBookingBlockState3 = serviceBookingBlockState;
        boolean z12 = interfaceC40160c2 instanceof InterfaceC40160c.b;
        ServiceBookingBlockParams serviceBookingBlockParams = serviceBookingBlockState3.f278246a;
        com.avito.android.service_booking_user_profile.view.item.c cVar = this.f278276b;
        if (z12) {
            InterfaceC40160c.b bVar = (InterfaceC40160c.b) interfaceC40160c2;
            if (serviceBookingBlockParams != null) {
                ServiceBookingBlockState.Type type = ServiceBookingBlockState.Type.f278252d;
                C39805a c39805a = bVar.f395438a;
                serviceBookingBlockStateA = ServiceBookingBlockState.a(serviceBookingBlockState3, c39805a, type, new ServiceBookingBlockState.a.C8270a(cVar.a(new b.a.C8263b(serviceBookingBlockParams, c39805a))), 1);
            } else {
                serviceBookingBlockStateA = ServiceBookingBlockState.a(serviceBookingBlockState3, bVar.f395438a, ServiceBookingBlockState.Type.f278250b, ServiceBookingBlockState.a.b.f278257a, 1);
            }
            return serviceBookingBlockStateA;
        }
        if (interfaceC40160c2 instanceof InterfaceC40160c.d) {
            ServiceBookingBlockState.Type type2 = ServiceBookingBlockState.Type.f278251c;
            ServiceBookingBlockParams serviceBookingBlockParams2 = ((InterfaceC40160c.d) interfaceC40160c2).f395440a;
            serviceBookingBlockState2 = new ServiceBookingBlockState(serviceBookingBlockParams2, null, type2, new ServiceBookingBlockState.a.C8270a(cVar.a(new b.a.c(serviceBookingBlockParams2))));
        } else {
            if (interfaceC40160c2 instanceof InterfaceC40160c.a) {
                return ServiceBookingBlockState.a(serviceBookingBlockState3, null, ServiceBookingBlockState.Type.f278253e, serviceBookingBlockParams == null ? ServiceBookingBlockState.a.b.f278257a : new ServiceBookingBlockState.a.C8270a(cVar.a(new b.a.C8262a(serviceBookingBlockParams))), 3);
            }
            if (!(interfaceC40160c2 instanceof InterfaceC40160c.C11113c)) {
                if ((interfaceC40160c2 instanceof InterfaceC40160c.f) || (interfaceC40160c2 instanceof InterfaceC40160c.e)) {
                    return serviceBookingBlockState3;
                }
                if (interfaceC40160c2 instanceof InterfaceC40160c.g) {
                    return new ServiceBookingBlockState(null, null, null, null, 15, null);
                }
                throw new NoWhenBranchMatchedException();
            }
            ServiceBookingBlockState.Type type3 = ServiceBookingBlockState.Type.f278252d;
            ServiceBookingBlockParams serviceBookingBlockParams3 = ((InterfaceC40160c.C11113c) interfaceC40160c2).f395439a;
            serviceBookingBlockState2 = new ServiceBookingBlockState(serviceBookingBlockParams3, null, type3, new ServiceBookingBlockState.a.C8270a(cVar.a(new b.a.C8263b(serviceBookingBlockParams3, null))));
        }
        return serviceBookingBlockState2;
    }
}
