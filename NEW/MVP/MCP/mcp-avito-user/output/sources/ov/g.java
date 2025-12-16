package Ov;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: LocationSetting.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOv/g;", "", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d f12684a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l f12685b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Long f12686c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Long f12687d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Long f12688e;

    public g(@Y61.k d dVar, @Y61.k l lVar, @Y61.l Long l12, @Y61.l Long l13, @Y61.l Long l14) {
        this.f12684a = dVar;
        this.f12685b = lVar;
        this.f12686c = l12;
        this.f12687d = l13;
        this.f12688e = l14;
    }

    public static g a(g gVar, l lVar, Long l12, Long l13, Long l14, int i12) {
        if ((i12 & 2) != 0) {
            lVar = gVar.f12685b;
        }
        l lVar2 = lVar;
        if ((i12 & 4) != 0) {
            l12 = gVar.f12686c;
        }
        Long l15 = l12;
        if ((i12 & 8) != 0) {
            l13 = gVar.f12687d;
        }
        Long l16 = l13;
        if ((i12 & 16) != 0) {
            l14 = gVar.f12688e;
        }
        return new g(gVar.f12684a, lVar2, l15, l16, l14);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.f12684a, gVar.f12684a) && L.f(this.f12685b, gVar.f12685b) && L.f(this.f12686c, gVar.f12686c) && L.f(this.f12687d, gVar.f12687d) && L.f(this.f12688e, gVar.f12688e);
    }

    public final int hashCode() {
        int iHashCode = (this.f12685b.hashCode() + (this.f12684a.hashCode() * 31)) * 31;
        Long l12 = this.f12686c;
        int iHashCode2 = (iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.f12687d;
        int iHashCode3 = (iHashCode2 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Long l14 = this.f12688e;
        return iHashCode3 + (l14 != null ? l14.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LocationSetting(location=");
        sb2.append(this.f12684a);
        sb2.append(", tariffId=");
        sb2.append(this.f12685b);
        sb2.append(", price=");
        sb2.append(this.f12686c);
        sb2.append(", minDays=");
        sb2.append(this.f12687d);
        sb2.append(", maxDays=");
        return androidx.media3.exoplayer.analytics.m.m(sb2, this.f12688e, ')');
    }

    public /* synthetic */ g(d dVar, l lVar, Long l12, Long l13, Long l14, int i12, C42822w c42822w) {
        this(dVar, lVar, (i12 & 4) != 0 ? null : l12, (i12 & 8) != 0 ? null : l13, (i12 & 16) != 0 ? null : l14);
    }
}
