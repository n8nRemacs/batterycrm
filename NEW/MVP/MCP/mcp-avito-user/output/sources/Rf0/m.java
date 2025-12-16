package RF0;

import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TrxPromoStrUniversalImage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRF0/m;", "", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Image f14249a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Image f14250b;

    public m(@Y61.k Image image, @Y61.l Image image2) {
        this.f14249a = image;
        this.f14250b = image2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return L.f(this.f14249a, mVar.f14249a) && L.f(this.f14250b, mVar.f14250b);
    }

    public final int hashCode() {
        int iHashCode = this.f14249a.hashCode() * 31;
        Image image = this.f14250b;
        return iHashCode + (image == null ? 0 : image.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TrxPromoStrUniversalImage(image=");
        sb2.append(this.f14249a);
        sb2.append(", imageDark=");
        return AK.c.o(sb2, this.f14250b, ')');
    }
}
