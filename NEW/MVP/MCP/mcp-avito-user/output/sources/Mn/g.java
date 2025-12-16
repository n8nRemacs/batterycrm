package MN;

import Y61.k;
import Y61.l;
import com.avito.android.util.P2;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: LoadingStateWrapper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002¨\u0006\u0003"}, d2 = {"LMN/g;", "T", "", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class g<T> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final P2<T> f10668a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Throwable f10669b;

    public g() {
        throw null;
    }

    public g(P2 p22, Throwable th2, int i12, C42822w c42822w) {
        th2 = (i12 & 2) != 0 ? null : th2;
        this.f10668a = p22;
        this.f10669b = th2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.f10668a, gVar.f10668a) && L.f(this.f10669b, gVar.f10669b);
    }

    public final int hashCode() {
        int iHashCode = this.f10668a.hashCode() * 31;
        Throwable th2 = this.f10669b;
        return iHashCode + (th2 == null ? 0 : th2.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LoadingStateWrapper(loadingState=");
        sb2.append(this.f10668a);
        sb2.append(", cause=");
        return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f10669b, ')');
    }
}
