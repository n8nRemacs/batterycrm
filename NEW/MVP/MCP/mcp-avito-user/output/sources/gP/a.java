package GP;

import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: PostPhoneRequestCodeApiResponse.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"LGP/a;", "", "", "lastTryTime", "nextTryTime", "<init>", "(JJ)V", "J", "getLastTryTime", "()J", "a", "_avito_job_cv-actualization_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a {

    @c("lastTryTime")
    private final long lastTryTime;

    @c("nextTryTime")
    private final long nextTryTime;

    public a(long j12, long j13) {
        this.lastTryTime = j12;
        this.nextTryTime = j13;
    }

    /* renamed from: a, reason: from getter */
    public final long getNextTryTime() {
        return this.nextTryTime;
    }
}
