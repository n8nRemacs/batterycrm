package com.avito.android.loyalty.ui.quality_service_gray.items.info_card_item;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InfoCardItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service_gray/items/info_card_item/a;", "Lcom/avito/conveyor_item/a;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f184080b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f184081c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f184082d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final UniversalImage f184083e;

    public a(@l AttributedText attributedText, @l UniversalImage universalImage, @k String str, @l String str2) {
        this.f184080b = str;
        this.f184081c = str2;
        this.f184082d = attributedText;
        this.f184083e = universalImage;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f184080b, aVar.f184080b) && L.f(this.f184081c, aVar.f184081c) && L.f(this.f184082d, aVar.f184082d) && L.f(this.f184083e, aVar.f184083e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83467b() {
        return getF81752b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF81752b() {
        return this.f184080b;
    }

    public final int hashCode() {
        int iHashCode = this.f184080b.hashCode() * 31;
        String str = this.f184081c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        AttributedText attributedText = this.f184082d;
        int iHashCode3 = (iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        UniversalImage universalImage = this.f184083e;
        return iHashCode3 + (universalImage != null ? universalImage.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InfoCardItem(stringId=");
        sb2.append(this.f184080b);
        sb2.append(", title=");
        sb2.append(this.f184081c);
        sb2.append(", description=");
        sb2.append(this.f184082d);
        sb2.append(", image=");
        return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.f184083e, ')');
    }
}
