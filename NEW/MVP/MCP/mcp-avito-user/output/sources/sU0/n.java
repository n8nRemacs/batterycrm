package SU0;

import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ParamEntry.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSU0/n;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f15026a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final o f15027b;

    public n(@Y61.k String str, @Y61.k o oVar) {
        this.f15026a = str;
        this.f15027b = oVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return L.f(this.f15026a, nVar.f15026a) && L.f(this.f15027b, nVar.f15027b);
    }

    public final int hashCode() {
        return this.f15027b.hashCode() + (this.f15026a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "ParamEntry(key=" + this.f15026a + ", paramValue=" + this.f15027b + ')';
    }
}
