package SU0;

import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: NetworkRequestBody.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSU0/p;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f15030a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final j f15031b;

    public p(@Y61.k String str, @Y61.k j jVar) {
        this.f15030a = str;
        this.f15031b = jVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return L.f(this.f15030a, pVar.f15030a) && L.f(this.f15031b, pVar.f15031b);
    }

    public final int hashCode() {
        return this.f15031b.hashCode() + (this.f15030a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "RequestEntry(key=" + this.f15030a + ", value=" + this.f15031b + ')';
    }
}
