package com.avito.android.trx_promo_impl.item.header;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TrxPromoHeaderItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/trx_promo_impl/item/header/c;", "Lcom/avito/conveyor_item/a;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f304306b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f304307c;

    public c(@k String str, @l AttributedText attributedText) {
        this.f304306b = str;
        this.f304307c = attributedText;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        cVar.getClass();
        return L.f(this.f304306b, cVar.f304306b) && L.f(this.f304307c, cVar.f304307c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF284485b() {
        return -1204396510;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF302516b() {
        return "trx_promo_header";
    }

    public final int hashCode() {
        int iD2 = H.d(1318413854, 31, this.f304306b);
        AttributedText attributedText = this.f304307c;
        return iD2 + (attributedText == null ? 0 : attributedText.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TrxPromoHeaderItem(stringId=trx_promo_header, title=");
        sb2.append(this.f304306b);
        sb2.append(", description=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f304307c, ')');
    }
}
