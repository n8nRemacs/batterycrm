package O40;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: OrderLastUpdate.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"LO40/c;", "", "", "lastUpdate", "pollingIntervalSec", "<init>", "(II)V", "I", "a", "()I", "b", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c {

    @com.google.gson.annotations.c("lastUpdate")
    private final int lastUpdate;

    @com.google.gson.annotations.c("pollingInterval")
    private final int pollingIntervalSec;

    public c(int i12, int i13) {
        this.lastUpdate = i12;
        this.pollingIntervalSec = i13;
    }

    /* renamed from: a, reason: from getter */
    public final int getLastUpdate() {
        return this.lastUpdate;
    }

    /* renamed from: b, reason: from getter */
    public final int getPollingIntervalSec() {
        return this.pollingIntervalSec;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.lastUpdate == cVar.lastUpdate && this.pollingIntervalSec == cVar.pollingIntervalSec;
    }

    public final int hashCode() {
        return Integer.hashCode(this.pollingIntervalSec) + (Integer.hashCode(this.lastUpdate) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OrderLastUpdate(lastUpdate=");
        sb2.append(this.lastUpdate);
        sb2.append(", pollingIntervalSec=");
        return r.t(sb2, this.pollingIntervalSec, ')');
    }
}
