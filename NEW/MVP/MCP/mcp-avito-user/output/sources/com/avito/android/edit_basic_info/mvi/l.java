package com.avito.android.edit_basic_info.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.arch.mvi.u;
import com.avito.android.edit_basic_info.model.EditBasicInfoArguments;
import com.avito.android.edit_basic_info.mvi.entity.EditBasicInfoInternalAction;
import com.avito.android.extended_profile_ui_components.ActionsBottomMenuData;
import com.avito.android.profile_management_core.moderation.ModerationStatus;
import com.avito.android.profile_settings_extended.adapter.basic_info_v2.BasicInfoV2Item;
import com.avito.android.remote.model.text.AttributedText;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import ky.InterfaceC43512a;

/* compiled from: EditBasicInfoReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/edit_basic_info/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/edit_basic_info/mvi/entity/EditBasicInfoInternalAction;", "Lky/c;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class l implements u<EditBasicInfoInternalAction, ky.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final EditBasicInfoArguments f146173b;

    @Inject
    public l(@Y61.k EditBasicInfoArguments editBasicInfoArguments) {
        this.f146173b = editBasicInfoArguments;
    }

    @Override // com.avito.android.arch.mvi.u
    public final ky.c a(EditBasicInfoInternalAction editBasicInfoInternalAction, ky.c cVar) {
        EditBasicInfoInternalAction editBasicInfoInternalAction2 = editBasicInfoInternalAction;
        ky.c cVar2 = cVar;
        boolean z12 = editBasicInfoInternalAction2 instanceof EditBasicInfoInternalAction.InitState;
        EditBasicInfoArguments editBasicInfoArguments = this.f146173b;
        if (z12) {
            String str = editBasicInfoArguments.f146101b.f229212h;
            if (str == null) {
                str = "";
            }
            ky.c cVarB = b(cVar2, str);
            BasicInfoV2Item.PersonalLink personalLink = editBasicInfoArguments.f146101b.f229216l;
            String str2 = personalLink != null ? personalLink.f229231b : null;
            return c(cVarB, str2 != null ? str2 : "");
        }
        if (editBasicInfoInternalAction2 instanceof EditBasicInfoInternalAction.NameInputText) {
            return b(cVar2, ((EditBasicInfoInternalAction.NameInputText) editBasicInfoInternalAction2).f146147b);
        }
        if (editBasicInfoInternalAction2 instanceof EditBasicInfoInternalAction.PersonalLinkInputText) {
            return c(cVar2, ((EditBasicInfoInternalAction.PersonalLinkInputText) editBasicInfoInternalAction2).f146159b);
        }
        if (editBasicInfoInternalAction2 instanceof EditBasicInfoInternalAction.Loading) {
            return ky.c.a(cVar2, null, false, null, null, false, null, null, false, null, null, null, null, false, null, null, null, false, true, null, 393215);
        }
        if (editBasicInfoInternalAction2 instanceof EditBasicInfoInternalAction.SavingError) {
            return ky.c.a(cVar2, null, false, null, null, false, null, null, false, null, null, null, null, false, null, null, null, false, false, null, 393215);
        }
        if (editBasicInfoInternalAction2 instanceof EditBasicInfoInternalAction.IncorrectValuesError) {
            EditBasicInfoInternalAction.IncorrectValuesError incorrectValuesError = (EditBasicInfoInternalAction.IncorrectValuesError) editBasicInfoInternalAction2;
            String str3 = incorrectValuesError.f146143b;
            boolean z13 = !(str3 == null || C43066x.K(str3));
            String str4 = incorrectValuesError.f146144c;
            return ky.c.a(cVar2, null, false, null, null, false, null, str3, z13, null, null, null, null, false, null, str4 != null ? new AttributedText(str4, C42784z0.f406748b, 0, 4, null) : null, null, !(str4 == null || C43066x.K(str4)), false, null, 311103);
        }
        if (editBasicInfoInternalAction2 instanceof EditBasicInfoInternalAction.SubmitSuccess ? true : editBasicInfoInternalAction2 instanceof EditBasicInfoInternalAction.OpenSellerTypeEditor ? true : editBasicInfoInternalAction2 instanceof EditBasicInfoInternalAction.Close) {
            return ky.c.a(cVar2, null, false, null, null, false, null, null, false, null, null, null, null, false, null, null, null, false, false, null, 393215);
        }
        if (editBasicInfoInternalAction2 instanceof EditBasicInfoInternalAction.OpenAvatarMenu) {
            ModerationStatus moderationStatus = cVar2.f413322d;
            return ky.c.a(cVar2, null, false, null, null, false, null, null, false, null, null, null, null, false, null, null, null, false, false, new ActionsBottomMenuData(moderationStatus != null ? moderationStatus.getF226770b() : null, moderationStatus != null ? moderationStatus.getF226771c() : null, C42745f0.U(new ActionsBottomMenuData.a(editBasicInfoArguments.f146101b.f229214j.f229225e, null, null, InterfaceC43512a.m.f413311a, R.drawable.ic_action_menu_upload, false, 38, null), new ActionsBottomMenuData.a(editBasicInfoArguments.f146101b.f229214j.f229226f, null, null, InterfaceC43512a.c.f413301a, R.drawable.ic_action_menu_remove, false, 38, null)), null, null, 24, null), 262143);
        }
        if (editBasicInfoInternalAction2 instanceof EditBasicInfoInternalAction.OpenAvatarPicker) {
            return ky.c.a(cVar2, null, false, null, null, false, null, null, false, null, null, null, null, false, null, null, null, false, false, null, 262143);
        }
        if (editBasicInfoInternalAction2 instanceof EditBasicInfoInternalAction.AvatarDeletionStarted) {
            return ky.c.a(cVar2, null, false, null, null, false, null, null, false, null, null, null, null, false, null, null, null, false, false, null, 262143);
        }
        if (editBasicInfoInternalAction2 instanceof EditBasicInfoInternalAction.AvatarDeletionSuccess) {
            return ky.c.a(cVar2, ((EditBasicInfoInternalAction.AvatarDeletionSuccess) editBasicInfoInternalAction2).f146133b, false, null, null, false, null, null, false, null, null, null, null, false, null, null, null, false, false, null, 524264);
        }
        if (editBasicInfoInternalAction2 instanceof EditBasicInfoInternalAction.AvatarDeletionFailure) {
            return ky.c.a(cVar2, null, false, null, null, false, null, null, false, null, null, null, null, false, null, null, null, false, false, null, 524271);
        }
        if (editBasicInfoInternalAction2 instanceof EditBasicInfoInternalAction.AvatarUploadCancel ? true : editBasicInfoInternalAction2 instanceof EditBasicInfoInternalAction.AvatarUploadFailure) {
            return ky.c.a(cVar2, null, false, null, null, false, null, null, false, null, null, null, null, false, null, null, null, false, false, null, 524263);
        }
        if (editBasicInfoInternalAction2 instanceof EditBasicInfoInternalAction.AvatarUploadStarted) {
            return ky.c.a(cVar2, null, false, null, ((EditBasicInfoInternalAction.AvatarUploadStarted) editBasicInfoInternalAction2).f146137b, true, null, null, false, null, null, null, null, false, null, null, null, false, false, null, 524263);
        }
        if (editBasicInfoInternalAction2 instanceof EditBasicInfoInternalAction.AvatarUploadSuccess) {
            EditBasicInfoInternalAction.AvatarUploadSuccess avatarUploadSuccess = (EditBasicInfoInternalAction.AvatarUploadSuccess) editBasicInfoInternalAction2;
            return ky.c.a(cVar2, avatarUploadSuccess.f146138b, true, avatarUploadSuccess.f146140d, null, false, null, null, false, null, null, null, null, false, null, null, null, false, false, null, 524256);
        }
        if (editBasicInfoInternalAction2 instanceof EditBasicInfoInternalAction.CloseActionsBottomMenu) {
            return ky.c.a(cVar2, null, false, null, null, false, null, null, false, null, null, null, null, false, null, null, null, false, false, null, 262143);
        }
        if (editBasicInfoInternalAction2 instanceof EditBasicInfoInternalAction.OnVerticalAndSpecificUpdated) {
            EditBasicInfoInternalAction.OnVerticalAndSpecificUpdated onVerticalAndSpecificUpdated = (EditBasicInfoInternalAction.OnVerticalAndSpecificUpdated) editBasicInfoInternalAction2;
            return ky.c.a(cVar2, null, false, null, null, false, null, null, false, onVerticalAndSpecificUpdated.f146152c, Integer.valueOf(onVerticalAndSpecificUpdated.f146151b), onVerticalAndSpecificUpdated.f146154e, onVerticalAndSpecificUpdated.f146153d, onVerticalAndSpecificUpdated.f146155f && editBasicInfoArguments.f146101b.f229219o.getSpecific() != null, null, null, null, false, false, null, 516351);
        }
        if (editBasicInfoInternalAction2 instanceof EditBasicInfoInternalAction.OnSpecificUpdated) {
            EditBasicInfoInternalAction.OnSpecificUpdated onSpecificUpdated = (EditBasicInfoInternalAction.OnSpecificUpdated) editBasicInfoInternalAction2;
            return ky.c.a(cVar2, null, false, null, null, false, null, null, false, null, null, onSpecificUpdated.f146150c, Integer.valueOf(onSpecificUpdated.f146149b), false, null, null, null, false, false, null, 521215);
        }
        if (editBasicInfoInternalAction2 instanceof EditBasicInfoInternalAction.OnSellerTypeChanged) {
            return ky.c.a(cVar2, null, false, null, null, false, null, null, false, null, null, null, null, false, null, null, ((EditBasicInfoInternalAction.OnSellerTypeChanged) editBasicInfoInternalAction2).f146148b, false, false, null, 491519);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final ky.c b(ky.c cVar, String str) {
        AttributedText f226771c;
        EditBasicInfoArguments editBasicInfoArguments = this.f146173b;
        if (!L.f(str, editBasicInfoArguments.f146101b.f229212h)) {
            return ky.c.a(cVar, null, false, null, null, false, str, null, false, null, null, null, null, false, null, null, null, false, false, null, 524063);
        }
        ModerationStatus moderationStatus = editBasicInfoArguments.f146101b.f229213i;
        String text = null;
        if (moderationStatus == null || (!(moderationStatus instanceof ModerationStatus.ModerationFailed) && !(moderationStatus instanceof ModerationStatus.ModerationPending))) {
            moderationStatus = null;
        }
        String f226770b = moderationStatus != null ? moderationStatus.getF226770b() : null;
        if (moderationStatus != null && (f226771c = moderationStatus.getF226771c()) != null) {
            text = f226771c.getText();
        }
        return ky.c.a(cVar, null, false, null, null, false, str, C42745f0.O(C42756l.B(new String[]{f226770b, text}), ". ", null, null, null, 62), moderationStatus instanceof ModerationStatus.ModerationFailed, null, null, null, null, false, null, null, null, false, false, null, 524063);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ky.c c(ky.c r27, java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.edit_basic_info.mvi.l.c(ky.c, java.lang.String):ky.c");
    }
}
