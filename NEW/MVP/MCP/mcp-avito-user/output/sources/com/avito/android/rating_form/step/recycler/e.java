package com.avito.android.rating_form.step.recycler;

import Y61.k;
import Y61.l;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RatingFormPayloadCreator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/step/recycler/e;", "", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class e {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final PrintableText f249734a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Boolean f249735b;

    public e(@l PrintableText printableText, @l Boolean bool) {
        this.f249734a = printableText;
        this.f249735b = bool;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f249734a, eVar.f249734a) && L.f(this.f249735b, eVar.f249735b);
    }

    public final int hashCode() {
        PrintableText printableText = this.f249734a;
        int iHashCode = (printableText == null ? 0 : printableText.hashCode()) * 31;
        Boolean bool = this.f249735b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VerifiableItemPayload(errorText=");
        sb2.append(this.f249734a);
        sb2.append(", isEnabled=");
        return C0.g(sb2, this.f249735b, ')');
    }
}
