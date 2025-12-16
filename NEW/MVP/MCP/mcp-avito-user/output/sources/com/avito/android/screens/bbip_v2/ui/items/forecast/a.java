package com.avito.android.screens.bbip_v2.ui.items.forecast;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BbipV2ForecastItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_v2/ui/items/forecast/a;", "Lcom/avito/conveyor_item/a;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f261657b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f261658c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f261659d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f261660e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f261661f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f261662g;

    public a(@k String str, @k String str2, @l String str3, @k String str4, @l String str5, @l String str6) {
        this.f261657b = str;
        this.f261658c = str2;
        this.f261659d = str3;
        this.f261660e = str4;
        this.f261661f = str5;
        this.f261662g = str6;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f261657b, aVar.f261657b) && L.f(this.f261658c, aVar.f261658c) && L.f(this.f261659d, aVar.f261659d) && L.f(this.f261660e, aVar.f261660e) && L.f(this.f261661f, aVar.f261661f) && L.f(this.f261662g, aVar.f261662g);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF247713b() {
        return getF260390b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF260390b() {
        return this.f261657b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f261657b.hashCode() * 31, 31, this.f261658c);
        String str = this.f261659d;
        int iD3 = H.d((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f261660e);
        String str2 = this.f261661f;
        int iHashCode = (iD3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f261662g;
        return iHashCode + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BbipV2ForecastItem(stringId=");
        sb2.append(this.f261657b);
        sb2.append(", forecastTitle=");
        sb2.append(this.f261658c);
        sb2.append(", forecastValue=");
        sb2.append(this.f261659d);
        sb2.append(", totalBudgetTitle=");
        sb2.append(this.f261660e);
        sb2.append(", totalPrice=");
        sb2.append(this.f261661f);
        sb2.append(", totalBudget=");
        return C22026a.c(sb2, this.f261662g, ')');
    }
}
