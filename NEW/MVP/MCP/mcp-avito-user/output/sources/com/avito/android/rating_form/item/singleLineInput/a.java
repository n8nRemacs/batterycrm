package com.avito.android.rating_form.item.singleLineInput;

import Y61.l;
import ah0.InterfaceC19890a;
import androidx.compose.foundation.H;
import com.akita.compose.component.accordion.s;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.rating_form.FieldIdentifier;
import com.avito.android.rating_form.api.remote.model.RatingFormField;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SingleLineInputItem.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_form/item/singleLineInput/a;", "Lcom/avito/conveyor_item/a;", "Lcom/avito/android/rating_form/step/recycler/f;", "Lah0/a;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class a implements com.avito.conveyor_item.a, com.avito.android.rating_form.step.recycler.f, InterfaceC19890a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f248601b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final PrintableText f248602c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Boolean f248603d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final FieldIdentifier f248604e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f248605f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f248606g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final AttributedText f248607h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f248608i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final RatingFormField.DataType f248609j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public String f248610k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final RatingFormField.MaskType f248611l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final String f248612m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final Boolean f248613n;

    /* renamed from: o, reason: collision with root package name */
    @l
    public final Integer f248614o;

    public a(@Y61.k String str, @l PrintableText printableText, @l Boolean bool, @Y61.k FieldIdentifier fieldIdentifier, @l String str2, @l String str3, @l AttributedText attributedText, @l String str4, @Y61.k RatingFormField.DataType dataType, @Y61.k String str5, @l RatingFormField.MaskType maskType, @l String str6, @l Boolean bool2, @l Integer num) {
        this.f248601b = str;
        this.f248602c = printableText;
        this.f248603d = bool;
        this.f248604e = fieldIdentifier;
        this.f248605f = str2;
        this.f248606g = str3;
        this.f248607h = attributedText;
        this.f248608i = str4;
        this.f248609j = dataType;
        this.f248610k = str5;
        this.f248611l = maskType;
        this.f248612m = str6;
        this.f248613n = bool2;
        this.f248614o = num;
    }

    @Override // com.avito.android.rating_form.step.recycler.f
    @l
    /* renamed from: a, reason: from getter */
    public final PrintableText getF248584g() {
        return this.f248602c;
    }

    @Override // ah0.InterfaceC19890a
    public final boolean b() {
        return this.f248610k.length() == 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f248601b, aVar.f248601b) && L.f(this.f248602c, aVar.f248602c) && L.f(this.f248603d, aVar.f248603d) && L.f(this.f248604e, aVar.f248604e) && L.f(this.f248605f, aVar.f248605f) && L.f(this.f248606g, aVar.f248606g) && L.f(this.f248607h, aVar.f248607h) && L.f(this.f248608i, aVar.f248608i) && this.f248609j == aVar.f248609j && L.f(this.f248610k, aVar.f248610k) && this.f248611l == aVar.f248611l && L.f(this.f248612m, aVar.f248612m) && L.f(this.f248613n, aVar.f248613n) && L.f(this.f248614o, aVar.f248614o);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF78592b() {
        return getF78593c().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF78593c() {
        return this.f248601b;
    }

    public final int hashCode() {
        int iHashCode = this.f248601b.hashCode() * 31;
        PrintableText printableText = this.f248602c;
        int iHashCode2 = (iHashCode + (printableText == null ? 0 : printableText.hashCode())) * 31;
        Boolean bool = this.f248603d;
        int iHashCode3 = (this.f248604e.hashCode() + ((iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31)) * 31;
        String str = this.f248605f;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f248606g;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AttributedText attributedText = this.f248607h;
        int iHashCode6 = (iHashCode5 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        String str3 = this.f248608i;
        int iD2 = H.d((this.f248609j.hashCode() + ((iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31, 31, this.f248610k);
        RatingFormField.MaskType maskType = this.f248611l;
        int iHashCode7 = (iD2 + (maskType == null ? 0 : maskType.hashCode())) * 31;
        String str4 = this.f248612m;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool2 = this.f248613n;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.f248614o;
        return iHashCode9 + (num != null ? num.hashCode() : 0);
    }

    @Override // com.avito.android.rating_form.step.recycler.f
    @l
    /* renamed from: isEnabled, reason: from getter */
    public final Boolean getF248585h() {
        return this.f248603d;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SingleLineInputItem(stringId=");
        sb2.append(this.f248601b);
        sb2.append(", errorText=");
        sb2.append(this.f248602c);
        sb2.append(", isEnabled=");
        sb2.append(this.f248603d);
        sb2.append(", fieldIdentifier=");
        sb2.append(this.f248604e);
        sb2.append(", title=");
        sb2.append(this.f248605f);
        sb2.append(", subtitle=");
        sb2.append(this.f248606g);
        sb2.append(", attributedSubtitle=");
        sb2.append(this.f248607h);
        sb2.append(", placeholder=");
        sb2.append(this.f248608i);
        sb2.append(", dataType=");
        sb2.append(this.f248609j);
        sb2.append(", value=");
        sb2.append(this.f248610k);
        sb2.append(", inputMaskType=");
        sb2.append(this.f248611l);
        sb2.append(", hintText=");
        sb2.append(this.f248612m);
        sb2.append(", focusRequested=");
        sb2.append(this.f248613n);
        sb2.append(", maxLength=");
        return s.j(sb2, this.f248614o, ')');
    }
}
