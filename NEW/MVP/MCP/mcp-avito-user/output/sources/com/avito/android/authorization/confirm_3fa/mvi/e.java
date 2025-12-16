package com.avito.android.authorization.confirm_3fa.mvi;

import com.avito.android.arch.mvi.t;
import com.avito.android.authorization.confirm_3fa.mvi.entity.ConfirmEmailListInternalAction;
import ge.InterfaceC40666b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ConfirmEmailListEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/authorization/confirm_3fa/mvi/e;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/authorization/confirm_3fa/mvi/entity/ConfirmEmailListInternalAction;", "Lge/b;", "<init>", "()V", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements t<ConfirmEmailListInternalAction, InterfaceC40666b> {
    @Inject
    public e() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC40666b b(ConfirmEmailListInternalAction confirmEmailListInternalAction) {
        ConfirmEmailListInternalAction confirmEmailListInternalAction2 = confirmEmailListInternalAction;
        if (confirmEmailListInternalAction2 instanceof ConfirmEmailListInternalAction.ShowDialog) {
            return new InterfaceC40666b.C11216b(((ConfirmEmailListInternalAction.ShowDialog) confirmEmailListInternalAction2).f93604b);
        }
        if (confirmEmailListInternalAction2 instanceof ConfirmEmailListInternalAction.FollowLink) {
            return new InterfaceC40666b.a(((ConfirmEmailListInternalAction.FollowLink) confirmEmailListInternalAction2).f93603b);
        }
        if (confirmEmailListInternalAction2 instanceof ConfirmEmailListInternalAction.ShowErrorToast) {
            return new InterfaceC40666b.c(((ConfirmEmailListInternalAction.ShowErrorToast) confirmEmailListInternalAction2).f93605b);
        }
        if (confirmEmailListInternalAction2 instanceof ConfirmEmailListInternalAction.StartLoading) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
