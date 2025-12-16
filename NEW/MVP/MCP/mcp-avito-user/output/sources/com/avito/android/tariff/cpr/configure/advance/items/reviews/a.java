package com.avito.android.tariff.cpr.configure.advance.items.reviews;

import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: CprConfigureAdvanceReviewsItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpr/configure/advance/items/reviews/a;", "Lcom/avito/conveyor_item/a;", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ArrayList f295287b;

    public a(@Y61.k ArrayList arrayList) {
        this.f295287b = arrayList;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        return this.f295287b.equals(aVar.f295287b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207369c() {
        return -238577481;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId */
    public final String getF291445k() {
        return "reviews_item";
    }

    public final int hashCode() {
        return this.f295287b.hashCode() + 1194032681;
    }

    @Y61.k
    public final String toString() {
        return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("CprConfigureAdvanceReviewsItem(stringId=reviews_item, reviews="), this.f295287b, ')');
    }
}
