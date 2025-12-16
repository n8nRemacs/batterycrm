package com.avito.android.early_access_advert.info_screen.mvi;

import Vx.b;
import com.avito.android.arch.mvi.t;
import com.avito.android.early_access_advert.info_screen.mvi.entity.EarlyAccessAdvertInfoInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: EarlyAccessAdvertInfoOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/early_access_advert/info_screen/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/early_access_advert/info_screen/mvi/entity/EarlyAccessAdvertInfoInternalAction;", "LVx/b;", "<init>", "()V", "_avito_early-access-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h implements t<EarlyAccessAdvertInfoInternalAction, Vx.b> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final Vx.b b(EarlyAccessAdvertInfoInternalAction earlyAccessAdvertInfoInternalAction) {
        EarlyAccessAdvertInfoInternalAction earlyAccessAdvertInfoInternalAction2 = earlyAccessAdvertInfoInternalAction;
        if (!(earlyAccessAdvertInfoInternalAction2 instanceof EarlyAccessAdvertInfoInternalAction.ShowFeedbackScreen)) {
            return null;
        }
        EarlyAccessAdvertInfoInternalAction.ShowFeedbackScreen showFeedbackScreen = (EarlyAccessAdvertInfoInternalAction.ShowFeedbackScreen) earlyAccessAdvertInfoInternalAction2;
        return new b.a(showFeedbackScreen.f145741b, showFeedbackScreen.f145742c);
    }
}
