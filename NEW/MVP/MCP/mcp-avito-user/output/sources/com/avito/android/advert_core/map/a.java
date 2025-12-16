package com.avito.android.advert_core.map;

import androidx.appcompat.app.r;
import com.avito.android.avito_map.AvitoMapPoint;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertMapData.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/map/a;", "", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AvitoMapPoint f83742a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ArrayList f83743b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f83744c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f83745d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f83746e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f83747f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f83748g;

    public a(@Y61.k AvitoMapPoint avitoMapPoint, @Y61.k ArrayList arrayList, @Y61.l String str, @Y61.l String str2, @Y61.l String str3, boolean z12, boolean z13) {
        this.f83742a = avitoMapPoint;
        this.f83743b = arrayList;
        this.f83744c = str;
        this.f83745d = str2;
        this.f83746e = str3;
        this.f83747f = z12;
        this.f83748g = z13;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f83742a.equals(aVar.f83742a) && this.f83743b.equals(aVar.f83743b) && L.f(this.f83744c, aVar.f83744c) && L.f(this.f83745d, aVar.f83745d) && L.f(this.f83746e, aVar.f83746e) && this.f83747f == aVar.f83747f && this.f83748g == aVar.f83748g;
    }

    public final int hashCode() {
        int iG2 = androidx.compose.ui.graphics.colorspace.e.g(this.f83743b, this.f83742a.hashCode() * 31, 31);
        String str = this.f83744c;
        int iHashCode = (iG2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f83745d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f83746e;
        return Boolean.hashCode(this.f83748g) + r.i((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.f83747f);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertMapData(coords=");
        sb2.append(this.f83742a);
        sb2.append(", pins=");
        sb2.append(this.f83743b);
        sb2.append(", header=");
        sb2.append(this.f83744c);
        sb2.append(", objects=");
        sb2.append(this.f83745d);
        sb2.append(", distance=");
        sb2.append(this.f83746e);
        sb2.append(", isRestyle=");
        sb2.append(this.f83747f);
        sb2.append(", isGigRestyle=");
        return r.x(sb2, this.f83748g, ')');
    }
}
