package BO;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ItemPriceHistoryData.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBO/b;", "", "_avito_item-price-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AttributedText f1375a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final AttributedText f1376b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f1377c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f1378d;

    public b(@k AttributedText attributedText, @l AttributedText attributedText2, @k AttributedText attributedText3, @l AttributedText attributedText4) {
        this.f1375a = attributedText;
        this.f1376b = attributedText2;
        this.f1377c = attributedText3;
        this.f1378d = attributedText4;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f1375a, bVar.f1375a) && L.f(this.f1376b, bVar.f1376b) && L.f(this.f1377c, bVar.f1377c) && L.f(this.f1378d, bVar.f1378d);
    }

    public final int hashCode() {
        int iHashCode = this.f1375a.hashCode() * 31;
        AttributedText attributedText = this.f1376b;
        int iB2 = com.avito.android.actions_sheet.a.b((iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.f1377c);
        AttributedText attributedText2 = this.f1378d;
        return iB2 + (attributedText2 != null ? attributedText2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PriceHistoryChange(date=");
        sb2.append(this.f1375a);
        sb2.append(", description=");
        sb2.append(this.f1376b);
        sb2.append(", price=");
        sb2.append(this.f1377c);
        sb2.append(", priceDelta=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f1378d, ')');
    }
}
