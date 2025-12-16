package MA0;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: ApiEditSellerAddressInfoV2Response.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"LMA0/j;", "", "", "hours", "minutes", "<init>", "(JJ)V", "J", "a", "()J", "b", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j {

    @com.google.gson.annotations.c("hours")
    private final long hours;

    @com.google.gson.annotations.c("minutes")
    private final long minutes;

    public j(long j12, long j13) {
        this.hours = j12;
        this.minutes = j13;
    }

    /* renamed from: a, reason: from getter */
    public final long getHours() {
        return this.hours;
    }

    /* renamed from: b, reason: from getter */
    public final long getMinutes() {
        return this.minutes;
    }
}
