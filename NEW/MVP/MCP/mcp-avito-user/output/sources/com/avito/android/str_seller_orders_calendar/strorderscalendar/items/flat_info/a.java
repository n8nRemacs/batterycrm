package com.avito.android.str_seller_orders_calendar.strorderscalendar.items.flat_info;

import Tz0.C15431e;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FlatInfoItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/items/flat_info/a;", "Lcom/avito/conveyor_item/a;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f290919b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f290920c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f290921d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f290922e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final DeepLink f290923f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final C15431e f290924g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f290925h;

    public a(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.k String str4, @Y61.l DeepLink deepLink, @Y61.l C15431e c15431e, boolean z12) {
        this.f290919b = str;
        this.f290920c = str2;
        this.f290921d = str3;
        this.f290922e = str4;
        this.f290923f = deepLink;
        this.f290924g = c15431e;
        this.f290925h = z12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f290919b, aVar.f290919b) && L.f(this.f290920c, aVar.f290920c) && L.f(this.f290921d, aVar.f290921d) && L.f(this.f290922e, aVar.f290922e) && L.f(this.f290923f, aVar.f290923f) && L.f(this.f290924g, aVar.f290924g) && this.f290925h == aVar.f290925h;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF272342b() {
        return getF290919b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF290919b() {
        return this.f290919b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f290919b.hashCode() * 31, 31, this.f290920c);
        String str = this.f290921d;
        int iD3 = H.d((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f290922e);
        DeepLink deepLink = this.f290923f;
        int iHashCode = (iD3 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        C15431e c15431e = this.f290924g;
        return Boolean.hashCode(this.f290925h) + ((iHashCode + (c15431e != null ? c15431e.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FlatInfoItem(stringId=");
        sb2.append(this.f290919b);
        sb2.append(", itemId=");
        sb2.append(this.f290920c);
        sb2.append(", imageLink=");
        sb2.append(this.f290921d);
        sb2.append(", infoText=");
        sb2.append(this.f290922e);
        sb2.append(", deeplink=");
        sb2.append(this.f290923f);
        sb2.append(", iconWithTooltip=");
        sb2.append(this.f290924g);
        sb2.append(", shouldAutoShowTooltip=");
        return r.x(sb2, this.f290925h, ')');
    }
}
