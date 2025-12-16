package com.avito.android.comparison.items.header_item;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ComparisonHeaderItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comparison/items/header_item/b;", "LTV0/a;", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class b implements TV0.a {

    /* renamed from: b, reason: collision with root package name */
    public final long f123950b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f123951c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f123952d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f123953e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f123954f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Image f123955g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final DeepLink f123956h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final m f123957i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final n f123958j;

    public b(long j12, boolean z12, @Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k Image image, @Y61.l DeepLink deepLink, @Y61.k m mVar, @Y61.l n nVar) {
        this.f123950b = j12;
        this.f123951c = z12;
        this.f123952d = str;
        this.f123953e = str2;
        this.f123954f = str3;
        this.f123955g = image;
        this.f123956h = deepLink;
        this.f123957i = mVar;
        this.f123958j = nVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f123950b == bVar.f123950b && this.f123951c == bVar.f123951c && L.f(this.f123952d, bVar.f123952d) && L.f(this.f123953e, bVar.f123953e) && L.f(this.f123954f, bVar.f123954f) && L.f(this.f123955g, bVar.f123955g) && L.f(this.f123956h, bVar.f123956h) && L.f(this.f123957i, bVar.f123957i) && L.f(this.f123958j, bVar.f123958j);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF84833b() {
        return this.f123950b;
    }

    public final int hashCode() {
        int iG2 = com.avito.android.actions_sheet.a.g(this.f123955g, H.d(H.d(H.d(r.i(Long.hashCode(this.f123950b) * 31, 31, this.f123951c), 31, this.f123952d), 31, this.f123953e), 31, this.f123954f), 31);
        DeepLink deepLink = this.f123956h;
        int iHashCode = (this.f123957i.hashCode() + ((iG2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31)) * 31;
        n nVar = this.f123958j;
        return iHashCode + (nVar != null ? nVar.f123995a.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "ComparisonHeaderItem(id=" + this.f123950b + ", isActive=" + this.f123951c + ", comparisonId=" + this.f123952d + ", title=" + this.f123953e + ", price=" + this.f123954f + ", image=" + this.f123955g + ", itemLink=" + this.f123956h + ", button=" + this.f123957i + ", menuButton=" + this.f123958j + ')';
    }
}
