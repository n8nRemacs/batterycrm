package d51;

import Y61.k;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.Metadata;

/* compiled from: PlatformThreadLocalRandom.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ld51/a;", "Lkotlin/random/a;", "<init>", "()V", "kotlin-stdlib-jdk8"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: d51.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C39509a extends kotlin.random.a {
    @Override // kotlin.random.f
    public final double g() {
        return ThreadLocalRandom.current().nextDouble(100.0d);
    }

    @Override // kotlin.random.f
    public final int l(int i12, int i13) {
        return ThreadLocalRandom.current().nextInt(i12, i13);
    }

    @Override // kotlin.random.f
    public final long n(long j12) {
        return ThreadLocalRandom.current().nextLong(j12);
    }

    @Override // kotlin.random.f
    public final long o(long j12, long j13) {
        return ThreadLocalRandom.current().nextLong(j12, j13);
    }

    @Override // kotlin.random.a
    @k
    public final Random p() {
        return ThreadLocalRandom.current();
    }
}
