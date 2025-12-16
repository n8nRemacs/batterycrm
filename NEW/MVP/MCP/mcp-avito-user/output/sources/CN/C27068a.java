package cN;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.AdvertPrice;
import com.avito.android.util.C35858o;
import kotlin.Metadata;

/* compiled from: AdvertNormalizedPriceFormatter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LcN/a;", "Lcom/avito/android/util/o;", "_avito_imv-goods-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cN.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C27068a extends C35858o {
    @Override // com.avito.android.util.C35858o
    @l
    public final String c(@k AdvertPrice advertPrice) {
        return advertPrice.getNormalizedValue();
    }

    @Override // com.avito.android.util.C35858o
    @k
    public final String b(@l String str, @k String str2) {
        return str2;
    }
}
