package com.avito.android.passport.profile_add.create_flow.set_profile_name;

import com.avito.android.R;
import com.avito.android.passport.profile_add.ProfileCreateExtendedFlow;
import com.avito.android.passport.profile_add.create_flow.set_profile_name.mvi.entity.SetProfileNameState;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: SetProfileNameFormatter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/set_profile_name/c;", "Lcom/avito/android/passport/profile_add/create_flow/set_profile_name/b;", "<init>", "()V", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c implements b {
    @Inject
    public c() {
    }

    @Override // com.avito.android.passport.profile_add.create_flow.set_profile_name.b
    @Y61.k
    public final SetProfileNameState a(@Y61.k ProfileCreateExtendedFlow profileCreateExtendedFlow, @Y61.k String str) {
        int i12;
        int i13;
        boolean z12 = profileCreateExtendedFlow instanceof ProfileCreateExtendedFlow.Profile;
        if (z12) {
            i12 = R.string.passport_add_profile_title;
        } else if (profileCreateExtendedFlow instanceof ProfileCreateExtendedFlow.Passport) {
            i12 = R.string.passport_add_profile_set_profile_name_title;
        } else {
            if (!(profileCreateExtendedFlow instanceof ProfileCreateExtendedFlow.Verification)) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = R.string.passport_add_profile_verification_title;
        }
        boolean z13 = profileCreateExtendedFlow instanceof ProfileCreateExtendedFlow.Passport;
        int i14 = z13 ? true : z12 ? R.string.passport_add_profile_set_profile_name_subtitle : profileCreateExtendedFlow instanceof ProfileCreateExtendedFlow.Verification.INN ? R.string.passport_add_profile_set_profile_name_inn_subtitle : R.string.passport_add_profile_set_profile_name_verification_subtitle;
        if (z13) {
            z12 = true;
        }
        if (z12) {
            i13 = R.string.passport_add_profile_set_profile_name_text;
        } else {
            if (!(profileCreateExtendedFlow instanceof ProfileCreateExtendedFlow.Verification)) {
                throw new NoWhenBranchMatchedException();
            }
            i13 = R.string.passport_add_profile_set_profile_name_verification_text;
        }
        boolean z14 = profileCreateExtendedFlow instanceof ProfileCreateExtendedFlow.Verification.TinkoffID;
        return new SetProfileNameState(new SetProfileNameState.b(com.avito.android.printable_text.b.c(i12, new Serializable[0]), com.avito.android.printable_text.b.c(i14, new Serializable[0]), com.avito.android.printable_text.b.c(i13, new Serializable[0]), com.avito.android.printable_text.b.a(), com.avito.android.printable_text.b.c(z14 ? R.string.passport_add_profile_set_profile_name_tinkoff_id_action : R.string.passport_add_profile_select_vertical_continue, new Serializable[0])), z14 ? Integer.valueOf(R.string.passport_add_profile_set_profile_name_tinkoff_id_footer) : null, str, SetProfileNameState.InputState.f212162b, false, null);
    }
}
