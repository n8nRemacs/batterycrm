package com.google.common.util.concurrent;

/* compiled from: Platform.java */
@InterfaceC37531b0
@XY0.b
/* loaded from: classes6.dex */
final class V0 {
    public static void a(Throwable th2) {
        if (th2 instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }
}
