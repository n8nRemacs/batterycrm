package com.avito.android.service_booking_additional_settings.additionalsettings.domain.converters;

import com.avito.android.B2;
import com.avito.android.service_booking_additional_settings.additionalsettings.recyclerview.item.AdditionalSettingsElementsContentItem;
import com.avito.android.service_booking_additional_settings.additionalsettings.remote.model.screen_data.ServiceBookingAdditionalSettingsElement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: AdditionalSettingsElementsContentConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/domain/converters/o;", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/domain/converters/n;", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class o implements n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d f274847a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g f274848b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final u f274849c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final B2 f274850d;

    /* compiled from: AdditionalSettingsElementsContentConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f274851a;

        static {
            int[] iArr = new int[ServiceBookingAdditionalSettingsElement.ElementType.values().length];
            try {
                iArr[ServiceBookingAdditionalSettingsElement.ElementType.BOOKING_TOGGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ServiceBookingAdditionalSettingsElement.ElementType.BOTTOMSHEET_TIME_GAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ServiceBookingAdditionalSettingsElement.ElementType.BOTTOMSHEET_TECH_BREAK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f274851a = iArr;
        }
    }

    @Inject
    public o(@Y61.k d dVar, @Y61.k g gVar, @Y61.k u uVar, @Y61.k B2 b22) {
        this.f274847a = dVar;
        this.f274848b = gVar;
        this.f274849c = uVar;
        this.f274850d = b22;
    }

    @Override // com.avito.android.service_booking_additional_settings.additionalsettings.domain.converters.n
    @Y61.k
    public final ArrayList a(@Y61.k List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ServiceBookingAdditionalSettingsElement serviceBookingAdditionalSettingsElement = (ServiceBookingAdditionalSettingsElement) it.next();
            int i12 = a.f274851a[serviceBookingAdditionalSettingsElement.getType().ordinal()];
            AdditionalSettingsElementsContentItem additionalSettingsElementsContentItemA = null;
            if (i12 == 1) {
                com.avito.android.service_booking_additional_settings.additionalsettings.remote.model.screen_data.a bookingToggle = serviceBookingAdditionalSettingsElement.getBookingToggle();
                if (bookingToggle == null) {
                    bookingToggle = null;
                }
                if (bookingToggle != null) {
                    additionalSettingsElementsContentItemA = this.f274847a.a(bookingToggle, serviceBookingAdditionalSettingsElement.getBlockEnabled());
                }
            } else if (i12 == 2) {
                com.avito.android.service_booking_additional_settings.additionalsettings.remote.model.screen_data.c bottomsheetTimeGap = serviceBookingAdditionalSettingsElement.getBottomsheetTimeGap();
                if (bottomsheetTimeGap == null) {
                    bottomsheetTimeGap = null;
                }
                if (bottomsheetTimeGap != null) {
                    additionalSettingsElementsContentItemA = this.f274848b.a(bottomsheetTimeGap, serviceBookingAdditionalSettingsElement.getBlockEnabled());
                }
            } else {
                if (i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                com.avito.android.service_booking_additional_settings.additionalsettings.remote.model.screen_data.b bottomSheetTechBreak = serviceBookingAdditionalSettingsElement.getBottomSheetTechBreak();
                B2 b22 = this.f274850d;
                b22.getClass();
                kotlin.reflect.n<Object> nVar = B2.f67184X[13];
                if (!((Boolean) b22.f67221o.a().invoke()).booleanValue() || bottomSheetTechBreak == null) {
                    bottomSheetTechBreak = null;
                }
                if (bottomSheetTechBreak != null) {
                    additionalSettingsElementsContentItemA = this.f274849c.a(bottomSheetTechBreak, serviceBookingAdditionalSettingsElement.getBlockEnabled());
                }
            }
            if (additionalSettingsElementsContentItemA != null) {
                arrayList.add(additionalSettingsElementsContentItemA);
            }
        }
        return arrayList;
    }
}
