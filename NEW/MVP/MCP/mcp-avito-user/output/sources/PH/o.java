package pH;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GigSlotState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpH/o;", "", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f428415a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f428416b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final m f428417c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final n f428418d;

    public o(@Y61.l String str, @Y61.l String str2, @Y61.k m mVar, @Y61.k n nVar) {
        this.f428415a = str;
        this.f428416b = str2;
        this.f428417c = mVar;
        this.f428418d = nVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return L.f(this.f428415a, oVar.f428415a) && L.f(this.f428416b, oVar.f428416b) && L.f(this.f428417c, oVar.f428417c) && L.f(this.f428418d, oVar.f428418d);
    }

    public final int hashCode() {
        String str = this.f428415a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f428416b;
        return this.f428418d.hashCode() + ((this.f428417c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "GigSlotMapViewState(title=" + this.f428415a + ", address=" + this.f428416b + ", bottomButton=" + this.f428417c + ", coords=" + this.f428418d + ')';
    }
}
