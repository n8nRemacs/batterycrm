package com.avito.android.developments_agency_search.screen.deal_room_development.adapter.lot;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LotItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room_development/adapter/lot/a;", "Lcom/avito/conveyor_item/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f137846b;

    /* renamed from: c, reason: collision with root package name */
    public final long f137847c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f137848d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Image f137849e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f137850f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f137851g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f137852h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final String f137853i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f137854j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f137855k;

    public a(@k String str, long j12, boolean z12, @l Image image, @k String str2, @l String str3, @l String str4, @k String str5, boolean z13, boolean z14) {
        this.f137846b = str;
        this.f137847c = j12;
        this.f137848d = z12;
        this.f137849e = image;
        this.f137850f = str2;
        this.f137851g = str3;
        this.f137852h = str4;
        this.f137853i = str5;
        this.f137854j = z13;
        this.f137855k = z14;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f137846b, aVar.f137846b) && this.f137847c == aVar.f137847c && this.f137848d == aVar.f137848d && L.f(this.f137849e, aVar.f137849e) && L.f(this.f137850f, aVar.f137850f) && L.f(this.f137851g, aVar.f137851g) && L.f(this.f137852h, aVar.f137852h) && L.f(this.f137853i, aVar.f137853i) && this.f137854j == aVar.f137854j && this.f137855k == aVar.f137855k;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF189215e() {
        return getF135128b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF135128b() {
        return this.f137846b;
    }

    public final int hashCode() {
        int i12 = r.i(r.g(this.f137846b.hashCode() * 31, 31, this.f137847c), 31, this.f137848d);
        Image image = this.f137849e;
        int iD2 = H.d((i12 + (image == null ? 0 : image.hashCode())) * 31, 31, this.f137850f);
        String str = this.f137851g;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f137852h;
        return Boolean.hashCode(this.f137855k) + r.i(H.d((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f137853i), 31, this.f137854j);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LotItem(stringId=");
        sb2.append(this.f137846b);
        sb2.append(", lotId=");
        sb2.append(this.f137847c);
        sb2.append(", isTranslucent=");
        sb2.append(this.f137848d);
        sb2.append(", image=");
        sb2.append(this.f137849e);
        sb2.append(", price=");
        sb2.append(this.f137850f);
        sb2.append(", priceTooltip=");
        sb2.append(this.f137851g);
        sb2.append(", award=");
        sb2.append(this.f137852h);
        sb2.append(", additionalInfo=");
        sb2.append(this.f137853i);
        sb2.append(", showBookButton=");
        sb2.append(this.f137854j);
        sb2.append(", showLotIsNotAvailableText=");
        return r.x(sb2, this.f137855k, ')');
    }
}
