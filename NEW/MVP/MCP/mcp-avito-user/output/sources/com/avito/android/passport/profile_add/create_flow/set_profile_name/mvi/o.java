package com.avito.android.passport.profile_add.create_flow.set_profile_name.mvi;

import com.avito.android.R;
import com.avito.android.arch.mvi.u;
import com.avito.android.passport.profile_add.create_flow.set_profile_name.SetProfileNameArgs;
import com.avito.android.passport.profile_add.create_flow.set_profile_name.mvi.entity.SetProfileNameInternalAction;
import com.avito.android.passport.profile_add.create_flow.set_profile_name.mvi.entity.SetProfileNameState;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SetProfileNameReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/set_profile_name/mvi/o;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/passport/profile_add/create_flow/set_profile_name/mvi/entity/SetProfileNameInternalAction;", "Lcom/avito/android/passport/profile_add/create_flow/set_profile_name/mvi/entity/SetProfileNameState;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class o implements u<SetProfileNameInternalAction, SetProfileNameState> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.passport.profile_add.create_flow.set_profile_name.b f212195b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SetProfileNameArgs f212196c;

    @Inject
    public o(@Y61.k com.avito.android.passport.profile_add.create_flow.set_profile_name.b bVar, @Y61.k SetProfileNameArgs setProfileNameArgs) {
        this.f212195b = bVar;
        this.f212196c = setProfileNameArgs;
    }

    @Override // com.avito.android.arch.mvi.u
    public final SetProfileNameState a(SetProfileNameInternalAction setProfileNameInternalAction, SetProfileNameState setProfileNameState) {
        SetProfileNameInternalAction setProfileNameInternalAction2 = setProfileNameInternalAction;
        SetProfileNameState setProfileNameState2 = setProfileNameState;
        if (setProfileNameInternalAction2 instanceof SetProfileNameInternalAction.InitState) {
            return this.f212195b.a(this.f212196c.f212035e, ((SetProfileNameInternalAction.InitState) setProfileNameInternalAction2).f212150b);
        }
        if (setProfileNameInternalAction2 instanceof SetProfileNameInternalAction.OnTyped) {
            return SetProfileNameState.a(setProfileNameState2, ((SetProfileNameInternalAction.OnTyped) setProfileNameInternalAction2).f212152b, SetProfileNameState.InputState.f212162b, false, null, 19);
        }
        if (setProfileNameInternalAction2 instanceof SetProfileNameInternalAction.EmptyNameError) {
            return SetProfileNameState.a(setProfileNameState2, null, SetProfileNameState.InputState.f212163c, false, com.avito.android.printable_text.b.c(R.string.passport_add_profile_set_profile_name_empty_input_error, new Serializable[0]), 23);
        }
        if (setProfileNameInternalAction2 instanceof SetProfileNameInternalAction.CreateProfileError) {
            Throwable th2 = ((SetProfileNameInternalAction.CreateProfileError) setProfileNameInternalAction2).f212143b;
            return com.avito.android.passport.profile_add.create_flow.set_profile_name.a.b(th2) ? SetProfileNameState.a(setProfileNameState2, null, SetProfileNameState.InputState.f212163c, false, com.avito.android.printable_text.b.f(com.avito.android.passport.profile_add.create_flow.set_profile_name.a.a(th2)), 23) : SetProfileNameState.a(setProfileNameState2, null, SetProfileNameState.InputState.f212162b, false, null, 23);
        }
        if (setProfileNameInternalAction2 instanceof SetProfileNameInternalAction.StartLoading) {
            return SetProfileNameState.a(setProfileNameState2, null, null, true, null, 47);
        }
        if (setProfileNameInternalAction2 instanceof SetProfileNameInternalAction.FinishLoading) {
            return SetProfileNameState.a(setProfileNameState2, null, null, false, null, 47);
        }
        if (setProfileNameInternalAction2 instanceof SetProfileNameInternalAction.HandleDeeplink ? true : setProfileNameInternalAction2 instanceof SetProfileNameInternalAction.Navigate) {
            return setProfileNameState2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
