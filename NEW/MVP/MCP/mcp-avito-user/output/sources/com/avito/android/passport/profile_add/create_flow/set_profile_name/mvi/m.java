package com.avito.android.passport.profile_add.create_flow.set_profile_name.mvi;

import V50.b;
import com.avito.android.arch.mvi.t;
import com.avito.android.passport.profile_add.create_flow.set_profile_name.mvi.entity.SetProfileNameInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SetProfileNameOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/set_profile_name/mvi/m;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/passport/profile_add/create_flow/set_profile_name/mvi/entity/SetProfileNameInternalAction;", "LV50/b;", "<init>", "()V", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class m implements t<SetProfileNameInternalAction, V50.b> {
    @Inject
    public m() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final V50.b b(SetProfileNameInternalAction setProfileNameInternalAction) {
        SetProfileNameInternalAction setProfileNameInternalAction2 = setProfileNameInternalAction;
        if (setProfileNameInternalAction2 instanceof SetProfileNameInternalAction.CreateProfileError) {
            Throwable th2 = ((SetProfileNameInternalAction.CreateProfileError) setProfileNameInternalAction2).f212143b;
            if (com.avito.android.passport.profile_add.create_flow.set_profile_name.a.b(th2)) {
                return null;
            }
            return new b.c(th2);
        }
        if (setProfileNameInternalAction2 instanceof SetProfileNameInternalAction.Navigate) {
            return new b.C1164b(((SetProfileNameInternalAction.Navigate) setProfileNameInternalAction2).f212151b);
        }
        if (setProfileNameInternalAction2 instanceof SetProfileNameInternalAction.HandleDeeplink) {
            SetProfileNameInternalAction.HandleDeeplink handleDeeplink = (SetProfileNameInternalAction.HandleDeeplink) setProfileNameInternalAction2;
            return new b.a(handleDeeplink.f212148b, handleDeeplink.f212149c);
        }
        if (setProfileNameInternalAction2 instanceof SetProfileNameInternalAction.InitState ? true : setProfileNameInternalAction2 instanceof SetProfileNameInternalAction.EmptyNameError ? true : setProfileNameInternalAction2 instanceof SetProfileNameInternalAction.StartLoading ? true : setProfileNameInternalAction2 instanceof SetProfileNameInternalAction.FinishLoading ? true : setProfileNameInternalAction2 instanceof SetProfileNameInternalAction.OnTyped) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
