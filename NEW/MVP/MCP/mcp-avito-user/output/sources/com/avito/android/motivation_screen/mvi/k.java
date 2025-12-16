package com.avito.android.motivation_screen.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.motivation_screen.models.MotivationInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import v20.AbstractC49151b;

/* compiled from: MotivationOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/motivation_screen/mvi/k;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/motivation_screen/models/MotivationInternalAction;", "Lv20/b;", "<init>", "()V", "_avito_gig_motivation-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class k implements t<MotivationInternalAction, AbstractC49151b> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final AbstractC49151b b(MotivationInternalAction motivationInternalAction) {
        MotivationInternalAction motivationInternalAction2 = motivationInternalAction;
        if (motivationInternalAction2 instanceof MotivationInternalAction.a) {
            return AbstractC49151b.a.f440403a;
        }
        if (motivationInternalAction2 instanceof MotivationInternalAction.ContentLoaded ? true : motivationInternalAction2.equals(MotivationInternalAction.c.f206335a) ? true : motivationInternalAction2.equals(MotivationInternalAction.b.f206334a)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
