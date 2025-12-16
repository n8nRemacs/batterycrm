package io.reactivex.rxjava3.exceptions;

import j41.e;

/* compiled from: Exceptions.java */
/* loaded from: classes8.dex */
public final class a {
    public a() {
        throw new IllegalStateException("No instances!");
    }

    public static void a(@e Throwable th2) {
        if (th2 instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th2);
        }
        if (th2 instanceof ThreadDeath) {
            throw ((ThreadDeath) th2);
        }
        if (th2 instanceof LinkageError) {
            throw ((LinkageError) th2);
        }
    }
}
