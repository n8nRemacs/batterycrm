package com.avito.android.advert.service_booking.ux_feedback;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CsatServiceBookingCampaign.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/service_booking/ux_feedback/CsatCampaignEvent;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CsatCampaignEvent {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ CsatCampaignEvent[] f80980b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f80981c;

    static {
        CsatCampaignEvent[] csatCampaignEventArr = {new CsatCampaignEvent("FLOW_CANCELED", 0), new CsatCampaignEvent("FLOW_FINISHED", 1)};
        f80980b = csatCampaignEventArr;
        f80981c = c.a(csatCampaignEventArr);
    }

    public static CsatCampaignEvent valueOf(String str) {
        return (CsatCampaignEvent) Enum.valueOf(CsatCampaignEvent.class, str);
    }

    public static CsatCampaignEvent[] values() {
        return (CsatCampaignEvent[]) f80980b.clone();
    }
}
