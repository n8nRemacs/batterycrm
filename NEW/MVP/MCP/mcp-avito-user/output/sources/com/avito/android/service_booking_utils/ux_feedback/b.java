package com.avito.android.service_booking_utils.ux_feedback;

import Y61.k;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ServiceBookingFeedbackCampaign.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_utils/ux_feedback/b;", "LSK0/c;", "a", "Lcom/avito/android/service_booking_utils/ux_feedback/b$a;", "_avito_service-booking-utils_utils"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class b implements SK0.c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f278399a;

    /* compiled from: ServiceBookingFeedbackCampaign.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_utils/ux_feedback/b$a;", "Lcom/avito/android/service_booking_utils/ux_feedback/b;", "<init>", "()V", "_avito_service-booking-utils_utils"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends b {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final a f278400b = new a();

        public a() {
            super("srv_details_booking_canceled", null);
        }
    }

    public b(String str, C42822w c42822w) {
        this.f278399a = str;
    }

    @Override // SK0.c
    @k
    /* renamed from: a, reason: from getter */
    public final String getF278399a() {
        return this.f278399a;
    }
}
