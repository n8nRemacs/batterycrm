package Sa1;

import V11.d;
import Y61.k;
import java.util.Map;
import kotlin.Q;
import kotlin.collections.P0;

/* loaded from: classes9.dex */
public final class b extends d {

    /* renamed from: b, reason: collision with root package name */
    public final long f15088b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15089c;

    public b(long j12, long j13) {
        super("PushMessageSkippedOnClientSdk");
        this.f15088b = j12;
        this.f15089c = j13;
    }

    @Override // V11.d
    @k
    public final Map<String, String> a() {
        long j12 = this.f15089c;
        long j13 = this.f15088b;
        return P0.g(new Q("received_by_server_at", String.valueOf(j13)), new Q("received_by_endpoint_at", String.valueOf(j12)), new Q("time_spent", String.valueOf(j12 - j13)));
    }
}
