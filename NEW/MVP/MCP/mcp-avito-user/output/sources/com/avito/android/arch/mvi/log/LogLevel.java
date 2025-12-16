package com.avito.android.arch.mvi.log;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LogLevel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/arch/mvi/log/LogLevel;", "", "_common_mvi-flow_util-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LogLevel {

    /* renamed from: b, reason: collision with root package name */
    public static final LogLevel f91962b;

    /* renamed from: c, reason: collision with root package name */
    public static final LogLevel f91963c;

    /* renamed from: d, reason: collision with root package name */
    public static final LogLevel f91964d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ LogLevel[] f91965e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f91966f;

    static {
        LogLevel logLevel = new LogLevel("Debug", 0);
        f91962b = logLevel;
        LogLevel logLevel2 = new LogLevel("Info", 1);
        f91963c = logLevel2;
        LogLevel logLevel3 = new LogLevel("Silence", 2);
        f91964d = logLevel3;
        LogLevel[] logLevelArr = {logLevel, logLevel2, logLevel3};
        f91965e = logLevelArr;
        f91966f = kotlin.enums.c.a(logLevelArr);
    }

    public LogLevel() {
        throw null;
    }

    public static LogLevel valueOf(String str) {
        return (LogLevel) Enum.valueOf(LogLevel.class, str);
    }

    public static LogLevel[] values() {
        return (LogLevel[]) f91965e.clone();
    }
}
