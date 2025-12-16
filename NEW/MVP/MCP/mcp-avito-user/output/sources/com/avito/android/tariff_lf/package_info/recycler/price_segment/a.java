package com.avito.android.tariff_lf.package_info.recycler.price_segment;

import android.text.SpannableStringBuilder;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffPriceSegmentParameterFormatter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf/package_info/recycler/price_segment/a;", "", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final SpannableStringBuilder f299263a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f299264b;

    public a(@Y61.k SpannableStringBuilder spannableStringBuilder, @Y61.l String str) {
        this.f299263a = spannableStringBuilder;
        this.f299264b = str;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f299263a.equals(aVar.f299263a) && L.f(this.f299264b, aVar.f299264b);
    }

    public final int hashCode() {
        int iHashCode = this.f299263a.hashCode() * 31;
        String str = this.f299264b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PriceSegmentParameter(text=");
        sb2.append((Object) this.f299263a);
        sb2.append(", badge=");
        return C22026a.c(sb2, this.f299264b, ')');
    }
}
