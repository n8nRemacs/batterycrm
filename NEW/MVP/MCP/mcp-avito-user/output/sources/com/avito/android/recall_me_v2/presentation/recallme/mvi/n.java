package com.avito.android.recall_me_v2.presentation.recallme.mvi;

import Di0.InterfaceC13404b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.recall_me_v2.presentation.recallme.mvi.entity.RecallMeInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: RecallMeOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/recall_me_v2/presentation/recallme/mvi/n;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/recall_me_v2/presentation/recallme/mvi/entity/RecallMeInternalAction;", "LDi0/b;", "<init>", "()V", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class n implements t<RecallMeInternalAction, InterfaceC13404b> {
    @Inject
    public n() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC13404b b(RecallMeInternalAction recallMeInternalAction) {
        RecallMeInternalAction recallMeInternalAction2 = recallMeInternalAction;
        if (recallMeInternalAction2 instanceof RecallMeInternalAction.OnCloseButtonClicked) {
            return new InterfaceC13404b.a(null, null);
        }
        if (recallMeInternalAction2 instanceof RecallMeInternalAction.OnRequestSaved) {
            RecallMeInternalAction.OnRequestSaved onRequestSaved = (RecallMeInternalAction.OnRequestSaved) recallMeInternalAction2;
            return new InterfaceC13404b.a(onRequestSaved.f252156b, onRequestSaved.f252157c);
        }
        if (recallMeInternalAction2 instanceof RecallMeInternalAction.OnError) {
            return new InterfaceC13404b.C0187b(((RecallMeInternalAction.OnError) recallMeInternalAction2).f252143b);
        }
        return null;
    }
}
