package com.avito.android.screens.bbip.ui.items.forecast;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ForecastItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip/ui/items/forecast/a;", "Lcom/avito/conveyor_item/a;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f260373b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f260374c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f260375d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f260376e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f260377f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f260378g;

    public a(@k String str, @k String str2, @l String str3, @k String str4, @l String str5, @l String str6) {
        this.f260373b = str;
        this.f260374c = str2;
        this.f260375d = str3;
        this.f260376e = str4;
        this.f260377f = str5;
        this.f260378g = str6;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f260373b, aVar.f260373b) && L.f(this.f260374c, aVar.f260374c) && L.f(this.f260375d, aVar.f260375d) && L.f(this.f260376e, aVar.f260376e) && L.f(this.f260377f, aVar.f260377f) && L.f(this.f260378g, aVar.f260378g);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF247713b() {
        return getF255769b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF255769b() {
        return this.f260373b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f260373b.hashCode() * 31, 31, this.f260374c);
        String str = this.f260375d;
        int iD3 = H.d((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f260376e);
        String str2 = this.f260377f;
        int iHashCode = (iD3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f260378g;
        return iHashCode + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ForecastItem(stringId=");
        sb2.append(this.f260373b);
        sb2.append(", forecastTitle=");
        sb2.append(this.f260374c);
        sb2.append(", forecastValue=");
        sb2.append(this.f260375d);
        sb2.append(", totalBudgetTitle=");
        sb2.append(this.f260376e);
        sb2.append(", totalPrice=");
        sb2.append(this.f260377f);
        sb2.append(", totalBudget=");
        return C22026a.c(sb2, this.f260378g, ')');
    }
}
