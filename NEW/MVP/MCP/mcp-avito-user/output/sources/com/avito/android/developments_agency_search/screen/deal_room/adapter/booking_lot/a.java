package com.avito.android.developments_agency_search.screen.deal_room.adapter.booking_lot;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.developments_agency_search.domain.Metro;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BookingLotItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/adapter/booking_lot/a;", "Lcom/avito/conveyor_item/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f137272b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f137273c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f137274d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f137275e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Metro f137276f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f137277g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f137278h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final String f137279i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final CharSequence f137280j;

    /* renamed from: k, reason: collision with root package name */
    public final float f137281k;

    public a(@k String str, @k String str2, @l String str3, @k String str4, @l Metro metro, @k String str5, @k String str6, @k String str7, @l CharSequence charSequence, float f12) {
        this.f137272b = str;
        this.f137273c = str2;
        this.f137274d = str3;
        this.f137275e = str4;
        this.f137276f = metro;
        this.f137277g = str5;
        this.f137278h = str6;
        this.f137279i = str7;
        this.f137280j = charSequence;
        this.f137281k = f12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f137272b, aVar.f137272b) && L.f(this.f137273c, aVar.f137273c) && L.f(this.f137274d, aVar.f137274d) && L.f(this.f137275e, aVar.f137275e) && L.f(this.f137276f, aVar.f137276f) && L.f(this.f137277g, aVar.f137277g) && L.f(this.f137278h, aVar.f137278h) && L.f(this.f137279i, aVar.f137279i) && L.f(this.f137280j, aVar.f137280j) && Float.compare(this.f137281k, aVar.f137281k) == 0;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF189215e() {
        return getF440966b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF440966b() {
        return this.f137272b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f137272b.hashCode() * 31, 31, this.f137273c);
        String str = this.f137274d;
        int iD3 = H.d((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f137275e);
        Metro metro = this.f137276f;
        int iD4 = H.d(H.d(H.d((iD3 + (metro == null ? 0 : metro.hashCode())) * 31, 31, this.f137277g), 31, this.f137278h), 31, this.f137279i);
        CharSequence charSequence = this.f137280j;
        return Float.hashCode(this.f137281k) + ((iD4 + (charSequence != null ? charSequence.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BookingLotItem(stringId=");
        sb2.append(this.f137272b);
        sb2.append(", price=");
        sb2.append(this.f137273c);
        sb2.append(", priceTooltip=");
        sb2.append(this.f137274d);
        sb2.append(", mainInfo=");
        sb2.append(this.f137275e);
        sb2.append(", metro=");
        sb2.append(this.f137276f);
        sb2.append(", address=");
        sb2.append(this.f137277g);
        sb2.append(", developer=");
        sb2.append(this.f137278h);
        sb2.append(", development=");
        sb2.append(this.f137279i);
        sb2.append(", reward=");
        sb2.append((Object) this.f137280j);
        sb2.append(", opacity=");
        return r.k(')', this.f137281k, sb2);
    }

    public /* synthetic */ a(String str, String str2, String str3, String str4, Metro metro, String str5, String str6, String str7, CharSequence charSequence, float f12, int i12, C42822w c42822w) {
        this(str, str2, str3, str4, metro, str5, str6, str7, charSequence, (i12 & 512) != 0 ? 1.0f : f12);
    }
}
