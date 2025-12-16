package com.avito.android.tariff_cpt.levels.ui.items.business_tools_header;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.a;
import kotlin.Metadata;

/* compiled from: TariffCptLevelsBusinessToolHeaderItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/levels/ui/items/business_tools_header/a;", "LHC0/a;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements HC0.a {

    /* renamed from: b, reason: collision with root package name */
    public final int f298692b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f298693c;

    public a(int i12, @k AttributedText attributedText) {
        this.f298692b = i12;
        this.f298693c = attributedText;
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
        return this.f298692b == aVar.f298692b && this.f298693c.equals(aVar.f298693c);
    }

    @Override // HC0.a
    /* renamed from: g, reason: from getter */
    public final int getF298692b() {
        return this.f298692b;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF284485b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF293163e() {
        return "key_tariff_cpt_levels_business_tool_header_item";
    }

    public final int hashCode() {
        return this.f298693c.hashCode() + r.e(this.f298692b, -1931284768, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TariffCptLevelsBusinessToolHeaderItem(stringId=key_tariff_cpt_levels_business_tool_header_item, levelId=");
        sb2.append(this.f298692b);
        sb2.append(", title=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f298693c, ')');
    }
}
