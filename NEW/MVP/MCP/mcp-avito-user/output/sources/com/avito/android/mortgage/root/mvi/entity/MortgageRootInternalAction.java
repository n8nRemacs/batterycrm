package com.avito.android.mortgage.root.mvi.entity;

import AK.c;
import JZ.d;
import KZ.C14285o;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mortgage.acceptance_dialog.model.AcceptanceDialogArguments;
import com.avito.android.mortgage.api.model.ConfirmCloseContent;
import com.avito.android.mortgage.api.model.items.application.ApplicationProcessType;
import com.avito.android.mortgage.api.model.items.form.SuggestFormSuggestType;
import com.avito.android.mortgage.applicant_type.model.ApplicantTypeSelectorArguments;
import com.avito.android.mortgage.root.list.items.bank.details.model.MortgageRootBankDetails;
import com.avito.android.mortgage.root.list.items.immutable_info.description.model.ImmutableInfoDescriptionArguments;
import com.avito.android.mortgage.root.list.items.realty_object_details.DetailsBlockOption;
import com.avito.android.mortgage.root.model.MortgageRootArguments;
import com.avito.android.mortgage.selected_appeal.model.SelectedAppealArguments;
import com.avito.android.mortgage.sending_confirm.model.SendingConfirmArguments;
import com.avito.android.mortgage.steps_details.model.StepsDetailsArguments;
import com.avito.android.mortgage.terms.model.MortgageTermsArguments;
import com.avito.android.remote.error.ApiError;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MortgageRootInternalAction.kt */
@Metadata(d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b8\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:8\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789\u0082\u00018:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopq¨\u0006r"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ApplicationDeleteCompleted", "ApplicationDeleteFailed", "ApplicationDeleteStarted", "ApplicationLoadingCompleted", "ApplicationLoadingFailed", "ApplicationLoadingStarted", "ApplicationPollingCompleted", "ApplicationPollingFailed", "ApplicationPollingStarted", "ApplicationReloadingCompleted", "ApplicationReloadingFailed", "ApplicationReloadingStarted", "BannerClicked", "CloseConfirmed", "CloseDeclined", "CreateApplicantLoadingCompleted", "CreateApplicantLoadingFailed", "CreateApplicantLoadingStarted", "DeleteApplicant", "GoBack", "HandleDeeplink", "InitState", "NavigationHideChanged", "NeedReload", "OpenAcceptDialog", "OpenApplicantTypeSelector", "OpenBankApplicationLoadingCompleted", "OpenBankApplicationLoadingFailed", "OpenBankApplicationLoadingStarted", "OpenBankDetails", "OpenConfirmCloseDialog", "OpenDetails", "OpenImmutableDataDescription", "OpenMortgageTerms", "OpenSelectedAppeal", "OpenSendingConfirm", "RealtyObjectDetailSubmitValidationFailed", "RealtyObjectDetailsAddressFillByHandClicked", "RealtyObjectDetailsAddressFocused", "RealtyObjectDetailsFirstFieldUpdated", "RealtyObjectDetailsOptionSelected", "RealtyObjectDetailsSecondFieldUpdated", "RealtyObjectIsAvitoItemOptionSelected", "RealtyObjectUpsertCompleted", "RealtyObjectUpsertFailed", "RealtyObjectUpsertStarted", "ScreenScrolled", "SelectBankLoadingCompleted", "SelectBankLoadingFailed", "SignChangeSelected", "StatusReloadClicked", "StepLoadingCompleted", "StepLoadingFailed", "StepLoadingStarted", "UpdateBankSelectionLoadingStarted", "UpdateSelectedBanksTab", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$ApplicationDeleteCompleted;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$ApplicationDeleteFailed;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$ApplicationDeleteStarted;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$ApplicationLoadingCompleted;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$ApplicationLoadingFailed;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$ApplicationLoadingStarted;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$ApplicationPollingCompleted;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$ApplicationPollingFailed;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$ApplicationPollingStarted;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$ApplicationReloadingCompleted;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$ApplicationReloadingFailed;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$ApplicationReloadingStarted;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$BannerClicked;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$CloseConfirmed;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$CloseDeclined;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$CreateApplicantLoadingCompleted;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$CreateApplicantLoadingFailed;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$CreateApplicantLoadingStarted;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$DeleteApplicant;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$GoBack;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$HandleDeeplink;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$InitState;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$NavigationHideChanged;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$NeedReload;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$OpenAcceptDialog;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$OpenApplicantTypeSelector;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$OpenBankApplicationLoadingCompleted;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$OpenBankApplicationLoadingFailed;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$OpenBankApplicationLoadingStarted;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$OpenBankDetails;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$OpenConfirmCloseDialog;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$OpenDetails;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$OpenImmutableDataDescription;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$OpenMortgageTerms;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$OpenSelectedAppeal;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$OpenSendingConfirm;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$RealtyObjectDetailSubmitValidationFailed;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$RealtyObjectDetailsAddressFillByHandClicked;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$RealtyObjectDetailsAddressFocused;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$RealtyObjectDetailsFirstFieldUpdated;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$RealtyObjectDetailsOptionSelected;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$RealtyObjectDetailsSecondFieldUpdated;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$RealtyObjectIsAvitoItemOptionSelected;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$RealtyObjectUpsertCompleted;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$RealtyObjectUpsertFailed;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$RealtyObjectUpsertStarted;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$ScreenScrolled;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$SelectBankLoadingCompleted;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$SelectBankLoadingFailed;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$SignChangeSelected;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$StatusReloadClicked;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$StepLoadingCompleted;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$StepLoadingFailed;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$StepLoadingStarted;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$UpdateBankSelectionLoadingStarted;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$UpdateSelectedBanksTab;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface MortgageRootInternalAction extends n {

    /* compiled from: MortgageRootInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$ApplicationDeleteCompleted;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ApplicationDeleteCompleted implements MortgageRootInternalAction, TrackableContent {
        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF314462e() {
            return "root_application_delete_loading";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF314460f() {
            return "root_application_delete_loading";
        }
    }

    /* compiled from: MortgageRootInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$ApplicationDeleteFailed;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ApplicationDeleteFailed implements MortgageRootInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f203157b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f203158c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f203159d = "root_application_delete_loading";

        public ApplicationDeleteFailed(@k ApiError apiError) {
            this.f203157b = apiError;
            this.f203158c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF314462e() {
            return this.f203159d;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF314460f() {
            return this.f203159d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ApplicationDeleteFailed) && L.f(this.f203157b, ((ApplicationDeleteFailed) obj).f203157b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF314423d() {
            return this.f203158c;
        }

        public final int hashCode() {
            return this.f203157b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("ApplicationDeleteFailed(error="), this.f203157b, ')');
        }
    }

    /* compiled from: MortgageRootInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$ApplicationDeleteStarted;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ApplicationDeleteStarted extends TrackableLoadingStarted implements MortgageRootInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f203160d = "root_application_delete_loading";

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF314462e() {
            return this.f203160d;
        }
    }

    /* compiled from: MortgageRootInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$ApplicationLoadingCompleted;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ApplicationLoadingCompleted implements MortgageRootInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final JZ.c f203161b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<C14285o> f203162c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final d f203163d;

        public ApplicationLoadingCompleted(@k JZ.c cVar, @k List<C14285o> list, @k d dVar) {
            this.f203161b = cVar;
            this.f203162c = list;
            this.f203163d = dVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF314462e() {
            return "root_application_loading";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF314460f() {
            return "root_application_loading";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ApplicationLoadingCompleted)) {
                return false;
            }
            ApplicationLoadingCompleted applicationLoadingCompleted = (ApplicationLoadingCompleted) obj;
            return L.f(this.f203161b, applicationLoadingCompleted.f203161b) && L.f(this.f203162c, applicationLoadingCompleted.f203162c) && L.f(this.f203163d, applicationLoadingCompleted.f203163d);
        }

        public final int hashCode() {
            return this.f203163d.hashCode() + H.e(this.f203161b.hashCode() * 31, 31, this.f203162c);
        }

        @k
        public final String toString() {
            return "ApplicationLoadingCompleted(header=" + this.f203161b + ", items=" + this.f203162c + ", metaInfo=" + this.f203163d + ')';
        }
    }

    /* compiled from: MortgageRootInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$ApplicationLoadingFailed;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ApplicationLoadingFailed implements MortgageRootInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f203164b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f203165c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f203166d = "root_application_loading";

        public ApplicationLoadingFailed(@k ApiError apiError) {
            this.f203164b = apiError;
            this.f203165c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF314462e() {
            return this.f203166d;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF314460f() {
            return this.f203166d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ApplicationLoadingFailed) && L.f(this.f203164b, ((ApplicationLoadingFailed) obj).f203164b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF314423d() {
            return this.f203165c;
        }

        public final int hashCode() {
            return this.f203164b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("ApplicationLoadingFailed(error="), this.f203164b, ')');
        }
    }

    /* compiled from: MortgageRootInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$ApplicationLoadingStarted;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ApplicationLoadingStarted extends TrackableLoadingStarted implements MortgageRootInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f203167d = "root_application_loading";

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF314462e() {
            return this.f203167d;
        }
    }

    /* compiled from: MortgageRootInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$ApplicationPollingCompleted;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ApplicationPollingCompleted implements MortgageRootInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final JZ.c f203168b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<C14285o> f203169c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final d f203170d;

        public ApplicationPollingCompleted(@k JZ.c cVar, @k List<C14285o> list, @k d dVar) {
            this.f203168b = cVar;
            this.f203169c = list;
            this.f203170d = dVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF314462e() {
            return "root_application_polling";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF314460f() {
            return "root_application_polling";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ApplicationPollingCompleted)) {
                return false;
            }
            ApplicationPollingCompleted applicationPollingCompleted = (ApplicationPollingCompleted) obj;
            return L.f(this.f203168b, applicationPollingCompleted.f203168b) && L.f(this.f203169c, applicationPollingCompleted.f203169c) && L.f(this.f203170d, applicationPollingCompleted.f203170d);
        }

        public final int hashCode() {
            return this.f203170d.hashCode() + H.e(this.f203168b.hashCode() * 31, 31, this.f203169c);
        }

        @k
        public final String toString() {
            return "ApplicationPollingCompleted(header=" + this.f203168b + ", items=" + this.f203169c + ", metaInfo=" + this.f203170d + ')';
        }
    }

    /* compiled from: MortgageRootInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$ApplicationPollingFailed;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ApplicationPollingFailed implements MortgageRootInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f203171b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f203172c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f203173d = "root_application_polling";

        public ApplicationPollingFailed(@k ApiError apiError) {
            this.f203171b = apiError;
            this.f203172c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF314462e() {
            return this.f203173d;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF314460f() {
            return this.f203173d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ApplicationPollingFailed) && L.f(this.f203171b, ((ApplicationPollingFailed) obj).f203171b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF314423d() {
            return this.f203172c;
        }

        public final int hashCode() {
            return this.f203171b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("ApplicationPollingFailed(error="), this.f203171b, ')');
        }
    }

    /* compiled from: MortgageRootInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$ApplicationPollingStarted;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ApplicationPollingStarted extends TrackableLoadingStarted implements MortgageRootInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f203174d = "root_application_polling";

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF314462e() {
            return this.f203174d;
        }
    }

    /* compiled from: MortgageRootInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$ApplicationReloadingCompleted;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ApplicationReloadingCompleted implements MortgageRootInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final JZ.c f203175b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<C14285o> f203176c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final d f203177d;

        public ApplicationReloadingCompleted(@k JZ.c cVar, @k List<C14285o> list, @k d dVar) {
            this.f203175b = cVar;
            this.f203176c = list;
            this.f203177d = dVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF314462e() {
            return "root_application_reloading";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF314460f() {
            return "root_application_reloading";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ApplicationReloadingCompleted)) {
                return false;
            }
            ApplicationReloadingCompleted applicationReloadingCompleted = (ApplicationReloadingCompleted) obj;
            return L.f(this.f203175b, applicationReloadingCompleted.f203175b) && L.f(this.f203176c, applicationReloadingCompleted.f203176c) && L.f(this.f203177d, applicationReloadingCompleted.f203177d);
        }

        public final int hashCode() {
            return this.f203177d.hashCode() + H.e(this.f203175b.hashCode() * 31, 31, this.f203176c);
        }

        @k
        public final String toString() {
            return "ApplicationReloadingCompleted(header=" + this.f203175b + ", items=" + this.f203176c + ", metaInfo=" + this.f203177d + ')';
        }
    }

    /* compiled from: MortgageRootInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$ApplicationReloadingFailed;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ApplicationReloadingFailed implements MortgageRootInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f203178b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f203179c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f203180d = "root_application_reloading";

        public ApplicationReloadingFailed(@k ApiError apiError) {
            this.f203178b = apiError;
            this.f203179c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF314462e() {
            return this.f203180d;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF314460f() {
            return this.f203180d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ApplicationReloadingFailed) && L.f(this.f203178b, ((ApplicationReloadingFailed) obj).f203178b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF314423d() {
            return this.f203179c;
        }

        public final int hashCode() {
            return this.f203178b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("ApplicationReloadingFailed(error="), this.f203178b, ')');
        }
    }

    /* compiled from: MortgageRootInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$ApplicationReloadingStarted;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ApplicationReloadingStarted extends TrackableLoadingStarted implements MortgageRootInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f203181d = "root_application_reloading";

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF314462e() {
            return this.f203181d;
        }
    }

    /* compiled from: MortgageRootInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$BannerClicked;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BannerClicked implements MortgageRootInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final BannerClicked f203182b = new BannerClicked();

        private BannerClicked() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof BannerClicked);
        }

        public final int hashCode() {
            return 2007718742;
        }

        @k
        public final String toString() {
            return "BannerClicked";
        }
    }

    /* compiled from: MortgageRootInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$CloseConfirmed;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseConfirmed implements MortgageRootInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseConfirmed f203183b = new CloseConfirmed();

        private CloseConfirmed() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseConfirmed);
        }

        public final int hashCode() {
            return -1768857684;
        }

        @k
        public final String toString() {
            return "CloseConfirmed";
        }
    }

    /* compiled from: MortgageRootInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$CloseDeclined;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseDeclined implements MortgageRootInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseDeclined f203184b = new CloseDeclined();

        private CloseDeclined() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseDeclined);
        }

        public final int hashCode() {
            return 1645453889;
        }

        @k
        public final String toString() {
            return "CloseDeclined";
        }
    }

    /* compiled from: MortgageRootInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$CreateApplicantLoadingCompleted;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CreateApplicantLoadingCompleted implements MortgageRootInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final JZ.c f203185b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<C14285o> f203186c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final d f203187d;

        public CreateApplicantLoadingCompleted(@k JZ.c cVar, @k List<C14285o> list, @k d dVar) {
            this.f203185b = cVar;
            this.f203186c = list;
            this.f203187d = dVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF314462e() {
            return "root_create_applicant_loading";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF314460f() {
            return "root_create_applicant_loading";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CreateApplicantLoadingCompleted)) {
                return false;
            }
            CreateApplicantLoadingCompleted createApplicantLoadingCompleted = (CreateApplicantLoadingCompleted) obj;
            return L.f(this.f203185b, createApplicantLoadingCompleted.f203185b) && L.f(this.f203186c, createApplicantLoadingCompleted.f203186c) && L.f(this.f203187d, createApplicantLoadingCompleted.f203187d);
        }

        public final int hashCode() {
            return this.f203187d.hashCode() + H.e(this.f203185b.hashCode() * 31, 31, this.f203186c);
        }

        @k
        public final String toString() {
            return "CreateApplicantLoadingCompleted(header=" + this.f203185b + ", items=" + this.f203186c + ", metaInfo=" + this.f203187d + ')';
        }
    }

    /* compiled from: MortgageRootInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$CreateApplicantLoadingFailed;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CreateApplicantLoadingFailed implements MortgageRootInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f203188b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f203189c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f203190d = "root_create_applicant_loading";

        public CreateApplicantLoadingFailed(@k ApiError apiError) {
            this.f203188b = apiError;
            this.f203189c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF314462e() {
            return this.f203190d;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF314460f() {
            return this.f203190d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CreateApplicantLoadingFailed) && L.f(this.f203188b, ((CreateApplicantLoadingFailed) obj).f203188b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF314423d() {
            return this.f203189c;
        }

        public final int hashCode() {
            return this.f203188b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("CreateApplicantLoadingFailed(error="), this.f203188b, ')');
        }
    }

    /* compiled from: MortgageRootInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$CreateApplicantLoadingStarted;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CreateApplicantLoadingStarted extends TrackableLoadingStarted implements MortgageRootInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f203191d = "root_create_applicant_loading";

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF314462e() {
            return this.f203191d;
        }
    }

    /* compiled from: MortgageRootInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$DeleteApplicant;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DeleteApplicant implements MortgageRootInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final DeleteApplicant f203192b = new DeleteApplicant();

        private DeleteApplicant() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof DeleteApplicant);
        }

        public final int hashCode() {
            return -1654869294;
        }

        @k
        public final String toString() {
            return "DeleteApplicant";
        }
    }

    /* compiled from: MortgageRootInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$GoBack;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class GoBack implements MortgageRootInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final GoBack f203193b = new GoBack();

        private GoBack() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof GoBack);
        }

        public final int hashCode() {
            return -1835292076;
        }

        @k
        public final String toString() {
            return "GoBack";
        }
    }

    /* compiled from: MortgageRootInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$HandleDeeplink;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements MortgageRootInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f203194b;

        public HandleDeeplink(@k DeepLink deepLink) {
            this.f203194b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleDeeplink) && L.f(this.f203194b, ((HandleDeeplink) obj).f203194b);
        }

        public final int hashCode() {
            return this.f203194b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f203194b, ')');
        }
    }

    /* compiled from: MortgageRootInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$InitState;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InitState implements MortgageRootInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final MortgageRootArguments f203195b;

        public InitState(@k MortgageRootArguments mortgageRootArguments) {
            this.f203195b = mortgageRootArguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitState) && L.f(this.f203195b, ((InitState) obj).f203195b);
        }

        public final int hashCode() {
            return this.f203195b.f202933b.hashCode();
        }

        @k
        public final String toString() {
            return "InitState(args=" + this.f203195b + ')';
        }
    }

    /* compiled from: MortgageRootInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$NavigationHideChanged;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NavigationHideChanged implements MortgageRootInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f203196b;

        public NavigationHideChanged(boolean z12) {
            this.f203196b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NavigationHideChanged) && this.f203196b == ((NavigationHideChanged) obj).f203196b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f203196b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("NavigationHideChanged(isOutOfScreen="), this.f203196b, ')');
        }
    }

    /* compiled from: MortgageRootInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$NeedReload;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NeedReload implements MortgageRootInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final NeedReload f203197b = new NeedReload();

        private NeedReload() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof NeedReload);
        }

        public final int hashCode() {
            return -972829772;
        }

        @k
        public final String toString() {
            return "NeedReload";
        }
    }

    /* compiled from: MortgageRootInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$OpenAcceptDialog;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenAcceptDialog implements MortgageRootInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AcceptanceDialogArguments f203198b;

        public OpenAcceptDialog(@k AcceptanceDialogArguments acceptanceDialogArguments) {
            this.f203198b = acceptanceDialogArguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenAcceptDialog) && L.f(this.f203198b, ((OpenAcceptDialog) obj).f203198b);
        }

        public final int hashCode() {
            return this.f203198b.hashCode();
        }

        @k
        public final String toString() {
            return "OpenAcceptDialog(arguments=" + this.f203198b + ')';
        }
    }

    /* compiled from: MortgageRootInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$OpenApplicantTypeSelector;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenApplicantTypeSelector implements MortgageRootInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApplicantTypeSelectorArguments f203199b;

        public OpenApplicantTypeSelector(@k ApplicantTypeSelectorArguments applicantTypeSelectorArguments) {
            this.f203199b = applicantTypeSelectorArguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenApplicantTypeSelector) && L.f(this.f203199b, ((OpenApplicantTypeSelector) obj).f203199b);
        }

        public final int hashCode() {
            return this.f203199b.hashCode();
        }

        @k
        public final String toString() {
            return "OpenApplicantTypeSelector(args=" + this.f203199b + ')';
        }
    }

    /* compiled from: MortgageRootInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$OpenBankApplicationLoadingCompleted;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenBankApplicationLoadingCompleted implements MortgageRootInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f203200b;

        public OpenBankApplicationLoadingCompleted(@k DeepLink deepLink) {
            this.f203200b = deepLink;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF314462e() {
            return "OPEN_BANK_APPLICATION_LOADING_CONTENT_TYPE";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF314460f() {
            return "OPEN_BANK_APPLICATION_LOADING_CONTENT_TYPE";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenBankApplicationLoadingCompleted) && L.f(this.f203200b, ((OpenBankApplicationLoadingCompleted) obj).f203200b);
        }

        public final int hashCode() {
            return this.f203200b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("OpenBankApplicationLoadingCompleted(applicationDeeplink="), this.f203200b, ')');
        }
    }

    /* compiled from: MortgageRootInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$OpenBankApplicationLoadingFailed;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenBankApplicationLoadingFailed implements MortgageRootInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f203201b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f203202c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f203203d = "OPEN_BANK_APPLICATION_LOADING_CONTENT_TYPE";

        public OpenBankApplicationLoadingFailed(@k ApiError apiError) {
            this.f203201b = apiError;
            this.f203202c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF314462e() {
            return this.f203203d;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF314460f() {
            return this.f203203d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenBankApplicationLoadingFailed) && L.f(this.f203201b, ((OpenBankApplicationLoadingFailed) obj).f203201b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF314423d() {
            return this.f203202c;
        }

        public final int hashCode() {
            return this.f203201b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("OpenBankApplicationLoadingFailed(error="), this.f203201b, ')');
        }
    }

    /* compiled from: MortgageRootInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$OpenBankApplicationLoadingStarted;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenBankApplicationLoadingStarted extends TrackableLoadingStarted implements MortgageRootInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f203204d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f203205e = "OPEN_BANK_APPLICATION_LOADING_CONTENT_TYPE";

        public OpenBankApplicationLoadingStarted(@k String str) {
            this.f203204d = str;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF314462e() {
            return this.f203205e;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenBankApplicationLoadingStarted) && L.f(this.f203204d, ((OpenBankApplicationLoadingStarted) obj).f203204d);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final int hashCode() {
            return this.f203204d.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenBankApplicationLoadingStarted(bankId="), this.f203204d, ')');
        }
    }

    /* compiled from: MortgageRootInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$OpenBankDetails;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenBankDetails implements MortgageRootInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final MortgageRootBankDetails f203206b;

        public OpenBankDetails(@k MortgageRootBankDetails mortgageRootBankDetails) {
            this.f203206b = mortgageRootBankDetails;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenBankDetails) && L.f(this.f203206b, ((OpenBankDetails) obj).f203206b);
        }

        public final int hashCode() {
            return this.f203206b.hashCode();
        }

        @k
        public final String toString() {
            return "OpenBankDetails(details=" + this.f203206b + ')';
        }
    }

    /* compiled from: MortgageRootInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$OpenConfirmCloseDialog;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenConfirmCloseDialog implements MortgageRootInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ConfirmCloseContent f203207b;

        public OpenConfirmCloseDialog(@k ConfirmCloseContent confirmCloseContent) {
            this.f203207b = confirmCloseContent;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenConfirmCloseDialog) && L.f(this.f203207b, ((OpenConfirmCloseDialog) obj).f203207b);
        }

        public final int hashCode() {
            return this.f203207b.hashCode();
        }

        @k
        public final String toString() {
            return "OpenConfirmCloseDialog(content=" + this.f203207b + ')';
        }
    }

    /* compiled from: MortgageRootInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$OpenDetails;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDetails implements MortgageRootInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final StepsDetailsArguments f203208b;

        public OpenDetails(@k StepsDetailsArguments stepsDetailsArguments) {
            this.f203208b = stepsDetailsArguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDetails) && L.f(this.f203208b, ((OpenDetails) obj).f203208b);
        }

        public final int hashCode() {
            return this.f203208b.hashCode();
        }

        @k
        public final String toString() {
            return "OpenDetails(args=" + this.f203208b + ')';
        }
    }

    /* compiled from: MortgageRootInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$OpenImmutableDataDescription;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenImmutableDataDescription implements MortgageRootInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ImmutableInfoDescriptionArguments f203209b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f203210c;

        public OpenImmutableDataDescription(@k ImmutableInfoDescriptionArguments immutableInfoDescriptionArguments, @k String str) {
            this.f203209b = immutableInfoDescriptionArguments;
            this.f203210c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenImmutableDataDescription)) {
                return false;
            }
            OpenImmutableDataDescription openImmutableDataDescription = (OpenImmutableDataDescription) obj;
            return L.f(this.f203209b, openImmutableDataDescription.f203209b) && L.f(this.f203210c, openImmutableDataDescription.f203210c);
        }

        public final int hashCode() {
            return this.f203210c.hashCode() + (this.f203209b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenImmutableDataDescription(arguments=");
            sb2.append(this.f203209b);
            sb2.append(", applicantType=");
            return C22026a.c(sb2, this.f203210c, ')');
        }
    }

    /* compiled from: MortgageRootInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$OpenMortgageTerms;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenMortgageTerms implements MortgageRootInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final MortgageTermsArguments f203211b;

        public OpenMortgageTerms(@k MortgageTermsArguments mortgageTermsArguments) {
            this.f203211b = mortgageTermsArguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenMortgageTerms) && L.f(this.f203211b, ((OpenMortgageTerms) obj).f203211b);
        }

        public final int hashCode() {
            return this.f203211b.hashCode();
        }

        @k
        public final String toString() {
            return "OpenMortgageTerms(args=" + this.f203211b + ')';
        }
    }

    /* compiled from: MortgageRootInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$OpenSelectedAppeal;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenSelectedAppeal implements MortgageRootInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SelectedAppealArguments f203212b;

        public OpenSelectedAppeal(@k SelectedAppealArguments selectedAppealArguments) {
            this.f203212b = selectedAppealArguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenSelectedAppeal) && L.f(this.f203212b, ((OpenSelectedAppeal) obj).f203212b);
        }

        public final int hashCode() {
            return this.f203212b.hashCode();
        }

        @k
        public final String toString() {
            return "OpenSelectedAppeal(args=" + this.f203212b + ')';
        }
    }

    /* compiled from: MortgageRootInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$OpenSendingConfirm;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenSendingConfirm implements MortgageRootInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SendingConfirmArguments f203213b;

        public OpenSendingConfirm(@k SendingConfirmArguments sendingConfirmArguments) {
            this.f203213b = sendingConfirmArguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenSendingConfirm) && L.f(this.f203213b, ((OpenSendingConfirm) obj).f203213b);
        }

        public final int hashCode() {
            return this.f203213b.hashCode();
        }

        @k
        public final String toString() {
            return "OpenSendingConfirm(args=" + this.f203213b + ')';
        }
    }

    /* compiled from: MortgageRootInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$RealtyObjectDetailSubmitValidationFailed;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RealtyObjectDetailSubmitValidationFailed implements MortgageRootInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Object f203214b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ApplicationProcessType f203215c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f203216d;

        public RealtyObjectDetailSubmitValidationFailed(@k Map<String, String> map, @k ApplicationProcessType applicationProcessType) {
            this.f203214b = map;
            this.f203215c = applicationProcessType;
            this.f203216d = applicationProcessType.toString();
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF314462e() {
            return this.f203216d;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF314460f() {
            return this.f203216d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RealtyObjectDetailSubmitValidationFailed)) {
                return false;
            }
            RealtyObjectDetailSubmitValidationFailed realtyObjectDetailSubmitValidationFailed = (RealtyObjectDetailSubmitValidationFailed) obj;
            return this.f203214b.equals(realtyObjectDetailSubmitValidationFailed.f203214b) && this.f203215c == realtyObjectDetailSubmitValidationFailed.f203215c;
        }

        public final int hashCode() {
            return this.f203215c.hashCode() + (this.f203214b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "RealtyObjectDetailSubmitValidationFailed(validationResult=" + this.f203214b + ", type=" + this.f203215c + ')';
        }
    }

    /* compiled from: MortgageRootInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$RealtyObjectDetailsAddressFillByHandClicked;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RealtyObjectDetailsAddressFillByHandClicked implements MortgageRootInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final RealtyObjectDetailsAddressFillByHandClicked f203217b = new RealtyObjectDetailsAddressFillByHandClicked();

        private RealtyObjectDetailsAddressFillByHandClicked() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof RealtyObjectDetailsAddressFillByHandClicked);
        }

        public final int hashCode() {
            return -766992763;
        }

        @k
        public final String toString() {
            return "RealtyObjectDetailsAddressFillByHandClicked";
        }
    }

    /* compiled from: MortgageRootInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$RealtyObjectDetailsAddressFocused;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RealtyObjectDetailsAddressFocused implements MortgageRootInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f203218b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f203219c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f203220d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final SuggestFormSuggestType f203221e;

        public RealtyObjectDetailsAddressFocused(@k String str, @k String str2, @k String str3, @k SuggestFormSuggestType suggestFormSuggestType) {
            this.f203218b = str;
            this.f203219c = str2;
            this.f203220d = str3;
            this.f203221e = suggestFormSuggestType;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RealtyObjectDetailsAddressFocused)) {
                return false;
            }
            RealtyObjectDetailsAddressFocused realtyObjectDetailsAddressFocused = (RealtyObjectDetailsAddressFocused) obj;
            return L.f(this.f203218b, realtyObjectDetailsAddressFocused.f203218b) && L.f(this.f203219c, realtyObjectDetailsAddressFocused.f203219c) && L.f(this.f203220d, realtyObjectDetailsAddressFocused.f203220d) && this.f203221e == realtyObjectDetailsAddressFocused.f203221e;
        }

        public final int hashCode() {
            return this.f203221e.hashCode() + H.d(H.d(this.f203218b.hashCode() * 31, 31, this.f203219c), 31, this.f203220d);
        }

        @k
        public final String toString() {
            return "RealtyObjectDetailsAddressFocused(fieldTitle=" + this.f203218b + ", fieldValue=" + this.f203219c + ", fieldHint=" + this.f203220d + ", fieldContentType=" + this.f203221e + ')';
        }
    }

    /* compiled from: MortgageRootInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$RealtyObjectDetailsFirstFieldUpdated;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RealtyObjectDetailsFirstFieldUpdated implements MortgageRootInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f203222b;

        public RealtyObjectDetailsFirstFieldUpdated(@k String str) {
            this.f203222b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RealtyObjectDetailsFirstFieldUpdated) && L.f(this.f203222b, ((RealtyObjectDetailsFirstFieldUpdated) obj).f203222b);
        }

        public final int hashCode() {
            return this.f203222b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("RealtyObjectDetailsFirstFieldUpdated(text="), this.f203222b, ')');
        }
    }

    /* compiled from: MortgageRootInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$RealtyObjectDetailsOptionSelected;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RealtyObjectDetailsOptionSelected implements MortgageRootInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DetailsBlockOption.Type f203223b;

        public RealtyObjectDetailsOptionSelected(@k DetailsBlockOption.Type type) {
            this.f203223b = type;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RealtyObjectDetailsOptionSelected) && this.f203223b == ((RealtyObjectDetailsOptionSelected) obj).f203223b;
        }

        public final int hashCode() {
            return this.f203223b.hashCode();
        }

        @k
        public final String toString() {
            return "RealtyObjectDetailsOptionSelected(type=" + this.f203223b + ')';
        }
    }

    /* compiled from: MortgageRootInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$RealtyObjectDetailsSecondFieldUpdated;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RealtyObjectDetailsSecondFieldUpdated implements MortgageRootInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f203224b;

        public RealtyObjectDetailsSecondFieldUpdated(@k String str) {
            this.f203224b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RealtyObjectDetailsSecondFieldUpdated) && L.f(this.f203224b, ((RealtyObjectDetailsSecondFieldUpdated) obj).f203224b);
        }

        public final int hashCode() {
            return this.f203224b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("RealtyObjectDetailsSecondFieldUpdated(text="), this.f203224b, ')');
        }
    }

    /* compiled from: MortgageRootInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$RealtyObjectIsAvitoItemOptionSelected;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RealtyObjectIsAvitoItemOptionSelected implements MortgageRootInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f203225b;

        public RealtyObjectIsAvitoItemOptionSelected(boolean z12) {
            this.f203225b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RealtyObjectIsAvitoItemOptionSelected) && this.f203225b == ((RealtyObjectIsAvitoItemOptionSelected) obj).f203225b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f203225b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("RealtyObjectIsAvitoItemOptionSelected(value="), this.f203225b, ')');
        }
    }

    /* compiled from: MortgageRootInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$RealtyObjectUpsertCompleted;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RealtyObjectUpsertCompleted implements MortgageRootInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Object f203226b;

        public RealtyObjectUpsertCompleted(@k Map<String, String> map) {
            this.f203226b = map;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF314462e() {
            return "UPSERT_REALTY_OBJECT_LOADING_CONTENT_TYPE";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF314460f() {
            return "UPSERT_REALTY_OBJECT_LOADING_CONTENT_TYPE";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RealtyObjectUpsertCompleted) && this.f203226b.equals(((RealtyObjectUpsertCompleted) obj).f203226b);
        }

        public final int hashCode() {
            return this.f203226b.hashCode();
        }

        @k
        public final String toString() {
            return H.n(new StringBuilder("RealtyObjectUpsertCompleted(validationResult="), this.f203226b, ')');
        }
    }

    /* compiled from: MortgageRootInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$RealtyObjectUpsertFailed;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RealtyObjectUpsertFailed implements MortgageRootInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f203227b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f203228c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f203229d = "UPSERT_REALTY_OBJECT_LOADING_CONTENT_TYPE";

        public RealtyObjectUpsertFailed(@k ApiError apiError) {
            this.f203227b = apiError;
            this.f203228c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF314462e() {
            return this.f203229d;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF314460f() {
            return this.f203229d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RealtyObjectUpsertFailed) && L.f(this.f203227b, ((RealtyObjectUpsertFailed) obj).f203227b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF314423d() {
            return this.f203228c;
        }

        public final int hashCode() {
            return this.f203227b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("RealtyObjectUpsertFailed(error="), this.f203227b, ')');
        }
    }

    /* compiled from: MortgageRootInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$RealtyObjectUpsertStarted;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RealtyObjectUpsertStarted extends TrackableLoadingStarted implements MortgageRootInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f203230d = "UPSERT_REALTY_OBJECT_LOADING_CONTENT_TYPE";

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF314462e() {
            return this.f203230d;
        }
    }

    /* compiled from: MortgageRootInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$ScreenScrolled;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ScreenScrolled implements MortgageRootInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f203231b;

        /* renamed from: c, reason: collision with root package name */
        public final int f203232c;

        public ScreenScrolled(int i12, int i13) {
            this.f203231b = i12;
            this.f203232c = i13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ScreenScrolled)) {
                return false;
            }
            ScreenScrolled screenScrolled = (ScreenScrolled) obj;
            return this.f203231b == screenScrolled.f203231b && this.f203232c == screenScrolled.f203232c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f203232c) + (Integer.hashCode(this.f203231b) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ScreenScrolled(firstVisibleItem=");
            sb2.append(this.f203231b);
            sb2.append(", lastVisibleItem=");
            return r.t(sb2, this.f203232c, ')');
        }
    }

    /* compiled from: MortgageRootInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$SelectBankLoadingCompleted;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectBankLoadingCompleted implements MortgageRootInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final JZ.c f203233b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<C14285o> f203234c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final d f203235d;

        public SelectBankLoadingCompleted(@k JZ.c cVar, @k List<C14285o> list, @k d dVar) {
            this.f203233b = cVar;
            this.f203234c = list;
            this.f203235d = dVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF314462e() {
            return "SELECT_BANK_LOADING_CONTENT_TYPE";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF314460f() {
            return "SELECT_BANK_LOADING_CONTENT_TYPE";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectBankLoadingCompleted)) {
                return false;
            }
            SelectBankLoadingCompleted selectBankLoadingCompleted = (SelectBankLoadingCompleted) obj;
            return L.f(this.f203233b, selectBankLoadingCompleted.f203233b) && L.f(this.f203234c, selectBankLoadingCompleted.f203234c) && L.f(this.f203235d, selectBankLoadingCompleted.f203235d);
        }

        public final int hashCode() {
            return this.f203235d.hashCode() + H.e(this.f203233b.hashCode() * 31, 31, this.f203234c);
        }

        @k
        public final String toString() {
            return "SelectBankLoadingCompleted(header=" + this.f203233b + ", items=" + this.f203234c + ", metaInfo=" + this.f203235d + ')';
        }
    }

    /* compiled from: MortgageRootInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$SelectBankLoadingFailed;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectBankLoadingFailed implements MortgageRootInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f203236b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f203237c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f203238d = "SELECT_BANK_LOADING_CONTENT_TYPE";

        public SelectBankLoadingFailed(@k ApiError apiError) {
            this.f203236b = apiError;
            this.f203237c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF314462e() {
            return this.f203238d;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF314460f() {
            return this.f203238d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectBankLoadingFailed) && L.f(this.f203236b, ((SelectBankLoadingFailed) obj).f203236b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF314423d() {
            return this.f203237c;
        }

        public final int hashCode() {
            return this.f203236b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("SelectBankLoadingFailed(error="), this.f203236b, ')');
        }
    }

    /* compiled from: MortgageRootInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$SignChangeSelected;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SignChangeSelected implements MortgageRootInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f203239b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f203240c;

        public SignChangeSelected(@k String str, @l String str2) {
            this.f203239b = str;
            this.f203240c = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SignChangeSelected)) {
                return false;
            }
            SignChangeSelected signChangeSelected = (SignChangeSelected) obj;
            return L.f(this.f203239b, signChangeSelected.f203239b) && L.f(this.f203240c, signChangeSelected.f203240c);
        }

        public final int hashCode() {
            int iHashCode = this.f203239b.hashCode() * 31;
            String str = this.f203240c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SignChangeSelected(applicantId=");
            sb2.append(this.f203239b);
            sb2.append(", applicantType=");
            return C22026a.c(sb2, this.f203240c, ')');
        }
    }

    /* compiled from: MortgageRootInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$StatusReloadClicked;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class StatusReloadClicked implements MortgageRootInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final StatusReloadClicked f203241b = new StatusReloadClicked();

        private StatusReloadClicked() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof StatusReloadClicked);
        }

        public final int hashCode() {
            return 122578231;
        }

        @k
        public final String toString() {
            return "StatusReloadClicked";
        }
    }

    /* compiled from: MortgageRootInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$StepLoadingCompleted;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class StepLoadingCompleted implements MortgageRootInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final JZ.c f203242b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<C14285o> f203243c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final d f203244d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final ApplicationProcessType f203245e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final String f203246f;

        public StepLoadingCompleted(@k JZ.c cVar, @k List<C14285o> list, @k d dVar, @k ApplicationProcessType applicationProcessType) {
            this.f203242b = cVar;
            this.f203243c = list;
            this.f203244d = dVar;
            this.f203245e = applicationProcessType;
            this.f203246f = applicationProcessType.toString();
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF314462e() {
            return this.f203246f;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF314460f() {
            return this.f203246f;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StepLoadingCompleted)) {
                return false;
            }
            StepLoadingCompleted stepLoadingCompleted = (StepLoadingCompleted) obj;
            return L.f(this.f203242b, stepLoadingCompleted.f203242b) && L.f(this.f203243c, stepLoadingCompleted.f203243c) && L.f(this.f203244d, stepLoadingCompleted.f203244d) && this.f203245e == stepLoadingCompleted.f203245e;
        }

        public final int hashCode() {
            return this.f203245e.hashCode() + ((this.f203244d.hashCode() + H.e(this.f203242b.hashCode() * 31, 31, this.f203243c)) * 31);
        }

        @k
        public final String toString() {
            return "StepLoadingCompleted(header=" + this.f203242b + ", items=" + this.f203243c + ", metaInfo=" + this.f203244d + ", type=" + this.f203245e + ')';
        }
    }

    /* compiled from: MortgageRootInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$StepLoadingFailed;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class StepLoadingFailed implements MortgageRootInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f203247b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ApplicationProcessType f203248c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final J.a f203249d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f203250e;

        public StepLoadingFailed(@k ApiError apiError, @k ApplicationProcessType applicationProcessType) {
            this.f203247b = apiError;
            this.f203248c = applicationProcessType;
            this.f203249d = new J.a(apiError);
            this.f203250e = applicationProcessType.toString();
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF314462e() {
            return this.f203250e;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF314460f() {
            return this.f203250e;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StepLoadingFailed)) {
                return false;
            }
            StepLoadingFailed stepLoadingFailed = (StepLoadingFailed) obj;
            return L.f(this.f203247b, stepLoadingFailed.f203247b) && this.f203248c == stepLoadingFailed.f203248c;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF314423d() {
            return this.f203249d;
        }

        public final int hashCode() {
            return this.f203248c.hashCode() + (this.f203247b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "StepLoadingFailed(error=" + this.f203247b + ", type=" + this.f203248c + ')';
        }
    }

    /* compiled from: MortgageRootInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$StepLoadingStarted;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class StepLoadingStarted extends TrackableLoadingStarted implements MortgageRootInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final ApplicationProcessType f203251d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f203252e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final String f203253f;

        public StepLoadingStarted(@k ApplicationProcessType applicationProcessType, boolean z12) {
            this.f203251d = applicationProcessType;
            this.f203252e = z12;
            this.f203253f = applicationProcessType.toString();
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF314462e() {
            return this.f203253f;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StepLoadingStarted)) {
                return false;
            }
            StepLoadingStarted stepLoadingStarted = (StepLoadingStarted) obj;
            return this.f203251d == stepLoadingStarted.f203251d && this.f203252e == stepLoadingStarted.f203252e;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final int hashCode() {
            return Boolean.hashCode(this.f203252e) + (this.f203251d.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("StepLoadingStarted(type=");
            sb2.append(this.f203251d);
            sb2.append(", userClicked=");
            return r.x(sb2, this.f203252e, ')');
        }
    }

    /* compiled from: MortgageRootInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$UpdateBankSelectionLoadingStarted;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateBankSelectionLoadingStarted extends TrackableLoadingStarted implements MortgageRootInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f203254d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f203255e = "SELECT_BANK_LOADING_CONTENT_TYPE";

        public UpdateBankSelectionLoadingStarted(@k String str) {
            this.f203254d = str;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF314462e() {
            return this.f203255e;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateBankSelectionLoadingStarted) && L.f(this.f203254d, ((UpdateBankSelectionLoadingStarted) obj).f203254d);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final int hashCode() {
            return this.f203254d.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("UpdateBankSelectionLoadingStarted(bankId="), this.f203254d, ')');
        }
    }

    /* compiled from: MortgageRootInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction$UpdateSelectedBanksTab;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateSelectedBanksTab implements MortgageRootInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f203256b;

        public UpdateSelectedBanksTab(@k String str) {
            this.f203256b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateSelectedBanksTab) && L.f(this.f203256b, ((UpdateSelectedBanksTab) obj).f203256b);
        }

        public final int hashCode() {
            return this.f203256b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("UpdateSelectedBanksTab(tabState="), this.f203256b, ')');
        }
    }
}
