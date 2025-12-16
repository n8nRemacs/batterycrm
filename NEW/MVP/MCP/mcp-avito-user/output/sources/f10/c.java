package f10;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mortgage.acceptance_dialog.model.AcceptanceDialogArguments;
import com.avito.android.mortgage.api.model.ConfirmCloseContent;
import com.avito.android.mortgage.applicant_type.model.ApplicantTypeSelectorArguments;
import com.avito.android.mortgage.person_form.suggestion.model.SuggestionArguments;
import com.avito.android.mortgage.root.list.items.bank.details.model.MortgageRootBankDetails;
import com.avito.android.mortgage.root.list.items.immutable_info.description.model.ImmutableInfoDescriptionArguments;
import com.avito.android.mortgage.selected_appeal.model.SelectedAppealArguments;
import com.avito.android.mortgage.sending_confirm.model.SendingConfirmArguments;
import com.avito.android.mortgage.steps_details.model.StepsDetailsArguments;
import com.avito.android.mortgage.terms.model.MortgageTermsArguments;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;

/* compiled from: MortgageRootOneTimeEvent.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u000f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0082\u0001\u000f\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"Lf10/c;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "Lf10/c$a;", "Lf10/c$b;", "Lf10/c$c;", "Lf10/c$d;", "Lf10/c$e;", "Lf10/c$f;", "Lf10/c$g;", "Lf10/c$h;", "Lf10/c$i;", "Lf10/c$j;", "Lf10/c$k;", "Lf10/c$l;", "Lf10/c$m;", "Lf10/c$n;", "Lf10/c$o;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface c {

    /* compiled from: MortgageRootOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf10/c$a;", "Lf10/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f395624a;

        public a(@Y61.k DeepLink deepLink) {
            this.f395624a = deepLink;
        }
    }

    /* compiled from: MortgageRootOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf10/c$b;", "Lf10/c;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f395625a = new b();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -690895456;
        }

        @Y61.k
        public final String toString() {
            return "GoBack";
        }
    }

    /* compiled from: MortgageRootOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf10/c$c;", "Lf10/c;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f10.c$c, reason: collision with other inner class name */
    public static final /* data */ class C11122c implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C11122c f395626a = new C11122c();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C11122c);
        }

        public final int hashCode() {
            return 124161200;
        }

        @Y61.k
        public final String toString() {
            return "GoBackWithDeletedResult";
        }
    }

    /* compiled from: MortgageRootOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf10/c$d;", "Lf10/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f395627a;

        public d(@Y61.k DeepLink deepLink) {
            this.f395627a = deepLink;
        }
    }

    /* compiled from: MortgageRootOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf10/c$e;", "Lf10/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final AcceptanceDialogArguments f395628a;

        public e(@Y61.k AcceptanceDialogArguments acceptanceDialogArguments) {
            this.f395628a = acceptanceDialogArguments;
        }
    }

    /* compiled from: MortgageRootOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf10/c$f;", "Lf10/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ApplicantTypeSelectorArguments f395629a;

        public f(@Y61.k ApplicantTypeSelectorArguments applicantTypeSelectorArguments) {
            this.f395629a = applicantTypeSelectorArguments;
        }
    }

    /* compiled from: MortgageRootOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf10/c$g;", "Lf10/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class g implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final MortgageRootBankDetails f395630a;

        public g(@Y61.k MortgageRootBankDetails mortgageRootBankDetails) {
            this.f395630a = mortgageRootBankDetails;
        }
    }

    /* compiled from: MortgageRootOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf10/c$h;", "Lf10/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class h implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ConfirmCloseContent f395631a;

        public h(@Y61.k ConfirmCloseContent confirmCloseContent) {
            this.f395631a = confirmCloseContent;
        }
    }

    /* compiled from: MortgageRootOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf10/c$i;", "Lf10/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class i implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final StepsDetailsArguments f395632a;

        public i(@Y61.k StepsDetailsArguments stepsDetailsArguments) {
            this.f395632a = stepsDetailsArguments;
        }
    }

    /* compiled from: MortgageRootOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf10/c$j;", "Lf10/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class j implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ImmutableInfoDescriptionArguments f395633a;

        public j(@Y61.k ImmutableInfoDescriptionArguments immutableInfoDescriptionArguments) {
            this.f395633a = immutableInfoDescriptionArguments;
        }
    }

    /* compiled from: MortgageRootOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf10/c$k;", "Lf10/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class k implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final MortgageTermsArguments f395634a;

        public k(@Y61.k MortgageTermsArguments mortgageTermsArguments) {
            this.f395634a = mortgageTermsArguments;
        }
    }

    /* compiled from: MortgageRootOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf10/c$l;", "Lf10/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class l implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SelectedAppealArguments f395635a;

        public l(@Y61.k SelectedAppealArguments selectedAppealArguments) {
            this.f395635a = selectedAppealArguments;
        }
    }

    /* compiled from: MortgageRootOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf10/c$m;", "Lf10/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class m implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SendingConfirmArguments f395636a;

        public m(@Y61.k SendingConfirmArguments sendingConfirmArguments) {
            this.f395636a = sendingConfirmArguments;
        }
    }

    /* compiled from: MortgageRootOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf10/c$n;", "Lf10/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class n implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SuggestionArguments f395637a;

        public n(@Y61.k SuggestionArguments suggestionArguments) {
            this.f395637a = suggestionArguments;
        }
    }

    /* compiled from: MortgageRootOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf10/c$o;", "Lf10/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class o implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ApiError f395638a;

        public o(@Y61.k ApiError apiError) {
            this.f395638a = apiError;
        }
    }
}
