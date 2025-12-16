package com.avito.android.beduin.common.preparer;

import com.avito.android.beduin.common.component.promo_blocks_group.BeduinPromoBlocksGroupModel;
import com.avito.android.beduin_models.BeduinModel;
import ei.InterfaceC40108b;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import qj.InterfaceC47406a;

/* compiled from: PromoBlocksGroupModelPreparer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/preparer/j;", "Lqj/a;", "Lcom/avito/android/beduin/common/component/promo_blocks_group/BeduinPromoBlocksGroupModel;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j implements InterfaceC47406a<BeduinPromoBlocksGroupModel> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40108b f103458a;

    @Inject
    public j(@Y61.k InterfaceC40108b interfaceC40108b) {
        this.f103458a = interfaceC40108b;
    }

    @Override // qj.InterfaceC47406a
    public final BeduinModel a(BeduinModel beduinModel) {
        BeduinPromoBlocksGroupModel beduinPromoBlocksGroupModel = (BeduinPromoBlocksGroupModel) beduinModel;
        List<BeduinModel> internalChildren = beduinPromoBlocksGroupModel.getInternalChildren();
        if (internalChildren == null) {
            internalChildren = C42784z0.f406748b;
        }
        return BeduinPromoBlocksGroupModel.copy$default(beduinPromoBlocksGroupModel, this.f103458a.a(internalChildren), null, null, 6, null);
    }
}
