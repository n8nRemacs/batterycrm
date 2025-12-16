package M50;

import com.avito.android.passport.profile_add.ProfileCreateExtendedFlow;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: AnalyticsUtils.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_extended-profile-creation_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e {
    @Y61.k
    public static final String a(@Y61.k ProfileCreateExtendedFlow profileCreateExtendedFlow) {
        if (profileCreateExtendedFlow instanceof ProfileCreateExtendedFlow.Passport) {
            return "passport_creation";
        }
        if (profileCreateExtendedFlow instanceof ProfileCreateExtendedFlow.Profile.Upgrade) {
            return "profile_creation";
        }
        if (profileCreateExtendedFlow instanceof ProfileCreateExtendedFlow.Profile.BusinessRegistrationUpgrade) {
            return "business_registration";
        }
        if (profileCreateExtendedFlow instanceof ProfileCreateExtendedFlow.Verification.INN) {
            return "requisites_check";
        }
        if (profileCreateExtendedFlow instanceof ProfileCreateExtendedFlow.Verification.TinkoffID) {
            return "tinkoff_id";
        }
        if (profileCreateExtendedFlow instanceof ProfileCreateExtendedFlow.Verification.SberID) {
            return "sber_id";
        }
        if (profileCreateExtendedFlow instanceof ProfileCreateExtendedFlow.Verification.AlfaID) {
            return "alfa_id";
        }
        if (profileCreateExtendedFlow instanceof ProfileCreateExtendedFlow.Verification.TochkaID) {
            return "tochka_id";
        }
        throw new NoWhenBranchMatchedException();
    }
}
