package com.avito.android.user_advert.advert.items.service_booking;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.adverts.MyAdvertDetails;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SbStatusBlockItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/service_booking/a;", "Lcom/avito/conveyor_item/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f310119b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f310120c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AttributedText f310121d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final com.avito.android.user_advert.advert.items.safe_deal_services.a f310122e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final MyAdvertDetails.SbStatusBlock.Action f310123f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final MyAdvertDetails.SbStatusBlock.Event f310124g;

    public a(String str, String str2, AttributedText attributedText, com.avito.android.user_advert.advert.items.safe_deal_services.a aVar, MyAdvertDetails.SbStatusBlock.Action action, MyAdvertDetails.SbStatusBlock.Event event, int i12, C42822w c42822w) {
        aVar = (i12 & 8) != 0 ? null : aVar;
        this.f310119b = str;
        this.f310120c = str2;
        this.f310121d = attributedText;
        this.f310122e = aVar;
        this.f310123f = action;
        this.f310124g = event;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f310119b, aVar.f310119b) && L.f(this.f310120c, aVar.f310120c) && L.f(this.f310121d, aVar.f310121d) && L.f(this.f310122e, aVar.f310122e) && L.f(this.f310123f, aVar.f310123f) && L.f(this.f310124g, aVar.f310124g);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85764e() {
        return getF98561d().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF98561d() {
        return this.f310119b;
    }

    public final int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b(H.d(this.f310119b.hashCode() * 31, 31, this.f310120c), 31, this.f310121d);
        com.avito.android.user_advert.advert.items.safe_deal_services.a aVar = this.f310122e;
        int iHashCode = (iB2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        MyAdvertDetails.SbStatusBlock.Action action = this.f310123f;
        int iHashCode2 = (iHashCode + (action == null ? 0 : action.hashCode())) * 31;
        MyAdvertDetails.SbStatusBlock.Event event = this.f310124g;
        return iHashCode2 + (event != null ? event.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "SbStatusBlockItem(stringId=" + this.f310119b + ", title=" + this.f310120c + ", subtitle=" + this.f310121d + ", icon=" + this.f310122e + ", button=" + this.f310123f + ", event=" + this.f310124g + ')';
    }
}
