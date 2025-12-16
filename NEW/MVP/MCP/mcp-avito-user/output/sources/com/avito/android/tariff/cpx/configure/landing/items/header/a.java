package com.avito.android.tariff.cpx.configure.landing.items.header;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CpxConfigureLandingHeaderItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/landing/items/header/a;", "Lcom/avito/conveyor_item/a;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AttributedText f295987b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f295988c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final UniversalImage f295989d;

    public a(@k AttributedText attributedText, @l AttributedText attributedText2, @l UniversalImage universalImage) {
        this.f295987b = attributedText;
        this.f295988c = attributedText2;
        this.f295989d = universalImage;
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
        return L.f(this.f295987b, aVar.f295987b) && L.f(this.f295988c, aVar.f295988c) && L.f(this.f295989d, aVar.f295989d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF75092b() {
        return 1183834501;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF288411b() {
        return "header_item";
    }

    public final int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b(-1955836133, 31, this.f295987b);
        AttributedText attributedText = this.f295988c;
        int iHashCode = (iB2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        UniversalImage universalImage = this.f295989d;
        return iHashCode + (universalImage != null ? universalImage.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CpxConfigureLandingHeaderItem(stringId=header_item, title=");
        sb2.append(this.f295987b);
        sb2.append(", description=");
        sb2.append(this.f295988c);
        sb2.append(", image=");
        return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.f295989d, ')');
    }
}
