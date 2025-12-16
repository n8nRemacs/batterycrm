package com.avito.android.comfortable_deal.stages_transition.item.reasonslist.reason;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ReasonItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/stages_transition/item/reasonslist/reason/c;", "Lcom/avito/conveyor_item/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f122926b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PrintableText f122927c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f122928d;

    public c(@k PrintableText printableText, @k String str, boolean z12) {
        this.f122926b = str;
        this.f122927c = printableText;
        this.f122928d = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f122926b, cVar.f122926b) && L.f(this.f122927c, cVar.f122927c) && this.f122928d == cVar.f122928d;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF94474b() {
        return getF96818b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF96818b() {
        return this.f122926b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f122928d) + com.avito.android.actions_sheet.a.f(this.f122927c, this.f122926b.hashCode() * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReasonItem(stringId=");
        sb2.append(this.f122926b);
        sb2.append(", label=");
        sb2.append(this.f122927c);
        sb2.append(", isChecked=");
        return r.x(sb2, this.f122928d, ')');
    }
}
