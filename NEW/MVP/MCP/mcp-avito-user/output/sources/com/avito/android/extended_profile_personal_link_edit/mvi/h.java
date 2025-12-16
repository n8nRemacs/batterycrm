package com.avito.android.extended_profile_personal_link_edit.mvi;

import DA.b;
import com.avito.android.arch.mvi.t;
import com.avito.android.extended_profile_personal_link_edit.mvi.entity.PersonalLinkEditInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PersonalLinkEditOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/extended_profile_personal_link_edit/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/extended_profile_personal_link_edit/mvi/entity/PersonalLinkEditInternalAction;", "LDA/b;", "<init>", "()V", "_avito_extended-profile-personal-link-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h implements t<PersonalLinkEditInternalAction, DA.b> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final DA.b b(PersonalLinkEditInternalAction personalLinkEditInternalAction) {
        PersonalLinkEditInternalAction personalLinkEditInternalAction2 = personalLinkEditInternalAction;
        if (personalLinkEditInternalAction2 instanceof PersonalLinkEditInternalAction.CloseScreen) {
            return new b.a(((PersonalLinkEditInternalAction.CloseScreen) personalLinkEditInternalAction2).f151525b);
        }
        if (personalLinkEditInternalAction2 instanceof PersonalLinkEditInternalAction.SuccessfulSave) {
            return new b.a(true);
        }
        if (personalLinkEditInternalAction2 instanceof PersonalLinkEditInternalAction.FailSave) {
            Throwable th2 = ((PersonalLinkEditInternalAction.FailSave) personalLinkEditInternalAction2).f151527c;
            if (th2 != null) {
                return new b.C0156b(th2);
            }
        } else {
            if (!(personalLinkEditInternalAction2 instanceof PersonalLinkEditInternalAction.InitState ? true : personalLinkEditInternalAction2 instanceof PersonalLinkEditInternalAction.OnTyped ? true : personalLinkEditInternalAction2 instanceof PersonalLinkEditInternalAction.Saving)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return null;
    }
}
