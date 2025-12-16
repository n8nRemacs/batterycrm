package Y81;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: MessengerConfig.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LY81/a;", "", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f19367a;

    public a(long j12) {
        this.f19367a = j12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f19367a == ((a) obj).f19367a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f19367a);
    }

    @k
    public final String toString() {
        return r.u(new StringBuilder("MessengerConfig(timeToModifyMessage="), this.f19367a, ')');
    }
}
