package ST0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DateTime.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LST0/d;", "LST0/h;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class d implements h {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f14989a;

    public d(@k String str) {
        this.f14989a = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && L.f(this.f14989a, ((d) obj).f14989a);
    }

    @Override // ST0.b
    @k
    /* renamed from: getValue, reason: from getter */
    public final String getF14992a() {
        return this.f14989a;
    }

    public final int hashCode() {
        return this.f14989a.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("Instant(value="), this.f14989a, ')');
    }
}
