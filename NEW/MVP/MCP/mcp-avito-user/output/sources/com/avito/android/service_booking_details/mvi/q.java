package com.avito.android.service_booking_details.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.service_booking_details.mvi.entity.ServiceBookingItemDetailsInternalAction;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ServiceBookingItemDetailsReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_details/mvi/q;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/service_booking_details/mvi/entity/ServiceBookingItemDetailsInternalAction;", "LBt0/c;", "_avito_service-booking-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class q implements u<ServiceBookingItemDetailsInternalAction, Bt0.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final a f277453b;

    @Inject
    public q(@Y61.k a aVar) {
        this.f277453b = aVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final Bt0.c a(ServiceBookingItemDetailsInternalAction serviceBookingItemDetailsInternalAction, Bt0.c cVar) {
        ServiceBookingItemDetailsInternalAction serviceBookingItemDetailsInternalAction2 = serviceBookingItemDetailsInternalAction;
        Bt0.c cVarA = cVar;
        if (serviceBookingItemDetailsInternalAction2 instanceof ServiceBookingItemDetailsInternalAction.Content) {
            cVarA = Bt0.c.a(((ServiceBookingItemDetailsInternalAction.Content) serviceBookingItemDetailsInternalAction2).f277365b, null, null, false, cVarA.f1776k, 511);
        } else if (serviceBookingItemDetailsInternalAction2 instanceof ServiceBookingItemDetailsInternalAction.Error) {
            cVarA = Bt0.c.a(cVarA, null, ((ServiceBookingItemDetailsInternalAction.Error) serviceBookingItemDetailsInternalAction2).f277367b, false, 0, 639);
        } else if (serviceBookingItemDetailsInternalAction2 instanceof ServiceBookingItemDetailsInternalAction.Loading) {
            cVarA = Bt0.c.a(cVarA, null, null, true, 0, 639);
        } else if (serviceBookingItemDetailsInternalAction2 instanceof ServiceBookingItemDetailsInternalAction.SetActivityResult) {
            ((ServiceBookingItemDetailsInternalAction.SetActivityResult) serviceBookingItemDetailsInternalAction2).getClass();
            cVarA = Bt0.c.a(cVarA, null, null, false, -1, 511);
        } else {
            boolean z12 = serviceBookingItemDetailsInternalAction2 instanceof ServiceBookingItemDetailsInternalAction.PhoneNumberSuccess;
            List<com.avito.conveyor_item.a> list = cVarA.f1770e;
            if (z12) {
                List<com.avito.conveyor_item.a> list2 = list;
                ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
                for (TV0.a aVarA : list2) {
                    if (aVarA instanceof com.avito.android.service_booking_common.blueprints.contact.c) {
                        com.avito.android.service_booking_common.blueprints.contact.c cVar2 = (com.avito.android.service_booking_common.blueprints.contact.c) aVarA;
                        ServiceBookingItemDetailsInternalAction.PhoneNumberSuccess phoneNumberSuccess = (ServiceBookingItemDetailsInternalAction.PhoneNumberSuccess) serviceBookingItemDetailsInternalAction2;
                        if (L.f(cVar2.f276288c, phoneNumberSuccess.f277380c)) {
                            aVarA = com.avito.android.service_booking_common.blueprints.contact.c.a(cVar2, true, phoneNumberSuccess.f277379b, 63);
                        }
                    }
                    arrayList.add(aVarA);
                }
                cVarA = Bt0.c.a(cVarA, arrayList, null, false, 0, 1015);
            } else if (serviceBookingItemDetailsInternalAction2 instanceof ServiceBookingItemDetailsInternalAction.OnShowPhone) {
                List<com.avito.conveyor_item.a> list3 = list;
                ArrayList arrayList2 = new ArrayList(C42745f0.q(list3, 10));
                for (TV0.a aVarA2 : list3) {
                    if (aVarA2 instanceof com.avito.android.service_booking_common.blueprints.contact.c) {
                        com.avito.android.service_booking_common.blueprints.contact.c cVar3 = (com.avito.android.service_booking_common.blueprints.contact.c) aVarA2;
                        if (L.f(cVar3.f276288c, ((ServiceBookingItemDetailsInternalAction.OnShowPhone) serviceBookingItemDetailsInternalAction2).f277373c)) {
                            aVarA2 = com.avito.android.service_booking_common.blueprints.contact.c.a(cVar3, false, null, 383);
                        }
                    }
                    arrayList2.add(aVarA2);
                }
                cVarA = Bt0.c.a(cVarA, arrayList2, null, false, 0, 1015);
            } else if (serviceBookingItemDetailsInternalAction2 instanceof ServiceBookingItemDetailsInternalAction.PhoneNumberErrorToast) {
                List<com.avito.conveyor_item.a> list4 = list;
                ArrayList arrayList3 = new ArrayList(C42745f0.q(list4, 10));
                for (TV0.a aVarA3 : list4) {
                    if (aVarA3 instanceof com.avito.android.service_booking_common.blueprints.contact.c) {
                        com.avito.android.service_booking_common.blueprints.contact.c cVar4 = (com.avito.android.service_booking_common.blueprints.contact.c) aVarA3;
                        if (L.f(cVar4.f276288c, ((ServiceBookingItemDetailsInternalAction.PhoneNumberErrorToast) serviceBookingItemDetailsInternalAction2).f277377d)) {
                            aVarA3 = com.avito.android.service_booking_common.blueprints.contact.c.a(cVar4, true, null, 383);
                        }
                    }
                    arrayList3.add(aVarA3);
                }
                cVarA = Bt0.c.a(cVarA, arrayList3, null, false, 0, 1015);
            }
        }
        this.f277453b.a(serviceBookingItemDetailsInternalAction2);
        return cVarA;
    }
}
