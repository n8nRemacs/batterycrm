package com.avito.android.mortgage;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import androidx.core.os.C22777e;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.mortgage.MortgageFragmentParams;
import com.avito.android.mortgage.applications_list.ApplicationsListFragment;
import com.avito.android.mortgage.document_upload.DocumentUploadFragment;
import com.avito.android.mortgage.landing.LandingFragment;
import com.avito.android.mortgage.person_form.MortgagePersonFormFragment;
import com.avito.android.mortgage.pre_approval.form.PreApprovalFormFragment;
import com.avito.android.mortgage.root.MortgageRootFragment;
import com.avito.android.mortgage.sign.SignFragment;
import com.avito.android.mortgage.verification_flow.VerificationFlowFragment;
import com.avito.android.ui.fragments.BaseFragment;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: MortgageApplicationActivity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage/MortgageApplicationActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MortgageApplicationActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final a f198151m = new a(null);

    /* compiled from: MortgageApplicationActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/MortgageApplicationActivity$a;", "", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static Intent a(@k Context context, @k MortgageFragmentParams mortgageFragmentParams) {
            Intent intent = new Intent(context, (Class<?>) MortgageApplicationActivity.class);
            intent.putExtra("fragment", mortgageFragmentParams);
            return intent;
        }

        public a() {
        }
    }

    public static BaseFragment a2(MortgageFragmentParams mortgageFragmentParams) {
        if (mortgageFragmentParams instanceof MortgageFragmentParams.MortgageDocumentsUploadFragment) {
            DocumentUploadFragment.f199027B0.getClass();
            return DocumentUploadFragment.a.a(((MortgageFragmentParams.MortgageDocumentsUploadFragment) mortgageFragmentParams).f198153b);
        }
        if (mortgageFragmentParams instanceof MortgageFragmentParams.MortgageFormFragment) {
            MortgagePersonFormFragment.f200441y0.getClass();
            return MortgagePersonFormFragment.a.a(((MortgageFragmentParams.MortgageFormFragment) mortgageFragmentParams).f198154b);
        }
        if (mortgageFragmentParams instanceof MortgageFragmentParams.MortgageLandingFragment) {
            LandingFragment.f199475z0.getClass();
            return LandingFragment.a.a(((MortgageFragmentParams.MortgageLandingFragment) mortgageFragmentParams).f198155b);
        }
        if (mortgageFragmentParams instanceof MortgageFragmentParams.MortgageSignFragment) {
            SignFragment.f203588r0.getClass();
            return SignFragment.a.a(((MortgageFragmentParams.MortgageSignFragment) mortgageFragmentParams).f198157b);
        }
        if (mortgageFragmentParams instanceof MortgageFragmentParams.MortgageRootFragment) {
            MortgageRootFragment.f202151t0.getClass();
            return MortgageRootFragment.C32677a.a(((MortgageFragmentParams.MortgageRootFragment) mortgageFragmentParams).f198156b);
        }
        if (mortgageFragmentParams instanceof MortgageFragmentParams.MortgageApplicationsListFragment) {
            ApplicationsListFragment.f198336t0.getClass();
            ApplicationsListFragment applicationsListFragment = new ApplicationsListFragment();
            applicationsListFragment.setArguments(C22777e.b(new Q("applicationsListArguments", ((MortgageFragmentParams.MortgageApplicationsListFragment) mortgageFragmentParams).f198152b)));
            return applicationsListFragment;
        }
        if (mortgageFragmentParams instanceof MortgageFragmentParams.MortgageVerificationFlowFragment) {
            VerificationFlowFragment.f203846t0.getClass();
            return VerificationFlowFragment.a.a(((MortgageFragmentParams.MortgageVerificationFlowFragment) mortgageFragmentParams).f198158b);
        }
        if (!(mortgageFragmentParams instanceof MortgageFragmentParams.PreApprovalFormFragment)) {
            throw new NoWhenBranchMatchedException();
        }
        PreApprovalFormFragment.f201682s0.getClass();
        return PreApprovalFormFragment.a.a(((MortgageFragmentParams.PreApprovalFormFragment) mortgageFragmentParams).f198159b);
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.mortgage_application_activity;
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            Intent intent = getIntent();
            Parcelable parcelableExtra = Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("fragment", MortgageFragmentParams.class) : intent.getParcelableExtra("fragment");
            if (parcelableExtra == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            H hE2 = getSupportFragmentManager().e();
            hE2.n(R.id.container, a2((MortgageFragmentParams) parcelableExtra), null);
            hE2.e();
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onNewIntent(@k Intent intent) {
        super.onNewIntent(intent);
        Parcelable parcelableExtra = Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("fragment", MortgageFragmentParams.class) : intent.getParcelableExtra("fragment");
        if (parcelableExtra == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        MortgageFragmentParams mortgageFragmentParams = (MortgageFragmentParams) parcelableExtra;
        BaseFragment baseFragmentA2 = a2(mortgageFragmentParams);
        if ((mortgageFragmentParams instanceof MortgageFragmentParams.MortgageLandingFragment) && ((MortgageFragmentParams.MortgageLandingFragment) mortgageFragmentParams).f198155b.f200086z) {
            getSupportFragmentManager().a0(1, null);
            H hE2 = getSupportFragmentManager().e();
            hE2.n(R.id.container, baseFragmentA2, null);
            hE2.e();
            return;
        }
        if (mortgageFragmentParams instanceof MortgageFragmentParams.MortgageRootFragment) {
            getSupportFragmentManager().b0(-1, 1, null);
            H hE3 = getSupportFragmentManager().e();
            hE3.n(R.id.container, baseFragmentA2, null);
            if (getSupportFragmentManager().L() > 0) {
                hE3.c(null);
            }
            hE3.e();
            return;
        }
        if (mortgageFragmentParams instanceof MortgageFragmentParams.MortgageFormFragment) {
            String canonicalName = MortgagePersonFormFragment.class.getCanonicalName();
            getSupportFragmentManager().a0(1, canonicalName);
            H hE4 = getSupportFragmentManager().e();
            hE4.n(R.id.container, baseFragmentA2, null);
            hE4.c(canonicalName);
            hE4.e();
            return;
        }
        if (mortgageFragmentParams instanceof MortgageFragmentParams.MortgageVerificationFlowFragment) {
            H hE5 = getSupportFragmentManager().e();
            hE5.j(R.id.container, baseFragmentA2, null, 1);
            hE5.e();
        } else if (mortgageFragmentParams instanceof MortgageFragmentParams.PreApprovalFormFragment) {
            H hE6 = getSupportFragmentManager().e();
            hE6.j(R.id.container, baseFragmentA2, null, 1);
            hE6.e();
        } else {
            H hE7 = getSupportFragmentManager().e();
            hE7.n(R.id.container, baseFragmentA2, null);
            hE7.c(null);
            hE7.e();
        }
    }
}
