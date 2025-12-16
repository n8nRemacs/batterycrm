package com.avito.android.rating_form.item.select;

import Y61.k;
import Y61.l;
import ah0.InterfaceC19890a;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.rating_form.FieldIdentifier;
import com.avito.android.rating_form.api.remote.model.RatingFormField;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectItem.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_form/item/select/a;", "Lcom/avito/conveyor_item/a;", "Lcom/avito/android/rating_form/step/recycler/f;", "Lah0/a;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class a implements com.avito.conveyor_item.a, com.avito.android.rating_form.step.recycler.f, InterfaceC19890a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f248579b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final FieldIdentifier f248580c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f248581d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f248582e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f248583f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final PrintableText f248584g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Boolean f248585h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final List<RatingFormField.Value> f248586i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final ArrayList f248587j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final String f248588k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f248589l;

    public a(@k String str, @k FieldIdentifier fieldIdentifier, @l String str2, @l String str3, @l String str4, @l PrintableText printableText, @l Boolean bool, @k List list, @l ArrayList arrayList, @l String str5, boolean z12) {
        this.f248579b = str;
        this.f248580c = fieldIdentifier;
        this.f248581d = str2;
        this.f248582e = str3;
        this.f248583f = str4;
        this.f248584g = printableText;
        this.f248585h = bool;
        this.f248586i = list;
        this.f248587j = arrayList;
        this.f248588k = str5;
        this.f248589l = z12;
    }

    @Override // com.avito.android.rating_form.step.recycler.f
    @l
    /* renamed from: a, reason: from getter */
    public final PrintableText getF248394g() {
        return this.f248584g;
    }

    @Override // ah0.InterfaceC19890a
    public final boolean b() {
        ArrayList arrayList = this.f248587j;
        if (arrayList != null) {
            return arrayList.isEmpty();
        }
        return true;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f248579b, aVar.f248579b) && this.f248580c.equals(aVar.f248580c) && L.f(this.f248581d, aVar.f248581d) && L.f(this.f248582e, aVar.f248582e) && L.f(this.f248583f, aVar.f248583f) && L.f(this.f248584g, aVar.f248584g) && this.f248585h.equals(aVar.f248585h) && L.f(this.f248586i, aVar.f248586i) && L.f(this.f248587j, aVar.f248587j) && L.f(this.f248588k, aVar.f248588k) && this.f248589l == aVar.f248589l;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80596b() {
        return getF154527b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF154527b() {
        return this.f248579b;
    }

    public final int hashCode() {
        int iHashCode = (this.f248580c.hashCode() + (this.f248579b.hashCode() * 31)) * 31;
        String str = this.f248581d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f248582e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f248583f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        PrintableText printableText = this.f248584g;
        int iE2 = H.e((this.f248585h.hashCode() + ((iHashCode4 + (printableText == null ? 0 : printableText.hashCode())) * 31)) * 31, 31, this.f248586i);
        ArrayList arrayList = this.f248587j;
        int iHashCode5 = (iE2 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        String str4 = this.f248588k;
        return Boolean.hashCode(this.f248589l) + ((iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    @Override // com.avito.android.rating_form.step.recycler.f
    @l
    /* renamed from: isEnabled, reason: from getter */
    public final Boolean getF248395h() {
        return this.f248585h;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectItem(stringId=");
        sb2.append(this.f248579b);
        sb2.append(", fieldIdentifier=");
        sb2.append(this.f248580c);
        sb2.append(", title=");
        sb2.append(this.f248581d);
        sb2.append(", subtitle=");
        sb2.append(this.f248582e);
        sb2.append(", placeholder=");
        sb2.append(this.f248583f);
        sb2.append(", errorText=");
        sb2.append(this.f248584g);
        sb2.append(", isEnabled=");
        sb2.append(this.f248585h);
        sb2.append(", values=");
        sb2.append(this.f248586i);
        sb2.append(", selectedValues=");
        sb2.append(this.f248587j);
        sb2.append(", selectedValuesAsString=");
        sb2.append(this.f248588k);
        sb2.append(", showSearchInput=");
        return r.x(sb2, this.f248589l, ')');
    }
}
