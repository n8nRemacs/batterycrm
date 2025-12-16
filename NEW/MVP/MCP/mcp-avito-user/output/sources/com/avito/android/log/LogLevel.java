package com.avito.android.log;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LogLevel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/log/LogLevel;", "", "_common_logger_util-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class LogLevel {

    /* renamed from: c, reason: collision with root package name */
    public static final LogLevel f182840c;

    /* renamed from: d, reason: collision with root package name */
    public static final LogLevel f182841d;

    /* renamed from: e, reason: collision with root package name */
    public static final LogLevel f182842e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ LogLevel[] f182843f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a f182844g;

    /* renamed from: b, reason: collision with root package name */
    public final int f182845b;

    static {
        LogLevel logLevel = new LogLevel("Verbose", 0, 2);
        f182840c = logLevel;
        LogLevel logLevel2 = new LogLevel("Debug", 1, 3);
        LogLevel logLevel3 = new LogLevel("Info", 2, 4);
        f182841d = logLevel3;
        LogLevel logLevel4 = new LogLevel("Warning", 3, 5);
        LogLevel logLevel5 = new LogLevel("Error", 4, 6);
        LogLevel logLevel6 = new LogLevel("Silent", 5, 10);
        f182842e = logLevel6;
        LogLevel[] logLevelArr = {logLevel, logLevel2, logLevel3, logLevel4, logLevel5, logLevel6};
        f182843f = logLevelArr;
        f182844g = c.a(logLevelArr);
    }

    public LogLevel(String str, int i12, int i13) {
        this.f182845b = i13;
    }

    public static LogLevel valueOf(String str) {
        return (LogLevel) Enum.valueOf(LogLevel.class, str);
    }

    public static LogLevel[] values() {
        return (LogLevel[]) f182843f.clone();
    }
}
