package KF0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.ranges.g;

/* compiled from: TrxPromoGoodsConfigureValueRange.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKF0/a;", "", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final g<Float> f9377a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final AttributedText f9378b;

    public a(@k g<Float> gVar, @l AttributedText attributedText) {
        this.f9377a = gVar;
        this.f9378b = attributedText;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f9377a, aVar.f9377a) && L.f(this.f9378b, aVar.f9378b);
    }

    public final int hashCode() {
        int iHashCode = this.f9377a.hashCode() * 31;
        AttributedText attributedText = this.f9378b;
        return iHashCode + (attributedText == null ? 0 : attributedText.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TrxPromoGoodsConfigureValueRange(range=");
        sb2.append(this.f9377a);
        sb2.append(", description=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f9378b, ')');
    }
}
