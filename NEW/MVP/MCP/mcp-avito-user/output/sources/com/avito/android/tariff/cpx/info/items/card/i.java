package com.avito.android.tariff.cpx.info.items.card;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffCpxInfoCardItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/info/items/card/i;", "", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class i {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final j f296448a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Integer f296449b;

    public i(@k j jVar, @l Integer num) {
        this.f296448a = jVar;
        this.f296449b = num;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return L.f(this.f296448a, iVar.f296448a) && L.f(this.f296449b, iVar.f296449b);
    }

    public final int hashCode() {
        int iHashCode = this.f296448a.hashCode() * 31;
        Integer num = this.f296449b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TariffCpxInfoItemContent(item=");
        sb2.append(this.f296448a);
        sb2.append(", bottomSpacer=");
        return s.j(sb2, this.f296449b, ')');
    }
}
