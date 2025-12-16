package com.avito.android.tariff_cpt.info.ui.items.card;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CptInfoCardItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/info/ui/items/card/i;", "", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class i {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final j f298287a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Integer f298288b;

    public i(@k j jVar, @l Integer num) {
        this.f298287a = jVar;
        this.f298288b = num;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return L.f(this.f298287a, iVar.f298287a) && L.f(this.f298288b, iVar.f298288b);
    }

    public final int hashCode() {
        int iHashCode = this.f298287a.hashCode() * 31;
        Integer num = this.f298288b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CptInfoItemContent(item=");
        sb2.append(this.f298287a);
        sb2.append(", bottomSpacer=");
        return s.j(sb2, this.f298288b, ')');
    }
}
