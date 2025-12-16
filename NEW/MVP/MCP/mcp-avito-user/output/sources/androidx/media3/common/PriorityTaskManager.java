package androidx.media3.common;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;

@androidx.media3.common.util.J
/* loaded from: classes.dex */
public final class PriorityTaskManager {

    /* renamed from: a, reason: collision with root package name */
    public final Object f47434a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final int f47435b;

    public static class PriorityTooLowException extends IOException {
    }

    public PriorityTaskManager() {
        new PriorityQueue(10, Collections.reverseOrder());
        this.f47435b = BeduinInputModel.MIN_TEXT_VERSION;
    }

    public final void a(int i12) {
        synchronized (this.f47434a) {
            try {
                if (this.f47435b != i12) {
                    throw new PriorityTooLowException("Priority too low [priority=" + i12 + ", highest=" + this.f47435b + "]");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
