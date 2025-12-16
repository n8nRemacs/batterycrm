package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query_header;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: QueriesHeaderItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/query_header/a;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/a;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class a implements com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f221112b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PrintableText f221113c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final PrintableText f221114d;

    public a(@k PrintableText printableText, @l PrintableText printableText2, @k String str) {
        this.f221112b = str;
        this.f221113c = printableText;
        this.f221114d = printableText2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f221112b, aVar.f221112b) && L.f(this.f221113c, aVar.f221113c) && L.f(this.f221114d, aVar.f221114d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF189215e() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF213635j() {
        return this.f221112b;
    }

    public final int hashCode() {
        int iF2 = com.avito.android.actions_sheet.a.f(this.f221113c, this.f221112b.hashCode() * 31, 31);
        PrintableText printableText = this.f221114d;
        return iF2 + (printableText == null ? 0 : printableText.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("QueriesHeaderItem(stringId=");
        sb2.append(this.f221112b);
        sb2.append(", title=");
        sb2.append(this.f221113c);
        sb2.append(", description=");
        return AK.c.m(sb2, this.f221114d, ')');
    }
}
