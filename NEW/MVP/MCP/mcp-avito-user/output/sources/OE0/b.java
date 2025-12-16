package OE0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TravelGuestProfileResponse.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOE0/b;", "", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<a> f12098a;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@k List<? extends a> list) {
        this.f12098a = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && L.f(this.f12098a, ((b) obj).f12098a);
    }

    public final int hashCode() {
        return this.f12098a.hashCode();
    }

    @k
    public final String toString() {
        return H.p(new StringBuilder("TravelGuestProfileResponse(blocks="), this.f12098a, ')');
    }
}
