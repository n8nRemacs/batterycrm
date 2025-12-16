package ln;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.rec.ScreenSource;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsFastOpenArgs.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lln/a;", "", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ln.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C43800a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f414185a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ScreenSource.CART_SIMILAR_ITEMS f414186b;

    /* renamed from: c, reason: collision with root package name */
    public final long f414187c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Image f414188d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f414189e;

    public C43800a(@k String str, @k ScreenSource.CART_SIMILAR_ITEMS cart_similar_items, long j12, @l Image image, @l String str2) {
        this.f414185a = str;
        this.f414186b = cart_similar_items;
        this.f414187c = j12;
        this.f414188d = image;
        this.f414189e = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43800a)) {
            return false;
        }
        C43800a c43800a = (C43800a) obj;
        return L.f(this.f414185a, c43800a.f414185a) && L.f(this.f414186b, c43800a.f414186b) && this.f414187c == c43800a.f414187c && L.f(this.f414188d, c43800a.f414188d) && L.f(this.f414189e, c43800a.f414189e);
    }

    public final int hashCode() {
        int iG2 = r.g((this.f414186b.hashCode() + (this.f414185a.hashCode() * 31)) * 31, 31, this.f414187c);
        Image image = this.f414188d;
        int iHashCode = (iG2 + (image == null ? 0 : image.hashCode())) * 31;
        String str = this.f414189e;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsFastOpenArgs(title=");
        sb2.append(this.f414185a);
        sb2.append(", screenSource=");
        sb2.append(this.f414186b);
        sb2.append(", clickTime=");
        sb2.append(this.f414187c);
        sb2.append(", image=");
        sb2.append(this.f414188d);
        sb2.append(", price=");
        return C22026a.c(sb2, this.f414189e, ')');
    }
}
