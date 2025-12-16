package com.avito.android.str_seller_orders_important_to_note.ui;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ItemBooking.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders_important_to_note/ui/i;", "Lcom/avito/conveyor_item/a;", "_avito_str-seller-orders-important-to-note_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class i implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Boolean f291436b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final ArrayList f291437c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final com.avito.android.str_seller_orders_important_to_note.domain.f f291438d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final DeepLink f291439e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final com.avito.android.str_seller_orders_important_to_note.domain.g f291440f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Boolean f291441g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f291442h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final AttributedText f291443i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final AttributedText f291444j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final String f291445k;

    public i(@l Boolean bool, @l ArrayList arrayList, @l com.avito.android.str_seller_orders_important_to_note.domain.f fVar, @l DeepLink deepLink, @l com.avito.android.str_seller_orders_important_to_note.domain.g gVar, @l Boolean bool2, @k String str, @l AttributedText attributedText, @k AttributedText attributedText2) {
        this.f291436b = bool;
        this.f291437c = arrayList;
        this.f291438d = fVar;
        this.f291439e = deepLink;
        this.f291440f = gVar;
        this.f291441g = bool2;
        this.f291442h = str;
        this.f291443i = attributedText;
        this.f291444j = attributedText2;
        this.f291445k = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return L.f(this.f291436b, iVar.f291436b) && L.f(this.f291437c, iVar.f291437c) && L.f(this.f291438d, iVar.f291438d) && L.f(this.f291439e, iVar.f291439e) && L.f(this.f291440f, iVar.f291440f) && L.f(this.f291441g, iVar.f291441g) && L.f(this.f291442h, iVar.f291442h) && L.f(this.f291443i, iVar.f291443i) && L.f(this.f291444j, iVar.f291444j);
    }

    @Override // TV0.a
    public final long getId() {
        return getF202303b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF202303b() {
        return this.f291445k;
    }

    public final int hashCode() {
        Boolean bool = this.f291436b;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        ArrayList arrayList = this.f291437c;
        int iHashCode2 = (iHashCode + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        com.avito.android.str_seller_orders_important_to_note.domain.f fVar = this.f291438d;
        int iHashCode3 = (iHashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        DeepLink deepLink = this.f291439e;
        int iHashCode4 = (iHashCode3 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        com.avito.android.str_seller_orders_important_to_note.domain.g gVar = this.f291440f;
        int iHashCode5 = (iHashCode4 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        Boolean bool2 = this.f291441g;
        int iD2 = H.d((iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31, 31, this.f291442h);
        AttributedText attributedText = this.f291443i;
        return this.f291444j.hashCode() + ((iD2 + (attributedText != null ? attributedText.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ItemBookingInfo(active=");
        sb2.append(this.f291436b);
        sb2.append(", buttons=");
        sb2.append(this.f291437c);
        sb2.append(", buyerInfo=");
        sb2.append(this.f291438d);
        sb2.append(", deepLink=");
        sb2.append(this.f291439e);
        sb2.append(", estateInfo=");
        sb2.append(this.f291440f);
        sb2.append(", hasAction=");
        sb2.append(this.f291441g);
        sb2.append(", bookingId=");
        sb2.append(this.f291442h);
        sb2.append(", subtitle=");
        sb2.append(this.f291443i);
        sb2.append(", title=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f291444j, ')');
    }
}
