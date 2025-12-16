package com.avito.android.tariff_cpt.configure.levels.ui.items.header;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffCptConfigureLevelsHeaderItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/levels/ui/items/header/a;", "Lcom/avito/conveyor_item/a;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AttributedText f297930b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f297931c;

    public a(@k AttributedText attributedText, @l AttributedText attributedText2) {
        this.f297930b = attributedText;
        this.f297931c = attributedText2;
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
        return L.f(this.f297930b, aVar.f297930b) && L.f(this.f297931c, aVar.f297931c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF284485b() {
        return 1183834501;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF293163e() {
        return "header_item";
    }

    public final int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b(-1955836133, 31, this.f297930b);
        AttributedText attributedText = this.f297931c;
        return iB2 + (attributedText == null ? 0 : attributedText.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TariffCptConfigureLevelsHeaderItem(stringId=header_item, title=");
        sb2.append(this.f297930b);
        sb2.append(", description=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f297931c, ')');
    }
}
