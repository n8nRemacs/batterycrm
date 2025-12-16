package vM0;

import Y61.k;
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
import kotlin.Metadata;

/* compiled from: VerificationIntentFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvM0/c;", "", "_avito_verification_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vM0.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC49236c {
    @k
    Intent a(@k VerificationStatusListLink verificationStatusListLink);

    @k
    Intent b(@k ProfileCreateExtendedLink profileCreateExtendedLink);

    @k
    Intent c(@k VerificationDisclaimerLink verificationDisclaimerLink);

    @k
    Intent d(@k DeepLink deepLink);

    @k
    Intent e(@k VerificationFetchInvoiceLink verificationFetchInvoiceLink);

    @k
    Intent f(@k VerificationInputInnLink verificationInputInnLink);

    @k
    Intent g(@k VerificationInputBillAmountLink verificationInputBillAmountLink);

    @k
    Intent h(@k VerificationConfirmRequisitesLink verificationConfirmRequisitesLink);

    @k
    Intent i(@k VerificationFinishLink verificationFinishLink);
}
