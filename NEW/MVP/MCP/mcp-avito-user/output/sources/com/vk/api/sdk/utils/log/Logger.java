package com.vk.api.sdk.utils.log;

import Y61.k;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;

/* compiled from: Logger.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/vk/api/sdk/utils/log/Logger;", "", "LogLevel", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public interface Logger {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Logger.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000f\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lcom/vk/api/sdk/utils/log/Logger$LogLevel;", "", "", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class LogLevel implements Comparable<LogLevel> {

        /* renamed from: b, reason: collision with root package name */
        public static final LogLevel f366736b;

        /* renamed from: c, reason: collision with root package name */
        public static final LogLevel f366737c;

        /* renamed from: d, reason: collision with root package name */
        public static final LogLevel f366738d;

        /* renamed from: e, reason: collision with root package name */
        public static final LogLevel f366739e;

        /* renamed from: f, reason: collision with root package name */
        public static final LogLevel f366740f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ LogLevel[] f366741g;

        static {
            LogLevel logLevel = new LogLevel("VERBOSE", 0);
            f366736b = logLevel;
            LogLevel logLevel2 = new LogLevel("DEBUG", 1);
            f366737c = logLevel2;
            LogLevel logLevel3 = new LogLevel("WARNING", 2);
            f366738d = logLevel3;
            LogLevel logLevel4 = new LogLevel("ERROR", 3);
            f366739e = logLevel4;
            LogLevel logLevel5 = new LogLevel("NONE", 4);
            f366740f = logLevel5;
            f366741g = new LogLevel[]{logLevel, logLevel2, logLevel3, logLevel4, logLevel5};
        }

        public LogLevel() {
            throw null;
        }

        public static LogLevel valueOf(String str) {
            return (LogLevel) Enum.valueOf(LogLevel.class, str);
        }

        public static LogLevel[] values() {
            return (LogLevel[]) f366741g.clone();
        }
    }

    /* compiled from: Logger.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a {
    }

    void a(@k LogLevel logLevel);

    @k
    InterfaceC42726C<LogLevel> b();
}
