package com.avito.android.rating_form.item.development;

import Y61.k;
import Y61.l;
import ah0.InterfaceC19890a;
import androidx.compose.runtime.C22026a;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.rating_form.FieldIdentifier;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DevelopmentItem.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_form/item/development/a;", "Lcom/avito/conveyor_item/a;", "Lcom/avito/android/rating_form/step/recycler/f;", "Lah0/a;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class a implements com.avito.conveyor_item.a, com.avito.android.rating_form.step.recycler.f, InterfaceC19890a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f248389b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final FieldIdentifier f248390c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f248391d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f248392e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f248393f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final PrintableText f248394g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Boolean f248395h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final Long f248396i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final String f248397j;

    public a(@k String str, @k FieldIdentifier fieldIdentifier, @l String str2, @l String str3, @l String str4, @l PrintableText printableText, @l Boolean bool, @l Long l12, @l String str5) {
        this.f248389b = str;
        this.f248390c = fieldIdentifier;
        this.f248391d = str2;
        this.f248392e = str3;
        this.f248393f = str4;
        this.f248394g = printableText;
        this.f248395h = bool;
        this.f248396i = l12;
        this.f248397j = str5;
    }

    @Override // com.avito.android.rating_form.step.recycler.f
    @l
    /* renamed from: a, reason: from getter */
    public final PrintableText getF248456c() {
        return this.f248394g;
    }

    @Override // ah0.InterfaceC19890a
    public final boolean b() {
        return this.f248396i == null;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f248389b, aVar.f248389b) && L.f(this.f248390c, aVar.f248390c) && L.f(this.f248391d, aVar.f248391d) && L.f(this.f248392e, aVar.f248392e) && L.f(this.f248393f, aVar.f248393f) && L.f(this.f248394g, aVar.f248394g) && L.f(this.f248395h, aVar.f248395h) && L.f(this.f248396i, aVar.f248396i) && L.f(this.f248397j, aVar.f248397j);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF124032b() {
        return getF243916b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF243916b() {
        return this.f248389b;
    }

    public final int hashCode() {
        int iHashCode = (this.f248390c.hashCode() + (this.f248389b.hashCode() * 31)) * 31;
        String str = this.f248391d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f248392e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f248393f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        PrintableText printableText = this.f248394g;
        int iHashCode5 = (iHashCode4 + (printableText == null ? 0 : printableText.hashCode())) * 31;
        Boolean bool = this.f248395h;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l12 = this.f248396i;
        int iHashCode7 = (iHashCode6 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str4 = this.f248397j;
        return iHashCode7 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // com.avito.android.rating_form.step.recycler.f
    @l
    /* renamed from: isEnabled, reason: from getter */
    public final Boolean getF248457d() {
        return this.f248395h;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DevelopmentItem(stringId=");
        sb2.append(this.f248389b);
        sb2.append(", fieldIdentifier=");
        sb2.append(this.f248390c);
        sb2.append(", title=");
        sb2.append(this.f248391d);
        sb2.append(", subtitle=");
        sb2.append(this.f248392e);
        sb2.append(", placeholder=");
        sb2.append(this.f248393f);
        sb2.append(", errorText=");
        sb2.append(this.f248394g);
        sb2.append(", isEnabled=");
        sb2.append(this.f248395h);
        sb2.append(", value=");
        sb2.append(this.f248396i);
        sb2.append(", displayedValue=");
        return C22026a.c(sb2, this.f248397j, ')');
    }
}
