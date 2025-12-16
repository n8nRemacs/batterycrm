package com.avito.android.service_booking.mvi.step.mvi;

import com.avito.android.error.z;
import com.avito.android.service_booking.BookingFlow;
import com.avito.android.service_booking.mvi.step.mvi.entity.ServiceBookingMviStepInternalAction;
import com.avito.android.service_booking.mvi.step.mvi.entity.ServiceBookingMviStepState;
import com.avito.android.service_booking_common.blueprints.SbInputItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import okhttp3.internal.ws.WebSocketProtocol;
import qt0.C47439c;
import qt0.C47440d;

/* compiled from: ServiceBookingMviStepReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/mvi/s;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepState;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class s implements com.avito.android.arch.mvi.u<ServiceBookingMviStepInternalAction, ServiceBookingMviStepState> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking_common.n f274791b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking.mvi.a f274792c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final BookingFlow f274793d;

    @Inject
    public s(@Y61.k com.avito.android.service_booking_common.n nVar, @Y61.k com.avito.android.service_booking.mvi.a aVar, @com.avito.android.service_booking.mvi.di.d @Y61.k BookingFlow bookingFlow) {
        this.f274791b = nVar;
        this.f274792c = aVar;
        this.f274793d = bookingFlow;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.lang.Object] */
    @Override // com.avito.android.arch.mvi.u
    public final ServiceBookingMviStepState a(ServiceBookingMviStepInternalAction serviceBookingMviStepInternalAction, ServiceBookingMviStepState serviceBookingMviStepState) {
        C47440d c47440d;
        C47440d c47440dB;
        List<com.avito.conveyor_item.a> list;
        C47440d next;
        LinkedHashMap linkedHashMapD;
        String str;
        LinkedHashMap linkedHashMapD2;
        C47440d c47440d2;
        Integer numValueOf;
        C47440d.b bVar;
        Map<C47440d.a, C47440d.c> map;
        Set<Map.Entry<C47440d.a, C47440d.c>> setEntrySet;
        List<com.avito.conveyor_item.a> list2;
        C47440d next2;
        LinkedHashMap linkedHashMapD3;
        ArrayList arrayList;
        C47439c c47439c;
        List arrayList2;
        C47439c c47439cB;
        C47439c next3;
        List<com.avito.conveyor_item.a> list3;
        C47440d c47440d3;
        C47440d c47440dB2;
        List<com.avito.conveyor_item.a> list4;
        Object next4;
        ServiceBookingMviStepInternalAction serviceBookingMviStepInternalAction2 = serviceBookingMviStepInternalAction;
        ServiceBookingMviStepState serviceBookingMviStepStateB = serviceBookingMviStepState;
        if (serviceBookingMviStepInternalAction2 instanceof ServiceBookingMviStepInternalAction.Loading) {
            serviceBookingMviStepStateB = ServiceBookingMviStepState.a(serviceBookingMviStepStateB, true, null, null, null, false, null, WebSocketProtocol.PAYLOAD_SHORT);
        } else if (serviceBookingMviStepInternalAction2 instanceof ServiceBookingMviStepInternalAction.ShowError) {
            serviceBookingMviStepStateB = ServiceBookingMviStepState.a(serviceBookingMviStepStateB, false, null, z.l(((ServiceBookingMviStepInternalAction.ShowError) serviceBookingMviStepInternalAction2).f274698b), null, false, null, 120);
        } else if (serviceBookingMviStepInternalAction2 instanceof ServiceBookingMviStepInternalAction.ShowToastError) {
            serviceBookingMviStepStateB = ServiceBookingMviStepState.a(serviceBookingMviStepStateB, false, null, null, null, false, new LinkedHashMap(), 62);
        } else {
            boolean z12 = serviceBookingMviStepInternalAction2 instanceof ServiceBookingMviStepInternalAction.SuccessContent;
            Map<String, Set<Object>> map2 = serviceBookingMviStepStateB.f274719h;
            if (z12) {
                ServiceBookingMviStepInternalAction.SuccessContent successContent = (ServiceBookingMviStepInternalAction.SuccessContent) serviceBookingMviStepInternalAction2;
                LinkedHashMap linkedHashMapD4 = com.avito.android.service_booking.mvi.domain.d.d(map2);
                for (Q q12 : successContent.f274705d) {
                    String str2 = (String) q12.f406619b;
                    Object obj = q12.f406620c;
                    if (obj != null) {
                        com.avito.android.service_booking.mvi.domain.d.a(linkedHashMapD4, str2, obj);
                    }
                }
                serviceBookingMviStepStateB = ServiceBookingMviStepState.a(serviceBookingMviStepStateB, false, null, null, successContent.f274703b, successContent.f274704c, linkedHashMapD4, 32);
            } else if (serviceBookingMviStepInternalAction2 instanceof ServiceBookingMviStepInternalAction.SuccessSaveRequest) {
                serviceBookingMviStepStateB = ServiceBookingMviStepState.a(serviceBookingMviStepStateB, false, null, null, null, false, null, WebSocketProtocol.PAYLOAD_SHORT);
            } else if (serviceBookingMviStepInternalAction2 instanceof ServiceBookingMviStepInternalAction.ServiceBookingErrorAction.Failure) {
                serviceBookingMviStepStateB = ServiceBookingMviStepState.a(serviceBookingMviStepStateB, false, ((ServiceBookingMviStepInternalAction.ServiceBookingErrorAction.Failure) serviceBookingMviStepInternalAction2).f274695c, null, null, false, null, 112);
            } else if (serviceBookingMviStepInternalAction2 instanceof ServiceBookingMviStepInternalAction.ServiceBookingErrorAction.PartnerServiceError) {
                serviceBookingMviStepStateB = ServiceBookingMviStepState.a(serviceBookingMviStepStateB, false, ((ServiceBookingMviStepInternalAction.ServiceBookingErrorAction.PartnerServiceError) serviceBookingMviStepInternalAction2).f274696c, null, null, false, null, 112);
            } else if (serviceBookingMviStepInternalAction2 instanceof ServiceBookingMviStepInternalAction.ServiceBookingErrorAction.WrongSlotError) {
                serviceBookingMviStepStateB = ServiceBookingMviStepState.a(serviceBookingMviStepStateB, false, ((ServiceBookingMviStepInternalAction.ServiceBookingErrorAction.WrongSlotError) serviceBookingMviStepInternalAction2).f274697c, null, null, false, null, 112);
            } else {
                boolean z13 = serviceBookingMviStepInternalAction2 instanceof ServiceBookingMviStepInternalAction.TimeSlotsInternalAction;
                ServiceBookingMviStepState.ServiceBookingContent serviceBookingContent = serviceBookingMviStepStateB.f274716e;
                if (z13) {
                    if (serviceBookingContent == null || (list4 = serviceBookingContent.f274726h) == null) {
                        c47440d3 = null;
                    } else {
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj2 : list4) {
                            if (obj2 instanceof C47440d) {
                                arrayList3.add(obj2);
                            }
                        }
                        Iterator it = arrayList3.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next4 = null;
                                break;
                            }
                            next4 = it.next();
                            if (L.f(((C47440d) next4).f429411b, ((ServiceBookingMviStepInternalAction.TimeSlotsInternalAction) serviceBookingMviStepInternalAction2).c().f406619b.f429416c)) {
                                break;
                            }
                        }
                        c47440d3 = (C47440d) next4;
                    }
                    if (c47440d3 != null) {
                        Set<Map.Entry<C47440d.a, C47440d.c>> setEntrySet2 = c47440d3.f429413d.entrySet();
                        int iF2 = P0.f(C42745f0.q(setEntrySet2, 10));
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2 >= 16 ? iF2 : 16);
                        Iterator it2 = setEntrySet2.iterator();
                        while (it2.hasNext()) {
                            Map.Entry entry = (Map.Entry) it2.next();
                            C47440d.c cVarA = ((C47440d.c) entry.getValue()).a(q.f274789l);
                            ServiceBookingMviStepInternalAction.TimeSlotsInternalAction timeSlotsInternalAction = (ServiceBookingMviStepInternalAction.TimeSlotsInternalAction) serviceBookingMviStepInternalAction2;
                            if (L.f(((C47440d.a) entry.getKey()).f429415b, timeSlotsInternalAction.c().f406619b.f429415b)) {
                                cVarA = timeSlotsInternalAction.c().f406620c;
                            }
                            linkedHashMap.put(C47440d.a.a((C47440d.a) entry.getKey(), L.f(((C47440d.a) entry.getKey()).f429415b, timeSlotsInternalAction.c().f406619b.f429415b)), cVarA);
                        }
                        c47440dB2 = C47440d.b(c47440d3, linkedHashMap, null, 11);
                    } else {
                        c47440dB2 = null;
                    }
                    serviceBookingMviStepStateB = t.b(serviceBookingMviStepStateB, c47440dB2, null, null, this.f274793d, 14);
                } else {
                    boolean z14 = serviceBookingMviStepInternalAction2 instanceof ServiceBookingMviStepInternalAction.OnServiceClicked;
                    com.avito.android.service_booking_common.n nVar = this.f274791b;
                    if (z14) {
                        ServiceBookingMviStepInternalAction.OnServiceClicked onServiceClicked = (ServiceBookingMviStepInternalAction.OnServiceClicked) serviceBookingMviStepInternalAction2;
                        C47439c.a aVar = onServiceClicked.f274681b;
                        boolean z15 = aVar.f429409e;
                        String str3 = aVar.f429405a;
                        String str4 = onServiceClicked.f274682c;
                        if (z15) {
                            linkedHashMapD3 = com.avito.android.service_booking.mvi.domain.d.d(map2);
                            Object linkedHashSet = linkedHashMapD3.get(str4);
                            if (linkedHashSet == null) {
                                linkedHashSet = new LinkedHashSet();
                                linkedHashMapD3.put(str4, linkedHashSet);
                            }
                            ((Set) linkedHashSet).remove(str3);
                        } else {
                            linkedHashMapD3 = com.avito.android.service_booking.mvi.domain.d.d(map2);
                            com.avito.android.service_booking.mvi.domain.d.a(linkedHashMapD3, str4, str3);
                        }
                        LinkedHashMap linkedHashMap2 = linkedHashMapD3;
                        if (serviceBookingContent == null || (list3 = serviceBookingContent.f274726h) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList();
                            for (Object obj3 : list3) {
                                if (obj3 instanceof C47439c) {
                                    arrayList.add(obj3);
                                }
                            }
                        }
                        if (arrayList != null) {
                            Iterator it3 = arrayList.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    next3 = 0;
                                    break;
                                }
                                next3 = it3.next();
                                if (L.f(((C47439c) next3).f429400b, aVar.f429406b)) {
                                    break;
                                }
                            }
                            c47439c = next3;
                        } else {
                            c47439c = null;
                        }
                        if (arrayList != null) {
                            arrayList2 = new ArrayList();
                            Iterator it4 = arrayList.iterator();
                            while (it4.hasNext()) {
                                List<C47439c.a> list5 = ((C47439c) it4.next()).f429404f;
                                ArrayList arrayList4 = new ArrayList();
                                for (Object obj4 : list5) {
                                    C47439c.a aVar2 = (C47439c.a) obj4;
                                    if (!L.f(aVar2.f429405a, str3) && aVar2.f429409e) {
                                        arrayList4.add(obj4);
                                    }
                                }
                                C42745f0.h(arrayList4, arrayList2);
                            }
                        } else {
                            arrayList2 = C42784z0.f406748b;
                        }
                        boolean zIsEmpty = arrayList2.isEmpty();
                        boolean z16 = aVar.f429409e;
                        boolean z17 = (zIsEmpty && z16) ? false : true;
                        if (c47439c != null) {
                            List<C47439c.a> list6 = c47439c.f429404f;
                            ArrayList arrayList5 = new ArrayList(C42745f0.q(list6, 10));
                            for (C47439c.a aVar3 : list6) {
                                arrayList5.add(L.f(aVar3.f429405a, str3) ? C47439c.a.a(aVar3, !z16, 47) : C47439c.a.a(aVar3, false, 63));
                            }
                            c47439cB = C47439c.b(c47439c, false, arrayList5, 15);
                        } else {
                            c47439cB = null;
                        }
                        t.a(serviceBookingMviStepStateB, str4, !z17);
                        serviceBookingMviStepStateB = t.b(serviceBookingMviStepStateB, c47439cB, nVar.e(nVar.b(Integer.valueOf(arrayList2.size() + (z16 ^ true ? 1 : 0)))), linkedHashMap2, this.f274793d, 2);
                    } else if (serviceBookingMviStepInternalAction2 instanceof ServiceBookingMviStepInternalAction.OnServiceGroupClicked) {
                        serviceBookingMviStepStateB = t.b(serviceBookingMviStepStateB, ((ServiceBookingMviStepInternalAction.OnServiceGroupClicked) serviceBookingMviStepInternalAction2).f274683b, null, null, this.f274793d, 14);
                    } else if (serviceBookingMviStepInternalAction2 instanceof ServiceBookingMviStepInternalAction.OnSlotSelected) {
                        if (serviceBookingContent == null || (list2 = serviceBookingContent.f274726h) == null) {
                            c47440d2 = null;
                        } else {
                            ArrayList arrayList6 = new ArrayList();
                            for (Object obj5 : list2) {
                                if (obj5 instanceof C47440d) {
                                    arrayList6.add(obj5);
                                }
                            }
                            Iterator it5 = arrayList6.iterator();
                            while (true) {
                                if (!it5.hasNext()) {
                                    next2 = 0;
                                    break;
                                }
                                next2 = it5.next();
                                if (L.f(((C47440d) next2).f429411b, ((ServiceBookingMviStepInternalAction.OnSlotSelected) serviceBookingMviStepInternalAction2).f274687b.f429416c)) {
                                    break;
                                }
                            }
                            c47440d2 = next2;
                        }
                        if (c47440d2 == null || (map = c47440d2.f429413d) == null || (setEntrySet = map.entrySet()) == null) {
                            numValueOf = null;
                        } else {
                            Iterator it6 = setEntrySet.iterator();
                            int i12 = 0;
                            while (true) {
                                if (!it6.hasNext()) {
                                    i12 = -1;
                                    break;
                                }
                                Object next5 = it6.next();
                                if (i12 < 0) {
                                    C42745f0.H0();
                                    throw null;
                                }
                                if (((C47440d.a) ((Map.Entry) next5).getKey()).f429418e) {
                                    break;
                                }
                                i12++;
                            }
                            numValueOf = Integer.valueOf(i12);
                        }
                        if (numValueOf != null) {
                            C47440d.a aVar4 = ((ServiceBookingMviStepInternalAction.OnSlotSelected) serviceBookingMviStepInternalAction2).f274687b;
                            t.a(serviceBookingMviStepStateB, aVar4.f429416c, false);
                            Set<Map.Entry<C47440d.a, C47440d.c>> setEntrySet3 = c47440d2.f429413d.entrySet();
                            int iF3 = P0.f(C42745f0.q(setEntrySet3, 10));
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap(iF3 >= 16 ? iF3 : 16);
                            Iterator it7 = setEntrySet3.iterator();
                            while (it7.hasNext()) {
                                Map.Entry entry2 = (Map.Entry) it7.next();
                                l0.a aVar5 = new l0.a();
                                linkedHashMap3.put(C47440d.a.a((C47440d.a) entry2.getKey(), aVar5.f406838b), ((C47440d.c) entry2.getValue()).a(new p(aVar5, serviceBookingMviStepInternalAction2)));
                            }
                            C47440d.b bVar2 = c47440d2.f429414e;
                            if (bVar2 != null) {
                                int i13 = bVar2.f429420a;
                                int i14 = bVar2.f429421b;
                                C47440d.b bVar3 = new C47440d.b(i13, i14);
                                if (!new kotlin.ranges.l(i13, i14, 1).h(numValueOf.intValue())) {
                                    bVar3 = null;
                                }
                                bVar = bVar3 == null ? new C47440d.b(numValueOf.intValue(), numValueOf.intValue()) : bVar3;
                            } else {
                                bVar = null;
                            }
                            C47440d c47440dB3 = C47440d.b(c47440d2, linkedHashMap3, bVar, 3);
                            String strE = nVar.e(nVar.a(aVar4.f429417d));
                            LinkedHashMap linkedHashMapD5 = com.avito.android.service_booking.mvi.domain.d.d(map2);
                            String str5 = aVar4.f429416c;
                            linkedHashMapD5.remove(str5);
                            com.avito.android.service_booking.mvi.domain.d.a(linkedHashMapD5, str5, aVar4.f429415b);
                            serviceBookingMviStepStateB = t.b(serviceBookingMviStepStateB, c47440dB3, strE, linkedHashMapD5, this.f274793d, 2);
                        }
                    } else if (serviceBookingMviStepInternalAction2 instanceof ServiceBookingMviStepInternalAction.OnDayScrolled) {
                        serviceBookingMviStepStateB = t.b(serviceBookingMviStepStateB, ((ServiceBookingMviStepInternalAction.OnDayScrolled) serviceBookingMviStepInternalAction2).f274677b, null, null, this.f274793d, 14);
                    } else {
                        if (serviceBookingMviStepInternalAction2 instanceof ServiceBookingMviStepInternalAction.OnInputChanged) {
                            ServiceBookingMviStepInternalAction.OnInputChanged onInputChanged = (ServiceBookingMviStepInternalAction.OnInputChanged) serviceBookingMviStepInternalAction2;
                            SbInputItem sbInputItem = onInputChanged.f274679b;
                            String str6 = sbInputItem.f276232g;
                            if (str6 == null) {
                                str6 = "";
                            }
                            String str7 = sbInputItem.f276231f;
                            t.a(serviceBookingMviStepStateB, str6, str7 == null || str7.length() == 0);
                            String str8 = sbInputItem.f276231f;
                            String str9 = sbInputItem.f276232g;
                            if (str8 == null || str8.length() == 0) {
                                linkedHashMapD2 = com.avito.android.service_booking.mvi.domain.d.d(map2);
                                linkedHashMapD2.remove(str9 != null ? str9 : "");
                            } else {
                                linkedHashMapD2 = com.avito.android.service_booking.mvi.domain.d.d(map2);
                                if (str9 == null) {
                                    str9 = "";
                                }
                                String str10 = sbInputItem.f276231f;
                                str = str10 != null ? str10 : "";
                                linkedHashMapD2.remove(str9);
                                com.avito.android.service_booking.mvi.domain.d.a(linkedHashMapD2, str9, str);
                            }
                            serviceBookingMviStepStateB = t.b(serviceBookingMviStepStateB, onInputChanged.f274679b, null, linkedHashMapD2, this.f274793d, 6);
                        } else if (serviceBookingMviStepInternalAction2 instanceof ServiceBookingMviStepInternalAction.OnCommentEdited) {
                            ServiceBookingMviStepInternalAction.OnCommentEdited onCommentEdited = (ServiceBookingMviStepInternalAction.OnCommentEdited) serviceBookingMviStepInternalAction2;
                            com.avito.android.service_booking_common.blueprints.comment.c cVar = onCommentEdited.f274676b;
                            String str11 = cVar.f276273c;
                            String str12 = cVar.f276275e;
                            t.a(serviceBookingMviStepStateB, str11, str12 == null || str12.length() == 0);
                            String str13 = cVar.f276275e;
                            String str14 = cVar.f276273c;
                            if (str13 == null || str13.length() == 0) {
                                linkedHashMapD = com.avito.android.service_booking.mvi.domain.d.d(map2);
                                linkedHashMapD.remove(str14);
                            } else {
                                linkedHashMapD = com.avito.android.service_booking.mvi.domain.d.d(map2);
                                String str15 = cVar.f276275e;
                                str = str15 != null ? str15 : "";
                                linkedHashMapD.remove(str14);
                                com.avito.android.service_booking.mvi.domain.d.a(linkedHashMapD, str14, str);
                            }
                            serviceBookingMviStepStateB = t.b(serviceBookingMviStepStateB, onCommentEdited.f274676b, null, linkedHashMapD, this.f274793d, 6);
                        } else {
                            if (serviceBookingMviStepInternalAction2 instanceof ServiceBookingMviStepInternalAction.OnSpecialistClicked) {
                                throw null;
                            }
                            if (serviceBookingMviStepInternalAction2 instanceof ServiceBookingMviStepInternalAction.OnAnySpecialistClicked) {
                                throw null;
                            }
                            if (serviceBookingMviStepInternalAction2 instanceof ServiceBookingMviStepInternalAction.OnDaySelected) {
                                C47440d.a aVar6 = ((ServiceBookingMviStepInternalAction.OnDaySelected) serviceBookingMviStepInternalAction2).f274678b;
                                if (aVar6.f429419f) {
                                    LinkedHashMap linkedHashMapD6 = com.avito.android.service_booking.mvi.domain.d.d(map2);
                                    String str16 = aVar6.f429416c;
                                    linkedHashMapD6.remove(str16);
                                    if (serviceBookingContent == null || (list = serviceBookingContent.f274726h) == null) {
                                        c47440d = null;
                                    } else {
                                        ArrayList arrayList7 = new ArrayList();
                                        for (Object obj6 : list) {
                                            if (obj6 instanceof C47440d) {
                                                arrayList7.add(obj6);
                                            }
                                        }
                                        Iterator it8 = arrayList7.iterator();
                                        while (true) {
                                            if (!it8.hasNext()) {
                                                next = 0;
                                                break;
                                            }
                                            next = it8.next();
                                            if (L.f(((C47440d) next).f429411b, str16)) {
                                                break;
                                            }
                                        }
                                        c47440d = next;
                                    }
                                    if (c47440d != null) {
                                        Set<Map.Entry<C47440d.a, C47440d.c>> setEntrySet4 = c47440d.f429413d.entrySet();
                                        int iF4 = P0.f(C42745f0.q(setEntrySet4, 10));
                                        LinkedHashMap linkedHashMap4 = new LinkedHashMap(iF4 >= 16 ? iF4 : 16);
                                        Iterator it9 = setEntrySet4.iterator();
                                        while (it9.hasNext()) {
                                            Map.Entry entry3 = (Map.Entry) it9.next();
                                            linkedHashMap4.put(C47440d.a.a((C47440d.a) entry3.getKey(), L.f(((C47440d.a) entry3.getKey()).f429415b, aVar6.f429415b)), ((C47440d.c) entry3.getValue()).a(r.f274790l));
                                        }
                                        c47440dB = C47440d.b(c47440d, linkedHashMap4, null, 11);
                                    } else {
                                        c47440dB = null;
                                    }
                                    t.a(serviceBookingMviStepStateB, str16, true);
                                    serviceBookingMviStepStateB = t.b(serviceBookingMviStepStateB, c47440dB, nVar.e(nVar.a(aVar6.f429417d)), linkedHashMapD6, this.f274793d, 2);
                                }
                            }
                        }
                    }
                }
            }
        }
        this.f274792c.a(serviceBookingMviStepInternalAction2);
        return serviceBookingMviStepStateB;
    }
}
