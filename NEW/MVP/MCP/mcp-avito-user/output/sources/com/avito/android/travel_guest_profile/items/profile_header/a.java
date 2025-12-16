package com.avito.android.travel_guest_profile.items.profile_header;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProfileHeaderItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_guest_profile/items/profile_header/a;", "Lcom/avito/conveyor_item/a;", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AttributedText f302079b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f302080c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AttributedText f302081d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final AttributedText f302082e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Image f302083f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final List<PE0.f> f302084g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final PE0.g f302085h;

    public a(@k AttributedText attributedText, @l AttributedText attributedText2, @k AttributedText attributedText3, @k AttributedText attributedText4, @k Image image, @k List list, @l PE0.g gVar) {
        this.f302079b = attributedText;
        this.f302080c = attributedText2;
        this.f302081d = attributedText3;
        this.f302082e = attributedText4;
        this.f302083f = image;
        this.f302084g = list;
        this.f302085h = gVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        return L.f(this.f302079b, aVar.f302079b) && L.f(this.f302080c, aVar.f302080c) && L.f(this.f302081d, aVar.f302081d) && L.f(this.f302082e, aVar.f302082e) && L.f(this.f302083f, aVar.f302083f) && L.f(this.f302084g, aVar.f302084g) && L.f(this.f302085h, aVar.f302085h);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF73058b() {
        return 1512122793;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF273262b() {
        return "ProfileHeaderItem";
    }

    public final int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b(-368833673, 31, this.f302079b);
        AttributedText attributedText = this.f302080c;
        int iE2 = H.e(com.avito.android.actions_sheet.a.g(this.f302083f, com.avito.android.actions_sheet.a.b(com.avito.android.actions_sheet.a.b((iB2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.f302081d), 31, this.f302082e), 31), 31, this.f302084g);
        PE0.g gVar = this.f302085h;
        return iE2 + (gVar != null ? gVar.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "ProfileHeaderItem(stringId=ProfileHeaderItem, userName=" + this.f302079b + ", rating=" + this.f302080c + ", personalInfo=" + this.f302081d + ", additionalInfo=" + this.f302082e + ", avatar=" + this.f302083f + ", badges=" + this.f302084g + ", blackListInfo=" + this.f302085h + ')';
    }
}
