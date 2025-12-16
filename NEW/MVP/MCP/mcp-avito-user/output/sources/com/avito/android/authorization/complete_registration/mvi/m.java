package com.avito.android.authorization.complete_registration.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.authorization.complete_registration.mvi.entity.CompleteRegistrationInternalAction;
import ee.c;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CompleteRegistrationReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/authorization/complete_registration/mvi/m;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/authorization/complete_registration/mvi/entity/CompleteRegistrationInternalAction;", "Lee/c;", "<init>", "()V", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class m implements u<CompleteRegistrationInternalAction, ee.c> {
    @Inject
    public m() {
    }

    public static ee.c b(ee.c cVar, boolean z12) {
        cVar.f395279b.getClass();
        return ee.c.a(cVar, new c.b(z12, null, null), null, null, null, 30);
    }

    @Override // com.avito.android.arch.mvi.u
    public final ee.c a(CompleteRegistrationInternalAction completeRegistrationInternalAction, ee.c cVar) {
        CompleteRegistrationInternalAction completeRegistrationInternalAction2 = completeRegistrationInternalAction;
        ee.c cVar2 = cVar;
        if (completeRegistrationInternalAction2 instanceof CompleteRegistrationInternalAction.UpdateName) {
            return ee.c.a(cVar2, c.b.a(cVar2.f395279b, false, 5), ((CompleteRegistrationInternalAction.UpdateName) completeRegistrationInternalAction2).f93477b, null, null, 28);
        }
        if (completeRegistrationInternalAction2 instanceof CompleteRegistrationInternalAction.UpdatePassword) {
            return ee.c.a(cVar2, c.b.a(cVar2.f395279b, false, 3), null, ((CompleteRegistrationInternalAction.UpdatePassword) completeRegistrationInternalAction2).f93478b, null, 26);
        }
        if (completeRegistrationInternalAction2 instanceof CompleteRegistrationInternalAction.SaveFocusedInput) {
            return ee.c.a(cVar2, null, null, null, ((CompleteRegistrationInternalAction.SaveFocusedInput) completeRegistrationInternalAction2).f93472b, 15);
        }
        if (completeRegistrationInternalAction2 instanceof CompleteRegistrationInternalAction.NeedParsingPermission ? true : completeRegistrationInternalAction2.equals(CompleteRegistrationInternalAction.ShowCredman.f93473b) ? true : completeRegistrationInternalAction2 instanceof CompleteRegistrationInternalAction.ShowLoading) {
            return b(cVar2, true);
        }
        if (completeRegistrationInternalAction2 instanceof CompleteRegistrationInternalAction.ShowError ? true : completeRegistrationInternalAction2 instanceof CompleteRegistrationInternalAction.ShowDialog) {
            return b(cVar2, false);
        }
        if (completeRegistrationInternalAction2 instanceof CompleteRegistrationInternalAction.HighlightInputs) {
            CompleteRegistrationInternalAction.HighlightInputs highlightInputs = (CompleteRegistrationInternalAction.HighlightInputs) completeRegistrationInternalAction2;
            cVar2.f395279b.getClass();
            return ee.c.a(cVar2, new c.b(false, highlightInputs.f93467b, highlightInputs.f93468c), null, null, null, 30);
        }
        if (completeRegistrationInternalAction2.equals(CompleteRegistrationInternalAction.Completed.f93465b) ? true : completeRegistrationInternalAction2 instanceof CompleteRegistrationInternalAction.FocusInput) {
            return cVar2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
