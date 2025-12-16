package com.avito.android.loyalty.ui.quality_service.items.faq;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: FaqItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service/items/faq/a;", "Lcom/avito/conveyor_item/a;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f183847b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f183848c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f183849d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f183850e;

    public a(String str, String str2, AttributedText attributedText, boolean z12, int i12, C42822w c42822w) {
        z12 = (i12 & 8) != 0 ? false : z12;
        this.f183847b = str;
        this.f183848c = str2;
        this.f183849d = attributedText;
        this.f183850e = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f183847b, aVar.f183847b) && L.f(this.f183848c, aVar.f183848c) && L.f(this.f183849d, aVar.f183849d) && this.f183850e == aVar.f183850e;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF82706b() {
        return getF183745b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF183745b() {
        return this.f183847b;
    }

    public final int hashCode() {
        int iHashCode = this.f183847b.hashCode() * 31;
        String str = this.f183848c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        AttributedText attributedText = this.f183849d;
        return Boolean.hashCode(this.f183850e) + ((iHashCode2 + (attributedText != null ? attributedText.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FaqItem(stringId=");
        sb2.append(this.f183847b);
        sb2.append(", title=");
        sb2.append(this.f183848c);
        sb2.append(", description=");
        sb2.append(this.f183849d);
        sb2.append(", isExpanded=");
        return r.x(sb2, this.f183850e, ')');
    }
}
