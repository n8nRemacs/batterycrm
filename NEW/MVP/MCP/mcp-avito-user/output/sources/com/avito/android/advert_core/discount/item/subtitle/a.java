package com.avito.android.advert_core.discount.item.subtitle;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.advert_core.discount.item.AdvertDiscountItem;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SubtitleItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/discount/item/subtitle/a;", "Lcom/avito/conveyor_item/a;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f83411b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f83412c;

    public a(String str, String str2, int i12, C42822w c42822w) {
        if ((i12 & 1) != 0) {
            AdvertDiscountItem[] advertDiscountItemArr = AdvertDiscountItem.f83348b;
            str = String.valueOf(1);
        }
        this.f83411b = str;
        this.f83412c = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f83411b, aVar.f83411b) && L.f(this.f83412c, aVar.f83412c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF72514d() {
        return getF75240b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF75240b() {
        return this.f83411b;
    }

    public final int hashCode() {
        return this.f83412c.hashCode() + (this.f83411b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SubtitleItem(stringId=");
        sb2.append(this.f83411b);
        sb2.append(", subtitle=");
        return C22026a.c(sb2, this.f83412c, ')');
    }
}
