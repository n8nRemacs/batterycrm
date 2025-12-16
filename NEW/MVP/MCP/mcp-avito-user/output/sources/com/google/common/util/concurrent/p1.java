package com.google.common.util.concurrent;

import aZ0.InterfaceC19845a;
import java.util.concurrent.Future;

/* compiled from: Uninterruptibles.java */
@InterfaceC37531b0
@XY0.b
/* loaded from: classes6.dex */
public final class p1 {
    @InterfaceC19845a
    @T0
    public static <V> V a(Future<V> future) {
        V v12;
        boolean z12 = false;
        while (true) {
            try {
                v12 = future.get();
                break;
            } catch (InterruptedException unused) {
                z12 = true;
            } catch (Throwable th2) {
                if (z12) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z12) {
            Thread.currentThread().interrupt();
        }
        return v12;
    }
}
