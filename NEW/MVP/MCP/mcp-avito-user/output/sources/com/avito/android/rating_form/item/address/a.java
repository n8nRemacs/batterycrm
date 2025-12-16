package com.avito.android.rating_form.item.address;

import Y61.k;
import Y61.l;
import ah0.InterfaceC19890a;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.rating_form.FieldIdentifier;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AddressItem.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_form/item/address/a;", "Lcom/avito/conveyor_item/a;", "Lcom/avito/android/rating_form/step/recycler/f;", "Lah0/a;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class a implements com.avito.conveyor_item.a, com.avito.android.rating_form.step.recycler.f, InterfaceC19890a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f248261b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final FieldIdentifier f248262c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f248263d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f248264e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f248265f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final PrintableText f248266g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Boolean f248267h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public String f248268i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final AddressParameter.ValidationRules f248269j;

    public a(@k String str, @k FieldIdentifier fieldIdentifier, @l String str2, @l String str3, @l String str4, @l PrintableText printableText, @l Boolean bool, @l String str5, @l AddressParameter.ValidationRules validationRules) {
        this.f248261b = str;
        this.f248262c = fieldIdentifier;
        this.f248263d = str2;
        this.f248264e = str3;
        this.f248265f = str4;
        this.f248266g = printableText;
        this.f248267h = bool;
        this.f248268i = str5;
        this.f248269j = validationRules;
    }

    @Override // com.avito.android.rating_form.step.recycler.f
    @l
    /* renamed from: a, reason: from getter */
    public final PrintableText getF248266g() {
        return this.f248266g;
    }

    @Override // ah0.InterfaceC19890a
    public final boolean b() {
        String str = this.f248268i;
        return str == null || str.length() == 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f248261b, aVar.f248261b) && L.f(this.f248262c, aVar.f248262c) && L.f(this.f248263d, aVar.f248263d) && L.f(this.f248264e, aVar.f248264e) && L.f(this.f248265f, aVar.f248265f) && L.f(this.f248266g, aVar.f248266g) && L.f(this.f248267h, aVar.f248267h) && L.f(this.f248268i, aVar.f248268i) && L.f(this.f248269j, aVar.f248269j);
    }

    @Override // TV0.a
    public final long getId() {
        return getF248261b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF248261b() {
        return this.f248261b;
    }

    public final int hashCode() {
        int iHashCode = (this.f248262c.hashCode() + (this.f248261b.hashCode() * 31)) * 31;
        String str = this.f248263d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f248264e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f248265f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        PrintableText printableText = this.f248266g;
        int iHashCode5 = (iHashCode4 + (printableText == null ? 0 : printableText.hashCode())) * 31;
        Boolean bool = this.f248267h;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.f248268i;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        AddressParameter.ValidationRules validationRules = this.f248269j;
        return iHashCode7 + (validationRules != null ? validationRules.hashCode() : 0);
    }

    @Override // com.avito.android.rating_form.step.recycler.f
    @l
    /* renamed from: isEnabled, reason: from getter */
    public final Boolean getF248267h() {
        return this.f248267h;
    }

    @k
    public final String toString() {
        return "AddressItem(stringId=" + this.f248261b + ", fieldIdentifier=" + this.f248262c + ", title=" + this.f248263d + ", subtitle=" + this.f248264e + ", placeholder=" + this.f248265f + ", errorText=" + this.f248266g + ", isEnabled=" + this.f248267h + ", value=" + this.f248268i + ", minimalPrecision=" + this.f248269j + ')';
    }
}
