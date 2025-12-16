package com.avito.android.advertising.loaders.beduin;

import com.avito.android.advertising.analytics.events.BannerPageSource;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CommercialContext.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/loaders/beduin/G;", "", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class G {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.loaders.n f88074a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final H f88075b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.loaders.event_service.c f88076c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final BannerPageSource f88077d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f88078e;

    public G(@Y61.k com.avito.android.advertising.loaders.n nVar, @Y61.k H h12, @Y61.k com.avito.android.advertising.loaders.event_service.c cVar, @Y61.k BannerPageSource bannerPageSource, boolean z12) {
        this.f88074a = nVar;
        this.f88075b = h12;
        this.f88076c = cVar;
        this.f88077d = bannerPageSource;
        this.f88078e = z12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g12 = (G) obj;
        return kotlin.jvm.internal.L.f(this.f88074a, g12.f88074a) && kotlin.jvm.internal.L.f(this.f88075b, g12.f88075b) && kotlin.jvm.internal.L.f(this.f88076c, g12.f88076c) && this.f88077d == g12.f88077d && this.f88078e == g12.f88078e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f88078e) + ((this.f88077d.hashCode() + ((this.f88076c.hashCode() + ((this.f88075b.hashCode() + (this.f88074a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CommercialContext(commercialBannerInteractor=");
        sb2.append(this.f88074a);
        sb2.append(", commercialLoadedAdHolder=");
        sb2.append(this.f88075b);
        sb2.append(", commercialPixelService=");
        sb2.append(this.f88076c);
        sb2.append(", source=");
        sb2.append(this.f88077d);
        sb2.append(", useV2BannerFormatInSearch=");
        return androidx.appcompat.app.r.x(sb2, this.f88078e, ')');
    }

    public /* synthetic */ G(com.avito.android.advertising.loaders.n nVar, H h12, com.avito.android.advertising.loaders.event_service.c cVar, BannerPageSource bannerPageSource, boolean z12, int i12, C42822w c42822w) {
        this(nVar, h12, cVar, bannerPageSource, (i12 & 16) != 0 ? false : z12);
    }
}
