package com.avito.android.rating_form.item.multiLineInput;

import Y61.l;
import ah0.InterfaceC19890a;
import androidx.compose.runtime.C22026a;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.rating_form.FieldIdentifier;
import com.avito.android.rating_form.api.remote.model.RatingFormField;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MultiLineInputItem.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_form/item/multiLineInput/a;", "Lcom/avito/conveyor_item/a;", "Lcom/avito/android/rating_form/step/recycler/f;", "Lah0/a;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class a implements com.avito.conveyor_item.a, com.avito.android.rating_form.step.recycler.f, InterfaceC19890a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f248455b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final PrintableText f248456c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Boolean f248457d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final FieldIdentifier f248458e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f248459f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f248460g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final AttributedText f248461h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f248462i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final Integer f248463j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final RatingFormField.DataType f248464k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public String f248465l;

    public a(@Y61.k String str, @l PrintableText printableText, @l Boolean bool, @Y61.k FieldIdentifier fieldIdentifier, @l String str2, @l String str3, @l AttributedText attributedText, @l String str4, @l Integer num, @Y61.k RatingFormField.DataType dataType, @Y61.k String str5) {
        this.f248455b = str;
        this.f248456c = printableText;
        this.f248457d = bool;
        this.f248458e = fieldIdentifier;
        this.f248459f = str2;
        this.f248460g = str3;
        this.f248461h = attributedText;
        this.f248462i = str4;
        this.f248463j = num;
        this.f248464k = dataType;
        this.f248465l = str5;
    }

    @Override // com.avito.android.rating_form.step.recycler.f
    @l
    /* renamed from: a, reason: from getter */
    public final PrintableText getF248654g() {
        return this.f248456c;
    }

    @Override // ah0.InterfaceC19890a
    public final boolean b() {
        return this.f248465l.length() == 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f248455b, aVar.f248455b) && L.f(this.f248456c, aVar.f248456c) && L.f(this.f248457d, aVar.f248457d) && L.f(this.f248458e, aVar.f248458e) && L.f(this.f248459f, aVar.f248459f) && L.f(this.f248460g, aVar.f248460g) && L.f(this.f248461h, aVar.f248461h) && L.f(this.f248462i, aVar.f248462i) && L.f(this.f248463j, aVar.f248463j) && this.f248464k == aVar.f248464k && L.f(this.f248465l, aVar.f248465l);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF124042b() {
        return getF248282b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF248282b() {
        return this.f248455b;
    }

    public final int hashCode() {
        int iHashCode = this.f248455b.hashCode() * 31;
        PrintableText printableText = this.f248456c;
        int iHashCode2 = (iHashCode + (printableText == null ? 0 : printableText.hashCode())) * 31;
        Boolean bool = this.f248457d;
        int iHashCode3 = (this.f248458e.hashCode() + ((iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31)) * 31;
        String str = this.f248459f;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f248460g;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AttributedText attributedText = this.f248461h;
        int iHashCode6 = (iHashCode5 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        String str3 = this.f248462i;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f248463j;
        return this.f248465l.hashCode() + ((this.f248464k.hashCode() + ((iHashCode7 + (num != null ? num.hashCode() : 0)) * 31)) * 31);
    }

    @Override // com.avito.android.rating_form.step.recycler.f
    @l
    /* renamed from: isEnabled, reason: from getter */
    public final Boolean getF248652e() {
        return this.f248457d;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MultiLineInputItem(stringId=");
        sb2.append(this.f248455b);
        sb2.append(", errorText=");
        sb2.append(this.f248456c);
        sb2.append(", isEnabled=");
        sb2.append(this.f248457d);
        sb2.append(", fieldIdentifier=");
        sb2.append(this.f248458e);
        sb2.append(", title=");
        sb2.append(this.f248459f);
        sb2.append(", subtitle=");
        sb2.append(this.f248460g);
        sb2.append(", attributedSubtitle=");
        sb2.append(this.f248461h);
        sb2.append(", placeholder=");
        sb2.append(this.f248462i);
        sb2.append(", maxSymbolLimit=");
        sb2.append(this.f248463j);
        sb2.append(", dataType=");
        sb2.append(this.f248464k);
        sb2.append(", value=");
        return C22026a.c(sb2, this.f248465l, ')');
    }
}
