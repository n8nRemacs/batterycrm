package DN0;

import AK.c;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ThemeImage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDN0/a;", "", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Image f3165a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Image f3166b;

    public a(@l Image image, @l Image image2) {
        this.f3165a = image;
        this.f3166b = image2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f3165a, aVar.f3165a) && L.f(this.f3166b, aVar.f3166b);
    }

    public final int hashCode() {
        Image image = this.f3165a;
        int iHashCode = (image == null ? 0 : image.hashCode()) * 31;
        Image image2 = this.f3166b;
        return iHashCode + (image2 != null ? image2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ThemeImage(imageLight=");
        sb2.append(this.f3165a);
        sb2.append(", imageDark=");
        return c.o(sb2, this.f3166b, ')');
    }
}
