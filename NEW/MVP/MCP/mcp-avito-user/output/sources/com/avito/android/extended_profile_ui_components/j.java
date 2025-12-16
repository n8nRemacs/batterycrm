package com.avito.android.extended_profile_ui_components;

import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileToastBarFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/j;", "", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final PrintableText f153349a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final PrintableText f153350b;

    public j(@Y61.k PrintableText printableText, @Y61.k PrintableText printableText2) {
        this.f153349a = printableText;
        this.f153350b = printableText2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return L.f(this.f153349a, jVar.f153349a) && L.f(this.f153350b, jVar.f153350b);
    }

    public final int hashCode() {
        return this.f153350b.hashCode() + (this.f153349a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CommonErrorToastBarTexts(text=");
        sb2.append(this.f153349a);
        sb2.append(", actionText=");
        return AK.c.m(sb2, this.f153350b, ')');
    }
}
