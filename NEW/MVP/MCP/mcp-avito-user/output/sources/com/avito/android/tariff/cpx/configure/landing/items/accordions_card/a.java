package com.avito.android.tariff.cpx.configure.landing.items.accordions_card;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CpxConfigureLandingAccordionsCardItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/landing/items/accordions_card/a;", "Lcom/avito/conveyor_item/a;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f295945b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f295946c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<CpxConfigureLandingAccordionItem> f295947d;

    public a(@k String str, @l AttributedText attributedText, @k List<CpxConfigureLandingAccordionItem> list) {
        this.f295945b = str;
        this.f295946c = attributedText;
        this.f295947d = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f295945b, aVar.f295945b) && L.f(this.f295946c, aVar.f295946c) && L.f(this.f295947d, aVar.f295947d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF186822h() {
        return getF317973b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF317973b() {
        return this.f295945b;
    }

    public final int hashCode() {
        int iHashCode = this.f295945b.hashCode() * 31;
        AttributedText attributedText = this.f295946c;
        return this.f295947d.hashCode() + ((iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CpxConfigureLandingAccordionsCardItem(stringId=");
        sb2.append(this.f295945b);
        sb2.append(", title=");
        sb2.append(this.f295946c);
        sb2.append(", accordions=");
        return H.p(sb2, this.f295947d, ')');
    }
}
