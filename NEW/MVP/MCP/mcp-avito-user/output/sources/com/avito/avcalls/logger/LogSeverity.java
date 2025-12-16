package com.avito.avcalls.logger;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LogSeverity.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/logger/LogSeverity;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LogSeverity {

    /* renamed from: c, reason: collision with root package name */
    public static final LogSeverity f332936c;

    /* renamed from: d, reason: collision with root package name */
    public static final LogSeverity f332937d;

    /* renamed from: e, reason: collision with root package name */
    public static final LogSeverity f332938e;

    /* renamed from: f, reason: collision with root package name */
    public static final LogSeverity f332939f;

    /* renamed from: g, reason: collision with root package name */
    public static final LogSeverity f332940g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ LogSeverity[] f332941h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f332942i;

    /* renamed from: b, reason: collision with root package name */
    public final int f332943b;

    static {
        LogSeverity logSeverity = new LogSeverity("VERBOSE", 0, 0);
        f332936c = logSeverity;
        LogSeverity logSeverity2 = new LogSeverity("INFO", 1, 1);
        f332937d = logSeverity2;
        LogSeverity logSeverity3 = new LogSeverity("WARNING", 2, 2);
        f332938e = logSeverity3;
        LogSeverity logSeverity4 = new LogSeverity("ERROR", 3, 3);
        f332939f = logSeverity4;
        LogSeverity logSeverity5 = new LogSeverity("NONE", 4, 4);
        f332940g = logSeverity5;
        LogSeverity[] logSeverityArr = {logSeverity, logSeverity2, logSeverity3, logSeverity4, logSeverity5};
        f332941h = logSeverityArr;
        f332942i = kotlin.enums.c.a(logSeverityArr);
    }

    public LogSeverity(String str, int i12, int i13) {
        this.f332943b = i13;
    }

    public static LogSeverity valueOf(String str) {
        return (LogSeverity) Enum.valueOf(LogSeverity.class, str);
    }

    public static LogSeverity[] values() {
        return (LogSeverity[]) f332941h.clone();
    }
}
