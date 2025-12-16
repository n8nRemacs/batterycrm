package androidx.core.os;

import j.P;

/* loaded from: classes.dex */
public class OperationCanceledException extends RuntimeException {
    public OperationCanceledException() {
        super("The operation has been canceled.");
    }

    public OperationCanceledException(@P String str) {
        super(str.toString());
    }
}
