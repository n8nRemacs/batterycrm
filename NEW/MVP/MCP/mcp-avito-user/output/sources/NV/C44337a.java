package nV;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.avito_map.AvitoMapPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UserLocationState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LnV/a;", "LnV/c;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nV.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* data */ class C44337a implements InterfaceC44339c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AvitoMapPoint f415161a;

    /* renamed from: b, reason: collision with root package name */
    public final float f415162b;

    public C44337a(AvitoMapPoint avitoMapPoint, float f12, int i12, C42822w c42822w) {
        f12 = (i12 & 2) != 0 ? 0.0f : f12;
        this.f415161a = avitoMapPoint;
        this.f415162b = f12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44337a)) {
            return false;
        }
        C44337a c44337a = (C44337a) obj;
        return L.f(this.f415161a, c44337a.f415161a) && Float.compare(this.f415162b, c44337a.f415162b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f415162b) + (this.f415161a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CircleLocation(point=");
        sb2.append(this.f415161a);
        sb2.append(", zIndex=");
        return r.k(')', this.f415162b, sb2);
    }
}
