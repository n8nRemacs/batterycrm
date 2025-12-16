package qG0;

import Y61.k;
import Y61.l;
import com.avito.android.avito_map.AvitoMapBounds;
import com.avito.android.avito_map.AvitoMapCameraPosition;
import com.avito.android.avito_map.AvitoMapPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import org.webrtc.h;

/* compiled from: UniversalMapEvents.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LqG0/a;", "", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qG0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C47290a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AvitoMapCameraPosition f429134a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AvitoMapBounds f429135b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AvitoMapPoint f429136c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AvitoMapPoint f429137d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Float f429138e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Float f429139f;

    public C47290a(@k AvitoMapCameraPosition avitoMapCameraPosition, @k AvitoMapBounds avitoMapBounds, @k AvitoMapPoint avitoMapPoint, @k AvitoMapPoint avitoMapPoint2, @l Float f12, @l Float f13) {
        this.f429134a = avitoMapCameraPosition;
        this.f429135b = avitoMapBounds;
        this.f429136c = avitoMapPoint;
        this.f429137d = avitoMapPoint2;
        this.f429138e = f12;
        this.f429139f = f13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47290a)) {
            return false;
        }
        C47290a c47290a = (C47290a) obj;
        return L.f(this.f429134a, c47290a.f429134a) && L.f(this.f429135b, c47290a.f429135b) && L.f(this.f429136c, c47290a.f429136c) && L.f(this.f429137d, c47290a.f429137d) && L.f(this.f429138e, c47290a.f429138e) && L.f(this.f429139f, c47290a.f429139f);
    }

    public final int hashCode() {
        int iHashCode = (this.f429137d.hashCode() + ((this.f429136c.hashCode() + ((this.f429135b.hashCode() + (this.f429134a.hashCode() * 31)) * 31)) * 31)) * 31;
        Float f12 = this.f429138e;
        int iHashCode2 = (iHashCode + (f12 == null ? 0 : f12.hashCode())) * 31;
        Float f13 = this.f429139f;
        return iHashCode2 + (f13 != null ? f13.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CameraCoordinatesEvent(cameraPosition=");
        sb2.append(this.f429134a);
        sb2.append(", projection=");
        sb2.append(this.f429135b);
        sb2.append(", topLeft=");
        sb2.append(this.f429136c);
        sb2.append(", bottomRight=");
        sb2.append(this.f429137d);
        sb2.append(", radius=");
        sb2.append(this.f429138e);
        sb2.append(", clusterRadius=");
        return h.d(sb2, this.f429139f, ')');
    }

    public /* synthetic */ C47290a(AvitoMapCameraPosition avitoMapCameraPosition, AvitoMapBounds avitoMapBounds, AvitoMapPoint avitoMapPoint, AvitoMapPoint avitoMapPoint2, Float f12, Float f13, int i12, C42822w c42822w) {
        this(avitoMapCameraPosition, avitoMapBounds, avitoMapPoint, avitoMapPoint2, (i12 & 16) != 0 ? null : f12, (i12 & 32) != 0 ? null : f13);
    }
}
