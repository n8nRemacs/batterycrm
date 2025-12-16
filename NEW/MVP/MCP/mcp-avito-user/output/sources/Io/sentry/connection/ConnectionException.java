package io.sentry.connection;

import java.io.IOException;

/* loaded from: classes8.dex */
public class ConnectionException extends RuntimeException {

    /* renamed from: b, reason: collision with root package name */
    public Long f405089b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f405090c;

    public ConnectionException() {
        this.f405089b = null;
        this.f405090c = null;
    }

    public ConnectionException(String str, IOException iOException, Long l12, Integer num) {
        super(str, iOException);
        this.f405089b = l12;
        this.f405090c = num;
    }
}
