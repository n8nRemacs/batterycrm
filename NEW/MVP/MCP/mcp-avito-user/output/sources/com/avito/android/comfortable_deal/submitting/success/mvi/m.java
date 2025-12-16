package com.avito.android.comfortable_deal.submitting.success.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.comfortable_deal.submitting.success.mvi.entity.SubmittingSuccessInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import rq.C47710c;

/* compiled from: SubmittingSuccessReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/success/mvi/m;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/comfortable_deal/submitting/success/mvi/entity/SubmittingSuccessInternalAction;", "Lrq/c;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class m implements u<SubmittingSuccessInternalAction, C47710c> {
    @Inject
    public m() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C47710c a(SubmittingSuccessInternalAction submittingSuccessInternalAction, C47710c c47710c) {
        SubmittingSuccessInternalAction submittingSuccessInternalAction2 = submittingSuccessInternalAction;
        C47710c c47710c2 = c47710c;
        if (!(submittingSuccessInternalAction2 instanceof SubmittingSuccessInternalAction.ContentLoaded)) {
            return c47710c2;
        }
        rp.i iVar = ((SubmittingSuccessInternalAction.ContentLoaded) submittingSuccessInternalAction2).f123421b;
        String str = iVar.f430223b;
        return new C47710c(iVar.f430225d, iVar.f430222a, str, iVar.f430224c, iVar.f430226e, iVar.f430227f);
    }
}
