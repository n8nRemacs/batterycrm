package com.avito.android.tariff.cpx.configure.advance.items.header;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CpxConfigureAdvanceHeaderItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/advance/items/header/a;", "Lcom/avito/conveyor_item/a;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f295722b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f295723c;

    public a(@k String str, @l AttributedText attributedText) {
        this.f295722b = str;
        this.f295723c = attributedText;
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
        return L.f(this.f295722b, aVar.f295722b) && L.f(this.f295723c, aVar.f295723c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF273715b() {
        return -2002761819;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF295701b() {
        return "key_header_item";
    }

    public final int hashCode() {
        int iD2 = H.d(-1956074245, 31, this.f295722b);
        AttributedText attributedText = this.f295723c;
        return iD2 + (attributedText == null ? 0 : attributedText.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CpxConfigureAdvanceHeaderItem(stringId=key_header_item, title=");
        sb2.append(this.f295722b);
        sb2.append(", description=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f295723c, ')');
    }
}
