package com.avito.android.developments_agency_search.adapter.error_layout;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ErrorLayoutItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/adapter/error_layout/a;", "Lcom/avito/conveyor_item/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f136260b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PrintableText f136261c;

    /* renamed from: d, reason: collision with root package name */
    public final int f136262d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final PrintableText f136263e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final PrintableText f136264f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f136265g;

    public a(String str, PrintableText printableText, int i12, PrintableText printableText2, PrintableText printableText3, boolean z12, int i13, C42822w c42822w) {
        i12 = (i13 & 4) != 0 ? R.attr.textH40 : i12;
        z12 = (i13 & 32) != 0 ? false : z12;
        this.f136260b = str;
        this.f136261c = printableText;
        this.f136262d = i12;
        this.f136263e = printableText2;
        this.f136264f = printableText3;
        this.f136265g = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f136260b, aVar.f136260b) && L.f(this.f136261c, aVar.f136261c) && this.f136262d == aVar.f136262d && L.f(this.f136263e, aVar.f136263e) && L.f(this.f136264f, aVar.f136264f) && this.f136265g == aVar.f136265g;
    }

    @Override // TV0.a
    public final long getId() {
        return getF173886b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF173886b() {
        return this.f136260b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f136265g) + com.avito.android.actions_sheet.a.f(this.f136264f, com.avito.android.actions_sheet.a.f(this.f136263e, r.e(this.f136262d, com.avito.android.actions_sheet.a.f(this.f136261c, this.f136260b.hashCode() * 31, 31), 31), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ErrorLayoutItem(stringId=");
        sb2.append(this.f136260b);
        sb2.append(", title=");
        sb2.append(this.f136261c);
        sb2.append(", titleAppearanceAttrId=");
        sb2.append(this.f136262d);
        sb2.append(", description=");
        sb2.append(this.f136263e);
        sb2.append(", buttonText=");
        sb2.append(this.f136264f);
        sb2.append(", hideActionButton=");
        return r.x(sb2, this.f136265g, ')');
    }
}
