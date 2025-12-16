package com.avito.android.tariff.cpx.info.items.level_header;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffCpxInfoLevelHeaderItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/info/items/level_header/a;", "", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final wZ.k f296526a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AttributedText f296527b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final wZ.l f296528c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final DeepLink f296529d;

    public a(@Y61.l wZ.k kVar, @Y61.k AttributedText attributedText, @Y61.l wZ.l lVar, @Y61.l DeepLink deepLink) {
        this.f296526a = kVar;
        this.f296527b = attributedText;
        this.f296528c = lVar;
        this.f296529d = deepLink;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f296526a, aVar.f296526a) && L.f(this.f296527b, aVar.f296527b) && L.f(this.f296528c, aVar.f296528c) && L.f(this.f296529d, aVar.f296529d);
    }

    public final int hashCode() {
        wZ.k kVar = this.f296526a;
        int iB2 = com.avito.android.actions_sheet.a.b((kVar == null ? 0 : kVar.hashCode()) * 31, 31, this.f296527b);
        wZ.l lVar = this.f296528c;
        int iHashCode = (iB2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        DeepLink deepLink = this.f296529d;
        return iHashCode + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TariffCpxInfoLevelHeaderBanner(color=");
        sb2.append(this.f296526a);
        sb2.append(", text=");
        sb2.append(this.f296527b);
        sb2.append(", image=");
        sb2.append(this.f296528c);
        sb2.append(", deeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f296529d, ')');
    }
}
