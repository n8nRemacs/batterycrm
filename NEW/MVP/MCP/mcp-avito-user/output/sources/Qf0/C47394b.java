package qf0;

import com.avito.android.remote.model.category_parameters.slot.market_price.MarketPriceResponse;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import yc.C50213a;

/* compiled from: ItemAddImvShieldShowEvent.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_publish_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: qf0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C47394b {
    public static final LinkedHashMap a(C50213a c50213a, long j12, long j13, MarketPriceResponse.PriceRange priceRange) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(c50213a.a());
        linkedHashMap.put("price", Long.valueOf(j12));
        linkedHashMap.put("market_price", Long.valueOf(j13));
        linkedHashMap.put("min_range", Long.valueOf(priceRange.getMin()));
        linkedHashMap.put("max_range", Long.valueOf(priceRange.getMax()));
        String priceType = priceRange.getPriceType();
        if (priceType != null) {
            linkedHashMap.put("shield_type", priceType);
        }
        return linkedHashMap;
    }
}
