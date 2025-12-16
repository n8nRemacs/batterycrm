package d21;

import V11.d;
import Y61.k;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: PushMessageDeliveredToClientSDKEvent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Ld21/b;", "LV11/d;", "a", "sdk-public-push-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class b extends d {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f393635e = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public final long f393636b;

    /* renamed from: c, reason: collision with root package name */
    public final long f393637c;

    /* renamed from: d, reason: collision with root package name */
    public final long f393638d;

    /* compiled from: PushMessageDeliveredToClientSDKEvent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Ld21/b$a;", "", "<init>", "()V", "", "EVENT_NAME", "Ljava/lang/String;", "RECEIVED_BY_ENDPOINT_AT", "RECEIVED_BY_SERVER_AT", "SLOT_ID", "TIME_SPENT", "sdk-public-push-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public b(long j12, long j13, long j14, C42822w c42822w) {
        super("PushMessageDeliveredToClientSdk");
        this.f393636b = j12;
        this.f393637c = j13;
        this.f393638d = j14;
    }

    @Override // V11.d
    @k
    public final Map<String, String> a() {
        long j12 = this.f393637c;
        long j13 = this.f393636b;
        return P0.g(new Q("received_by_server_at", String.valueOf(j13)), new Q("received_by_endpoint_at", String.valueOf(j12)), new Q("time_spent", String.valueOf(j12 - j13)), new Q("slot_id", String.valueOf(this.f393638d)));
    }
}
