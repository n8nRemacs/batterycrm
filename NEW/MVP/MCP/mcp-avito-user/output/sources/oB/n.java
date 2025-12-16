package oB;

import com.avito.android.remote.model.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileWidgetAction.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoB/n;", "LoB/k;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class n implements k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<Image> f419520b;

    /* renamed from: c, reason: collision with root package name */
    public final int f419521c;

    public n(@Y61.k List<Image> list, int i12) {
        this.f419520b = list;
        this.f419521c = i12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return L.f(this.f419520b, nVar.f419520b) && this.f419521c == nVar.f419521c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f419521c) + (this.f419520b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GalleryImageClickAction(images=");
        sb2.append(this.f419520b);
        sb2.append(", index=");
        return androidx.appcompat.app.r.t(sb2, this.f419521c, ')');
    }
}
