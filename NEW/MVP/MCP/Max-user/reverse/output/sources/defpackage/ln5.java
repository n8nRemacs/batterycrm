package defpackage;

import androidx.work.WorkRequest;

/* loaded from: classes2.dex */
public final class ln5 {
    public final long a;
    public final float b;

    public ln5(int i) {
        long j = (i & 1) != 0 ? 500L : 1000L;
        float f = (i & 4) != 0 ? 1.5f : 2.0f;
        this.a = j;
        this.b = f;
        if (j < 1) {
            throw new IllegalArgumentException("Interval is invalid. Must be greater than 1.");
        }
        if (WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS < j) {
            throw new IllegalArgumentException("maxInterval is invalid. Must be greater or equal than Interval.");
        }
        if (f < 1.0d) {
            throw new IllegalArgumentException("Multiplier is invalid. Must be greater than 1.0.");
        }
        double d = 0.2f;
        if (d < 0.0d || 1.0d <= d) {
            throw new IllegalArgumentException("Range is invalid. Must be greater or equal 0.0 and lower than 1.0.");
        }
    }
}
