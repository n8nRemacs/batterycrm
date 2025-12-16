package iC0;

import Y61.k;
import Y61.l;
import android.content.Context;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffCptUniversalImage.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LiC0/f;", "", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Image f398448a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Image f398449b;

    public f(@k Image image, @l Image image2) {
        this.f398448a = image;
        this.f398449b = image2;
    }

    @k
    public final Image a(@k Context context) {
        Image image;
        boolean zB2 = com.avito.android.lib.util.darkTheme.c.b(context);
        Image image2 = this.f398448a;
        return (zB2 || (image = this.f398449b) == null) ? image2 : image;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.f398448a, fVar.f398448a) && L.f(this.f398449b, fVar.f398449b);
    }

    public final int hashCode() {
        int iHashCode = this.f398448a.hashCode() * 31;
        Image image = this.f398449b;
        return iHashCode + (image == null ? 0 : image.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TariffCptUniversalImage(image=");
        sb2.append(this.f398448a);
        sb2.append(", imageDark=");
        return AK.c.o(sb2, this.f398449b, ')');
    }
}
