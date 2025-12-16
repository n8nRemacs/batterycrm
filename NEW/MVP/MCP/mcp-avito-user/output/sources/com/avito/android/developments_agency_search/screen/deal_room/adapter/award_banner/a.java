package com.avito.android.developments_agency_search.screen.deal_room.adapter.award_banner;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AwardBannerItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/adapter/award_banner/a;", "Lcom/avito/conveyor_item/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PrintableText f137260b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f137261c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final PrintableText f137262d;

    public a(@k PrintableText printableText, @k PrintableText printableText2, @k String str) {
        this.f137260b = printableText;
        this.f137261c = str;
        this.f137262d = printableText2;
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
        return this.f137260b.equals(aVar.f137260b) && L.f(this.f137261c, aVar.f137261c) && this.f137262d.equals(aVar.f137262d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF268422b() {
        return -1423125701;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF268425c() {
        return "revenue-section-paid-deal-banner-item";
    }

    public final int hashCode() {
        return this.f137262d.hashCode() + H.d(com.avito.android.actions_sheet.a.f(this.f137260b, -1167223771, 31), 31, this.f137261c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AwardBannerItem(stringId=revenue-section-paid-deal-banner-item, bannerTitle=");
        sb2.append(this.f137260b);
        sb2.append(", awardAmount=");
        sb2.append(this.f137261c);
        sb2.append(", awardAmountDescription=");
        return AK.c.m(sb2, this.f137262d, ')');
    }
}
