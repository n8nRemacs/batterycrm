package com.avito.android.arch.mvi.log;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LogParams.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/arch/mvi/log/LogVerbosity;", "", "_common_mvi-flow_util-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LogVerbosity {

    /* renamed from: b, reason: collision with root package name */
    public static final LogVerbosity f91967b;

    /* renamed from: c, reason: collision with root package name */
    public static final LogVerbosity f91968c;

    /* renamed from: d, reason: collision with root package name */
    public static final LogVerbosity f91969d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ LogVerbosity[] f91970e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f91971f;

    static {
        LogVerbosity logVerbosity = new LogVerbosity("Full", 0);
        f91967b = logVerbosity;
        LogVerbosity logVerbosity2 = new LogVerbosity("Short", 1);
        f91968c = logVerbosity2;
        LogVerbosity logVerbosity3 = new LogVerbosity("Disabled", 2);
        f91969d = logVerbosity3;
        LogVerbosity[] logVerbosityArr = {logVerbosity, logVerbosity2, logVerbosity3};
        f91970e = logVerbosityArr;
        f91971f = kotlin.enums.c.a(logVerbosityArr);
    }

    public LogVerbosity() {
        throw null;
    }

    public static LogVerbosity valueOf(String str) {
        return (LogVerbosity) Enum.valueOf(LogVerbosity.class, str);
    }

    public static LogVerbosity[] values() {
        return (LogVerbosity[]) f91970e.clone();
    }
}
