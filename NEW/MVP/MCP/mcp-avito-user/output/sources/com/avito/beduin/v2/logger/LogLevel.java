package com.avito.beduin.v2.logger;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LogLevel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/logger/LogLevel;", "", "logger_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LogLevel {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ LogLevel[] f337864b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f337865c;

    static {
        LogLevel[] logLevelArr = {new LogLevel("Verbose", 0, 0), new LogLevel("Debug", 1, 1), new LogLevel("Info", 2, 2), new LogLevel("Warning", 3, 3), new LogLevel("Error", 4, 4), new LogLevel("Silent", 5, 10)};
        f337864b = logLevelArr;
        f337865c = c.a(logLevelArr);
    }

    public LogLevel(String str, int i12, int i13) {
    }

    public static LogLevel valueOf(String str) {
        return (LogLevel) Enum.valueOf(LogLevel.class, str);
    }

    public static LogLevel[] values() {
        return (LogLevel[]) f337864b.clone();
    }
}
