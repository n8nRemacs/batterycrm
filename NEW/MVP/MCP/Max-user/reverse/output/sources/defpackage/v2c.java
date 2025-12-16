package defpackage;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* loaded from: classes.dex */
public final class v2c extends t3 {
    @Override // defpackage.k7d
    public final long e(long j) {
        return ThreadLocalRandom.current().nextLong(j);
    }

    @Override // defpackage.k7d
    public final long f(long j, long j2) {
        return ThreadLocalRandom.current().nextLong(j, j2);
    }

    @Override // defpackage.t3
    public final Random g() {
        return ThreadLocalRandom.current();
    }
}
