package n91;

import Y61.k;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.random.i;
import kotlin.ranges.s;
import ru.avito.messenger.u0;

/* compiled from: BackoffReconnectIntervalGenerator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ln91/a;", "Lru/avito/messenger/u0;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: n91.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C44220a implements u0 {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final i f414910a;

    /* renamed from: b, reason: collision with root package name */
    public final double f414911b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final long[] f414912c;

    public C44220a(@k i iVar, double d12, @k long[] jArr) {
        this.f414910a = iVar;
        this.f414911b = d12;
        this.f414912c = jArr;
    }

    @Override // ru.avito.messenger.u0
    public final long a(int i12, @k TimeUnit timeUnit) {
        long[] jArr = this.f414912c;
        int length = jArr.length - 1;
        if (i12 > length) {
            i12 = length;
        }
        long jB2 = s.b(jArr[i12], 0L);
        double d12 = this.f414911b;
        if (d12 < 0.0d) {
            d12 = 0.0d;
        }
        return timeUnit.convert(kotlin.math.b.c((this.f414910a.f(-d12, d12) + 1) * TimeUnit.SECONDS.toNanos(jB2)), TimeUnit.NANOSECONDS);
    }
}
