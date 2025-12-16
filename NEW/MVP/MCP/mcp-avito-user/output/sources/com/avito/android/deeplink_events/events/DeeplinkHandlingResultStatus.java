package com.avito.android.deeplink_events.events;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DeeplinkHandlingEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deeplink_events/events/DeeplinkHandlingResultStatus;", "", "_avito_deeplinks_events_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeeplinkHandlingResultStatus {

    /* renamed from: c, reason: collision with root package name */
    public static final DeeplinkHandlingResultStatus f134138c;

    /* renamed from: d, reason: collision with root package name */
    public static final DeeplinkHandlingResultStatus f134139d;

    /* renamed from: e, reason: collision with root package name */
    public static final DeeplinkHandlingResultStatus f134140e;

    /* renamed from: f, reason: collision with root package name */
    public static final DeeplinkHandlingResultStatus f134141f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ DeeplinkHandlingResultStatus[] f134142g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ a f134143h;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f134144b;

    static {
        DeeplinkHandlingResultStatus deeplinkHandlingResultStatus = new DeeplinkHandlingResultStatus("Success", 0, "success");
        f134138c = deeplinkHandlingResultStatus;
        DeeplinkHandlingResultStatus deeplinkHandlingResultStatus2 = new DeeplinkHandlingResultStatus("Failure", 1, "failure");
        f134139d = deeplinkHandlingResultStatus2;
        DeeplinkHandlingResultStatus deeplinkHandlingResultStatus3 = new DeeplinkHandlingResultStatus("NotFound", 2, "not_found");
        f134140e = deeplinkHandlingResultStatus3;
        DeeplinkHandlingResultStatus deeplinkHandlingResultStatus4 = new DeeplinkHandlingResultStatus("Unknown", 3, "unknown");
        f134141f = deeplinkHandlingResultStatus4;
        DeeplinkHandlingResultStatus[] deeplinkHandlingResultStatusArr = {deeplinkHandlingResultStatus, deeplinkHandlingResultStatus2, deeplinkHandlingResultStatus3, deeplinkHandlingResultStatus4};
        f134142g = deeplinkHandlingResultStatusArr;
        f134143h = c.a(deeplinkHandlingResultStatusArr);
    }

    public DeeplinkHandlingResultStatus(String str, int i12, String str2) {
        this.f134144b = str2;
    }

    public static DeeplinkHandlingResultStatus valueOf(String str) {
        return (DeeplinkHandlingResultStatus) Enum.valueOf(DeeplinkHandlingResultStatus.class, str);
    }

    public static DeeplinkHandlingResultStatus[] values() {
        return (DeeplinkHandlingResultStatus[]) f134142g.clone();
    }
}
