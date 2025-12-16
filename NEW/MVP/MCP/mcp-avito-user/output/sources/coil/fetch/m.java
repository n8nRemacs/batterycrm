package coil.fetch;

import coil.decode.DataSource;
import coil.decode.n;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FetchResult.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/fetch/m;", "Lcoil/fetch/g;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class m extends g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final n f58410a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f58411b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final DataSource f58412c;

    public m(@Y61.k n nVar, @Y61.l String str, @Y61.k DataSource dataSource) {
        super(null);
        this.f58410a = nVar;
        this.f58411b = str;
        this.f58412c = dataSource;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (L.f(this.f58410a, mVar.f58410a) && L.f(this.f58411b, mVar.f58411b) && this.f58412c == mVar.f58412c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f58410a.hashCode() * 31;
        String str = this.f58411b;
        return this.f58412c.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
