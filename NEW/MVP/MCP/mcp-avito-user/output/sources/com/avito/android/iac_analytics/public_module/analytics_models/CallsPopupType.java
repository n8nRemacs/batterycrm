package com.avito.android.iac_analytics.public_module.analytics_models;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CallsPopupType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_analytics/public_module/analytics_models/CallsPopupType;", "", "_avito_iac-analytics_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CallsPopupType {

    /* renamed from: b, reason: collision with root package name */
    public static final CallsPopupType f164277b;

    /* renamed from: c, reason: collision with root package name */
    public static final CallsPopupType f164278c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ CallsPopupType[] f164279d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f164280e;

    static {
        CallsPopupType callsPopupType = new CallsPopupType("REGULAR", 0);
        f164277b = callsPopupType;
        CallsPopupType callsPopupType2 = new CallsPopupType("ENABLER", 1);
        CallsPopupType callsPopupType3 = new CallsPopupType("TO_SETTINGS", 2);
        f164278c = callsPopupType3;
        CallsPopupType[] callsPopupTypeArr = {callsPopupType, callsPopupType2, callsPopupType3};
        f164279d = callsPopupTypeArr;
        f164280e = c.a(callsPopupTypeArr);
    }

    public CallsPopupType() {
        throw null;
    }

    public static CallsPopupType valueOf(String str) {
        return (CallsPopupType) Enum.valueOf(CallsPopupType.class, str);
    }

    public static CallsPopupType[] values() {
        return (CallsPopupType[]) f164279d.clone();
    }
}
