package com.avito.android.tariff_cpt.configure.levels.ui.items.level_cards;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffCptConfigureLevelsCardsItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/levels/ui/items/level_cards/d;", "Lcom/avito/conveyor_item/a;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class d implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f297949b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<com.avito.android.tariff_cpt.configure.levels.ui.items.level_cards.level_card.c> f297950c;

    public d(@Y61.k String str, @Y61.k List<com.avito.android.tariff_cpt.configure.levels.ui.items.level_cards.level_card.c> list) {
        this.f297949b = str;
        this.f297950c = list;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f297949b, dVar.f297949b) && L.f(this.f297950c, dVar.f297950c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF269870b() {
        return getF297949b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF297949b() {
        return this.f297949b;
    }

    public final int hashCode() {
        return this.f297950c.hashCode() + (this.f297949b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TariffCptConfigureLevelsCardsItem(stringId=");
        sb2.append(this.f297949b);
        sb2.append(", list=");
        return H.p(sb2, this.f297950c, ')');
    }
}
