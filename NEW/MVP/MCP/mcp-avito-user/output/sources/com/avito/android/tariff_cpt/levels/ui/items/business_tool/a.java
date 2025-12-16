package com.avito.android.tariff_cpt.levels.ui.items.business_tool;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffCptLevelsBusinessToolItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/levels/ui/items/business_tool/a;", "LHC0/a;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements HC0.a {

    /* renamed from: b, reason: collision with root package name */
    public final int f298668b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f298669c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final iC0.f f298670d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final iC0.f f298671e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final DeepLink f298672f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f298673g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final AttributedText f298674h;

    public a(int i12, @k String str, @k iC0.f fVar, @l iC0.f fVar2, @l DeepLink deepLink, boolean z12, @l AttributedText attributedText) {
        this.f298668b = i12;
        this.f298669c = str;
        this.f298670d = fVar;
        this.f298671e = fVar2;
        this.f298672f = deepLink;
        this.f298673g = z12;
        this.f298674h = attributedText;
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
        return this.f298668b == aVar.f298668b && L.f(this.f298669c, aVar.f298669c) && this.f298670d.equals(aVar.f298670d) && L.f(this.f298671e, aVar.f298671e) && L.f(this.f298672f, aVar.f298672f) && this.f298673g == aVar.f298673g && L.f(this.f298674h, aVar.f298674h);
    }

    @Override // HC0.a
    /* renamed from: g, reason: from getter */
    public final int getF298668b() {
        return this.f298668b;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF270893b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF298960b() {
        return "key_tariff_cpt_levels_business_tool_item";
    }

    public final int hashCode() {
        int iHashCode = (this.f298670d.hashCode() + H.d(r.e(this.f298668b, -1696380120, 31), 31, this.f298669c)) * 31;
        iC0.f fVar = this.f298671e;
        int iHashCode2 = (iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        DeepLink deepLink = this.f298672f;
        int i12 = r.i((iHashCode2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31, 31, this.f298673g);
        AttributedText attributedText = this.f298674h;
        return i12 + (attributedText != null ? attributedText.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TariffCptLevelsBusinessToolItem(stringId=key_tariff_cpt_levels_business_tool_item, levelId=");
        sb2.append(this.f298668b);
        sb2.append(", title=");
        sb2.append(this.f298669c);
        sb2.append(", icon=");
        sb2.append(this.f298670d);
        sb2.append(", iconDisabled=");
        sb2.append(this.f298671e);
        sb2.append(", deeplink=");
        sb2.append(this.f298672f);
        sb2.append(", isEnabled=");
        sb2.append(this.f298673g);
        sb2.append(", description=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f298674h, ')');
    }
}
