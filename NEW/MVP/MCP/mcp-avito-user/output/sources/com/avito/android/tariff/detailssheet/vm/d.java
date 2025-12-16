package com.avito.android.tariff.detailssheet.vm;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffDetailsSheetModel.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/detailssheet/vm/d;", "", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final AttributedText f297435a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f297436b;

    public d(@Y61.l AttributedText attributedText, @Y61.l String str) {
        this.f297435a = attributedText;
        this.f297436b = str;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f297435a, dVar.f297435a) && L.f(this.f297436b, dVar.f297436b);
    }

    public final int hashCode() {
        AttributedText attributedText = this.f297435a;
        int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
        String str = this.f297436b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TariffDetailsSheetModel(description=");
        sb2.append(this.f297435a);
        sb2.append(", buttonTitle=");
        return C22026a.c(sb2, this.f297436b, ')');
    }
}
