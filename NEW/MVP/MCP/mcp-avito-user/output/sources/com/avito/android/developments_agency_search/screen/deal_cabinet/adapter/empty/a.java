package com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.empty;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: EmptyItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/adapter/empty/a;", "Lcom/avito/conveyor_item/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f136824b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PrintableText f136825c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final PrintableText f136826d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final PrintableText f136827e;

    public a(@k String str, @k PrintableText printableText, @k PrintableText printableText2, @l PrintableText printableText3) {
        this.f136824b = str;
        this.f136825c = printableText;
        this.f136826d = printableText2;
        this.f136827e = printableText3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f136824b, aVar.f136824b) && L.f(this.f136825c, aVar.f136825c) && L.f(this.f136826d, aVar.f136826d) && L.f(this.f136827e, aVar.f136827e);
    }

    @Override // TV0.a
    public final long getId() {
        return getF130376b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF130376b() {
        return this.f136824b;
    }

    public final int hashCode() {
        int iF2 = com.avito.android.actions_sheet.a.f(this.f136826d, com.avito.android.actions_sheet.a.f(this.f136825c, this.f136824b.hashCode() * 31, 31), 31);
        PrintableText printableText = this.f136827e;
        return iF2 + (printableText == null ? 0 : printableText.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EmptyItem(stringId=");
        sb2.append(this.f136824b);
        sb2.append(", title=");
        sb2.append(this.f136825c);
        sb2.append(", description=");
        sb2.append(this.f136826d);
        sb2.append(", actionText=");
        return AK.c.m(sb2, this.f136827e, ')');
    }

    public /* synthetic */ a(String str, PrintableText printableText, PrintableText printableText2, PrintableText printableText3, int i12, C42822w c42822w) {
        this(str, printableText, printableText2, (i12 & 8) != 0 ? null : printableText3);
    }
}
