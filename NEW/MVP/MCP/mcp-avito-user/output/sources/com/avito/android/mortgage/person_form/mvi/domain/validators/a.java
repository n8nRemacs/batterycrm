package com.avito.android.mortgage.person_form.mvi.domain.validators;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MortgageFormValidationModel.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/mvi/domain/validators/a;", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f201170a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final PrintableText f201171b;

    public a(@k String str, @l PrintableText printableText) {
        this.f201170a = str;
        this.f201171b = printableText;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f201170a, aVar.f201170a) && L.f(this.f201171b, aVar.f201171b);
    }

    public final int hashCode() {
        int iHashCode = this.f201170a.hashCode() * 31;
        PrintableText printableText = this.f201171b;
        return iHashCode + (printableText == null ? 0 : printableText.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MortgageFormValidationModel(fieldName=");
        sb2.append(this.f201170a);
        sb2.append(", error=");
        return AK.c.m(sb2, this.f201171b, ')');
    }
}
