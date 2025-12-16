package com.avito.android.rating_form.item.stars;

import androidx.compose.runtime.C22026a;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StarsItemValue.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/item/stars/k;", "", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final PrintableText f248673a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f248674b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f248675c;

    public k(@Y61.k PrintableText printableText, @Y61.l String str, @Y61.k String str2) {
        this.f248673a = printableText;
        this.f248674b = str;
        this.f248675c = str2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return L.f(this.f248673a, kVar.f248673a) && L.f(this.f248674b, kVar.f248674b) && L.f(this.f248675c, kVar.f248675c);
    }

    public final int hashCode() {
        int iHashCode = this.f248673a.hashCode() * 31;
        String str = this.f248674b;
        return this.f248675c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StarsItemValue(label=");
        sb2.append(this.f248673a);
        sb2.append(", description=");
        sb2.append(this.f248674b);
        sb2.append(", value=");
        return C22026a.c(sb2, this.f248675c, ')');
    }
}
