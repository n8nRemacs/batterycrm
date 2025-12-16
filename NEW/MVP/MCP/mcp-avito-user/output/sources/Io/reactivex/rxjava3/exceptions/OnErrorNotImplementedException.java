package io.reactivex.rxjava3.exceptions;

import j41.e;

/* loaded from: classes8.dex */
public final class OnErrorNotImplementedException extends RuntimeException {
    private static final long serialVersionUID = -6298857009889503852L;

    public OnErrorNotImplementedException(@e Throwable th2) {
        super("The exception was not handled due to missing onError handler in the subscribe() method call. Further reading: https://github.com/ReactiveX/RxJava/wiki/Error-Handling | " + th2, th2 == null ? new NullPointerException() : th2);
    }
}
