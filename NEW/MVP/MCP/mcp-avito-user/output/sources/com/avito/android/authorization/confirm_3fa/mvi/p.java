package com.avito.android.authorization.confirm_3fa.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.authorization.confirm_3fa.mvi.entity.ConfirmEmailListInternalAction;
import ge.C40667c;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ConfirmEmailListReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/authorization/confirm_3fa/mvi/p;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/authorization/confirm_3fa/mvi/entity/ConfirmEmailListInternalAction;", "Lge/c;", "<init>", "()V", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class p implements u<ConfirmEmailListInternalAction, C40667c> {
    @Inject
    public p() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C40667c a(ConfirmEmailListInternalAction confirmEmailListInternalAction, C40667c c40667c) {
        ConfirmEmailListInternalAction confirmEmailListInternalAction2 = confirmEmailListInternalAction;
        C40667c c40667c2 = c40667c;
        if (confirmEmailListInternalAction2 instanceof ConfirmEmailListInternalAction.ShowDialog ? true : confirmEmailListInternalAction2 instanceof ConfirmEmailListInternalAction.FollowLink ? true : confirmEmailListInternalAction2 instanceof ConfirmEmailListInternalAction.ShowErrorToast) {
            return new C40667c(c40667c2.f396650b, false);
        }
        if (confirmEmailListInternalAction2 instanceof ConfirmEmailListInternalAction.StartLoading) {
            return new C40667c(c40667c2.f396650b, true);
        }
        throw new NoWhenBranchMatchedException();
    }
}
