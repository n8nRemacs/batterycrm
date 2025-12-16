package com.avito.android.service_booking.mvi.step.mvi;

import com.avito.android.service_booking.BookingFlow;
import com.avito.android.service_booking.mvi.step.mvi.entity.ServiceBookingMviStepState;
import com.avito.android.service_booking.mvi.step.mvi.entity.StepBlockProperty;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ServiceBookingMviStepReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_service-booking_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class t {

    /* compiled from: ServiceBookingMviStepReducer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f274794a;

        static {
            int[] iArr = new int[BookingFlow.values().length];
            try {
                BookingFlow bookingFlow = BookingFlow.f274120b;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f274794a = iArr;
        }
    }

    public static final void a(ServiceBookingMviStepState serviceBookingMviStepState, String str, boolean z12) {
        Map<String, StepBlockProperty> map;
        Map<String, StepBlockProperty> map2;
        StepBlockProperty stepBlockProperty;
        ServiceBookingMviStepState.ServiceBookingContent serviceBookingContent = serviceBookingMviStepState.f274716e;
        Boolean bool = (serviceBookingContent == null || (map2 = serviceBookingContent.f274728j) == null || (stepBlockProperty = map2.get(str)) == null) ? null : stepBlockProperty.f274735b;
        ServiceBookingMviStepState.ServiceBookingContent serviceBookingContent2 = serviceBookingMviStepState.f274716e;
        if (serviceBookingContent2 == null || (map = serviceBookingContent2.f274728j) == null) {
            return;
        }
        map.put(str, new StepBlockProperty(bool, z12));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List<com.avito.conveyor_item.a>] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.avito.android.service_booking.mvi.step.mvi.entity.ServiceBookingMviStepState b(com.avito.android.service_booking.mvi.step.mvi.entity.ServiceBookingMviStepState r18, com.avito.conveyor_item.a r19, java.lang.String r20, java.util.LinkedHashMap r21, com.avito.android.service_booking.BookingFlow r22, int r23) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.service_booking.mvi.step.mvi.t.b(com.avito.android.service_booking.mvi.step.mvi.entity.ServiceBookingMviStepState, com.avito.conveyor_item.a, java.lang.String, java.util.LinkedHashMap, com.avito.android.service_booking.BookingFlow, int):com.avito.android.service_booking.mvi.step.mvi.entity.ServiceBookingMviStepState");
    }
}
