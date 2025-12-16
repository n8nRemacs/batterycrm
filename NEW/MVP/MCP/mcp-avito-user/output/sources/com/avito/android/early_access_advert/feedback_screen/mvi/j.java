package com.avito.android.early_access_advert.feedback_screen.mvi;

import Ux.C15581c;
import Ux.C15582d;
import com.avito.android.arch.mvi.u;
import com.avito.android.early_access_advert.feedback_screen.mvi.entity.EarlyAccessAdvertFeedbackInternalAction;
import com.avito.android.remote.model.early_access_advert.EarlyAccessFeedback;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: EarlyAccessAdvertFeedbackReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/early_access_advert/feedback_screen/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/early_access_advert/feedback_screen/mvi/entity/EarlyAccessAdvertFeedbackInternalAction;", "LUx/c;", "<init>", "()V", "_avito_early-access-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j implements u<EarlyAccessAdvertFeedbackInternalAction, C15581c> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C15581c a(EarlyAccessAdvertFeedbackInternalAction earlyAccessAdvertFeedbackInternalAction, C15581c c15581c) {
        String buttonTextWithFeedback;
        String str;
        EarlyAccessAdvertFeedbackInternalAction earlyAccessAdvertFeedbackInternalAction2 = earlyAccessAdvertFeedbackInternalAction;
        C15581c c15581c2 = c15581c;
        if (earlyAccessAdvertFeedbackInternalAction2 instanceof EarlyAccessAdvertFeedbackInternalAction.Content) {
            EarlyAccessAdvertFeedbackInternalAction.Content content = (EarlyAccessAdvertFeedbackInternalAction.Content) earlyAccessAdvertFeedbackInternalAction2;
            EarlyAccessFeedback earlyAccessFeedback = content.f145692d;
            String title = earlyAccessFeedback.getTitle();
            String subtitle = earlyAccessFeedback.getSubtitle();
            String reason = earlyAccessFeedback.getReason();
            String hint = earlyAccessFeedback.getHint();
            String buttonTextWithoutFeedback = earlyAccessFeedback.getButtonTextWithoutFeedback();
            c15581c2.f16794f.getClass();
            return C15581c.a(c15581c2, earlyAccessFeedback, content.f145690b, content.f145691c, null, new C15582d(title, subtitle, reason, hint, null, false, true, buttonTextWithoutFeedback), 8);
        }
        if (!(earlyAccessAdvertFeedbackInternalAction2 instanceof EarlyAccessAdvertFeedbackInternalAction.FeedbackTextUpdated)) {
            return earlyAccessAdvertFeedbackInternalAction2 instanceof EarlyAccessAdvertFeedbackInternalAction.ButtonVisibilityChanged ? C15581c.a(c15581c2, null, null, null, null, C15582d.a(c15581c2.f16794f, null, null, false, ((EarlyAccessAdvertFeedbackInternalAction.ButtonVisibilityChanged) earlyAccessAdvertFeedbackInternalAction2).f145688b, 127), 15) : earlyAccessAdvertFeedbackInternalAction2 instanceof EarlyAccessAdvertFeedbackInternalAction.SendFeedbackError ? C15581c.a(c15581c2, null, null, null, null, C15582d.a(c15581c2.f16794f, null, null, false, false, 191), 15) : earlyAccessAdvertFeedbackInternalAction2 instanceof EarlyAccessAdvertFeedbackInternalAction.SendFeedbackLoading ? C15581c.a(c15581c2, null, null, null, null, C15582d.a(c15581c2.f16794f, null, null, true, false, 191), 15) : c15581c2;
        }
        String str2 = ((EarlyAccessAdvertFeedbackInternalAction.FeedbackTextUpdated) earlyAccessAdvertFeedbackInternalAction2).f145693b;
        boolean zK2 = C43066x.K(str2);
        EarlyAccessFeedback earlyAccessFeedback2 = c15581c2.f16790b;
        if (zK2) {
            if (earlyAccessFeedback2 != null) {
                buttonTextWithFeedback = earlyAccessFeedback2.getButtonTextWithoutFeedback();
                str = buttonTextWithFeedback;
            }
            str = null;
        } else {
            if (earlyAccessFeedback2 != null) {
                buttonTextWithFeedback = earlyAccessFeedback2.getButtonTextWithFeedback();
                str = buttonTextWithFeedback;
            }
            str = null;
        }
        return C15581c.a(c15581c2, null, null, null, str2, C15582d.a(c15581c2.f16794f, str2, str, false, false, 207), 7);
    }
}
