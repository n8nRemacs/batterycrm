package com.avito.android.seller_promotions.konveyor.attributed_text;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.seller_promotions.konveyor.g;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AttributedTextItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/seller_promotions/konveyor/attributed_text/c;", "Lcom/avito/android/seller_promotions/konveyor/c;", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class c implements com.avito.android.seller_promotions.konveyor.c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f267765b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g f267766c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AttributedText f267767d;

    public c(String str, g gVar, AttributedText attributedText, int i12, C42822w c42822w) {
        str = (i12 & 1) != 0 ? "promotion-condition" : str;
        gVar = (i12 & 2) != 0 ? g.a.f267804a : gVar;
        this.f267765b = str;
        this.f267766c = gVar;
        this.f267767d = attributedText;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f267765b, cVar.f267765b) && L.f(this.f267766c, cVar.f267766c) && L.f(this.f267767d, cVar.f267767d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF78710b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF250470b() {
        return this.f267765b;
    }

    public final int hashCode() {
        return this.f267767d.hashCode() + ((this.f267766c.hashCode() + (this.f267765b.hashCode() * 31)) * 31);
    }

    @Override // com.avito.android.seller_promotions.konveyor.c
    @k
    /* renamed from: q, reason: from getter */
    public final g getF267809c() {
        return this.f267766c;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AttributedTextItem(stringId=");
        sb2.append(this.f267765b);
        sb2.append(", spanType=");
        sb2.append(this.f267766c);
        sb2.append(", text=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f267767d, ')');
    }
}
