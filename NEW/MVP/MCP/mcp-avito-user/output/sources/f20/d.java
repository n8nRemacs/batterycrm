package F20;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MultiSendContentData.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LF20/d;", "", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    public final long f4499a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f4500b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f4501c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f4502d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f4503e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final f f4504f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Image f4505g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f4506h;

    public d(long j12, @l String str, @k String str2, @k String str3, @k String str4, @l f fVar, @l Image image, @l String str5) {
        this.f4499a = j12;
        this.f4500b = str;
        this.f4501c = str2;
        this.f4502d = str3;
        this.f4503e = str4;
        this.f4504f = fVar;
        this.f4505g = image;
        this.f4506h = str5;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f4499a == dVar.f4499a && L.f(this.f4500b, dVar.f4500b) && L.f(this.f4501c, dVar.f4501c) && L.f(this.f4502d, dVar.f4502d) && L.f(this.f4503e, dVar.f4503e) && L.f(this.f4504f, dVar.f4504f) && L.f(this.f4505g, dVar.f4505g) && L.f(this.f4506h, dVar.f4506h);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f4499a) * 31;
        String str = this.f4500b;
        int iD2 = H.d(H.d(H.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f4501c), 31, this.f4502d), 31, this.f4503e);
        f fVar = this.f4504f;
        int iHashCode2 = (iD2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        Image image = this.f4505g;
        int iHashCode3 = (iHashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        String str2 = this.f4506h;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MultiSendItemData(id=");
        sb2.append(this.f4499a);
        sb2.append(", address=");
        sb2.append(this.f4500b);
        sb2.append(", name=");
        sb2.append(this.f4501c);
        sb2.append(", price=");
        sb2.append(this.f4502d);
        sb2.append(", sellerName=");
        sb2.append(this.f4503e);
        sb2.append(", sellerReputation=");
        sb2.append(this.f4504f);
        sb2.append(", image=");
        sb2.append(this.f4505g);
        sb2.append(", minDeliveryTime=");
        return C22026a.c(sb2, this.f4506h, ')');
    }
}
