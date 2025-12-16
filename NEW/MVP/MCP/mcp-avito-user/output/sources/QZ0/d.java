package qz0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrOrdersFiltersState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lqz0/d;", "", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f429556a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final List<TV0.a> f429557b;

    /* JADX WARN: Multi-variable type inference failed */
    public d(@l String str, @l List<? extends TV0.a> list) {
        this.f429556a = str;
        this.f429557b = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f429556a, dVar.f429556a) && L.f(this.f429557b, dVar.f429557b);
    }

    public final int hashCode() {
        String str = this.f429556a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<TV0.a> list = this.f429557b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StrOrdersFiltersViewState(buttonTitle=");
        sb2.append(this.f429556a);
        sb2.append(", items=");
        return H.p(sb2, this.f429557b, ')');
    }
}
