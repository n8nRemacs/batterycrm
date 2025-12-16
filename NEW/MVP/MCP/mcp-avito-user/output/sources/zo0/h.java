package ZO0;

import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WalletPageViewState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZO0/h;", "", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final j f20147a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final i f20148b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final k f20149c;

    public h(@Y61.l j jVar, @Y61.k i iVar, @Y61.l k kVar) {
        this.f20147a = jVar;
        this.f20148b = iVar;
        this.f20149c = kVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return L.f(this.f20147a, hVar.f20147a) && L.f(this.f20148b, hVar.f20148b) && L.f(this.f20149c, hVar.f20149c);
    }

    public final int hashCode() {
        j jVar = this.f20147a;
        int iHashCode = (this.f20148b.hashCode() + ((jVar == null ? 0 : jVar.hashCode()) * 31)) * 31;
        k kVar = this.f20149c;
        return iHashCode + (kVar != null ? kVar.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "WalletPagePromoBannerIcon(localImage=" + this.f20147a + ", size=" + this.f20148b + ", universalImage=" + this.f20149c + ')';
    }
}
