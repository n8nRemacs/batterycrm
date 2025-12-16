package com.avito.android.deeplink_events.events;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DeeplinkParsingEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deeplink_events/events/DeeplinkParsingFailReason;", "", "_avito_deeplinks_events_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeeplinkParsingFailReason {

    /* renamed from: b, reason: collision with root package name */
    public static final DeeplinkParsingFailReason f134145b;

    /* renamed from: c, reason: collision with root package name */
    public static final DeeplinkParsingFailReason f134146c;

    /* renamed from: d, reason: collision with root package name */
    public static final DeeplinkParsingFailReason f134147d;

    /* renamed from: e, reason: collision with root package name */
    public static final DeeplinkParsingFailReason f134148e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ DeeplinkParsingFailReason[] f134149f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a f134150g;

    static {
        DeeplinkParsingFailReason deeplinkParsingFailReason = new DeeplinkParsingFailReason("UNKNOWN_DEEPLINK", 0);
        f134145b = deeplinkParsingFailReason;
        DeeplinkParsingFailReason deeplinkParsingFailReason2 = new DeeplinkParsingFailReason("INVALID_FORMAT", 1);
        f134146c = deeplinkParsingFailReason2;
        DeeplinkParsingFailReason deeplinkParsingFailReason3 = new DeeplinkParsingFailReason("EXPECTED_PUBLIC_DEEPLINK", 2);
        f134147d = deeplinkParsingFailReason3;
        DeeplinkParsingFailReason deeplinkParsingFailReason4 = new DeeplinkParsingFailReason("INVALID_REGION", 3);
        f134148e = deeplinkParsingFailReason4;
        DeeplinkParsingFailReason[] deeplinkParsingFailReasonArr = {deeplinkParsingFailReason, deeplinkParsingFailReason2, deeplinkParsingFailReason3, deeplinkParsingFailReason4};
        f134149f = deeplinkParsingFailReasonArr;
        f134150g = c.a(deeplinkParsingFailReasonArr);
    }

    public DeeplinkParsingFailReason() {
        throw null;
    }

    public static DeeplinkParsingFailReason valueOf(String str) {
        return (DeeplinkParsingFailReason) Enum.valueOf(DeeplinkParsingFailReason.class, str);
    }

    public static DeeplinkParsingFailReason[] values() {
        return (DeeplinkParsingFailReason[]) f134149f.clone();
    }
}
