package To0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CreateDiscountDispatchData.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTo0/f;", "", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class f {

    /* renamed from: a, reason: collision with root package name */
    public final long f15908a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f15909b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Image f15910c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f15911d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f15912e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f15913f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f15914g;

    public f(long j12, @k String str, @l Image image, @k String str2, @k String str3, @k String str4, @k String str5) {
        this.f15908a = j12;
        this.f15909b = str;
        this.f15910c = image;
        this.f15911d = str2;
        this.f15912e = str3;
        this.f15913f = str4;
        this.f15914g = str5;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f15908a == fVar.f15908a && L.f(this.f15909b, fVar.f15909b) && L.f(this.f15910c, fVar.f15910c) && L.f(this.f15911d, fVar.f15911d) && L.f(this.f15912e, fVar.f15912e) && L.f(this.f15913f, fVar.f15913f) && L.f(this.f15914g, fVar.f15914g);
    }

    public final int hashCode() {
        int iD2 = H.d(Long.hashCode(this.f15908a) * 31, 31, this.f15909b);
        Image image = this.f15910c;
        return this.f15914g.hashCode() + H.d(H.d(H.d((iD2 + (image == null ? 0 : image.hashCode())) * 31, 31, this.f15911d), 31, this.f15912e), 31, this.f15913f);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ItemInfo(id=");
        sb2.append(this.f15908a);
        sb2.append(", title=");
        sb2.append(this.f15909b);
        sb2.append(", imageBySizes=");
        sb2.append(this.f15910c);
        sb2.append(", oldPriceString=");
        sb2.append(this.f15911d);
        sb2.append(", locationWithMetro=");
        sb2.append(this.f15912e);
        sb2.append(", urlPath=");
        sb2.append(this.f15913f);
        sb2.append(", uriPath=");
        return C22026a.c(sb2, this.f15914g, ')');
    }
}
