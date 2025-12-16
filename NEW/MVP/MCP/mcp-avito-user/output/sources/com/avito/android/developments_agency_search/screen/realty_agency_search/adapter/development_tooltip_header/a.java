package com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_header;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DevelopmentTooltipHeaderItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/adapter/development_tooltip_header/a;", "Lcom/avito/conveyor_item/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    public final long f138343b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f138344c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final PrintableText f138345d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<Image> f138346e;

    public a(long j12, @k String str, @k PrintableText printableText, @k List list) {
        this.f138343b = j12;
        this.f138344c = str;
        this.f138345d = printableText;
        this.f138346e = list;
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
        return this.f138343b == aVar.f138343b && L.f(this.f138344c, aVar.f138344c) && this.f138345d.equals(aVar.f138345d) && L.f(this.f138346e, aVar.f138346e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80070b() {
        return -943980844;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF109523d() {
        return "map_development_tooltip-header_item";
    }

    public final int hashCode() {
        return this.f138346e.hashCode() + com.avito.android.actions_sheet.a.f(this.f138345d, H.d(r.g(801364908, 31, this.f138343b), 31, this.f138344c), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DevelopmentTooltipHeaderItem(stringId=map_development_tooltip-header_item, developmentId=");
        sb2.append(this.f138343b);
        sb2.append(", title=");
        sb2.append(this.f138344c);
        sb2.append(", subtitle=");
        sb2.append(this.f138345d);
        sb2.append(", galleryImages=");
        return H.p(sb2, this.f138346e, ')');
    }
}
