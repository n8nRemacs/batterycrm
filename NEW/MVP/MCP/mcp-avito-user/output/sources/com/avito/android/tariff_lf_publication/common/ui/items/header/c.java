package com.avito.android.tariff_lf_publication.common.ui.items.header;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TariffLfPublicationHeaderItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf_publication/common/ui/items/header/c;", "Lcom/avito/conveyor_item/a;", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f300713b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f300714c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f300715d;

    public c(String str, String str2, AttributedText attributedText, int i12, C42822w c42822w) {
        this.f300713b = (i12 & 1) != 0 ? "tariff_lf_publication_header" : str;
        this.f300714c = str2;
        this.f300715d = attributedText;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f300713b, cVar.f300713b) && L.f(this.f300714c, cVar.f300714c) && L.f(this.f300715d, cVar.f300715d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF268996b() {
        return getF294064b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF294064b() {
        return this.f300713b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f300713b.hashCode() * 31, 31, this.f300714c);
        AttributedText attributedText = this.f300715d;
        return iD2 + (attributedText == null ? 0 : attributedText.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TariffLfPublicationHeaderItem(stringId=");
        sb2.append(this.f300713b);
        sb2.append(", title=");
        sb2.append(this.f300714c);
        sb2.append(", description=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f300715d, ')');
    }
}
