package vs0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.SearchParams;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SerpItemEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvs0/b;", "", "_avito-discouraged_avito-libs_serp-core_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Integer f441020a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final SearchParams f441021b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f441022c;

    public b() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f441020a, bVar.f441020a) && L.f(this.f441021b, bVar.f441021b) && L.f(this.f441022c, bVar.f441022c);
    }

    public final int hashCode() {
        Integer num = this.f441020a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        SearchParams searchParams = this.f441021b;
        int iHashCode2 = (iHashCode + (searchParams == null ? 0 : searchParams.hashCode())) * 31;
        String str = this.f441022c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Arguments(position=");
        sb2.append(this.f441020a);
        sb2.append(", searchParams=");
        sb2.append(this.f441021b);
        sb2.append(", xHash=");
        return C22026a.c(sb2, this.f441022c, ')');
    }

    public b(Integer num, SearchParams searchParams, String str, int i12, C42822w c42822w) {
        num = (i12 & 1) != 0 ? null : num;
        searchParams = (i12 & 2) != 0 ? null : searchParams;
        str = (i12 & 4) != 0 ? null : str;
        this.f441020a = num;
        this.f441021b = searchParams;
        this.f441022c = str;
    }
}
