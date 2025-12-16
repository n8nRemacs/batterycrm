package com.avito.android.recall_me_v2.presentation.recallme.mvi;

import Di0.AbstractC13405c;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.recall_me_v2.presentation.recallme.mvi.entity.RecallMeInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: RecallMeReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/recall_me_v2/presentation/recallme/mvi/p;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/recall_me_v2/presentation/recallme/mvi/entity/RecallMeInternalAction;", "LDi0/c;", "<init>", "()V", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class p implements u<RecallMeInternalAction, AbstractC13405c> {
    @Inject
    public p() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final AbstractC13405c a(RecallMeInternalAction recallMeInternalAction, AbstractC13405c abstractC13405c) {
        AbstractC13405c c0188c;
        RecallMeInternalAction recallMeInternalAction2 = recallMeInternalAction;
        AbstractC13405c abstractC13405c2 = abstractC13405c;
        if (recallMeInternalAction2 instanceof RecallMeInternalAction.OnInitStart) {
            c0188c = new AbstractC13405c.b(abstractC13405c2.getF3411b());
        } else {
            if (!(recallMeInternalAction2 instanceof RecallMeInternalAction.OnInitError)) {
                if (recallMeInternalAction2 instanceof RecallMeInternalAction.OnInitFinished) {
                    RecallMeInternalAction.OnInitFinished onInitFinished = (RecallMeInternalAction.OnInitFinished) recallMeInternalAction2;
                    return new AbstractC13405c.a(abstractC13405c2.getF3411b(), false, onInitFinished.f252145b, onInitFinished.f252146c, onInitFinished.f252147d, false, onInitFinished.f252148e, false, onInitFinished.f252149f, onInitFinished.f252150g);
                }
                if (recallMeInternalAction2 instanceof RecallMeInternalAction.OnCloseButtonClicked) {
                    return abstractC13405c2;
                }
                if (recallMeInternalAction2 instanceof RecallMeInternalAction.OnLoadingChanged) {
                    AbstractC13405c.a aVar = (AbstractC13405c.a) (abstractC13405c2 instanceof AbstractC13405c.a ? abstractC13405c2 : null);
                    return aVar != null ? AbstractC13405c.a.d(aVar, ((RecallMeInternalAction.OnLoadingChanged) recallMeInternalAction2).f252151b, null, null, false, 1021) : abstractC13405c2;
                }
                if (recallMeInternalAction2 instanceof RecallMeInternalAction.OnNameInputChanged) {
                    AbstractC13405c.a aVar2 = (AbstractC13405c.a) (abstractC13405c2 instanceof AbstractC13405c.a ? abstractC13405c2 : null);
                    return aVar2 != null ? AbstractC13405c.a.d(aVar2, false, ((RecallMeInternalAction.OnNameInputChanged) recallMeInternalAction2).f252152b, null, false, 975) : abstractC13405c2;
                }
                if (recallMeInternalAction2.equals(RecallMeInternalAction.OnNameInputResetClicked.f252153b)) {
                    AbstractC13405c.a aVar3 = (AbstractC13405c.a) (abstractC13405c2 instanceof AbstractC13405c.a ? abstractC13405c2 : null);
                    return aVar3 != null ? AbstractC13405c.a.d(aVar3, false, "", null, false, 975) : abstractC13405c2;
                }
                if (recallMeInternalAction2 instanceof RecallMeInternalAction.OnPhoneInputChanged) {
                    AbstractC13405c.a aVar4 = (AbstractC13405c.a) (abstractC13405c2 instanceof AbstractC13405c.a ? abstractC13405c2 : null);
                    return aVar4 != null ? AbstractC13405c.a.d(aVar4, false, null, ((RecallMeInternalAction.OnPhoneInputChanged) recallMeInternalAction2).f252154b, false, 831) : abstractC13405c2;
                }
                if (recallMeInternalAction2.equals(RecallMeInternalAction.OnPhoneInputResetClicked.f252155b)) {
                    AbstractC13405c.a aVar5 = (AbstractC13405c.a) (abstractC13405c2 instanceof AbstractC13405c.a ? abstractC13405c2 : null);
                    return aVar5 != null ? AbstractC13405c.a.d(aVar5, false, null, "", false, 831) : abstractC13405c2;
                }
                if (!(recallMeInternalAction2 instanceof RecallMeInternalAction.OnPhoneInputErrorChanged)) {
                    if ((recallMeInternalAction2 instanceof RecallMeInternalAction.OnError) || (recallMeInternalAction2 instanceof RecallMeInternalAction.OnRequestSaved)) {
                        return abstractC13405c2;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                AbstractC13405c.a aVar6 = (AbstractC13405c.a) (abstractC13405c2 instanceof AbstractC13405c.a ? abstractC13405c2 : null);
                if (aVar6 == null) {
                    return abstractC13405c2;
                }
                return AbstractC13405c.a.d(aVar6, false, null, null, true, 895);
            }
            c0188c = new AbstractC13405c.C0188c(abstractC13405c2.getF3411b());
        }
        return c0188c;
    }
}
