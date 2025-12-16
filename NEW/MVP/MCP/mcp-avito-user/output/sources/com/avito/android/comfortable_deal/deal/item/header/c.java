package com.avito.android.comfortable_deal.deal.item.header;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HeaderItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/item/header/c;", "Lcom/avito/conveyor_item/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f121424b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PrintableText f121425c;

    public c(@k String str, @k PrintableText printableText) {
        this.f121424b = str;
        this.f121425c = printableText;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f121424b, cVar.f121424b) && L.f(this.f121425c, cVar.f121425c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF79432j() {
        return getF79431i().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF79431i() {
        return this.f121424b;
    }

    public final int hashCode() {
        return this.f121425c.hashCode() + (this.f121424b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HeaderItem(stringId=");
        sb2.append(this.f121424b);
        sb2.append(", text=");
        return AK.c.m(sb2, this.f121425c, ')');
    }
}
