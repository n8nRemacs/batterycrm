package J80;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PlayerPerfMetrics.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJ80/f;", "", "_avito_player-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class f {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f8797a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Long f8798b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public Long f8799c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public Long f8800d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public Long f8801e;

    /* renamed from: f, reason: collision with root package name */
    public int f8802f;

    /* renamed from: g, reason: collision with root package name */
    public int f8803g;

    public f() {
        this(null, null, null, null, null, 0, 0, 127, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.f8797a, fVar.f8797a) && L.f(this.f8798b, fVar.f8798b) && L.f(this.f8799c, fVar.f8799c) && L.f(this.f8800d, fVar.f8800d) && L.f(this.f8801e, fVar.f8801e) && this.f8802f == fVar.f8802f && this.f8803g == fVar.f8803g;
    }

    public final int hashCode() {
        String str = this.f8797a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l12 = this.f8798b;
        int iHashCode2 = (iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.f8799c;
        int iHashCode3 = (iHashCode2 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Long l14 = this.f8800d;
        int iHashCode4 = (iHashCode3 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.f8801e;
        return Integer.hashCode(this.f8803g) + r.e(this.f8802f, (iHashCode4 + (l15 != null ? l15.hashCode() : 0)) * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlayerPerfMetrics(videoUrl=");
        sb2.append(this.f8797a);
        sb2.append(", playerStartPrepareTime=");
        sb2.append(this.f8798b);
        sb2.append(", playerRenderFirstFrameTime=");
        sb2.append(this.f8799c);
        sb2.append(", playerBufferingStart=");
        sb2.append(this.f8800d);
        sb2.append(", playerReadyTime=");
        sb2.append(this.f8801e);
        sb2.append(", skippedFramesCount=");
        sb2.append(this.f8802f);
        sb2.append(", playerStallsCount=");
        return r.t(sb2, this.f8803g, ')');
    }

    public f(String str, Long l12, Long l13, Long l14, Long l15, int i12, int i13, int i14, C42822w c42822w) {
        str = (i14 & 1) != 0 ? null : str;
        l12 = (i14 & 2) != 0 ? null : l12;
        l13 = (i14 & 4) != 0 ? null : l13;
        l14 = (i14 & 8) != 0 ? null : l14;
        l15 = (i14 & 16) != 0 ? null : l15;
        i12 = (i14 & 32) != 0 ? 0 : i12;
        i13 = (i14 & 64) != 0 ? 0 : i13;
        this.f8797a = str;
        this.f8798b = l12;
        this.f8799c = l13;
        this.f8800d = l14;
        this.f8801e = l15;
        this.f8802f = i12;
        this.f8803g = i13;
    }
}
