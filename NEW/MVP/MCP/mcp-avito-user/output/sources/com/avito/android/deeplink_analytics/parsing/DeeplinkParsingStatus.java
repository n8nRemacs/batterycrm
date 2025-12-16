package com.avito.android.deeplink_analytics.parsing;

import Y61.k;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DeeplinkParsingStatus.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deeplink_analytics/parsing/DeeplinkParsingStatus;", "", "_avito_deeplinks_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeeplinkParsingStatus {

    /* renamed from: c, reason: collision with root package name */
    public static final DeeplinkParsingStatus f134121c;

    /* renamed from: d, reason: collision with root package name */
    public static final DeeplinkParsingStatus f134122d;

    /* renamed from: e, reason: collision with root package name */
    public static final DeeplinkParsingStatus f134123e;

    /* renamed from: f, reason: collision with root package name */
    public static final DeeplinkParsingStatus f134124f;

    /* renamed from: g, reason: collision with root package name */
    public static final DeeplinkParsingStatus f134125g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ DeeplinkParsingStatus[] f134126h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f134127i;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f134128b;

    static {
        DeeplinkParsingStatus deeplinkParsingStatus = new DeeplinkParsingStatus("SUCCESS", 0, "success");
        f134121c = deeplinkParsingStatus;
        DeeplinkParsingStatus deeplinkParsingStatus2 = new DeeplinkParsingStatus("UNKNOWN_DEEPLINK", 1, "unknown_deeplink");
        f134122d = deeplinkParsingStatus2;
        DeeplinkParsingStatus deeplinkParsingStatus3 = new DeeplinkParsingStatus("INVALID_FORMAT", 2, "invalid_format");
        f134123e = deeplinkParsingStatus3;
        DeeplinkParsingStatus deeplinkParsingStatus4 = new DeeplinkParsingStatus("EXPECTED_PUBLIC_DEEPLINK", 3, "expected_public_deeplink");
        f134124f = deeplinkParsingStatus4;
        DeeplinkParsingStatus deeplinkParsingStatus5 = new DeeplinkParsingStatus("INVALID_REGION", 4, "invalid_region");
        f134125g = deeplinkParsingStatus5;
        DeeplinkParsingStatus[] deeplinkParsingStatusArr = {deeplinkParsingStatus, deeplinkParsingStatus2, deeplinkParsingStatus3, deeplinkParsingStatus4, deeplinkParsingStatus5};
        f134126h = deeplinkParsingStatusArr;
        f134127i = kotlin.enums.c.a(deeplinkParsingStatusArr);
    }

    public DeeplinkParsingStatus(String str, int i12, String str2) {
        this.f134128b = str2;
    }

    public static DeeplinkParsingStatus valueOf(String str) {
        return (DeeplinkParsingStatus) Enum.valueOf(DeeplinkParsingStatus.class, str);
    }

    public static DeeplinkParsingStatus[] values() {
        return (DeeplinkParsingStatus[]) f134126h.clone();
    }
}
