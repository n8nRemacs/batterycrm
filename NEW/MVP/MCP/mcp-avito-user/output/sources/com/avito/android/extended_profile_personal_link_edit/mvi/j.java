package com.avito.android.extended_profile_personal_link_edit.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.extended_profile_personal_link_edit.PersonalLinkEditConfig;
import com.avito.android.extended_profile_personal_link_edit.mvi.entity.PersonalLinkEditInternalAction;
import com.avito.android.extended_profile_personal_link_edit.mvi.entity.PersonalLinkEditState;
import com.avito.android.printable_text.PrintableText;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PersonalLinkEditReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_personal_link_edit/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/extended_profile_personal_link_edit/mvi/entity/PersonalLinkEditInternalAction;", "Lcom/avito/android/extended_profile_personal_link_edit/mvi/entity/PersonalLinkEditState;", "_avito_extended-profile-personal-link-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j implements u<PersonalLinkEditInternalAction, PersonalLinkEditState> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final PersonalLinkEditConfig f151548b;

    @Inject
    public j(@Y61.k PersonalLinkEditConfig personalLinkEditConfig) {
        this.f151548b = personalLinkEditConfig;
    }

    @Override // com.avito.android.arch.mvi.u
    public final PersonalLinkEditState a(PersonalLinkEditInternalAction personalLinkEditInternalAction, PersonalLinkEditState personalLinkEditState) {
        PersonalLinkEditInternalAction personalLinkEditInternalAction2 = personalLinkEditInternalAction;
        PersonalLinkEditState personalLinkEditState2 = personalLinkEditState;
        boolean z12 = personalLinkEditInternalAction2 instanceof PersonalLinkEditInternalAction.InitState;
        PersonalLinkEditConfig personalLinkEditConfig = this.f151548b;
        if (z12) {
            String str = personalLinkEditConfig.f151437f;
            if (str == null) {
                str = "";
            }
            PrintableText printableTextF = com.avito.android.printable_text.b.f(str);
            PersonalLinkEditState.InputState inputState = PersonalLinkEditState.InputState.f151538b;
            String str2 = personalLinkEditConfig.f151436e;
            return new PersonalLinkEditState(false, str2 != null ? str2 : "", inputState, printableTextF);
        }
        if (personalLinkEditInternalAction2 instanceof PersonalLinkEditInternalAction.FailSave) {
            return PersonalLinkEditState.a(personalLinkEditState2, false, null, PersonalLinkEditState.InputState.f151539c, ((PersonalLinkEditInternalAction.FailSave) personalLinkEditInternalAction2).f151526b, 2);
        }
        if (personalLinkEditInternalAction2 instanceof PersonalLinkEditInternalAction.OnTyped) {
            PersonalLinkEditInternalAction.OnTyped onTyped = (PersonalLinkEditInternalAction.OnTyped) personalLinkEditInternalAction2;
            PersonalLinkEditState.InputState inputState2 = PersonalLinkEditState.InputState.f151538b;
            String str3 = personalLinkEditConfig.f151437f;
            return PersonalLinkEditState.a(personalLinkEditState2, false, onTyped.f151529b, inputState2, com.avito.android.printable_text.b.f(str3 != null ? str3 : ""), 1);
        }
        if (personalLinkEditInternalAction2 instanceof PersonalLinkEditInternalAction.Saving) {
            return PersonalLinkEditState.a(personalLinkEditState2, true, null, null, null, 14);
        }
        if (personalLinkEditInternalAction2 instanceof PersonalLinkEditInternalAction.SuccessfulSave) {
            return PersonalLinkEditState.a(personalLinkEditState2, false, null, null, null, 14);
        }
        if (personalLinkEditInternalAction2 instanceof PersonalLinkEditInternalAction.CloseScreen) {
            return personalLinkEditState2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
