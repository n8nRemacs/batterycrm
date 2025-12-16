package Nq0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.rec.ScreenSource;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsFastOpenArgs.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNq0/a;", "", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Nq0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C14603a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f11757a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ScreenSource.SELLER_PROMOTIONS f11758b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11759c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Image f11760d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f11761e;

    public C14603a(@k String str, @k ScreenSource.SELLER_PROMOTIONS seller_promotions, long j12, @l Image image, @l String str2) {
        this.f11757a = str;
        this.f11758b = seller_promotions;
        this.f11759c = j12;
        this.f11760d = image;
        this.f11761e = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14603a)) {
            return false;
        }
        C14603a c14603a = (C14603a) obj;
        return L.f(this.f11757a, c14603a.f11757a) && L.f(this.f11758b, c14603a.f11758b) && this.f11759c == c14603a.f11759c && L.f(this.f11760d, c14603a.f11760d) && L.f(this.f11761e, c14603a.f11761e);
    }

    public final int hashCode() {
        int iG2 = r.g((this.f11758b.hashCode() + (this.f11757a.hashCode() * 31)) * 31, 31, this.f11759c);
        Image image = this.f11760d;
        int iHashCode = (iG2 + (image == null ? 0 : image.hashCode())) * 31;
        String str = this.f11761e;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsFastOpenArgs(title=");
        sb2.append(this.f11757a);
        sb2.append(", screenSource=");
        sb2.append(this.f11758b);
        sb2.append(", clickTime=");
        sb2.append(this.f11759c);
        sb2.append(", image=");
        sb2.append(this.f11760d);
        sb2.append(", price=");
        return C22026a.c(sb2, this.f11761e, ')');
    }
}
