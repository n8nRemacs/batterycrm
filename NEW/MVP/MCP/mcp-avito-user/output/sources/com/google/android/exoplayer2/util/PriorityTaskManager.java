package com.google.android.exoplayer2.util;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;

/* loaded from: classes6.dex */
public final class PriorityTaskManager {

    /* renamed from: a, reason: collision with root package name */
    public final Object f348103a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final int f348104b;

    public static class PriorityTooLowException extends IOException {
    }

    public PriorityTaskManager() {
        new PriorityQueue(10, Collections.reverseOrder());
        this.f348104b = BeduinInputModel.MIN_TEXT_VERSION;
    }

    public final void a(int i12) {
        synchronized (this.f348103a) {
            try {
                if (this.f348104b != i12) {
                    throw new PriorityTooLowException("Priority too low [priority=" + i12 + ", highest=" + this.f348104b + "]");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
