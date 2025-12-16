package com.avito.android.tariff.cpx.configure.landing.items.card;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CpxConfigureLandingCardItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/landing/items/card/g;", "", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AttributedText f295979a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Integer f295980b;

    public g(@k AttributedText attributedText, @l Integer num) {
        this.f295979a = attributedText;
        this.f295980b = num;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.f295979a, gVar.f295979a) && L.f(this.f295980b, gVar.f295980b);
    }

    public final int hashCode() {
        int iHashCode = this.f295979a.hashCode() * 31;
        Integer num = this.f295980b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CpxConfigureLandingCardItemText(text=");
        sb2.append(this.f295979a);
        sb2.append(", bottomSpacer=");
        return s.j(sb2, this.f295980b, ')');
    }
}
