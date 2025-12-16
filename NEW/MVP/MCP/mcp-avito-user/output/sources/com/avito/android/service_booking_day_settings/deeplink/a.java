package com.avito.android.service_booking_day_settings.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.service_booking_calendar.ServiceBookingCalendarActivityArg;
import com.avito.android.service_booking_day_settings.ServiceBookingDayScheduleSettingsLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import sv.C48421d;

/* compiled from: ServiceBookingDayScheduleSettingsLinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class a extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ServiceBookingDayScheduleSettingsLink f277087l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f277088m;

    /* compiled from: ServiceBookingDayScheduleSettingsLinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.service_booking_day_settings.deeplink.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C8225a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f277089a;

        static {
            int[] iArr = new int[ServiceBookingDayScheduleSettingsLink.SbSettingsOpenFlowType.values().length];
            try {
                iArr[ServiceBookingDayScheduleSettingsLink.SbSettingsOpenFlowType.CALENDAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f277089a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ServiceBookingDayScheduleSettingsLink serviceBookingDayScheduleSettingsLink, b bVar) {
        super(0);
        this.f277087l = serviceBookingDayScheduleSettingsLink;
        this.f277088m = bVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        ServiceBookingDayScheduleSettingsLink serviceBookingDayScheduleSettingsLink = this.f277087l;
        ServiceBookingDayScheduleSettingsLink.SbSettingsOpenFlowType openFlow = serviceBookingDayScheduleSettingsLink.getOpenFlow();
        int i12 = openFlow == null ? -1 : C8225a.f277089a[openFlow.ordinal()];
        b bVar = this.f277088m;
        a.InterfaceC4053a interfaceC4053a = bVar.f277090f;
        if (i12 == 1) {
            interfaceC4053a.J(bVar.f277093i.a(new ServiceBookingCalendarActivityArg(serviceBookingDayScheduleSettingsLink.getDay())), C48421d.a(bVar), com.avito.android.deeplink_handler.view.c.f134589l);
        }
        interfaceC4053a.J(bVar.f277092h.a(serviceBookingDayScheduleSettingsLink.getDay()), C48421d.a(bVar), com.avito.android.deeplink_handler.view.c.f134589l);
        return G0.f406611a;
    }
}
