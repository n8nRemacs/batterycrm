package com.avito.android.early_access_advert.feedback_screen.mvi;

import Ux.InterfaceC15580b;
import com.avito.android.arch.mvi.t;
import com.avito.android.early_access_advert.feedback_screen.mvi.entity.EarlyAccessAdvertFeedbackInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: EarlyAccessAdvertFeedbackOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/early_access_advert/feedback_screen/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/early_access_advert/feedback_screen/mvi/entity/EarlyAccessAdvertFeedbackInternalAction;", "LUx/b;", "<init>", "()V", "_avito_early-access-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h implements t<EarlyAccessAdvertFeedbackInternalAction, InterfaceC15580b> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC15580b b(EarlyAccessAdvertFeedbackInternalAction earlyAccessAdvertFeedbackInternalAction) {
        EarlyAccessAdvertFeedbackInternalAction earlyAccessAdvertFeedbackInternalAction2 = earlyAccessAdvertFeedbackInternalAction;
        if (earlyAccessAdvertFeedbackInternalAction2 instanceof EarlyAccessAdvertFeedbackInternalAction.CloseScreen) {
            return InterfaceC15580b.a.f16786a;
        }
        if (earlyAccessAdvertFeedbackInternalAction2 instanceof EarlyAccessAdvertFeedbackInternalAction.SendFeedbackError) {
            return new InterfaceC15580b.C1156b(((EarlyAccessAdvertFeedbackInternalAction.SendFeedbackError) earlyAccessAdvertFeedbackInternalAction2).f145694b);
        }
        return null;
    }
}
