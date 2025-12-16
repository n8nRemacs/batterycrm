package n91;

import Y61.k;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import ru.avito.messenger.u0;

/* compiled from: FixedReconnectIntervalGenerator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ln91/b;", "Lru/avito/messenger/u0;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: n91.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C44221b implements u0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f414913a;

    public C44221b(long j12) {
        this.f414913a = j12;
    }

    @Override // ru.avito.messenger.u0
    public final long a(int i12, @k TimeUnit timeUnit) {
        return timeUnit.convert(this.f414913a, TimeUnit.SECONDS);
    }
}
