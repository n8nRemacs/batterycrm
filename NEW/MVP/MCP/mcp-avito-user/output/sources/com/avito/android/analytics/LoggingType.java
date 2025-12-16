package com.avito.android.analytics;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LoggingType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/LoggingType;", "", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LoggingType {

    /* renamed from: c, reason: collision with root package name */
    public static final LoggingType f89660c;

    /* renamed from: d, reason: collision with root package name */
    public static final LoggingType f89661d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ LoggingType[] f89662e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f89663f;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f89664b;

    static {
        LoggingType loggingType = new LoggingType("CLOSE", 0, "close");
        f89660c = loggingType;
        LoggingType loggingType2 = new LoggingType("SCROLL", 1, "scroll");
        f89661d = loggingType2;
        LoggingType[] loggingTypeArr = {loggingType, loggingType2};
        f89662e = loggingTypeArr;
        f89663f = kotlin.enums.c.a(loggingTypeArr);
    }

    public LoggingType(String str, int i12, String str2) {
        this.f89664b = str2;
    }

    public static LoggingType valueOf(String str) {
        return (LoggingType) Enum.valueOf(LoggingType.class, str);
    }

    public static LoggingType[] values() {
        return (LoggingType[]) f89662e.clone();
    }
}
