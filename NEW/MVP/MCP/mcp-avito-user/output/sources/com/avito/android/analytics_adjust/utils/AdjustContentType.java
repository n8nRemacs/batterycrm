package com.avito.android.analytics_adjust.utils;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdjustEvents.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics_adjust/utils/AdjustContentType;", "", "_common_analytics-adjust_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AdjustContentType {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AdjustContentType[] f91246b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f91247c;

    static {
        AdjustContentType[] adjustContentTypeArr = {new AdjustContentType()};
        f91246b = adjustContentTypeArr;
        f91247c = c.a(adjustContentTypeArr);
    }

    public static AdjustContentType valueOf(String str) {
        return (AdjustContentType) Enum.valueOf(AdjustContentType.class, str);
    }

    public static AdjustContentType[] values() {
        return (AdjustContentType[]) f91246b.clone();
    }
}
