package com.avito.android.verification;

import Y61.k;
import android.content.Context;
import android.content.Intent;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ProfileCreateExtendedLink;
import com.avito.android.deep_linking.links.VerificationConfirmRequisitesLink;
import com.avito.android.deep_linking.links.VerificationDisclaimerLink;
import com.avito.android.deep_linking.links.VerificationFetchInvoiceLink;
import com.avito.android.deep_linking.links.VerificationFinishLink;
import com.avito.android.deep_linking.links.VerificationInputBillAmountLink;
import com.avito.android.deep_linking.links.VerificationInputInnLink;
import com.avito.android.deep_linking.links.VerificationStatusListLink;
import com.avito.android.deep_linking.links.VerificationSumsubLink;
import com.avito.android.verification.verification_finish.VerificationFinishArgs;
import com.avito.android.verification.verification_passport.CyberityParams;
import com.avito.android.verification.verification_passport.VerificationPassportActivity;
import com.avito.android.verification.verification_status_list.VerificationStatusListArgs;
import com.avito.android.verification.verification_webview.VerificationWebViewActivity;
import com.avito.android.verification.verification_webview.VerificationWebViewArgs;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import vM0.InterfaceC49236c;

/* compiled from: VerificationIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/b;", "LvM0/c;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements InterfaceC49236c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f323380a;

    @Inject
    public b(@k Context context) {
        this.f323380a = context;
    }

    @Override // vM0.InterfaceC49236c
    @k
    public final Intent a(@k VerificationStatusListLink verificationStatusListLink) {
        VerificationActivity.f323373r.getClass();
        Intent intent = new Intent(this.f323380a, (Class<?>) VerificationActivity.class);
        intent.putExtra("key.verification_status_list_args", new VerificationStatusListArgs(verificationStatusListLink.f133846b));
        intent.setFlags(603979776);
        return intent;
    }

    @Override // vM0.InterfaceC49236c
    @k
    public final Intent b(@k ProfileCreateExtendedLink profileCreateExtendedLink) {
        VerificationActivity.f323373r.getClass();
        Intent intent = new Intent(this.f323380a, (Class<?>) VerificationActivity.class);
        intent.putExtra("key.profile_create_extended_link", profileCreateExtendedLink);
        intent.setFlags(603979776);
        return intent;
    }

    @Override // vM0.InterfaceC49236c
    @k
    public final Intent c(@k VerificationDisclaimerLink verificationDisclaimerLink) {
        VerificationActivity.f323373r.getClass();
        Intent intent = new Intent(this.f323380a, (Class<?>) VerificationActivity.class);
        intent.putExtra("key.verification_disclaimer_link", verificationDisclaimerLink);
        intent.setFlags(603979776);
        return intent;
    }

    @Override // vM0.InterfaceC49236c
    @k
    public final Intent d(@k DeepLink deepLink) {
        VerificationPassportActivity.a aVar = VerificationPassportActivity.f325677s;
        VerificationSumsubLink verificationSumsubLink = deepLink instanceof VerificationSumsubLink ? (VerificationSumsubLink) deepLink : null;
        if (verificationSumsubLink == null) {
            throw new IllegalStateException("Incorrect deeplink for start Cyberity verification");
        }
        aVar.getClass();
        Intent intent = new Intent(this.f323380a, (Class<?>) VerificationPassportActivity.class);
        aVar.getClass();
        intent.putExtra("cyberity_params", new CyberityParams(verificationSumsubLink.f133849d, verificationSumsubLink.f133850e, verificationSumsubLink.f133847b, verificationSumsubLink.f133848c));
        return intent;
    }

    @Override // vM0.InterfaceC49236c
    @k
    public final Intent e(@k VerificationFetchInvoiceLink verificationFetchInvoiceLink) {
        VerificationActivity.f323373r.getClass();
        Intent intent = new Intent(this.f323380a, (Class<?>) VerificationActivity.class);
        intent.putExtra("key.verification_fetch_invoice_link", verificationFetchInvoiceLink);
        intent.setFlags(603979776);
        return intent;
    }

    @Override // vM0.InterfaceC49236c
    @k
    public final Intent f(@k VerificationInputInnLink verificationInputInnLink) {
        VerificationActivity.f323373r.getClass();
        Intent intent = new Intent(this.f323380a, (Class<?>) VerificationActivity.class);
        intent.putExtra("key.verification_inn_link", verificationInputInnLink);
        intent.setFlags(603979776);
        return intent;
    }

    @Override // vM0.InterfaceC49236c
    @k
    public final Intent g(@k VerificationInputBillAmountLink verificationInputBillAmountLink) {
        VerificationActivity.f323373r.getClass();
        Intent intent = new Intent(this.f323380a, (Class<?>) VerificationActivity.class);
        intent.putExtra("key.verification_input_bill_amount", verificationInputBillAmountLink);
        intent.setFlags(603979776);
        return intent;
    }

    @Override // vM0.InterfaceC49236c
    @k
    public final Intent h(@k VerificationConfirmRequisitesLink verificationConfirmRequisitesLink) {
        VerificationActivity.f323373r.getClass();
        Intent intent = new Intent(this.f323380a, (Class<?>) VerificationActivity.class);
        intent.putExtra("key.verification_confirm_requisites_link", verificationConfirmRequisitesLink);
        intent.setFlags(603979776);
        return intent;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    @Override // vM0.InterfaceC49236c
    @k
    public final Intent i(@k VerificationFinishLink verificationFinishLink) {
        VerificationActivity.f323373r.getClass();
        Intent intent = new Intent(this.f323380a, (Class<?>) VerificationActivity.class);
        intent.putExtra("key.verification_finish_link", new VerificationFinishArgs(verificationFinishLink.f133842b));
        intent.setFlags(603979776);
        return intent;
    }

    @k
    public final Intent j(@k VerificationWebViewArgs verificationWebViewArgs) {
        VerificationWebViewActivity.f325830m.getClass();
        Intent intent = new Intent(this.f323380a, (Class<?>) VerificationWebViewActivity.class);
        intent.putExtra("verificationWebViewArgs", verificationWebViewArgs);
        return intent;
    }
}
