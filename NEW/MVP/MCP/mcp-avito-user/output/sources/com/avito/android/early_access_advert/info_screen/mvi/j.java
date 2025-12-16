package com.avito.android.early_access_advert.info_screen.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.early_access_advert.info_screen.mvi.entity.EarlyAccessAdvertInfoInternalAction;
import com.avito.android.remote.model.early_access_advert.EarlyAccessAdvert;
import com.avito.android.remote.model.early_access_advert.EarlyAccessData;
import com.avito.android.remote.model.early_access_advert.EarlyAccessFeature;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: EarlyAccessAdvertInfoReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/early_access_advert/info_screen/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/early_access_advert/info_screen/mvi/entity/EarlyAccessAdvertInfoInternalAction;", "LVx/c;", "<init>", "()V", "_avito_early-access-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j implements u<EarlyAccessAdvertInfoInternalAction, Vx.c> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final Vx.c a(EarlyAccessAdvertInfoInternalAction earlyAccessAdvertInfoInternalAction, Vx.c cVar) {
        EarlyAccessAdvertInfoInternalAction earlyAccessAdvertInfoInternalAction2 = earlyAccessAdvertInfoInternalAction;
        Vx.c cVar2 = cVar;
        if (!(earlyAccessAdvertInfoInternalAction2 instanceof EarlyAccessAdvertInfoInternalAction.Content)) {
            return cVar2;
        }
        EarlyAccessAdvert earlyAccessAdvert = ((EarlyAccessAdvertInfoInternalAction.Content) earlyAccessAdvertInfoInternalAction2).f145740b;
        EarlyAccessData earlyAccessData = earlyAccessAdvert.getEarlyAccessData();
        String title = earlyAccessData != null ? earlyAccessData.getTitle() : null;
        EarlyAccessData earlyAccessData2 = earlyAccessAdvert.getEarlyAccessData();
        List<EarlyAccessFeature> features = earlyAccessData2 != null ? earlyAccessData2.getFeatures() : null;
        EarlyAccessData earlyAccessData3 = earlyAccessAdvert.getEarlyAccessData();
        String agreementButtonText = earlyAccessData3 != null ? earlyAccessData3.getAgreementButtonText() : null;
        EarlyAccessData earlyAccessData4 = earlyAccessAdvert.getEarlyAccessData();
        String disagreementButtonText = earlyAccessData4 != null ? earlyAccessData4.getDisagreementButtonText() : null;
        EarlyAccessData earlyAccessData5 = earlyAccessAdvert.getEarlyAccessData();
        String buttonDisclaimer = earlyAccessData5 != null ? earlyAccessData5.getButtonDisclaimer() : null;
        cVar2.f17523c.getClass();
        return new Vx.c(earlyAccessAdvert, new Vx.d(title, features, agreementButtonText, disagreementButtonText, buttonDisclaimer));
    }
}
