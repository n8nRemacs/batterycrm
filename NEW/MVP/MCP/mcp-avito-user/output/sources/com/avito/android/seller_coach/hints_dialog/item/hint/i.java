package com.avito.android.seller_coach.hints_dialog.item.hint;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: HintDataItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/seller_coach/hints_dialog/item/hint/i;", "", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class i {

    /* renamed from: a, reason: collision with root package name */
    public final float f267508a;

    /* renamed from: b, reason: collision with root package name */
    public final float f267509b;

    /* renamed from: c, reason: collision with root package name */
    public final float f267510c;

    public i(float f12, float f13, float f14) {
        this.f267508a = f12;
        this.f267509b = f13;
        this.f267510c = f14;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Float.compare(this.f267508a, iVar.f267508a) == 0 && Float.compare(this.f267509b, iVar.f267509b) == 0 && Float.compare(this.f267510c, iVar.f267510c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f267510c) + r.d(this.f267509b, Float.hashCode(this.f267508a) * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HintStats(views=");
        sb2.append(this.f267508a);
        sb2.append(", contacts=");
        sb2.append(this.f267509b);
        sb2.append(", conversion=");
        return r.k(')', this.f267510c, sb2);
    }
}
