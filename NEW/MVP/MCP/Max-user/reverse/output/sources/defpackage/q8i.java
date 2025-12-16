package defpackage;

import android.os.SystemClock;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class q8i {
    public final nz9 a;
    public final long b;
    public long c = SystemClock.elapsedRealtime();

    public q8i(long j, nz9 nz9Var) {
        this.a = nz9Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q8i.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.a, ((q8i) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
