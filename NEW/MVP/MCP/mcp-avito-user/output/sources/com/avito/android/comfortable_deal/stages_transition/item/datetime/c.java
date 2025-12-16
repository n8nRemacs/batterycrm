package com.avito.android.comfortable_deal.stages_transition.item.datetime;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import com.avito.conveyor_item.a;
import eq.InterfaceC40145a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DateTimeItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/stages_transition/item/datetime/c;", "Leq/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class c implements InterfaceC40145a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final PrintableText f122876b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f122877c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f122878d;

    public c(@l PrintableText printableText, @l String str, @l String str2) {
        this.f122876b = printableText;
        this.f122877c = str;
        this.f122878d = str2;
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
        return L.f(this.f122876b, cVar.f122876b) && L.f(this.f122877c, cVar.f122877c) && L.f(this.f122878d, cVar.f122878d);
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF107341b() {
        return "contactTime";
    }

    public final int hashCode() {
        PrintableText printableText = this.f122876b;
        int iHashCode = (1267435155 + (printableText == null ? 0 : printableText.hashCode())) * 31;
        String str = this.f122877c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f122878d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DateTimeItem(stringId=contactTime, label=");
        sb2.append(this.f122876b);
        sb2.append(", date=");
        sb2.append(this.f122877c);
        sb2.append(", time=");
        return C22026a.c(sb2, this.f122878d, ')');
    }
}
