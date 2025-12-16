package com.avito.android.mortgage;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.applications_list.ApplicationsListArguments;
import com.avito.android.mortgage.document_upload.model.DocumentUploadArguments;
import com.avito.android.mortgage.landing.model.LandingArguments;
import com.avito.android.mortgage.person_form.model.PersonFormArguments;
import com.avito.android.mortgage.pre_approval.model.PreApprovalArguments;
import com.avito.android.mortgage.root.model.MortgageRootArguments;
import com.avito.android.mortgage.sign.model.SignArguments;
import com.avito.android.mortgage.verification_flow.model.VerificationFlowArguments;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MortgageFragmentParams.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/mortgage/MortgageFragmentParams;", "Landroid/os/Parcelable;", "MortgageApplicationsListFragment", "MortgageDocumentsUploadFragment", "MortgageFormFragment", "MortgageLandingFragment", "MortgageRootFragment", "MortgageSignFragment", "MortgageVerificationFlowFragment", "PreApprovalFormFragment", "Lcom/avito/android/mortgage/MortgageFragmentParams$MortgageApplicationsListFragment;", "Lcom/avito/android/mortgage/MortgageFragmentParams$MortgageDocumentsUploadFragment;", "Lcom/avito/android/mortgage/MortgageFragmentParams$MortgageFormFragment;", "Lcom/avito/android/mortgage/MortgageFragmentParams$MortgageLandingFragment;", "Lcom/avito/android/mortgage/MortgageFragmentParams$MortgageRootFragment;", "Lcom/avito/android/mortgage/MortgageFragmentParams$MortgageSignFragment;", "Lcom/avito/android/mortgage/MortgageFragmentParams$MortgageVerificationFlowFragment;", "Lcom/avito/android/mortgage/MortgageFragmentParams$PreApprovalFormFragment;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface MortgageFragmentParams extends Parcelable {

    /* compiled from: MortgageFragmentParams.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/MortgageFragmentParams$MortgageApplicationsListFragment;", "Lcom/avito/android/mortgage/MortgageFragmentParams;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class MortgageApplicationsListFragment implements MortgageFragmentParams {

        @k
        public static final Parcelable.Creator<MortgageApplicationsListFragment> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApplicationsListArguments f198152b;

        /* compiled from: MortgageFragmentParams.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<MortgageApplicationsListFragment> {
            @Override // android.os.Parcelable.Creator
            public final MortgageApplicationsListFragment createFromParcel(Parcel parcel) {
                return new MortgageApplicationsListFragment(ApplicationsListArguments.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final MortgageApplicationsListFragment[] newArray(int i12) {
                return new MortgageApplicationsListFragment[i12];
            }
        }

        public MortgageApplicationsListFragment(@k ApplicationsListArguments applicationsListArguments) {
            this.f198152b = applicationsListArguments;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MortgageApplicationsListFragment) && L.f(this.f198152b, ((MortgageApplicationsListFragment) obj).f198152b);
        }

        public final int hashCode() {
            return this.f198152b.f198335b.hashCode();
        }

        @k
        public final String toString() {
            return "MortgageApplicationsListFragment(args=" + this.f198152b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.f198152b.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: MortgageFragmentParams.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/MortgageFragmentParams$MortgageDocumentsUploadFragment;", "Lcom/avito/android/mortgage/MortgageFragmentParams;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class MortgageDocumentsUploadFragment implements MortgageFragmentParams {

        @k
        public static final Parcelable.Creator<MortgageDocumentsUploadFragment> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DocumentUploadArguments f198153b;

        /* compiled from: MortgageFragmentParams.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<MortgageDocumentsUploadFragment> {
            @Override // android.os.Parcelable.Creator
            public final MortgageDocumentsUploadFragment createFromParcel(Parcel parcel) {
                return new MortgageDocumentsUploadFragment(DocumentUploadArguments.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final MortgageDocumentsUploadFragment[] newArray(int i12) {
                return new MortgageDocumentsUploadFragment[i12];
            }
        }

        public MortgageDocumentsUploadFragment(@k DocumentUploadArguments documentUploadArguments) {
            this.f198153b = documentUploadArguments;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MortgageDocumentsUploadFragment) && L.f(this.f198153b, ((MortgageDocumentsUploadFragment) obj).f198153b);
        }

        public final int hashCode() {
            return this.f198153b.hashCode();
        }

        @k
        public final String toString() {
            return "MortgageDocumentsUploadFragment(args=" + this.f198153b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.f198153b.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: MortgageFragmentParams.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/MortgageFragmentParams$MortgageFormFragment;", "Lcom/avito/android/mortgage/MortgageFragmentParams;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class MortgageFormFragment implements MortgageFragmentParams {

        @k
        public static final Parcelable.Creator<MortgageFormFragment> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PersonFormArguments f198154b;

        /* compiled from: MortgageFragmentParams.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<MortgageFormFragment> {
            @Override // android.os.Parcelable.Creator
            public final MortgageFormFragment createFromParcel(Parcel parcel) {
                return new MortgageFormFragment(PersonFormArguments.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final MortgageFormFragment[] newArray(int i12) {
                return new MortgageFormFragment[i12];
            }
        }

        public MortgageFormFragment(@k PersonFormArguments personFormArguments) {
            this.f198154b = personFormArguments;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MortgageFormFragment) && L.f(this.f198154b, ((MortgageFormFragment) obj).f198154b);
        }

        public final int hashCode() {
            return this.f198154b.hashCode();
        }

        @k
        public final String toString() {
            return "MortgageFormFragment(args=" + this.f198154b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.f198154b.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: MortgageFragmentParams.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/MortgageFragmentParams$MortgageLandingFragment;", "Lcom/avito/android/mortgage/MortgageFragmentParams;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class MortgageLandingFragment implements MortgageFragmentParams {

        @k
        public static final Parcelable.Creator<MortgageLandingFragment> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final LandingArguments f198155b;

        /* compiled from: MortgageFragmentParams.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<MortgageLandingFragment> {
            @Override // android.os.Parcelable.Creator
            public final MortgageLandingFragment createFromParcel(Parcel parcel) {
                return new MortgageLandingFragment(LandingArguments.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final MortgageLandingFragment[] newArray(int i12) {
                return new MortgageLandingFragment[i12];
            }
        }

        public MortgageLandingFragment(@k LandingArguments landingArguments) {
            this.f198155b = landingArguments;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MortgageLandingFragment) && L.f(this.f198155b, ((MortgageLandingFragment) obj).f198155b);
        }

        public final int hashCode() {
            return this.f198155b.hashCode();
        }

        @k
        public final String toString() {
            return "MortgageLandingFragment(args=" + this.f198155b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.f198155b.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: MortgageFragmentParams.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/MortgageFragmentParams$MortgageRootFragment;", "Lcom/avito/android/mortgage/MortgageFragmentParams;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class MortgageRootFragment implements MortgageFragmentParams {

        @k
        public static final Parcelable.Creator<MortgageRootFragment> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final MortgageRootArguments f198156b;

        /* compiled from: MortgageFragmentParams.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<MortgageRootFragment> {
            @Override // android.os.Parcelable.Creator
            public final MortgageRootFragment createFromParcel(Parcel parcel) {
                return new MortgageRootFragment(MortgageRootArguments.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final MortgageRootFragment[] newArray(int i12) {
                return new MortgageRootFragment[i12];
            }
        }

        public MortgageRootFragment(@k MortgageRootArguments mortgageRootArguments) {
            this.f198156b = mortgageRootArguments;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MortgageRootFragment) && L.f(this.f198156b, ((MortgageRootFragment) obj).f198156b);
        }

        public final int hashCode() {
            return this.f198156b.f202933b.hashCode();
        }

        @k
        public final String toString() {
            return "MortgageRootFragment(args=" + this.f198156b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.f198156b.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: MortgageFragmentParams.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/MortgageFragmentParams$MortgageSignFragment;", "Lcom/avito/android/mortgage/MortgageFragmentParams;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class MortgageSignFragment implements MortgageFragmentParams {

        @k
        public static final Parcelable.Creator<MortgageSignFragment> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SignArguments f198157b;

        /* compiled from: MortgageFragmentParams.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<MortgageSignFragment> {
            @Override // android.os.Parcelable.Creator
            public final MortgageSignFragment createFromParcel(Parcel parcel) {
                return new MortgageSignFragment(SignArguments.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final MortgageSignFragment[] newArray(int i12) {
                return new MortgageSignFragment[i12];
            }
        }

        public MortgageSignFragment(@k SignArguments signArguments) {
            this.f198157b = signArguments;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MortgageSignFragment) && L.f(this.f198157b, ((MortgageSignFragment) obj).f198157b);
        }

        public final int hashCode() {
            return this.f198157b.hashCode();
        }

        @k
        public final String toString() {
            return "MortgageSignFragment(args=" + this.f198157b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.f198157b.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: MortgageFragmentParams.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/MortgageFragmentParams$MortgageVerificationFlowFragment;", "Lcom/avito/android/mortgage/MortgageFragmentParams;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class MortgageVerificationFlowFragment implements MortgageFragmentParams {

        @k
        public static final Parcelable.Creator<MortgageVerificationFlowFragment> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final VerificationFlowArguments f198158b;

        /* compiled from: MortgageFragmentParams.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<MortgageVerificationFlowFragment> {
            @Override // android.os.Parcelable.Creator
            public final MortgageVerificationFlowFragment createFromParcel(Parcel parcel) {
                return new MortgageVerificationFlowFragment(VerificationFlowArguments.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final MortgageVerificationFlowFragment[] newArray(int i12) {
                return new MortgageVerificationFlowFragment[i12];
            }
        }

        public MortgageVerificationFlowFragment(@k VerificationFlowArguments verificationFlowArguments) {
            this.f198158b = verificationFlowArguments;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MortgageVerificationFlowFragment) && L.f(this.f198158b, ((MortgageVerificationFlowFragment) obj).f198158b);
        }

        public final int hashCode() {
            return this.f198158b.hashCode();
        }

        @k
        public final String toString() {
            return "MortgageVerificationFlowFragment(args=" + this.f198158b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.f198158b.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: MortgageFragmentParams.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/MortgageFragmentParams$PreApprovalFormFragment;", "Lcom/avito/android/mortgage/MortgageFragmentParams;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class PreApprovalFormFragment implements MortgageFragmentParams {

        @k
        public static final Parcelable.Creator<PreApprovalFormFragment> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PreApprovalArguments f198159b;

        /* compiled from: MortgageFragmentParams.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<PreApprovalFormFragment> {
            @Override // android.os.Parcelable.Creator
            public final PreApprovalFormFragment createFromParcel(Parcel parcel) {
                return new PreApprovalFormFragment(PreApprovalArguments.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final PreApprovalFormFragment[] newArray(int i12) {
                return new PreApprovalFormFragment[i12];
            }
        }

        public PreApprovalFormFragment(@k PreApprovalArguments preApprovalArguments) {
            this.f198159b = preApprovalArguments;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PreApprovalFormFragment) && L.f(this.f198159b, ((PreApprovalFormFragment) obj).f198159b);
        }

        public final int hashCode() {
            return this.f198159b.hashCode();
        }

        @k
        public final String toString() {
            return "PreApprovalFormFragment(args=" + this.f198159b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.f198159b.writeToParcel(parcel, i12);
        }
    }
}
