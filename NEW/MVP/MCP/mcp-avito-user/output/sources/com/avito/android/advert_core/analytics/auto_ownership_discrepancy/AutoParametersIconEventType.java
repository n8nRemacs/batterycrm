package com.avito.android.advert_core.analytics.auto_ownership_discrepancy;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AutoParametersIconShownEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/analytics/auto_ownership_discrepancy/AutoParametersIconEventType;", "", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AutoParametersIconEventType {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AutoParametersIconEventType[] f82798b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f82799c;

    static {
        AutoParametersIconEventType[] autoParametersIconEventTypeArr = {new AutoParametersIconEventType("NO_PTS", 0), new AutoParametersIconEventType("OWNERSHIP_DISCREPANCY", 1)};
        f82798b = autoParametersIconEventTypeArr;
        f82799c = c.a(autoParametersIconEventTypeArr);
    }

    public static AutoParametersIconEventType valueOf(String str) {
        return (AutoParametersIconEventType) Enum.valueOf(AutoParametersIconEventType.class, str);
    }

    public static AutoParametersIconEventType[] values() {
        return (AutoParametersIconEventType[]) f82798b.clone();
    }
}
