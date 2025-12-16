package com.avito.android.imv_goods_advert.mvi;

import aN.b;
import com.avito.android.arch.mvi.t;
import com.avito.android.imv_goods_advert.mvi.entity.ImvGoodsAdvertInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ImvGoodsAdvertOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/imv_goods_advert/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/imv_goods_advert/mvi/entity/ImvGoodsAdvertInternalAction;", "LaN/b;", "<init>", "()V", "_avito_imv-goods-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class j implements t<ImvGoodsAdvertInternalAction, aN.b> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final aN.b b(ImvGoodsAdvertInternalAction imvGoodsAdvertInternalAction) {
        ImvGoodsAdvertInternalAction imvGoodsAdvertInternalAction2 = imvGoodsAdvertInternalAction;
        if (imvGoodsAdvertInternalAction2 instanceof ImvGoodsAdvertInternalAction.OpenGallery) {
            ImvGoodsAdvertInternalAction.OpenGallery openGallery = (ImvGoodsAdvertInternalAction.OpenGallery) imvGoodsAdvertInternalAction2;
            return new b.C1491b(openGallery.f170550b, openGallery.f170551c, openGallery.f170552d);
        }
        if (imvGoodsAdvertInternalAction2 instanceof ImvGoodsAdvertInternalAction.CloseScreen) {
            return b.a.f20881a;
        }
        return null;
    }
}
