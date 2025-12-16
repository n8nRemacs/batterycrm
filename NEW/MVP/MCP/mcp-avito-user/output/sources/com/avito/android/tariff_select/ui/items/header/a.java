package com.avito.android.tariff_select.ui.items.header;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffSelectHeaderItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_select/ui/items/header/a;", "Lcom/avito/conveyor_item/a;", "_avito_tariff-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f301253b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f301254c;

    public a(@k String str, @l AttributedText attributedText) {
        this.f301253b = str;
        this.f301254c = attributedText;
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
        return L.f(this.f301253b, aVar.f301253b) && L.f(this.f301254c, aVar.f301254c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF284485b() {
        return 552260437;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF300628b() {
        return "tariff_select_header";
    }

    public final int hashCode() {
        int iD2 = H.d(-59795637, 31, this.f301253b);
        AttributedText attributedText = this.f301254c;
        return iD2 + (attributedText == null ? 0 : attributedText.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TariffSelectHeaderItem(stringId=tariff_select_header, title=");
        sb2.append(this.f301253b);
        sb2.append(", description=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f301254c, ')');
    }
}
