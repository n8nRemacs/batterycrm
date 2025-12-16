package defpackage;

import android.os.SystemClock;
import java.time.Clock;

/* loaded from: classes2.dex */
public final class z8g implements y8g {
    public Long a;
    public Long b;

    @Override // defpackage.y8g
    public final long getMsSinceBoot() {
        return SystemClock.elapsedRealtime();
    }

    @Override // defpackage.y8g
    public final Long getServerTimeMs() {
        Long l = this.b;
        if (l != null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - l.longValue();
            Long l2 = this.a;
            if (l2 != null) {
                return Long.valueOf(l2.longValue() + jElapsedRealtime);
            }
        }
        return null;
    }

    @Override // defpackage.y8g
    public final long localTimeMs() {
        return System.currentTimeMillis();
    }

    @Override // defpackage.y8g
    public final Long mapToLocalTimeMs(long j) {
        Long serverTimeMs = getServerTimeMs();
        if (serverTimeMs == null) {
            return null;
        }
        return Long.valueOf(System.currentTimeMillis() + (j - serverTimeMs.longValue()));
    }

    @Override // defpackage.y8g
    public final long utcTimeMs() {
        return Clock.systemUTC().millis();
    }
}
