package com.avito.android.advert_core.discount.item.dotted_discount;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.advert_core.discount.item.AdvertDiscountItem;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DottedDiscountItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/discount/item/dotted_discount/a;", "Lcom/avito/conveyor_item/a;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f83387b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f83388c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f83389d;

    public a(String str, String str2, String str3, int i12, C42822w c42822w) {
        if ((i12 & 1) != 0) {
            AdvertDiscountItem[] advertDiscountItemArr = AdvertDiscountItem.f83348b;
            str = String.valueOf(2);
        }
        this.f83387b = str;
        this.f83388c = str2;
        this.f83389d = str3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f83387b, aVar.f83387b) && L.f(this.f83388c, aVar.f83388c) && L.f(this.f83389d, aVar.f83389d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF270893b() {
        return getF331245g().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF331245g() {
        return this.f83387b;
    }

    public final int hashCode() {
        return this.f83389d.hashCode() + H.d(this.f83387b.hashCode() * 31, 31, this.f83388c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DottedDiscountItem(stringId=");
        sb2.append(this.f83387b);
        sb2.append(", title=");
        sb2.append(this.f83388c);
        sb2.append(", value=");
        return C22026a.c(sb2, this.f83389d, ')');
    }
}
