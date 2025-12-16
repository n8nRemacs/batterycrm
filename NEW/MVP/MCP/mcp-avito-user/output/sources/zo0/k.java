package ZO0;

import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WalletPageViewState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZO0/k;", "", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Image f20154a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Image f20155b;

    public k(@Y61.k Image image, @Y61.l Image image2) {
        this.f20154a = image;
        this.f20155b = image2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return L.f(this.f20154a, kVar.f20154a) && L.f(this.f20155b, kVar.f20155b);
    }

    public final int hashCode() {
        int iHashCode = this.f20154a.hashCode() * 31;
        Image image = this.f20155b;
        return iHashCode + (image == null ? 0 : image.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WalletPagePromoBannerUniversalImage(lightImage=");
        sb2.append(this.f20154a);
        sb2.append(", darkImage=");
        return AK.c.o(sb2, this.f20155b, ')');
    }
}
