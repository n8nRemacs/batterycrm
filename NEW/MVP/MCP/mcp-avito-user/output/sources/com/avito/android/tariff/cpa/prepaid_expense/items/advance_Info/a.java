package com.avito.android.tariff.cpa.prepaid_expense.items.advance_Info;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvanceInfoItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpa/prepaid_expense/items/advance_Info/a;", "Lcom/avito/conveyor_item/a;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f295013b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f295014c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f295015d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f295016e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f295017f;

    public a(@k String str, @k String str2, @k String str3, @k String str4, boolean z12) {
        this.f295013b = str;
        this.f295014c = str2;
        this.f295015d = str3;
        this.f295016e = str4;
        this.f295017f = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f295013b, aVar.f295013b) && L.f(this.f295014c, aVar.f295014c) && L.f(this.f295015d, aVar.f295015d) && L.f(this.f295016e, aVar.f295016e) && this.f295017f == aVar.f295017f;
    }

    @Override // TV0.a
    public final long getId() {
        return getF294319b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF294319b() {
        return this.f295013b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f295017f) + H.d(H.d(H.d(this.f295013b.hashCode() * 31, 31, this.f295014c), 31, this.f295015d), 31, this.f295016e);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvanceInfoItem(stringId=");
        sb2.append(this.f295013b);
        sb2.append(", value=");
        sb2.append(this.f295014c);
        sb2.append(", minValueMessage=");
        sb2.append(this.f295015d);
        sb2.append(", placeholder=");
        sb2.append(this.f295016e);
        sb2.append(", isValidValue=");
        return r.x(sb2, this.f295017f, ')');
    }
}
