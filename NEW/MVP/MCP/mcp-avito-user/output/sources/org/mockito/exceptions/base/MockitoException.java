package org.mockito.exceptions.base;

import org.mockito.internal.exceptions.stacktrace.a;

/* loaded from: classes7.dex */
public class MockitoException extends RuntimeException {
    private static final long serialVersionUID = 1;

    public MockitoException(String str, Throwable th2) {
        super(str, th2);
        getStackTrace();
        new a().a(this);
    }

    public MockitoException(String str) {
        super(str);
        getStackTrace();
        new a().a(this);
    }
}
