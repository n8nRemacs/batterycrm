package com.avito.android.profile_phones.add_phone.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.profile_phones.add_phone.mvi.entity.AddPhoneInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import nb0.C44373c;

/* compiled from: AddPhoneReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/profile_phones/add_phone/mvi/n;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/profile_phones/add_phone/mvi/entity/AddPhoneInternalAction;", "Lnb0/c;", "<init>", "()V", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class n implements u<AddPhoneInternalAction, C44373c> {
    @Inject
    public n() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C44373c a(AddPhoneInternalAction addPhoneInternalAction, C44373c c44373c) {
        AddPhoneInternalAction addPhoneInternalAction2 = addPhoneInternalAction;
        C44373c c44373c2 = c44373c;
        if (addPhoneInternalAction2.equals(AddPhoneInternalAction.RoutingGoBack.f226910b) ? true : addPhoneInternalAction2 instanceof AddPhoneInternalAction.RoutingFinish ? true : addPhoneInternalAction2 instanceof AddPhoneInternalAction.ErrorDialog ? true : addPhoneInternalAction2 instanceof AddPhoneInternalAction.RoutingGoToPhoneAllowReverificationInfo ? true : addPhoneInternalAction2 instanceof AddPhoneInternalAction.RoutingGoToPhoneDisallowReverificationInfo) {
            return c44373c2;
        }
        if (addPhoneInternalAction2 instanceof AddPhoneInternalAction.Loading) {
            return new C44373c(true, null);
        }
        if (addPhoneInternalAction2 instanceof AddPhoneInternalAction.Error) {
            String str = ((AddPhoneInternalAction.Error) addPhoneInternalAction2).f226902b;
            return str != null ? new C44373c(false, str) : new C44373c(false, c44373c2.f415215c);
        }
        if (addPhoneInternalAction2.equals(AddPhoneInternalAction.Ok.f226905b) ? true : addPhoneInternalAction2 instanceof AddPhoneInternalAction.OkWithDeeplink ? true : addPhoneInternalAction2 instanceof AddPhoneInternalAction.AddPhoneResultOk ? true : addPhoneInternalAction2 instanceof AddPhoneInternalAction.PhoneReverificationInfoAccepted) {
            return new C44373c(false, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
