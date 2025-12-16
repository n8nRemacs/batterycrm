package pJ0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UserAdvertsFiltersSubmit.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpJ0/d;", "", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<String> f428504a;

    public d(@k List<String> list) {
        this.f428504a = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && L.f(this.f428504a, ((d) obj).f428504a);
    }

    public final int hashCode() {
        return this.f428504a.hashCode();
    }

    @k
    public final String toString() {
        return H.p(new StringBuilder("UserAdvertsFiltersSubmit(parameterIds="), this.f428504a, ')');
    }
}
