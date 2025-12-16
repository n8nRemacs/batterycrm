package t00;

import Y61.k;
import android.content.Intent;
import com.avito.android.mortgage.applications_list.ApplicationsListArguments;
import com.avito.android.mortgage.document_upload.model.DocumentUploadArguments;
import com.avito.android.mortgage.landing.model.LandingArguments;
import com.avito.android.mortgage.person_form.model.PersonFormArguments;
import com.avito.android.mortgage.pre_approval.model.PreApprovalArguments;
import com.avito.android.mortgage.root.model.MortgageRootArguments;
import com.avito.android.mortgage.sign.model.SignArguments;
import com.avito.android.mortgage.verification_flow.model.VerificationFlowArguments;
import kotlin.Metadata;

/* compiled from: MortgageApplicationIntentFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lt00/a;", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: t00.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC48454a {
    @k
    Intent a(@k MortgageRootArguments mortgageRootArguments);

    @k
    Intent b(@k DocumentUploadArguments documentUploadArguments);

    @k
    Intent c(@k LandingArguments landingArguments);

    @k
    Intent d(@k VerificationFlowArguments verificationFlowArguments);

    @k
    Intent e(@k PersonFormArguments personFormArguments);

    @k
    Intent f(@k PreApprovalArguments preApprovalArguments);

    @k
    Intent g(@k SignArguments signArguments);

    @k
    Intent h(@k ApplicationsListArguments applicationsListArguments);
}
