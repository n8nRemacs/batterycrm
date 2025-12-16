package com.avito.logger;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LogLevel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000f\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/logger/LogLevel;", "", "", "logger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LogLevel implements Comparable<LogLevel> {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ LogLevel[] f338573b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f338574c;

    static {
        LogLevel[] logLevelArr = {new LogLevel("VERBOSE", 0), new LogLevel("DEBUG", 1), new LogLevel("INFO", 2), new LogLevel("WARNING", 3), new LogLevel("CRITICAL", 4)};
        f338573b = logLevelArr;
        f338574c = c.a(logLevelArr);
    }

    public LogLevel() {
        throw null;
    }

    public static LogLevel valueOf(String str) {
        return (LogLevel) Enum.valueOf(LogLevel.class, str);
    }

    public static LogLevel[] values() {
        return (LogLevel[]) f338573b.clone();
    }
}
