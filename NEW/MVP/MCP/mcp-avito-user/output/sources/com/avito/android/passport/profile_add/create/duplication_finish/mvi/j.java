package com.avito.android.passport.profile_add.create.duplication_finish.mvi;

import P50.c;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.passport.profile_add.create.duplication_finish.mvi.entity.BusinessVerificationDuplicationFinishInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: BusinessVerificationDuplicationFinishReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/passport/profile_add/create/duplication_finish/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/passport/profile_add/create/duplication_finish/mvi/entity/BusinessVerificationDuplicationFinishInternalAction;", "LP50/c;", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class j implements u<BusinessVerificationDuplicationFinishInternalAction, P50.c> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final P50.c a(BusinessVerificationDuplicationFinishInternalAction businessVerificationDuplicationFinishInternalAction, P50.c cVar) {
        BusinessVerificationDuplicationFinishInternalAction businessVerificationDuplicationFinishInternalAction2 = businessVerificationDuplicationFinishInternalAction;
        P50.c cVar2 = cVar;
        if (businessVerificationDuplicationFinishInternalAction2 instanceof BusinessVerificationDuplicationFinishInternalAction.Content) {
            return new c.C0834c(((BusinessVerificationDuplicationFinishInternalAction.Content) businessVerificationDuplicationFinishInternalAction2).f211320b);
        }
        if (businessVerificationDuplicationFinishInternalAction2 instanceof BusinessVerificationDuplicationFinishInternalAction.Error) {
            ((BusinessVerificationDuplicationFinishInternalAction.Error) businessVerificationDuplicationFinishInternalAction2).f211321b.getMessage();
            return new c.b(null);
        }
        if (businessVerificationDuplicationFinishInternalAction2 instanceof BusinessVerificationDuplicationFinishInternalAction.Loading) {
            return c.d.f12836d;
        }
        if (businessVerificationDuplicationFinishInternalAction2 instanceof BusinessVerificationDuplicationFinishInternalAction.Close) {
            return cVar2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
