package com.vk.id.logger;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* compiled from: LogEngine.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\fJ1\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/vk/id/logger/LogEngine;", "", "Lcom/vk/id/logger/LogEngine$LogLevel;", "logLevel", "", "tag", "message", "", "throwable", "Lkotlin/G0;", "log", "(Lcom/vk/id/logger/LogEngine$LogLevel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "LogLevel", "logger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface LogEngine {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LogEngine.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/vk/id/logger/LogEngine$LogLevel;", "", "<init>", "(Ljava/lang/String;I)V", "INFO", "DEBUG", "ERROR", "logger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LogLevel {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ LogLevel[] $VALUES;
        public static final LogLevel INFO = new LogLevel("INFO", 0);
        public static final LogLevel DEBUG = new LogLevel("DEBUG", 1);
        public static final LogLevel ERROR = new LogLevel("ERROR", 2);

        private static final /* synthetic */ LogLevel[] $values() {
            return new LogLevel[]{INFO, DEBUG, ERROR};
        }

        static {
            LogLevel[] logLevelArr$values = $values();
            $VALUES = logLevelArr$values;
            $ENTRIES = c.a(logLevelArr$values);
        }

        private LogLevel(String str, int i12) {
        }

        public static LogLevel valueOf(String str) {
            return (LogLevel) Enum.valueOf(LogLevel.class, str);
        }

        public static LogLevel[] values() {
            return (LogLevel[]) $VALUES.clone();
        }
    }

    void log(@k LogLevel logLevel, @k String tag, @k String message, @l Throwable throwable);
}
