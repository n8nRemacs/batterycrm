package com.avito.android.tariff.cpa.configure_advance.items.advance_info;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvanceInfoItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpa/configure_advance/items/advance_info/a;", "Lcom/avito/conveyor_item/a;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f294319b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f294320c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f294321d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f294322e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f294323f;

    public a(@k String str, @k String str2, @k String str3, @k String str4, boolean z12) {
        this.f294319b = str;
        this.f294320c = str2;
        this.f294321d = str3;
        this.f294322e = str4;
        this.f294323f = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f294319b, aVar.f294319b) && L.f(this.f294320c, aVar.f294320c) && L.f(this.f294321d, aVar.f294321d) && L.f(this.f294322e, aVar.f294322e) && this.f294323f == aVar.f294323f;
    }

    @Override // TV0.a
    public final long getId() {
        return getF289386b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF289386b() {
        return this.f294319b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f294323f) + H.d(H.d(H.d(this.f294319b.hashCode() * 31, 31, this.f294320c), 31, this.f294321d), 31, this.f294322e);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvanceInfoItem(stringId=");
        sb2.append(this.f294319b);
        sb2.append(", value=");
        sb2.append(this.f294320c);
        sb2.append(", minValueMessage=");
        sb2.append(this.f294321d);
        sb2.append(", placeholder=");
        sb2.append(this.f294322e);
        sb2.append(", isValidValue=");
        return r.x(sb2, this.f294323f, ')');
    }
}
