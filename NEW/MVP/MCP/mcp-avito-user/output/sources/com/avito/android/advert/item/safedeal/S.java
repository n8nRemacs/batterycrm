package com.avito.android.advert.item.safedeal;

import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.C31179w;
import io.reactivex.rxjava3.internal.operators.single.C42007e;
import io.reactivex.rxjava3.internal.operators.single.C42026y;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CartItemInteractor.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/safedeal/S;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final V f78763a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C31179w f78764b;

    @Inject
    public S(@Y61.k V v12, @Y61.k C31179w c31179w) {
        this.f78763a = v12;
        this.f78764b = c31179w;
    }

    @Y61.k
    public final C42026y a(@Y61.k String str, @Y61.l Map map) {
        V v12 = this.f78763a;
        v12.getClass();
        return new C42007e(new com.avito.android.advert.deeplinks.delivery.p(v12, str, map, 1)).z(v12.f78774b.a()).n(new P(this));
    }
}
