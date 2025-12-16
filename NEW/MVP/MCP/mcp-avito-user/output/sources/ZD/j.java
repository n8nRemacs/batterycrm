package Zd;

import android.app.Application;
import android.content.Intent;
import android.os.Parcelable;
import com.avito.android.authorization.AuthScreenMode;
import com.avito.android.authorization.SocialRegistrationSuggestsParams;
import com.avito.android.authorization.auth.AuthActivity;
import com.avito.android.authorization.auto_recovery.AutoRecoveryActivity;
import com.avito.android.authorization.auto_recovery.factor_unavailable_reason.FactorUnavailableReasonArguments;
import com.avito.android.authorization.auto_recovery.recovery_availability.RecoveryAvailabilityArguments;
import com.avito.android.authorization.auto_recovery.require_tfa.RequireTfaArguments;
import com.avito.android.authorization.change_password.ChangeResettedPasswordActivity;
import com.avito.android.authorization.complete_registration.CompleteRegistrationActivity;
import com.avito.android.authorization.confirm_3fa.ConfirmEmailList;
import com.avito.android.authorization.confirm_3fa.ConfirmEmailListActivity;
import com.avito.android.authorization.login.LoginActivity;
import com.avito.android.authorization.select_profile.SelectProfileActivity;
import com.avito.android.authorization.select_profile.social_login.SocialRegistrationSuggestsActivity;
import com.avito.android.authorization.select_social.SelectSocialActivity;
import com.avito.android.authorization.upgrade_password.UpgradePasswordActivity;
import com.avito.android.authorization.upgrade_password.UpgradePasswordArguments;
import com.avito.android.deep_linking.links.auth.AutoRecoveryLink;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.TfaSource;
import com.avito.android.remote.model.registration.ProfileSocial;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: InternalAuthIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZd/j;", "LZd/i;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f20314a;

    @Inject
    public j(@Y61.k Application application) {
        this.f20314a = application;
    }

    @Override // Zd.i
    @Y61.k
    public final Intent a(@Y61.k Intent intent, @Y61.k String str, @Y61.k String str2, boolean z12) {
        return new Intent(this.f20314a, (Class<?>) CompleteRegistrationActivity.class).putExtra("intent", intent).putExtra("login", str).putExtra("hash", str2).putExtra("opened_by_register_link", z12);
    }

    @Override // Zd.i
    @Y61.k
    public final Intent b(@Y61.k String str, @Y61.k String str2, @Y61.l String str3) {
        return new Intent(this.f20314a, (Class<?>) ChangeResettedPasswordActivity.class).putExtra("hash", str2).putExtra("login", str).putExtra(SearchParamsConverterKt.SOURCE, str3);
    }

    @Override // Zd.i
    @Y61.k
    public final Intent c(@Y61.k String str) {
        AutoRecoveryActivity.a aVar = AutoRecoveryActivity.f93068m;
        FactorUnavailableReasonArguments.Email email = new FactorUnavailableReasonArguments.Email(str);
        aVar.getClass();
        Intent intentPutExtra = new Intent(this.f20314a, (Class<?>) AutoRecoveryActivity.class).putExtra("automated_recovery.screen_name", "automated_recovery.factor_unavailable_reason").putExtra("require_tfa.availability.args", email);
        intentPutExtra.setFlags(603979776);
        return intentPutExtra;
    }

    @Override // Zd.i
    @Y61.k
    public final Intent d(@Y61.k AutoRecoveryLink.Source source) {
        AutoRecoveryActivity.a aVar = AutoRecoveryActivity.f93068m;
        FactorUnavailableReasonArguments.Phone phone = new FactorUnavailableReasonArguments.Phone(source);
        aVar.getClass();
        Intent intentPutExtra = new Intent(this.f20314a, (Class<?>) AutoRecoveryActivity.class).putExtra("automated_recovery.screen_name", "automated_recovery.factor_unavailable_reason").putExtra("require_tfa.availability.args", phone);
        intentPutExtra.setFlags(603979776);
        return intentPutExtra;
    }

    @Override // Zd.i
    @Y61.k
    public final Intent e(boolean z12) {
        AutoRecoveryActivity.a aVar = AutoRecoveryActivity.f93068m;
        RecoveryAvailabilityArguments recoveryAvailabilityArguments = new RecoveryAvailabilityArguments(z12);
        aVar.getClass();
        Intent intentPutExtra = new Intent(this.f20314a, (Class<?>) AutoRecoveryActivity.class).putExtra("automated_recovery.screen_name", "automated_recovery.availability").putExtra("automated_recovery.availability.args", recoveryAvailabilityArguments);
        intentPutExtra.setFlags(603979776);
        return intentPutExtra;
    }

    @Override // Zd.i
    @Y61.k
    public final Intent f(@Y61.k Intent intent, @Y61.k List<ProfileSocial> list, @Y61.l String str) {
        return new Intent(this.f20314a, (Class<?>) SelectSocialActivity.class).putExtra("intent", intent).putParcelableArrayListExtra("social", new ArrayList<>(list)).putExtra("suggest_key", str);
    }

    @Override // Zd.i
    @Y61.k
    public final Intent g(@Y61.k TfaSource tfaSource) {
        AutoRecoveryActivity.a aVar = AutoRecoveryActivity.f93068m;
        RequireTfaArguments requireTfaArguments = new RequireTfaArguments(tfaSource);
        aVar.getClass();
        Intent intentPutExtra = new Intent(this.f20314a, (Class<?>) AutoRecoveryActivity.class).putExtra("automated_recovery.screen_name", "automated_recovery.require_tfa").putExtra("require_tfa.availability.args", requireTfaArguments);
        intentPutExtra.setFlags(603979776);
        return intentPutExtra;
    }

    @Override // Zd.i
    @Y61.k
    public final Intent h(@Y61.k ConfirmEmailList confirmEmailList) {
        ConfirmEmailListActivity.f93537m.getClass();
        Intent intent = new Intent(this.f20314a, (Class<?>) ConfirmEmailListActivity.class);
        intent.putExtra("ConfirmEmailListActivity.emailList", confirmEmailList);
        return intent;
    }

    @Override // Zd.i
    @Y61.k
    public final Intent i(@Y61.l Intent intent, @Y61.l String str, @Y61.l Parcelable parcelable, @Y61.k AuthScreenMode authScreenMode) {
        return new Intent(this.f20314a, (Class<?>) AuthActivity.class).putExtra("intent", intent).putExtra("src", str).putExtra("full_screen_mode", (Parcelable) authScreenMode).putExtra("successAuthData", parcelable);
    }

    @Override // Zd.i
    @Y61.k
    public final Intent j(@Y61.k Intent intent, @Y61.l String str, @Y61.l String str2, boolean z12, @Y61.l String str3, boolean z13, @Y61.l String str4, @Y61.l String str5) {
        return new Intent(this.f20314a, (Class<?>) LoginActivity.class).putExtra("login", str).putExtra("password", str2).putExtra("is_hidden_login", z12).putExtra("suggest_key", str3).putExtra("skip_saved_login", z13).putExtra("src", str4).putExtra("phone_hint", str5).putExtra("intent", intent);
    }

    @Override // Zd.i
    @Y61.k
    public final Intent k(@Y61.l String str, @Y61.l String str2, @Y61.l String str3) {
        return new Intent(this.f20314a, (Class<?>) UpgradePasswordActivity.class).putExtra("extra_args", new UpgradePasswordArguments(str, str2, str3));
    }

    @Override // Zd.i
    @Y61.k
    public final Intent l(@Y61.k Intent intent, @Y61.k String str, @Y61.k String str2) {
        return new Intent(this.f20314a, (Class<?>) SelectProfileActivity.class).putExtra("intent", intent).putExtra("login", str).putExtra("hash", str2);
    }

    @Override // Zd.i
    @Y61.k
    public final Intent m(@Y61.k Intent intent, @Y61.k SocialRegistrationSuggestsParams socialRegistrationSuggestsParams) {
        Intent intent2 = new Intent(this.f20314a, (Class<?>) SocialRegistrationSuggestsActivity.class);
        intent2.putExtra("intent", intent);
        intent2.putExtra("extra_srs_params", socialRegistrationSuggestsParams);
        return intent2;
    }
}
