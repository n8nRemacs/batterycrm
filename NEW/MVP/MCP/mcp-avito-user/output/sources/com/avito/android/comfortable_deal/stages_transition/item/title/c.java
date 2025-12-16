package com.avito.android.comfortable_deal.stages_transition.item.title;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import com.avito.conveyor_item.a;
import eq.InterfaceC40145a;
import kotlin.Metadata;

/* compiled from: TitleItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/stages_transition/item/title/c;", "Leq/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class c implements InterfaceC40145a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PrintableText f122943b;

    public c(@k PrintableText printableText) {
        this.f122943b = printableText;
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
        return this.f122943b.equals(cVar.f122943b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF79432j() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF79431i() {
        return "title_item";
    }

    public final int hashCode() {
        return this.f122943b.hashCode() + 850479782;
    }

    @k
    public final String toString() {
        return AK.c.m(new StringBuilder("TitleItem(stringId=title_item, title="), this.f122943b, ')');
    }
}
