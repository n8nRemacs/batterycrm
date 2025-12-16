package com.avito.android.developments_agency_search.screen.deal_room.adapter.development;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalColor;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DevelopmentItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/adapter/development/c;", "Lcom/avito/conveyor_item/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f137323b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f137324c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Image f137325d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f137326e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final UniversalColor f137327f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f137328g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final UniversalColor f137329h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final String f137330i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final UniversalColor f137331j;

    public c(@k String str, @k String str2, @l Image image, @k String str3, @k UniversalColor universalColor, @k String str4, @k UniversalColor universalColor2, @k String str5, @k UniversalColor universalColor3) {
        this.f137323b = str;
        this.f137324c = str2;
        this.f137325d = image;
        this.f137326e = str3;
        this.f137327f = universalColor;
        this.f137328g = str4;
        this.f137329h = universalColor2;
        this.f137330i = str5;
        this.f137331j = universalColor3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f137323b, cVar.f137323b) && L.f(this.f137324c, cVar.f137324c) && L.f(this.f137325d, cVar.f137325d) && L.f(this.f137326e, cVar.f137326e) && L.f(this.f137327f, cVar.f137327f) && L.f(this.f137328g, cVar.f137328g) && L.f(this.f137329h, cVar.f137329h) && L.f(this.f137330i, cVar.f137330i) && L.f(this.f137331j, cVar.f137331j);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF189215e() {
        return getF288414b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF137343b() {
        return this.f137323b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f137323b.hashCode() * 31, 31, this.f137324c);
        Image image = this.f137325d;
        return this.f137331j.hashCode() + H.d(com.avito.android.actions_sheet.a.i(this.f137329h, H.d(com.avito.android.actions_sheet.a.i(this.f137327f, H.d((iD2 + (image == null ? 0 : image.hashCode())) * 31, 31, this.f137326e), 31), 31, this.f137328g), 31), 31, this.f137330i);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DevelopmentItem(stringId=");
        sb2.append(this.f137323b);
        sb2.append(", developmentId=");
        sb2.append(this.f137324c);
        sb2.append(", image=");
        sb2.append(this.f137325d);
        sb2.append(", title=");
        sb2.append(this.f137326e);
        sb2.append(", titleColor=");
        sb2.append(this.f137327f);
        sb2.append(", subtitle=");
        sb2.append(this.f137328g);
        sb2.append(", subtitleColor=");
        sb2.append(this.f137329h);
        sb2.append(", text=");
        sb2.append(this.f137330i);
        sb2.append(", textColor=");
        return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.f137331j, ')');
    }
}
