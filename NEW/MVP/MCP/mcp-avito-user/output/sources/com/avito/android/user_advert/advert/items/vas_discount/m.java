package com.avito.android.user_advert.advert.items.vas_discount;

import com.avito.android.remote.model.Image;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VasDiscountItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/items/vas_discount/m;", "Lcom/avito/android/user_advert/advert/items/vas_discount/l;", "<init>", "()V", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class m implements l {
    @Inject
    public m() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        o oVar = (o) eVar;
        i iVar = (i) aVar;
        oVar.mf(iVar.f310361d);
        oVar.jz(iVar.f310360c);
        Image image = iVar.f310362e;
        oVar.cS(image != null ? com.avito.android.image_loader.b.b(image) : null);
    }
}
