package com.avito.android.advertising.adapter.items.buzzoola.video;

import androidx.appcompat.app.r;
import com.avito.android.advertising.loaders.BannerInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CommercialVideoPerfInteractorImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/adapter/items/buzzoola/video/a;", "", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final BannerInfo f87525a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Long f87526b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public Long f87527c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Long f87528d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public Long f87529e;

    /* renamed from: f, reason: collision with root package name */
    public int f87530f;

    /* renamed from: g, reason: collision with root package name */
    public int f87531g;

    public a(BannerInfo bannerInfo, Long l12, Long l13, Long l14, Long l15, int i12, int i13, int i14, C42822w c42822w) {
        l12 = (i14 & 2) != 0 ? null : l12;
        l13 = (i14 & 4) != 0 ? null : l13;
        l14 = (i14 & 8) != 0 ? null : l14;
        l15 = (i14 & 16) != 0 ? null : l15;
        i12 = (i14 & 32) != 0 ? 0 : i12;
        i13 = (i14 & 64) != 0 ? 0 : i13;
        this.f87525a = bannerInfo;
        this.f87526b = l12;
        this.f87527c = l13;
        this.f87528d = l14;
        this.f87529e = l15;
        this.f87530f = i12;
        this.f87531g = i13;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f87525a, aVar.f87525a) && L.f(this.f87526b, aVar.f87526b) && L.f(this.f87527c, aVar.f87527c) && L.f(this.f87528d, aVar.f87528d) && L.f(this.f87529e, aVar.f87529e) && this.f87530f == aVar.f87530f && this.f87531g == aVar.f87531g;
    }

    public final int hashCode() {
        int iHashCode = this.f87525a.hashCode() * 31;
        Long l12 = this.f87526b;
        int iHashCode2 = (iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.f87527c;
        int iHashCode3 = (iHashCode2 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Long l14 = this.f87528d;
        int iHashCode4 = (iHashCode3 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.f87529e;
        return Integer.hashCode(this.f87531g) + r.e(this.f87530f, (iHashCode4 + (l15 != null ? l15.hashCode() : 0)) * 31, 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CommercialPlayerPerfMetrics(bannerInfo=");
        sb2.append(this.f87525a);
        sb2.append(", playerStartPrepareTime=");
        sb2.append(this.f87526b);
        sb2.append(", playerRenderFirstFrameTime=");
        sb2.append(this.f87527c);
        sb2.append(", playerBufferingStart=");
        sb2.append(this.f87528d);
        sb2.append(", playerReadyTime=");
        sb2.append(this.f87529e);
        sb2.append(", skippedFramesCount=");
        sb2.append(this.f87530f);
        sb2.append(", playerStallsCount=");
        return r.t(sb2, this.f87531g, ')');
    }
}
