package com.avito.android.tariff_cpt.info.ui.items.level_banner;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CptInfoLevelBannerItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/info/ui/items/level_banner/a;", "Lcom/avito/conveyor_item/a;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final iC0.e f298375b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f298376c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final iC0.f f298377d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final DeepLink f298378e;

    public a(@l iC0.e eVar, @k AttributedText attributedText, @k iC0.f fVar, @l DeepLink deepLink) {
        this.f298375b = eVar;
        this.f298376c = attributedText;
        this.f298377d = fVar;
        this.f298378e = deepLink;
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
        return L.f(this.f298375b, aVar.f298375b) && L.f(this.f298376c, aVar.f298376c) && this.f298377d.equals(aVar.f298377d) && L.f(this.f298378e, aVar.f298378e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF395939g() {
        return -770301024;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF293121b() {
        return "cpt_info_level_banner";
    }

    public final int hashCode() {
        iC0.e eVar = this.f298375b;
        int iHashCode = (this.f298377d.hashCode() + com.avito.android.actions_sheet.a.b((1890472032 + (eVar == null ? 0 : eVar.hashCode())) * 31, 31, this.f298376c)) * 31;
        DeepLink deepLink = this.f298378e;
        return iHashCode + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CptInfoLevelBannerItem(stringId=cpt_info_level_banner, color=");
        sb2.append(this.f298375b);
        sb2.append(", text=");
        sb2.append(this.f298376c);
        sb2.append(", image=");
        sb2.append(this.f298377d);
        sb2.append(", deeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f298378e, ')');
    }
}
