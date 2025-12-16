package com.avito.android.authorization.confirm_3fa.mvi;

import com.avito.android.authorization.confirm_3fa.mvi.entity.ConfirmEmailListInternalAction;
import com.avito.android.remote.model.automated_recovery.RecoverThirdFactorConfirmResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;

/* compiled from: ConfirmEmailListInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "result", "Lcom/avito/android/remote/model/automated_recovery/RecoverThirdFactorConfirmResult;", "invoke", "(Lcom/avito/android/remote/model/automated_recovery/RecoverThirdFactorConfirmResult;)Lcom/avito/android/authorization/confirm_3fa/mvi/entity/ConfirmEmailListInternalAction;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class l extends N implements Y41.l<RecoverThirdFactorConfirmResult, ConfirmEmailListInternalAction> {

    /* renamed from: l, reason: collision with root package name */
    public static final l f93621l = new l();

    public l() {
        super(1);
    }

    @Override // Y41.l
    public final ConfirmEmailListInternalAction invoke(RecoverThirdFactorConfirmResult recoverThirdFactorConfirmResult) {
        RecoverThirdFactorConfirmResult recoverThirdFactorConfirmResult2 = recoverThirdFactorConfirmResult;
        if (recoverThirdFactorConfirmResult2 instanceof RecoverThirdFactorConfirmResult.ShowDialog) {
            return new ConfirmEmailListInternalAction.ShowDialog(((RecoverThirdFactorConfirmResult.ShowDialog) recoverThirdFactorConfirmResult2).getUserDialog());
        }
        if (recoverThirdFactorConfirmResult2 instanceof RecoverThirdFactorConfirmResult.FollowLink) {
            return new ConfirmEmailListInternalAction.FollowLink(((RecoverThirdFactorConfirmResult.FollowLink) recoverThirdFactorConfirmResult2).getDeeplink());
        }
        throw new NoWhenBranchMatchedException();
    }
}
