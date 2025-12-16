package com.avito.android.comfortable_deal.submitting.promo.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.comfortable_deal.submitting.promo.mvi.entity.ButtonState;
import com.avito.android.comfortable_deal.submitting.promo.mvi.entity.HeaderState;
import com.avito.android.comfortable_deal.submitting.promo.mvi.entity.InputState;
import com.avito.android.comfortable_deal.submitting.promo.mvi.entity.PromoInternalAction;
import com.avito.android.comfortable_deal.submitting.promo.mvi.entity.PromoState;
import com.avito.android.comfortable_deal.submitting.recycler.items.NumeratedBulletItem.NumeratedBulletItem;
import com.avito.android.comfortable_deal.submitting.recycler.items.imageBulletItem.ImageBulletItem;
import com.avito.android.comfortable_deal.submitting.recycler.items.titleBulletItem.TitleItem;
import com.avito.android.util.C5;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import rp.C47700c;
import rp.C47701d;
import rp.C47703f;
import rp.C47704g;

/* compiled from: PromoReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/promo/mvi/n;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/comfortable_deal/submitting/promo/mvi/entity/PromoInternalAction;", "Lcom/avito/android/comfortable_deal/submitting/promo/mvi/entity/PromoState;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class n implements u<PromoInternalAction, PromoState> {
    @Inject
    public n() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final PromoState a(PromoInternalAction promoInternalAction, PromoState promoState) {
        com.avito.conveyor_item.a titleItem;
        PromoInternalAction promoInternalAction2 = promoInternalAction;
        PromoState promoState2 = promoState;
        if (!(promoInternalAction2 instanceof PromoInternalAction.ContentLoaded)) {
            if (!(promoInternalAction2 instanceof PromoInternalAction.PhoneInputChanged)) {
                if (promoInternalAction2.equals(PromoInternalAction.Loading.f123182b)) {
                    return PromoState.a(promoState2, null, ButtonState.a(promoState2.f123190e, false, true, 4), 23);
                }
                return promoInternalAction2 instanceof PromoInternalAction.Success ? true : promoInternalAction2 instanceof PromoInternalAction.Error ? PromoState.a(promoState2, null, ButtonState.a(promoState2.f123190e, true, false, 4), 23) : promoState2;
            }
            PromoInternalAction.PhoneInputChanged phoneInputChanged = (PromoInternalAction.PhoneInputChanged) promoInternalAction2;
            boolean zE2 = C5.f318568b.e(phoneInputChanged.f123184b);
            InputState inputState = promoState2.f123189d;
            return PromoState.a(promoState2, new InputState(inputState.f123174b, inputState.f123175c, phoneInputChanged.f123184b, inputState.f123177e, inputState.f123178f, !zE2), ButtonState.a(promoState2.f123190e, zE2, false, 6), 19);
        }
        C47704g c47704g = ((PromoInternalAction.ContentLoaded) promoInternalAction2).f123180b;
        C47700c c47700c = c47704g.f430214b;
        HeaderState headerState = new HeaderState(c47700c.f430196a, c47700c.f430197b, c47700c.f430198c);
        C47703f c47703f = c47704g.f430215c;
        InputState inputState2 = new InputState(c47703f.f430209a, c47703f.f430210b, "", c47703f.f430211c, c47703f.f430212d, false);
        List<C47701d> list = c47704g.f430217e;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (C47701d c47701d : list) {
            int iOrdinal = c47701d.f430199a.ordinal();
            String str = c47701d.f430200b;
            if (iOrdinal == 0) {
                titleItem = new TitleItem("titleItem", str);
            } else if (iOrdinal == 1) {
                titleItem = new NumeratedBulletItem("numeratedBulletItem", c47701d.f430202d, str);
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                titleItem = new ImageBulletItem("imageBulletItem", c47701d.f430201c, str);
            }
            arrayList.add(titleItem);
        }
        return new PromoState(c47704g.f430213a, headerState, inputState2, new ButtonState(false, false, c47704g.f430216d), arrayList);
    }
}
