package wZ;

import android.content.Context;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MnzUniversalImage.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LwZ/l;", "", "_avito_mnz-common_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Image f441575a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Image f441576b;

    public l(@Y61.k Image image, @Y61.l Image image2) {
        this.f441575a = image;
        this.f441576b = image2;
    }

    @Y61.k
    public final Image a(@Y61.k Context context) {
        Image image;
        boolean zB2 = com.avito.android.lib.util.darkTheme.c.b(context);
        Image image2 = this.f441575a;
        return (zB2 || (image = this.f441576b) == null) ? image2 : image;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return L.f(this.f441575a, lVar.f441575a) && L.f(this.f441576b, lVar.f441576b);
    }

    public final int hashCode() {
        int iHashCode = this.f441575a.hashCode() * 31;
        Image image = this.f441576b;
        return iHashCode + (image == null ? 0 : image.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MnzUniversalImage(image=");
        sb2.append(this.f441575a);
        sb2.append(", imageDark=");
        return AK.c.o(sb2, this.f441576b, ')');
    }
}
