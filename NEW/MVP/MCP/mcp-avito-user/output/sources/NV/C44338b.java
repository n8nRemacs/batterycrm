package nV;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.avito_map.AvitoMapMarker;
import com.avito.android.avito_map.AvitoMapPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UserLocationState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LnV/b;", "LnV/c;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nV.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* data */ class C44338b implements InterfaceC44339c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AvitoMapPoint f415163a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AvitoMapMarker.Anchor f415164b;

    /* renamed from: c, reason: collision with root package name */
    public final float f415165c;

    public C44338b(AvitoMapPoint avitoMapPoint, AvitoMapMarker.Anchor anchor, float f12, int i12, C42822w c42822w) {
        anchor = (i12 & 2) != 0 ? AvitoMapMarker.Anchor.CENTER : anchor;
        f12 = (i12 & 4) != 0 ? 0.0f : f12;
        this.f415163a = avitoMapPoint;
        this.f415164b = anchor;
        this.f415165c = f12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44338b)) {
            return false;
        }
        C44338b c44338b = (C44338b) obj;
        return L.f(this.f415163a, c44338b.f415163a) && this.f415164b == c44338b.f415164b && Float.compare(this.f415165c, c44338b.f415165c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f415165c) + ((this.f415164b.hashCode() + (this.f415163a.hashCode() * 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PointLocation(point=");
        sb2.append(this.f415163a);
        sb2.append(", anchor=");
        sb2.append(this.f415164b);
        sb2.append(", zIndex=");
        return r.k(')', this.f415165c, sb2);
    }
}
