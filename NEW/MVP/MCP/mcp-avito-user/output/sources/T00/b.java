package t00;

import Y61.k;
import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.MortgageApplicationActivity;
import com.avito.android.mortgage.MortgageFragmentParams;
import com.avito.android.mortgage.applications_list.ApplicationsListArguments;
import com.avito.android.mortgage.document_upload.model.DocumentUploadArguments;
import com.avito.android.mortgage.landing.model.LandingArguments;
import com.avito.android.mortgage.person_form.model.PersonFormArguments;
import com.avito.android.mortgage.pre_approval.model.PreApprovalArguments;
import com.avito.android.mortgage.root.model.MortgageRootArguments;
import com.avito.android.mortgage.sign.model.SignArguments;
import com.avito.android.mortgage.verification_flow.model.VerificationFlowArguments;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MortgageApplicationIntentFactory.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lt00/b;", "Lt00/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements InterfaceC48454a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f439017a;

    @Inject
    public b(@k Context context) {
        this.f439017a = context;
    }

    @Override // t00.InterfaceC48454a
    @k
    public final Intent a(@k MortgageRootArguments mortgageRootArguments) {
        MortgageFragmentParams.MortgageRootFragment mortgageRootFragment = new MortgageFragmentParams.MortgageRootFragment(mortgageRootArguments);
        MortgageApplicationActivity.f198151m.getClass();
        return MortgageApplicationActivity.a.a(this.f439017a, mortgageRootFragment);
    }

    @Override // t00.InterfaceC48454a
    @k
    public final Intent b(@k DocumentUploadArguments documentUploadArguments) {
        MortgageFragmentParams.MortgageDocumentsUploadFragment mortgageDocumentsUploadFragment = new MortgageFragmentParams.MortgageDocumentsUploadFragment(documentUploadArguments);
        MortgageApplicationActivity.f198151m.getClass();
        return MortgageApplicationActivity.a.a(this.f439017a, mortgageDocumentsUploadFragment);
    }

    @Override // t00.InterfaceC48454a
    @k
    public final Intent c(@k LandingArguments landingArguments) {
        MortgageFragmentParams.MortgageLandingFragment mortgageLandingFragment = new MortgageFragmentParams.MortgageLandingFragment(landingArguments);
        MortgageApplicationActivity.f198151m.getClass();
        return MortgageApplicationActivity.a.a(this.f439017a, mortgageLandingFragment);
    }

    @Override // t00.InterfaceC48454a
    @k
    public final Intent d(@k VerificationFlowArguments verificationFlowArguments) {
        MortgageFragmentParams.MortgageVerificationFlowFragment mortgageVerificationFlowFragment = new MortgageFragmentParams.MortgageVerificationFlowFragment(verificationFlowArguments);
        MortgageApplicationActivity.f198151m.getClass();
        return MortgageApplicationActivity.a.a(this.f439017a, mortgageVerificationFlowFragment);
    }

    @Override // t00.InterfaceC48454a
    @k
    public final Intent e(@k PersonFormArguments personFormArguments) {
        MortgageFragmentParams.MortgageFormFragment mortgageFormFragment = new MortgageFragmentParams.MortgageFormFragment(personFormArguments);
        MortgageApplicationActivity.f198151m.getClass();
        return MortgageApplicationActivity.a.a(this.f439017a, mortgageFormFragment);
    }

    @Override // t00.InterfaceC48454a
    @k
    public final Intent f(@k PreApprovalArguments preApprovalArguments) {
        MortgageFragmentParams.PreApprovalFormFragment preApprovalFormFragment = new MortgageFragmentParams.PreApprovalFormFragment(preApprovalArguments);
        MortgageApplicationActivity.f198151m.getClass();
        return MortgageApplicationActivity.a.a(this.f439017a, preApprovalFormFragment);
    }

    @Override // t00.InterfaceC48454a
    @k
    public final Intent g(@k SignArguments signArguments) {
        MortgageFragmentParams.MortgageSignFragment mortgageSignFragment = new MortgageFragmentParams.MortgageSignFragment(signArguments);
        MortgageApplicationActivity.f198151m.getClass();
        return MortgageApplicationActivity.a.a(this.f439017a, mortgageSignFragment);
    }

    @Override // t00.InterfaceC48454a
    @k
    public final Intent h(@k ApplicationsListArguments applicationsListArguments) {
        MortgageFragmentParams.MortgageApplicationsListFragment mortgageApplicationsListFragment = new MortgageFragmentParams.MortgageApplicationsListFragment(applicationsListArguments);
        MortgageApplicationActivity.f198151m.getClass();
        return MortgageApplicationActivity.a.a(this.f439017a, mortgageApplicationsListFragment);
    }
}
