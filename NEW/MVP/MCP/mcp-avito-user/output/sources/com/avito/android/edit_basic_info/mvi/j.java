package com.avito.android.edit_basic_info.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.edit_basic_info.mvi.entity.EditBasicInfoInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import ky.InterfaceC43512a;
import ky.InterfaceC43513b;

/* compiled from: EditBasicInfoOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/edit_basic_info/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction;", "Lky/b;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j implements t<EditBasicInfoInternalAction, InterfaceC43513b> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC43513b b(EditBasicInfoInternalAction editBasicInfoInternalAction) {
        EditBasicInfoInternalAction editBasicInfoInternalAction2 = editBasicInfoInternalAction;
        if (editBasicInfoInternalAction2 instanceof EditBasicInfoInternalAction.SavingError) {
            return new InterfaceC43513b.f(((EditBasicInfoInternalAction.SavingError) editBasicInfoInternalAction2).f146160b, InterfaceC43512a.e.f413303a);
        }
        if (editBasicInfoInternalAction2 instanceof EditBasicInfoInternalAction.SubmitSuccess) {
            EditBasicInfoInternalAction.SubmitSuccess submitSuccess = (EditBasicInfoInternalAction.SubmitSuccess) editBasicInfoInternalAction2;
            submitSuccess.getClass();
            return new InterfaceC43513b.C11766b(submitSuccess.f146161b);
        }
        if (editBasicInfoInternalAction2 instanceof EditBasicInfoInternalAction.Close) {
            return InterfaceC43513b.a.f413312a;
        }
        if (editBasicInfoInternalAction2 instanceof EditBasicInfoInternalAction.AvatarUploadSuccess ? true : editBasicInfoInternalAction2 instanceof EditBasicInfoInternalAction.AvatarDeletionSuccess) {
            return new InterfaceC43513b.e();
        }
        if (editBasicInfoInternalAction2 instanceof EditBasicInfoInternalAction.OpenAvatarPicker) {
            return InterfaceC43513b.c.f413314a;
        }
        if (editBasicInfoInternalAction2 instanceof EditBasicInfoInternalAction.AvatarUploadFailure) {
            EditBasicInfoInternalAction.AvatarUploadFailure avatarUploadFailure = (EditBasicInfoInternalAction.AvatarUploadFailure) editBasicInfoInternalAction2;
            return new InterfaceC43513b.f(avatarUploadFailure.f146135b, new InterfaceC43512a.C11765a(avatarUploadFailure.f146136c));
        }
        if (editBasicInfoInternalAction2 instanceof EditBasicInfoInternalAction.AvatarDeletionFailure) {
            return new InterfaceC43513b.f(((EditBasicInfoInternalAction.AvatarDeletionFailure) editBasicInfoInternalAction2).f146131b, InterfaceC43512a.c.f413301a);
        }
        if (editBasicInfoInternalAction2 instanceof EditBasicInfoInternalAction.OpenSellerTypeEditor) {
            ky.d dVar = ((EditBasicInfoInternalAction.OpenSellerTypeEditor) editBasicInfoInternalAction2).f146158b;
            return new InterfaceC43513b.d(dVar.f413340b, dVar.f413341c);
        }
        if (editBasicInfoInternalAction2 instanceof EditBasicInfoInternalAction.IncorrectValuesError ? true : editBasicInfoInternalAction2 instanceof EditBasicInfoInternalAction.Loading ? true : editBasicInfoInternalAction2 instanceof EditBasicInfoInternalAction.NameInputText ? true : editBasicInfoInternalAction2 instanceof EditBasicInfoInternalAction.InitState ? true : editBasicInfoInternalAction2 instanceof EditBasicInfoInternalAction.OpenAvatarMenu ? true : editBasicInfoInternalAction2 instanceof EditBasicInfoInternalAction.AvatarDeletionStarted ? true : editBasicInfoInternalAction2 instanceof EditBasicInfoInternalAction.AvatarUploadCancel ? true : editBasicInfoInternalAction2 instanceof EditBasicInfoInternalAction.AvatarUploadStarted ? true : editBasicInfoInternalAction2 instanceof EditBasicInfoInternalAction.CloseActionsBottomMenu ? true : editBasicInfoInternalAction2 instanceof EditBasicInfoInternalAction.OnSpecificUpdated ? true : editBasicInfoInternalAction2 instanceof EditBasicInfoInternalAction.OnVerticalAndSpecificUpdated ? true : editBasicInfoInternalAction2 instanceof EditBasicInfoInternalAction.OnSellerTypeChanged ? true : editBasicInfoInternalAction2 instanceof EditBasicInfoInternalAction.PersonalLinkInputText) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
