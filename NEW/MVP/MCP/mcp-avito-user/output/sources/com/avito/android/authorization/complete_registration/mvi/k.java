package com.avito.android.authorization.complete_registration.mvi;

import com.avito.android.arch.mvi.t;
import com.avito.android.authorization.complete_registration.mvi.entity.CompleteRegistrationInternalAction;
import com.avito.android.authorization.complete_registration.mvi.entity.InputType;
import com.avito.android.component.toast.f;
import ee.b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CompleteRegistrationOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/authorization/complete_registration/mvi/k;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/authorization/complete_registration/mvi/entity/CompleteRegistrationInternalAction;", "Lee/b;", "<init>", "()V", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class k implements t<CompleteRegistrationInternalAction, ee.b> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final ee.b b(CompleteRegistrationInternalAction completeRegistrationInternalAction) {
        ee.b c11095b;
        CompleteRegistrationInternalAction completeRegistrationInternalAction2 = completeRegistrationInternalAction;
        if (completeRegistrationInternalAction2.equals(CompleteRegistrationInternalAction.Completed.f93465b)) {
            return b.a.f395269a;
        }
        if (completeRegistrationInternalAction2 instanceof CompleteRegistrationInternalAction.ShowDialog) {
            c11095b = new b.d(((CompleteRegistrationInternalAction.ShowDialog) completeRegistrationInternalAction2).f93474b);
        } else if (completeRegistrationInternalAction2 instanceof CompleteRegistrationInternalAction.ShowError) {
            f.c.f125255c.getClass();
            c11095b = new b.e(((CompleteRegistrationInternalAction.ShowError) completeRegistrationInternalAction2).f93475b, f.c.a.b());
        } else if (completeRegistrationInternalAction2 instanceof CompleteRegistrationInternalAction.NeedParsingPermission) {
            CompleteRegistrationInternalAction.NeedParsingPermission needParsingPermission = (CompleteRegistrationInternalAction.NeedParsingPermission) completeRegistrationInternalAction2;
            c11095b = new b.c(needParsingPermission.f93469b, needParsingPermission.f93470c, needParsingPermission.f93471d);
        } else {
            if (!(completeRegistrationInternalAction2 instanceof CompleteRegistrationInternalAction.FocusInput)) {
                if (completeRegistrationInternalAction2 instanceof CompleteRegistrationInternalAction.HighlightInputs) {
                    CompleteRegistrationInternalAction.HighlightInputs highlightInputs = (CompleteRegistrationInternalAction.HighlightInputs) completeRegistrationInternalAction2;
                    if (highlightInputs.f93467b != null) {
                        return new b.C11095b(InputType.f93479b);
                    }
                    if (highlightInputs.f93468c != null) {
                        return new b.C11095b(InputType.f93480c);
                    }
                } else {
                    if (!(completeRegistrationInternalAction2 instanceof CompleteRegistrationInternalAction.UpdateName ? true : completeRegistrationInternalAction2 instanceof CompleteRegistrationInternalAction.UpdatePassword ? true : completeRegistrationInternalAction2 instanceof CompleteRegistrationInternalAction.ShowLoading ? true : completeRegistrationInternalAction2.equals(CompleteRegistrationInternalAction.ShowCredman.f93473b) ? true : completeRegistrationInternalAction2 instanceof CompleteRegistrationInternalAction.SaveFocusedInput)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return null;
            }
            c11095b = new b.C11095b(((CompleteRegistrationInternalAction.FocusInput) completeRegistrationInternalAction2).f93466b);
        }
        return c11095b;
    }
}
