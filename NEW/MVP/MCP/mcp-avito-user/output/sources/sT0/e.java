package ST0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DateTime.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LST0/e;", "LST0/a;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class e implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f14990a;

    public e(@k String str) {
        this.f14990a = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && L.f(this.f14990a, ((e) obj).f14990a);
    }

    @Override // ST0.b
    @k
    /* renamed from: getValue, reason: from getter */
    public final String getF14992a() {
        return this.f14990a;
    }

    public final int hashCode() {
        return this.f14990a.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("LocalDate(value="), this.f14990a, ')');
    }
}
