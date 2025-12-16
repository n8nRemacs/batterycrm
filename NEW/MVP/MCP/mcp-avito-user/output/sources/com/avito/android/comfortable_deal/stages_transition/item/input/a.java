package com.avito.android.comfortable_deal.stages_transition.item.input;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import com.avito.conveyor_item.a;
import eq.InterfaceC40145a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InputItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/stages_transition/item/input/a;", "Leq/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class a implements InterfaceC40145a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final PrintableText f122891b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final PrintableText f122892c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f122893d;

    public a(@l PrintableText printableText, @l PrintableText printableText2, @l String str) {
        this.f122891b = printableText;
        this.f122892c = printableText2;
        this.f122893d = str;
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
        return this.f122891b.equals(aVar.f122891b) && this.f122892c.equals(aVar.f122892c) && L.f(this.f122893d, aVar.f122893d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83558b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF296143b() {
        return "itemLink";
    }

    public final int hashCode() {
        int iF2 = com.avito.android.actions_sheet.a.f(this.f122892c, com.avito.android.actions_sheet.a.f(this.f122891b, 2135939059, 31), 31);
        String str = this.f122893d;
        return iF2 + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InputItem(stringId=itemLink, label=");
        sb2.append(this.f122891b);
        sb2.append(", hint=");
        sb2.append(this.f122892c);
        sb2.append(", value=");
        return C22026a.c(sb2, this.f122893d, ')');
    }
}
