package MZ;

import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LandingActionItem.kt */
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LMZ/a;", "", "", "eventId", "version", "", "", "params", "<init>", "(IILjava/util/Map;)V", "I", "a", "()I", "c", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class a {

    @com.google.gson.annotations.c("eventId")
    private final int eventId;

    @com.google.gson.annotations.c("params")
    @Y61.k
    private final Map<String, String> params;

    @com.google.gson.annotations.c("version")
    private final int version;

    public a(int i12, int i13, @Y61.k Map<String, String> map) {
        this.eventId = i12;
        this.version = i13;
        this.params = map;
    }

    /* renamed from: a, reason: from getter */
    public final int getEventId() {
        return this.eventId;
    }

    @Y61.k
    public final Map<String, String> b() {
        return this.params;
    }

    /* renamed from: c, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.eventId == aVar.eventId && this.version == aVar.version && L.f(this.params, aVar.params);
    }

    public final int hashCode() {
        return this.params.hashCode() + r.e(this.version, Integer.hashCode(this.eventId) * 31, 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AnalyticsEvent(eventId=");
        sb2.append(this.eventId);
        sb2.append(", version=");
        sb2.append(this.version);
        sb2.append(", params=");
        return r.w(sb2, this.params, ')');
    }
}
