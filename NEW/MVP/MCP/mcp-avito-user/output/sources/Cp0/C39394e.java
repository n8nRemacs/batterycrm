package cp0;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: ApiCreateDispatchVasV1Response.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcp0/e;", "", "", "default", "max", "min", "", "readOnly", "<init>", "(JJJZ)V", "J", "a", "()J", "b", "c", "Z", "d", "()Z", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cp0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C39394e {

    @com.google.gson.annotations.c("default")
    private final long default;

    @com.google.gson.annotations.c("max")
    private final long max;

    @com.google.gson.annotations.c("min")
    private final long min;

    @com.google.gson.annotations.c("readOnly")
    private final boolean readOnly;

    public C39394e(long j12, long j13, long j14, boolean z12) {
        this.default = j12;
        this.max = j13;
        this.min = j14;
        this.readOnly = z12;
    }

    /* renamed from: a, reason: from getter */
    public final long getDefault() {
        return this.default;
    }

    /* renamed from: b, reason: from getter */
    public final long getMax() {
        return this.max;
    }

    /* renamed from: c, reason: from getter */
    public final long getMin() {
        return this.min;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getReadOnly() {
        return this.readOnly;
    }
}
