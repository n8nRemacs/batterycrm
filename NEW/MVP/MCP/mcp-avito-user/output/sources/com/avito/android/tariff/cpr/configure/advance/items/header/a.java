package com.avito.android.tariff.cpr.configure.advance.items.header;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CprConfigureAdvanceHeaderItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpr/configure/advance/items/header/a;", "Lcom/avito/conveyor_item/a;", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f295260b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f295261c;

    public a(@k String str, @l AttributedText attributedText) {
        this.f295260b = str;
        this.f295261c = attributedText;
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
        return L.f(this.f295260b, aVar.f295260b) && L.f(this.f295261c, aVar.f295261c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF75840b() {
        return 1183834501;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF270078b() {
        return "header_item";
    }

    public final int hashCode() {
        int iD2 = H.d(-1955836133, 31, this.f295260b);
        AttributedText attributedText = this.f295261c;
        return iD2 + (attributedText == null ? 0 : attributedText.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CprConfigureAdvanceHeaderItem(stringId=header_item, title=");
        sb2.append(this.f295260b);
        sb2.append(", description=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f295261c, ')');
    }
}
