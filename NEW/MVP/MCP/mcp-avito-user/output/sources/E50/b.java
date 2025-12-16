package E50;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.PrintableTextUserDialog;
import com.avito.android.passport.auth_suggest.PassportAuthSuggestActivity;
import com.avito.android.passport.auth_suggest.PassportAuthSuggestOpenParams;
import com.avito.android.passport.deeplinks.PassportSelectBusinessVrfLink;
import com.avito.android.passport.network.model.PassportUserDialogWithProfile;
import com.avito.android.passport.profile_add.merge.PassportMergeAccountsActivity;
import com.avito.android.passport.profile_add.merge.domain.MergeFlow;
import com.avito.android.passport.profile_add.onboarding.PassportOnboardingActivity;
import com.avito.android.passport.profiles_list.PassportProfilesListActivity;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PassportIntentFactory.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LE50/b;", "LE50/a;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f3764a;

    @Inject
    public b(@k Context context) {
        this.f3764a = context;
    }

    @Override // E50.a
    @k
    public final Intent a(@k PrintableTextUserDialog printableTextUserDialog) {
        PassportMergeAccountsActivity.f212380m.getClass();
        Intent intentPutExtra = new Intent(this.f3764a, (Class<?>) PassportMergeAccountsActivity.class).putExtra("passport.add_profile.screen_name", "passport.add_profile.merge.full_screen_error_dialog").putExtra("passport.add_profile.merge.user_dialog", printableTextUserDialog);
        intentPutExtra.setFlags(603979776);
        return intentPutExtra;
    }

    @Override // E50.a
    @k
    public final Intent b(@k String str) {
        PassportMergeAccountsActivity.f212380m.getClass();
        Intent intentPutExtra = new Intent(this.f3764a, (Class<?>) PassportMergeAccountsActivity.class).putExtra("passport.add_profile.screen_name", "passport.add_profile.create.business_vrf_duplication").putExtra("passport.add_profile.merge.business_vrf_duplication_profile_creation", str);
        intentPutExtra.setFlags(603979776);
        return intentPutExtra;
    }

    @Override // E50.a
    @k
    public final Intent c() {
        PassportOnboardingActivity.f213545v.getClass();
        return new Intent(this.f3764a, (Class<?>) PassportOnboardingActivity.class).putExtra("passport.onboarding.is_pro", true);
    }

    @Override // E50.a
    @k
    public final Intent d(@k String str, @l String str2, @k String str3) {
        PassportAuthSuggestActivity.a aVar = PassportAuthSuggestActivity.f210912n;
        PassportAuthSuggestOpenParams passportAuthSuggestOpenParams = new PassportAuthSuggestOpenParams(str, str2, str3);
        aVar.getClass();
        return new Intent(this.f3764a, (Class<?>) PassportAuthSuggestActivity.class).putExtra("open_params", passportAuthSuggestOpenParams);
    }

    @Override // E50.a
    @k
    public final Intent e(@k PassportUserDialogWithProfile passportUserDialogWithProfile) {
        PassportMergeAccountsActivity.f212380m.getClass();
        Intent intentPutExtra = new Intent(this.f3764a, (Class<?>) PassportMergeAccountsActivity.class).putExtra("passport.add_profile.screen_name", "passport.add_profile.merge.profile_error").putExtra("passport.add_profile.merge.user_dialog_with_profile", passportUserDialogWithProfile);
        intentPutExtra.setFlags(603979776);
        return intentPutExtra;
    }

    @Override // E50.a
    @k
    public final Intent f(@k PassportSelectBusinessVrfLink.Flow flow, @l String str) {
        PassportMergeAccountsActivity.f212380m.getClass();
        Intent intentPutExtra = new Intent(this.f3764a, (Class<?>) PassportMergeAccountsActivity.class).putExtra("passport.add_profile.screen_name", "passport.add_profile.merge.select_business_vrf").putExtra("passport.add_profile.select_business_vrf_flow", flow).putExtra("passport.add_profile.draft_id", str);
        intentPutExtra.setFlags(603979776);
        return intentPutExtra;
    }

    @Override // E50.a
    @k
    public final Intent g(@k MergeFlow mergeFlow) {
        PassportMergeAccountsActivity.f212380m.getClass();
        Intent intentPutExtra = new Intent(this.f3764a, (Class<?>) PassportMergeAccountsActivity.class).putExtra("passport.add_profile.screen_name", "passport.add_profile.merge.profiles_list").putExtra("passport.add_profile.merge.merge_flow", mergeFlow);
        intentPutExtra.setFlags(603979776);
        return intentPutExtra;
    }

    @Override // E50.a
    @k
    public final Intent h(boolean z12) {
        PassportMergeAccountsActivity.f212380m.getClass();
        Intent intentPutExtra = new Intent(this.f3764a, (Class<?>) PassportMergeAccountsActivity.class).putExtra("passport.add_profile.screen_name", "passport.add_profile.merge.confirm_ownership").putExtra("passport.add_profile.merge.back_icon", z12);
        intentPutExtra.setFlags(603979776);
        return intentPutExtra;
    }

    @Override // E50.a
    @k
    public final Intent i() {
        PassportMergeAccountsActivity.f212380m.getClass();
        Intent intentPutExtra = new Intent(this.f3764a, (Class<?>) PassportMergeAccountsActivity.class).putExtra("passport.add_profile.screen_name", "passport.add_profile.create.business_vrf_duplication_finish");
        intentPutExtra.setFlags(603979776);
        return intentPutExtra;
    }

    @Override // E50.a
    @k
    public final Intent j(boolean z12) {
        PassportProfilesListActivity.f213728u.getClass();
        Intent intentPutExtra = new Intent(this.f3764a, (Class<?>) PassportProfilesListActivity.class).putExtra("finalized", z12);
        intentPutExtra.setFlags(603979776);
        return intentPutExtra;
    }
}
