package com.avito.android.service_booking_additional_settings.additionalsettings.mvi;

import Os0.InterfaceC14732a;
import com.avito.android.arch.mvi.a;
import com.avito.android.select.Arguments;
import com.avito.android.service_booking_additional_settings.additionalsettings.mvi.entity.ServiceBookingAdditionalSettingsInternalAction;
import com.avito.android.service_booking_additional_settings.additionalsettings.mvi.entity.ServiceBookingAdditionalSettingsState;
import com.avito.android.service_booking_additional_settings.additionalsettings.recyclerview.item.AdditionalSettingsElementsContentItem;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ServiceBookingAdditionalSettingsActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "LOs0/a;", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/entity/ServiceBookingAdditionalSettingsInternalAction;", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/entity/ServiceBookingAdditionalSettingsState;", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements com.avito.android.arch.mvi.a<InterfaceC14732a, ServiceBookingAdditionalSettingsInternalAction, ServiceBookingAdditionalSettingsState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking_additional_settings.additionalsettings.domain.use_case.a f274971a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking_additional_settings.additionalsettings.domain.use_case.e<ServiceBookingAdditionalSettingsInternalAction> f274972b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking_additional_settings.additionalsettings.domain.use_case.m f274973c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking_additional_settings.additionalsettings.domain.use_case.j f274974d;

    @Inject
    public c(@Y61.k com.avito.android.service_booking_additional_settings.additionalsettings.domain.use_case.a aVar, @Y61.k com.avito.android.service_booking_additional_settings.additionalsettings.domain.use_case.e<ServiceBookingAdditionalSettingsInternalAction> eVar, @Y61.k com.avito.android.service_booking_additional_settings.additionalsettings.domain.use_case.m mVar, @Y61.k com.avito.android.service_booking_additional_settings.additionalsettings.domain.use_case.j jVar) {
        this.f274971a = aVar;
        this.f274972b = eVar;
        this.f274973c = mVar;
        this.f274974d = jVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<ServiceBookingAdditionalSettingsInternalAction> b(InterfaceC14732a interfaceC14732a, ServiceBookingAdditionalSettingsState serviceBookingAdditionalSettingsState) {
        InterfaceC43160i<ServiceBookingAdditionalSettingsInternalAction> c43210w;
        InterfaceC14732a interfaceC14732a2 = interfaceC14732a;
        if (interfaceC14732a2.equals(InterfaceC14732a.C0814a.f12631a)) {
            return new C43210w(ServiceBookingAdditionalSettingsInternalAction.Finish.f274980b);
        }
        if (interfaceC14732a2.equals(InterfaceC14732a.b.f12632a)) {
            return this.f274971a.invoke();
        }
        Object obj = null;
        if (interfaceC14732a2 instanceof InterfaceC14732a.f) {
            c43210w = new C43137a0(new a(interfaceC14732a2, null), this.f274973c.a(((InterfaceC14732a.f) interfaceC14732a2).f12642a));
        } else if (interfaceC14732a2 instanceof InterfaceC14732a.e) {
            c43210w = new C43137a0(new b(interfaceC14732a2, null), this.f274974d.a(((InterfaceC14732a.e) interfaceC14732a2).f12641a));
        } else {
            if (interfaceC14732a2 instanceof InterfaceC14732a.d) {
                return this.f274972b.a(((InterfaceC14732a.d) interfaceC14732a2).f12640a);
            }
            if (interfaceC14732a2 instanceof InterfaceC14732a.c) {
                InterfaceC14732a.c cVar = (InterfaceC14732a.c) interfaceC14732a2;
                InterfaceC14732a.c.C0815a c0815a = cVar.f12633a;
                List list = c0815a.f12635a;
                if (list == null) {
                    list = C42784z0.f406748b;
                }
                List list2 = list;
                Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (L.f(((AdditionalSettingsElementsContentItem.AdditionalSettingsElementSheetTimeGap.AdditionalSettingsElementOption) next).f275050c, c0815a.f12636b)) {
                        obj = next;
                        break;
                    }
                }
                AdditionalSettingsElementsContentItem.AdditionalSettingsElementSheetTimeGap.AdditionalSettingsElementOption additionalSettingsElementOption = (AdditionalSettingsElementsContentItem.AdditionalSettingsElementSheetTimeGap.AdditionalSettingsElementOption) obj;
                List listSingletonList = additionalSettingsElementOption != null ? Collections.singletonList(additionalSettingsElementOption) : C42784z0.f406748b;
                String str = c0815a.f12637c;
                if (str == null) {
                    str = "";
                }
                return new C43210w(new ServiceBookingAdditionalSettingsInternalAction.OnShowSelectSheet(new Arguments(false, cVar.f12634b, null, list2, listSingletonList, str, c0815a.f12639e, false, false, false, false, c0815a.f12638d, false, false, false, null, false, null, null, null, null, false, false, false, false, false, false, false, null, null, null, false, false, null, false, false, false, 0, null, null, -7419, 255, null)));
            }
            if (!(interfaceC14732a2 instanceof InterfaceC14732a.g)) {
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(new ServiceBookingAdditionalSettingsInternalAction.OnOpenDeeplink(((InterfaceC14732a.g) interfaceC14732a2).f12643a));
        }
        return c43210w;
    }
}
