package com.avito.android.service_booking_settings.work_hours.mvi;

import St0.InterfaceC15221a;
import Ut0.C15567b;
import Ut0.C15568c;
import com.avito.android.arch.mvi.u;
import com.avito.android.service_booking_settings.work_hours.ServiceBookingWorkHoursArgument;
import com.avito.android.service_booking_settings.work_hours.mvi.entity.SchedulePeriod;
import com.avito.android.service_booking_settings.work_hours.mvi.entity.ServiceBookingWorkHoursInternalAction;
import com.avito.android.service_booking_utils.BookingSettingsStatus;
import fu0.C40481b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ServiceBookingWorkHoursReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_settings/work_hours/mvi/m;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction;", "LUt0/h;", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m implements u<ServiceBookingWorkHoursInternalAction, Ut0.h> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking_settings.data.preferences.a f278123b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15221a f278124c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f278125d;

    @Inject
    public m(@Y61.k com.avito.android.service_booking_settings.data.preferences.a aVar, @Y61.k InterfaceC15221a interfaceC15221a, @Y61.k ServiceBookingWorkHoursArgument serviceBookingWorkHoursArgument) {
        this.f278123b = aVar;
        this.f278124c = interfaceC15221a;
        this.f278125d = serviceBookingWorkHoursArgument.f277894b;
    }

    @Override // com.avito.android.arch.mvi.u
    public final Ut0.h a(ServiceBookingWorkHoursInternalAction serviceBookingWorkHoursInternalAction, Ut0.h hVar) {
        boolean z12;
        ServiceBookingWorkHoursInternalAction serviceBookingWorkHoursInternalAction2 = serviceBookingWorkHoursInternalAction;
        Ut0.h hVarA = hVar;
        if (serviceBookingWorkHoursInternalAction2 instanceof ServiceBookingWorkHoursInternalAction.ShowLoading) {
            hVarA = Ut0.h.a(hVarA, true, null, null, null, null, null, null, null, null, null, null, null, null, null, 16380);
        } else if (serviceBookingWorkHoursInternalAction2 instanceof ServiceBookingWorkHoursInternalAction.ContentLoadingError) {
            hVarA = Ut0.h.a(hVarA, false, ((ServiceBookingWorkHoursInternalAction.ContentLoadingError) serviceBookingWorkHoursInternalAction2).f278065b, null, null, null, null, null, null, null, null, null, null, null, null, 16380);
        } else if (serviceBookingWorkHoursInternalAction2 instanceof ServiceBookingWorkHoursInternalAction.ContentLoadingSuccess) {
            ServiceBookingWorkHoursInternalAction.ContentLoadingSuccess contentLoadingSuccess = (ServiceBookingWorkHoursInternalAction.ContentLoadingSuccess) serviceBookingWorkHoursInternalAction2;
            hVarA = Ut0.h.a(hVarA, false, null, contentLoadingSuccess.f278066b, contentLoadingSuccess.f278067c, contentLoadingSuccess.f278068d, contentLoadingSuccess.f278069e, new Ut0.f(b(hVarA.f16744f), false), contentLoadingSuccess.f278070f, contentLoadingSuccess.f278071g, contentLoadingSuccess.f278072h, contentLoadingSuccess.f278073i, contentLoadingSuccess.f278074j, null, contentLoadingSuccess.f278075k, 4096);
        } else {
            boolean z13 = serviceBookingWorkHoursInternalAction2 instanceof ServiceBookingWorkHoursInternalAction.OnTimeRestrictionOptionSelected;
            Ut0.k kVar = hVarA.f16747i;
            List list = hVarA.f16744f;
            BookingSettingsStatus bookingSettingsStatus = hVarA.f16752n;
            if (z13) {
                hVarA = Ut0.h.a(hVarA, false, null, null, null, null, null, new Ut0.f(b(list), false), kVar != null ? Ut0.k.f(kVar, ((ServiceBookingWorkHoursInternalAction.OnTimeRestrictionOptionSelected) serviceBookingWorkHoursInternalAction2).f278090b, false, 111) : null, null, null, null, null, C40481b.a(bookingSettingsStatus, BookingSettingsStatus.f278278d), null, 12095);
            } else {
                boolean z14 = serviceBookingWorkHoursInternalAction2 instanceof ServiceBookingWorkHoursInternalAction.OnSchedulePeriodOptionSelected;
                SchedulePeriod schedulePeriod = hVarA.f16748j;
                if (z14) {
                    hVarA = Ut0.h.a(hVarA, false, null, null, null, null, null, new Ut0.f(b(list), false), null, schedulePeriod != null ? SchedulePeriod.f(schedulePeriod, ((ServiceBookingWorkHoursInternalAction.OnSchedulePeriodOptionSelected) serviceBookingWorkHoursInternalAction2).f278088b, false, 111) : null, null, null, null, C40481b.a(bookingSettingsStatus, BookingSettingsStatus.f278278d), null, 11967);
                } else {
                    boolean z15 = serviceBookingWorkHoursInternalAction2 instanceof ServiceBookingWorkHoursInternalAction.SaveSettingsError;
                    Ut0.g gVar = hVarA.f16750l;
                    if (z15) {
                        Ut0.g gVarA = gVar != null ? Ut0.g.a(gVar, false) : null;
                        Ut0.f fVar = new Ut0.f(hVarA.f16746h.f16728a, false);
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
                        Iterator<T> it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(C15567b.a((C15567b) it.next(), false, null, null, true, 63));
                        }
                        hVarA = Ut0.h.a(hVarA, false, null, null, null, arrayList, null, fVar, kVar != null ? Ut0.k.f(kVar, null, true, 63) : null, schedulePeriod != null ? SchedulePeriod.f(schedulePeriod, null, true, 63) : null, null, gVarA, null, C40481b.a(bookingSettingsStatus, BookingSettingsStatus.f278277c), null, 10798);
                    } else if (serviceBookingWorkHoursInternalAction2 instanceof ServiceBookingWorkHoursInternalAction.SaveSettingsSuccess) {
                        boolean z16 = this.f278125d;
                        com.avito.android.service_booking_settings.data.preferences.a aVar = this.f278123b;
                        if (!z16 && gVar != null) {
                            aVar.f277782a.edit().putBoolean("SAVE_DIALOG_SHOWN_KEY", true).apply();
                        }
                        aVar.f277782a.edit().putBoolean("AGREEMENT_SHOWN_KEY", true).apply();
                        List list3 = list;
                        ArrayList arrayList2 = new ArrayList(C42745f0.q(list3, 10));
                        Iterator<T> it2 = list3.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(C15567b.a((C15567b) it2.next(), false, null, null, true, 63));
                        }
                        hVarA = Ut0.h.a(hVarA, false, null, null, null, arrayList2, null, new Ut0.f(false, false), kVar != null ? Ut0.k.f(kVar, null, true, 63) : null, schedulePeriod != null ? SchedulePeriod.f(schedulePeriod, null, true, 63) : null, null, gVar != null ? Ut0.g.a(gVar, false) : null, null, C40481b.a(bookingSettingsStatus, BookingSettingsStatus.f278277c), new C15568c(arrayList2, kVar, schedulePeriod), 2604);
                    } else if (serviceBookingWorkHoursInternalAction2 instanceof ServiceBookingWorkHoursInternalAction.OnChangeSaveDialogVisibility) {
                        hVarA = Ut0.h.a(hVarA, false, null, null, null, null, null, null, null, null, null, gVar != null ? Ut0.g.a(gVar, ((ServiceBookingWorkHoursInternalAction.OnChangeSaveDialogVisibility) serviceBookingWorkHoursInternalAction2).f278079b) : null, null, null, null, 15359);
                    } else {
                        int i12 = -1;
                        if (serviceBookingWorkHoursInternalAction2 instanceof ServiceBookingWorkHoursInternalAction.OnDayCheckedChanged) {
                            ArrayList arrayList3 = new ArrayList(list);
                            Iterator<C15567b> it3 = list.iterator();
                            int i13 = 0;
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                if (L.f(it3.next().f16716b, ((ServiceBookingWorkHoursInternalAction.OnDayCheckedChanged) serviceBookingWorkHoursInternalAction2).f278081c.f16716b)) {
                                    i12 = i13;
                                    break;
                                }
                                i13++;
                            }
                            arrayList3.set(i12, C15567b.a((C15567b) arrayList3.get(i12), ((ServiceBookingWorkHoursInternalAction.OnDayCheckedChanged) serviceBookingWorkHoursInternalAction2).f278080b, null, null, false, 119));
                            hVarA = Ut0.h.a(hVarA, false, null, null, null, arrayList3, null, new Ut0.f(b(arrayList3), false), null, null, null, null, null, C40481b.a(bookingSettingsStatus, BookingSettingsStatus.f278278d), null, 12207);
                        } else if (serviceBookingWorkHoursInternalAction2 instanceof ServiceBookingWorkHoursInternalAction.OnDayTimeChanged) {
                            Iterator<C15567b> it4 = list.iterator();
                            int i14 = 0;
                            while (true) {
                                if (!it4.hasNext()) {
                                    break;
                                }
                                if (L.f(it4.next().f16716b, ((ServiceBookingWorkHoursInternalAction.OnDayTimeChanged) serviceBookingWorkHoursInternalAction2).f278084d.f16716b)) {
                                    i12 = i14;
                                    break;
                                }
                                i14++;
                            }
                            ArrayList arrayList4 = new ArrayList(list);
                            ServiceBookingWorkHoursInternalAction.OnDayTimeChanged onDayTimeChanged = (ServiceBookingWorkHoursInternalAction.OnDayTimeChanged) serviceBookingWorkHoursInternalAction2;
                            arrayList4.set(i12, C15567b.a((C15567b) arrayList4.get(i12), false, onDayTimeChanged.f278082b, onDayTimeChanged.f278083c, false, 79));
                            hVarA = Ut0.h.a(hVarA, false, null, null, null, arrayList4, null, new Ut0.f(b(arrayList4), false), null, null, null, null, null, C40481b.a(bookingSettingsStatus, BookingSettingsStatus.f278278d), null, 12207);
                        } else if (serviceBookingWorkHoursInternalAction2 instanceof ServiceBookingWorkHoursInternalAction.SaveSettingsInProgress) {
                            Ut0.f fVar2 = new Ut0.f(b(list), true);
                            List list4 = list;
                            ArrayList arrayList5 = new ArrayList(C42745f0.q(list4, 10));
                            Iterator<T> it5 = list4.iterator();
                            while (true) {
                                boolean zHasNext = it5.hasNext();
                                z12 = fVar2.f16729b;
                                if (!zHasNext) {
                                    break;
                                }
                                arrayList5.add(C15567b.a((C15567b) it5.next(), false, null, null, !z12, 63));
                            }
                            hVarA = Ut0.h.a(hVarA, false, null, null, null, arrayList5, null, fVar2, kVar != null ? Ut0.k.f(kVar, null, !z12, 63) : null, schedulePeriod != null ? SchedulePeriod.f(schedulePeriod, null, !z12, 63) : null, null, null, null, null, null, 15919);
                        }
                    }
                }
            }
        }
        this.f278124c.a(serviceBookingWorkHoursInternalAction2);
        return hVarA;
    }

    public final boolean b(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((C15567b) obj).f16719e) {
                arrayList.add(obj);
            }
        }
        Boolean boolValueOf = Boolean.valueOf(!arrayList.isEmpty());
        if (!this.f278125d) {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return true;
    }
}
