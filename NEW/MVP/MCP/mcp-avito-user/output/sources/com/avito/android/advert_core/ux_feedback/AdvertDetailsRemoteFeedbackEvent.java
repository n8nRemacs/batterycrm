package com.avito.android.advert_core.ux_feedback;

import Y61.k;
import com.avito.android.delayed_ux_feedback.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdvertDetailsRemoteFeedbackEvent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_core/ux_feedback/AdvertDetailsRemoteFeedbackEvent;", "", "Lcom/avito/android/delayed_ux_feedback/c;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AdvertDetailsRemoteFeedbackEvent implements c {

    /* renamed from: c, reason: collision with root package name */
    public static final AdvertDetailsRemoteFeedbackEvent f84398c;

    /* renamed from: d, reason: collision with root package name */
    public static final AdvertDetailsRemoteFeedbackEvent f84399d;

    /* renamed from: e, reason: collision with root package name */
    public static final AdvertDetailsRemoteFeedbackEvent f84400e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AdvertDetailsRemoteFeedbackEvent[] f84401f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a f84402g;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f84403b;

    static {
        AdvertDetailsRemoteFeedbackEvent advertDetailsRemoteFeedbackEvent = new AdvertDetailsRemoteFeedbackEvent("BACK_PRODUCT_CART", 0, "BackProductCart");
        f84398c = advertDetailsRemoteFeedbackEvent;
        AdvertDetailsRemoteFeedbackEvent advertDetailsRemoteFeedbackEvent2 = new AdvertDetailsRemoteFeedbackEvent("PRODUCT_CART", 1, "ProductCart");
        f84399d = advertDetailsRemoteFeedbackEvent2;
        AdvertDetailsRemoteFeedbackEvent advertDetailsRemoteFeedbackEvent3 = new AdvertDetailsRemoteFeedbackEvent("AFTER_CONTACT", 2, "AfterContact");
        f84400e = advertDetailsRemoteFeedbackEvent3;
        AdvertDetailsRemoteFeedbackEvent[] advertDetailsRemoteFeedbackEventArr = {advertDetailsRemoteFeedbackEvent, advertDetailsRemoteFeedbackEvent2, advertDetailsRemoteFeedbackEvent3};
        f84401f = advertDetailsRemoteFeedbackEventArr;
        f84402g = kotlin.enums.c.a(advertDetailsRemoteFeedbackEventArr);
    }

    public AdvertDetailsRemoteFeedbackEvent(String str, int i12, String str2) {
        this.f84403b = str2;
    }

    public static AdvertDetailsRemoteFeedbackEvent valueOf(String str) {
        return (AdvertDetailsRemoteFeedbackEvent) Enum.valueOf(AdvertDetailsRemoteFeedbackEvent.class, str);
    }

    public static AdvertDetailsRemoteFeedbackEvent[] values() {
        return (AdvertDetailsRemoteFeedbackEvent[]) f84401f.clone();
    }

    @Override // com.avito.android.delayed_ux_feedback.c
    @k
    /* renamed from: a, reason: from getter */
    public final String getF84403b() {
        return this.f84403b;
    }
}
