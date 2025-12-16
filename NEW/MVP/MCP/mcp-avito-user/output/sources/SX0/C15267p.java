package Sx0;

import kotlin.Metadata;

/* compiled from: Api4StrOrderSellerByOrderIdGetResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"LSx0/p;", "", "", "isRequired", "", "maxCount", "timeout", "<init>", "(ZJJ)V", "Z", "c", "()Z", "J", "a", "()J", "b", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Sx0.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15267p {

    @com.google.gson.annotations.c("isRequired")
    private final boolean isRequired;

    @com.google.gson.annotations.c("maxCount")
    private final long maxCount;

    @com.google.gson.annotations.c("timeout")
    private final long timeout;

    public C15267p(boolean z12, long j12, long j13) {
        this.isRequired = z12;
        this.maxCount = j12;
        this.timeout = j13;
    }

    /* renamed from: a, reason: from getter */
    public final long getMaxCount() {
        return this.maxCount;
    }

    /* renamed from: b, reason: from getter */
    public final long getTimeout() {
        return this.timeout;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getIsRequired() {
        return this.isRequired;
    }
}
