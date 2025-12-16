package JO;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.slot.market_price.MarketPriceResponse;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MarketPriceV2Item.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJO/l;", "Lcom/avito/conveyor_item/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class l implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f8954b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f8955c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final AttributedText f8956d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final MarketPriceResponse.PriceRangeV2 f8957e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Long f8958f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Long f8959g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f8960h;

    public l(@Y61.k String str, @Y61.l String str2, @Y61.l AttributedText attributedText, @Y61.k MarketPriceResponse.PriceRangeV2 priceRangeV2, @Y61.l Long l12, @Y61.l Long l13, @Y61.l String str3) {
        this.f8954b = str;
        this.f8955c = str2;
        this.f8956d = attributedText;
        this.f8957e = priceRangeV2;
        this.f8958f = l12;
        this.f8959g = l13;
        this.f8960h = str3;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return L.f(this.f8954b, lVar.f8954b) && L.f(this.f8955c, lVar.f8955c) && L.f(this.f8956d, lVar.f8956d) && L.f(this.f8957e, lVar.f8957e) && L.f(this.f8958f, lVar.f8958f) && L.f(this.f8959g, lVar.f8959g) && L.f(this.f8960h, lVar.f8960h);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF82706b() {
        return getF223261b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF223261b() {
        return this.f8954b;
    }

    public final int hashCode() {
        int iHashCode = this.f8954b.hashCode() * 31;
        String str = this.f8955c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        AttributedText attributedText = this.f8956d;
        int iHashCode3 = (this.f8957e.hashCode() + ((iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31)) * 31;
        Long l12 = this.f8958f;
        int iHashCode4 = (iHashCode3 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.f8959g;
        int iHashCode5 = (iHashCode4 + (l13 == null ? 0 : l13.hashCode())) * 31;
        String str2 = this.f8960h;
        return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MarketPriceV2Item(stringId=");
        sb2.append(this.f8954b);
        sb2.append(", itemId=");
        sb2.append(this.f8955c);
        sb2.append(", priceDetails=");
        sb2.append(this.f8956d);
        sb2.append(", priceRange=");
        sb2.append(this.f8957e);
        sb2.append(", marketPrice=");
        sb2.append(this.f8958f);
        sb2.append(", userPrice=");
        sb2.append(this.f8959g);
        sb2.append(", commentDescription=");
        return C22026a.c(sb2, this.f8960h, ')');
    }
}
