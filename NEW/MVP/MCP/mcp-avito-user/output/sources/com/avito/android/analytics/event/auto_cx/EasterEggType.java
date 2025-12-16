package com.avito.android.analytics.event.auto_cx;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EasterEggShownEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/event/auto_cx/EasterEggType;", "", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class EasterEggType {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EasterEggType[] f90011b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f90012c;

    static {
        EasterEggType[] easterEggTypeArr = {new EasterEggType()};
        f90011b = easterEggTypeArr;
        f90012c = c.a(easterEggTypeArr);
    }

    public static EasterEggType valueOf(String str) {
        return (EasterEggType) Enum.valueOf(EasterEggType.class, str);
    }

    public static EasterEggType[] values() {
        return (EasterEggType[]) f90011b.clone();
    }
}
