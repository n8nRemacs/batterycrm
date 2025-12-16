package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query_header_info;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: QueriesHeaderInfoItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/query_header_info/a;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/a;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class a implements com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f221121b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final PrintableText f221122c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final PrintableText f221123d;

    public a(@l PrintableText printableText, @l PrintableText printableText2, @k String str) {
        this.f221121b = str;
        this.f221122c = printableText;
        this.f221123d = printableText2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f221121b, aVar.f221121b) && L.f(this.f221122c, aVar.f221122c) && L.f(this.f221123d, aVar.f221123d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF186822h() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF186831h() {
        return this.f221121b;
    }

    public final int hashCode() {
        int iHashCode = this.f221121b.hashCode() * 31;
        PrintableText printableText = this.f221122c;
        int iHashCode2 = (iHashCode + (printableText == null ? 0 : printableText.hashCode())) * 31;
        PrintableText printableText2 = this.f221123d;
        return iHashCode2 + (printableText2 != null ? printableText2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("QueriesHeaderInfoItem(stringId=");
        sb2.append(this.f221121b);
        sb2.append(", leftColumnTitle=");
        sb2.append(this.f221122c);
        sb2.append(", rightColumnTitle=");
        return AK.c.m(sb2, this.f221123d, ')');
    }
}
