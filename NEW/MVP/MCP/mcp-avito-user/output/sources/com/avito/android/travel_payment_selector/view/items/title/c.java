package com.avito.android.travel_payment_selector.view.items.title;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TitleItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_payment_selector/view/items/title/c;", "Lcom/avito/conveyor_item/a;", "_avito_travel-payment-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f302758b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f302759c;

    public c(@k String str, @k AttributedText attributedText) {
        this.f302758b = str;
        this.f302759c = attributedText;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f302758b, cVar.f302758b) && L.f(this.f302759c, cVar.f302759c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF78563b() {
        return getF246539b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF246539b() {
        return this.f302758b;
    }

    public final int hashCode() {
        return this.f302759c.hashCode() + (this.f302758b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TitleItem(stringId=");
        sb2.append(this.f302758b);
        sb2.append(", text=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f302759c, ')');
    }
}
