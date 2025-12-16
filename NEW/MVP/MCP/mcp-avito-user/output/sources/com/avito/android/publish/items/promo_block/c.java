package com.avito.android.publish.items.promo_block;

import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PromoBlockRedesignedItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/items/promo_block/c;", "Lcom/avito/android/publish/items/promo_block/i;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c implements i {
    @Inject
    public c() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        j jVar = (j) eVar;
        PromoBlockRedesignedItem promoBlockRedesignedItem = (PromoBlockRedesignedItem) aVar;
        jVar.b(promoBlockRedesignedItem.f237062c);
        jVar.x3(promoBlockRedesignedItem.f237063d);
        jVar.X4(promoBlockRedesignedItem.f237064e);
        if (promoBlockRedesignedItem.f237065f) {
            jVar.F5();
        } else {
            jVar.cF();
        }
    }
}
