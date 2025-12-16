package com.avito.android.advert_core.discount.item.discount;

import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DiscountItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/advert_core/discount/item/discount/d;", "LTV0/d;", "Lcom/avito/android/advert_core/discount/item/discount/f;", "Lcom/avito/android/advert_core/discount/item/discount/a;", "<init>", "()V", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements TV0.d<f, a> {
    @Inject
    public d() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        a aVar2 = (a) aVar;
        fVar.setTitle(aVar2.f83363c);
        fVar.tX(aVar2.f83364d, aVar2.f83365e, aVar2.f83367g, aVar2.f83368h);
        String str = aVar2.f83366f;
        if (str == null) {
            fVar.B8();
        } else {
            fVar.r2(str);
        }
    }
}
