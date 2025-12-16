package com.avito.android.iac_analytics.public_module.analytics_models;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CallDeliveryType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_analytics/public_module/analytics_models/CallDeliveryType;", "", "_avito_iac-analytics_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CallDeliveryType {

    /* renamed from: b, reason: collision with root package name */
    public static final CallDeliveryType f164269b;

    /* renamed from: c, reason: collision with root package name */
    public static final CallDeliveryType f164270c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ CallDeliveryType[] f164271d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f164272e;

    static {
        CallDeliveryType callDeliveryType = new CallDeliveryType("PUSH", 0);
        f164269b = callDeliveryType;
        CallDeliveryType callDeliveryType2 = new CallDeliveryType("SOCKET", 1);
        f164270c = callDeliveryType2;
        CallDeliveryType[] callDeliveryTypeArr = {callDeliveryType, callDeliveryType2};
        f164271d = callDeliveryTypeArr;
        f164272e = c.a(callDeliveryTypeArr);
    }

    public CallDeliveryType() {
        throw null;
    }

    public static CallDeliveryType valueOf(String str) {
        return (CallDeliveryType) Enum.valueOf(CallDeliveryType.class, str);
    }

    public static CallDeliveryType[] values() {
        return (CallDeliveryType[]) f164271d.clone();
    }
}
