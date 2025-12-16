package vW;

import com.avito.android.avito_map.AvitoMapBounds;
import com.avito.android.remote.model.Radius;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ChangeRadiusUpdate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvW/f;", "", "_avito_location-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final List<Radius> f440802a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final AvitoMapBounds f440803b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Long f440804c;

    public f(@Y61.k List<Radius> list, @Y61.l AvitoMapBounds avitoMapBounds, @Y61.l Long l12) {
        this.f440802a = list;
        this.f440803b = avitoMapBounds;
        this.f440804c = l12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.f440802a, fVar.f440802a) && L.f(this.f440803b, fVar.f440803b) && L.f(this.f440804c, fVar.f440804c);
    }

    public final int hashCode() {
        int iHashCode = this.f440802a.hashCode() * 31;
        AvitoMapBounds avitoMapBounds = this.f440803b;
        int iHashCode2 = (iHashCode + (avitoMapBounds == null ? 0 : avitoMapBounds.hashCode())) * 31;
        Long l12 = this.f440804c;
        return iHashCode2 + (l12 != null ? l12.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChangeRadiusUpdate(radiusList=");
        sb2.append(this.f440802a);
        sb2.append(", mapBounds=");
        sb2.append(this.f440803b);
        sb2.append(", distanceInMeters=");
        return androidx.media3.exoplayer.analytics.m.m(sb2, this.f440804c, ')');
    }
}
