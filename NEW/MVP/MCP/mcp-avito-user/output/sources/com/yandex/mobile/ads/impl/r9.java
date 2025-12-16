package com.yandex.mobile.ads.impl;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

/* loaded from: classes8.dex */
public final class r9 extends Handler {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final r9 f389446a = new r9();

    private r9() {
    }

    @Override // java.util.logging.Handler
    public final void publish(@Y61.k LogRecord logRecord) {
        int i12 = q9.f389115c;
        q9.a(logRecord.getLoggerName(), s9.a(logRecord), logRecord.getMessage(), logRecord.getThrown());
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}
