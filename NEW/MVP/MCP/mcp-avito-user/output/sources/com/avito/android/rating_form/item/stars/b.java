package com.avito.android.rating_form.item.stars;

import ah0.InterfaceC19890a;
import androidx.media3.common.C23088b;
import com.akita.compose.component.accordion.s;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.rating_form.FieldIdentifier;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StarsItem.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_form/item/stars/b;", "Lcom/avito/conveyor_item/a;", "Lcom/avito/android/rating_form/step/recycler/f;", "Lah0/a;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class b implements com.avito.conveyor_item.a, com.avito.android.rating_form.step.recycler.f, InterfaceC19890a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f248649b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final FieldIdentifier f248650c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public PrintableText f248651d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Boolean f248652e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Object f248653f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final PrintableText f248654g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public Integer f248655h;

    public b(@Y61.k String str, @Y61.k FieldIdentifier fieldIdentifier, @Y61.k PrintableText printableText, @Y61.l Boolean bool, @Y61.k List<k> list, @Y61.l PrintableText printableText2, @Y61.l Integer num) {
        this.f248649b = str;
        this.f248650c = fieldIdentifier;
        this.f248651d = printableText;
        this.f248652e = bool;
        this.f248653f = list;
        this.f248654g = printableText2;
        this.f248655h = num;
    }

    @Override // com.avito.android.rating_form.step.recycler.f
    @Y61.l
    /* renamed from: a, reason: from getter */
    public final PrintableText getF248394g() {
        return this.f248654g;
    }

    @Override // ah0.InterfaceC19890a
    public final boolean b() {
        return this.f248655h == null;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f248649b, bVar.f248649b) && this.f248650c.equals(bVar.f248650c) && L.f(this.f248651d, bVar.f248651d) && this.f248652e.equals(bVar.f248652e) && L.f(this.f248653f, bVar.f248653f) && L.f(this.f248654g, bVar.f248654g) && L.f(this.f248655h, bVar.f248655h);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF113526b() {
        return getF229755b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF229755b() {
        return this.f248649b;
    }

    public final int hashCode() {
        int iA2 = C23088b.a((this.f248652e.hashCode() + com.avito.android.actions_sheet.a.f(this.f248651d, (this.f248650c.hashCode() + (this.f248649b.hashCode() * 31)) * 31, 31)) * 31, 31, this.f248653f);
        PrintableText printableText = this.f248654g;
        int iHashCode = (iA2 + (printableText == null ? 0 : printableText.hashCode())) * 31;
        Integer num = this.f248655h;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    @Override // com.avito.android.rating_form.step.recycler.f
    @Y61.l
    /* renamed from: isEnabled, reason: from getter */
    public final Boolean getF248395h() {
        return this.f248652e;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StarsItem(stringId=");
        sb2.append(this.f248649b);
        sb2.append(", fieldIdentifier=");
        sb2.append(this.f248650c);
        sb2.append(", description=");
        sb2.append(this.f248651d);
        sb2.append(", isEnabled=");
        sb2.append(this.f248652e);
        sb2.append(", values=");
        sb2.append(this.f248653f);
        sb2.append(", errorText=");
        sb2.append(this.f248654g);
        sb2.append(", value=");
        return s.j(sb2, this.f248655h, ')');
    }
}
