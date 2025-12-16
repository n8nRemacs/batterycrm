package JJ;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: AvCallsConfig.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJJ/b;", "", "_avito_iac-avcalls_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f8870a;

    public b(long j12) {
        this.f8870a = j12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f8870a == ((b) obj).f8870a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f8870a);
    }

    @k
    public final String toString() {
        return r.u(new StringBuilder("AvCallsConfig(outgoingAcceptTimeout="), this.f8870a, ')');
    }
}
