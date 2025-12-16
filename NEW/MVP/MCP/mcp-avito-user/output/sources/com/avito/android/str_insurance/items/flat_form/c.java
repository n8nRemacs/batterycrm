package com.avito.android.str_insurance.items.flat_form;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrInsuranceFlatFormItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_insurance/items/flat_form/c;", "Lcom/avito/conveyor_item/a;", "_avito_str-insurance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f288565b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f288566c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f288567d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final AttributedText f288568e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f288569f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f288570g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f288571h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final List<Integer> f288572i;

    public c(@k String str, @k String str2, @k String str3, @k AttributedText attributedText, @l String str4, @k String str5, @k String str6, @k List list) {
        this.f288565b = str;
        this.f288566c = str2;
        this.f288567d = str3;
        this.f288568e = attributedText;
        this.f288569f = str4;
        this.f288570g = str5;
        this.f288571h = str6;
        this.f288572i = list;
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
        return L.f(this.f288565b, cVar.f288565b) && L.f(this.f288566c, cVar.f288566c) && L.f(this.f288567d, cVar.f288567d) && L.f(this.f288568e, cVar.f288568e) && L.f(this.f288569f, cVar.f288569f) && L.f(this.f288570g, cVar.f288570g) && L.f(this.f288571h, cVar.f288571h) && L.f(this.f288572i, cVar.f288572i);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF74281b() {
        return 313538664;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF74282c() {
        return "flat_form_item";
    }

    public final int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b(H.d(H.d(H.d(1129763992, 31, this.f288565b), 31, this.f288566c), 31, this.f288567d), 31, this.f288568e);
        String str = this.f288569f;
        return this.f288572i.hashCode() + H.d(H.d((iB2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f288570g), 31, this.f288571h);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StrInsuranceFlatFormItem(stringId=flat_form_item, title=");
        sb2.append(this.f288565b);
        sb2.append(", description=");
        sb2.append(this.f288566c);
        sb2.append(", address=");
        sb2.append(this.f288567d);
        sb2.append(", disclaimer=");
        sb2.append(this.f288568e);
        sb2.append(", flatNumber=");
        sb2.append(this.f288569f);
        sb2.append(", flatNumberPattern=");
        sb2.append(this.f288570g);
        sb2.append(", itemId=");
        sb2.append(this.f288571h);
        sb2.append(", state=");
        return H.p(sb2, this.f288572i, ')');
    }
}
