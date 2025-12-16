package com.avito.android.mortgage_invite.client_form.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mortgage.phone_confirm.model.PhoneConfirmArguments;
import com.avito.android.mortgage_invite.client_search.model.MortgageClient;
import com.avito.android.mortgage_invite.client_search.model.MortgageClientSearchArguments;
import com.avito.android.mortgage_invite.common.domain.model.ContactInfoFieldId;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ApplicationClientFormInternalAction.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0010\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0082\u0001\u0010\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\""}, d2 = {"Lcom/avito/android/mortgage_invite/client_form/mvi/entity/ApplicationClientFormInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ActionLoadingError", "ActionLoadingStarted", "AgentInfoUpdated", "AgentInfoValidationError", "ClientInfoUpdated", "ClientInfoValidationError", "ClientSelected", "CreateNewClient", "FormLoadingFailed", "FormLoadingStarted", "FormLoadingSuccess", "HandleDeeplink", "OpenClientSearch", "PhoneConfirmationRequired", "ScrollToItem", "SetClientSearchError", "Lcom/avito/android/mortgage_invite/client_form/mvi/entity/ApplicationClientFormInternalAction$ActionLoadingError;", "Lcom/avito/android/mortgage_invite/client_form/mvi/entity/ApplicationClientFormInternalAction$ActionLoadingStarted;", "Lcom/avito/android/mortgage_invite/client_form/mvi/entity/ApplicationClientFormInternalAction$AgentInfoUpdated;", "Lcom/avito/android/mortgage_invite/client_form/mvi/entity/ApplicationClientFormInternalAction$AgentInfoValidationError;", "Lcom/avito/android/mortgage_invite/client_form/mvi/entity/ApplicationClientFormInternalAction$ClientInfoUpdated;", "Lcom/avito/android/mortgage_invite/client_form/mvi/entity/ApplicationClientFormInternalAction$ClientInfoValidationError;", "Lcom/avito/android/mortgage_invite/client_form/mvi/entity/ApplicationClientFormInternalAction$ClientSelected;", "Lcom/avito/android/mortgage_invite/client_form/mvi/entity/ApplicationClientFormInternalAction$CreateNewClient;", "Lcom/avito/android/mortgage_invite/client_form/mvi/entity/ApplicationClientFormInternalAction$FormLoadingFailed;", "Lcom/avito/android/mortgage_invite/client_form/mvi/entity/ApplicationClientFormInternalAction$FormLoadingStarted;", "Lcom/avito/android/mortgage_invite/client_form/mvi/entity/ApplicationClientFormInternalAction$FormLoadingSuccess;", "Lcom/avito/android/mortgage_invite/client_form/mvi/entity/ApplicationClientFormInternalAction$HandleDeeplink;", "Lcom/avito/android/mortgage_invite/client_form/mvi/entity/ApplicationClientFormInternalAction$OpenClientSearch;", "Lcom/avito/android/mortgage_invite/client_form/mvi/entity/ApplicationClientFormInternalAction$PhoneConfirmationRequired;", "Lcom/avito/android/mortgage_invite/client_form/mvi/entity/ApplicationClientFormInternalAction$ScrollToItem;", "Lcom/avito/android/mortgage_invite/client_form/mvi/entity/ApplicationClientFormInternalAction$SetClientSearchError;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ApplicationClientFormInternalAction extends n {

    /* compiled from: ApplicationClientFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/client_form/mvi/entity/ApplicationClientFormInternalAction$ActionLoadingError;", "Lcom/avito/android/mortgage_invite/client_form/mvi/entity/ApplicationClientFormInternalAction;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ActionLoadingError implements ApplicationClientFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f205230b;

        public ActionLoadingError(@k ApiError apiError) {
            this.f205230b = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionLoadingError) && L.f(this.f205230b, ((ActionLoadingError) obj).f205230b);
        }

        public final int hashCode() {
            return this.f205230b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("ActionLoadingError(error="), this.f205230b, ')');
        }
    }

    /* compiled from: ApplicationClientFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_invite/client_form/mvi/entity/ApplicationClientFormInternalAction$ActionLoadingStarted;", "Lcom/avito/android/mortgage_invite/client_form/mvi/entity/ApplicationClientFormInternalAction;", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ActionLoadingStarted implements ApplicationClientFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ActionLoadingStarted f205231b = new ActionLoadingStarted();

        private ActionLoadingStarted() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ActionLoadingStarted);
        }

        public final int hashCode() {
            return -1220495343;
        }

        @k
        public final String toString() {
            return "ActionLoadingStarted";
        }
    }

    /* compiled from: ApplicationClientFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/client_form/mvi/entity/ApplicationClientFormInternalAction$AgentInfoUpdated;", "Lcom/avito/android/mortgage_invite/client_form/mvi/entity/ApplicationClientFormInternalAction;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AgentInfoUpdated implements ApplicationClientFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ContactInfoFieldId f205232b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f205233c;

        public AgentInfoUpdated(@k ContactInfoFieldId contactInfoFieldId, @k String str) {
            this.f205232b = contactInfoFieldId;
            this.f205233c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AgentInfoUpdated)) {
                return false;
            }
            AgentInfoUpdated agentInfoUpdated = (AgentInfoUpdated) obj;
            return this.f205232b == agentInfoUpdated.f205232b && L.f(this.f205233c, agentInfoUpdated.f205233c);
        }

        public final int hashCode() {
            return this.f205233c.hashCode() + (this.f205232b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AgentInfoUpdated(id=");
            sb2.append(this.f205232b);
            sb2.append(", value=");
            return C22026a.c(sb2, this.f205233c, ')');
        }
    }

    /* compiled from: ApplicationClientFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/client_form/mvi/entity/ApplicationClientFormInternalAction$AgentInfoValidationError;", "Lcom/avito/android/mortgage_invite/client_form/mvi/entity/ApplicationClientFormInternalAction;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AgentInfoValidationError implements ApplicationClientFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Map<ContactInfoFieldId, PrintableText> f205234b;

        /* JADX WARN: Multi-variable type inference failed */
        public AgentInfoValidationError(@k Map<ContactInfoFieldId, ? extends PrintableText> map) {
            this.f205234b = map;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AgentInfoValidationError) && L.f(this.f205234b, ((AgentInfoValidationError) obj).f205234b);
        }

        public final int hashCode() {
            return this.f205234b.hashCode();
        }

        @k
        public final String toString() {
            return r.w(new StringBuilder("AgentInfoValidationError(payload="), this.f205234b, ')');
        }
    }

    /* compiled from: ApplicationClientFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/client_form/mvi/entity/ApplicationClientFormInternalAction$ClientInfoUpdated;", "Lcom/avito/android/mortgage_invite/client_form/mvi/entity/ApplicationClientFormInternalAction;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ClientInfoUpdated implements ApplicationClientFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ContactInfoFieldId f205235b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f205236c;

        public ClientInfoUpdated(@k ContactInfoFieldId contactInfoFieldId, @k String str) {
            this.f205235b = contactInfoFieldId;
            this.f205236c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClientInfoUpdated)) {
                return false;
            }
            ClientInfoUpdated clientInfoUpdated = (ClientInfoUpdated) obj;
            return this.f205235b == clientInfoUpdated.f205235b && L.f(this.f205236c, clientInfoUpdated.f205236c);
        }

        public final int hashCode() {
            return this.f205236c.hashCode() + (this.f205235b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ClientInfoUpdated(id=");
            sb2.append(this.f205235b);
            sb2.append(", value=");
            return C22026a.c(sb2, this.f205236c, ')');
        }
    }

    /* compiled from: ApplicationClientFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/client_form/mvi/entity/ApplicationClientFormInternalAction$ClientInfoValidationError;", "Lcom/avito/android/mortgage_invite/client_form/mvi/entity/ApplicationClientFormInternalAction;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ClientInfoValidationError implements ApplicationClientFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Map<ContactInfoFieldId, PrintableText> f205237b;

        /* JADX WARN: Multi-variable type inference failed */
        public ClientInfoValidationError(@k Map<ContactInfoFieldId, ? extends PrintableText> map) {
            this.f205237b = map;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ClientInfoValidationError) && L.f(this.f205237b, ((ClientInfoValidationError) obj).f205237b);
        }

        public final int hashCode() {
            return this.f205237b.hashCode();
        }

        @k
        public final String toString() {
            return r.w(new StringBuilder("ClientInfoValidationError(payload="), this.f205237b, ')');
        }
    }

    /* compiled from: ApplicationClientFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/client_form/mvi/entity/ApplicationClientFormInternalAction$ClientSelected;", "Lcom/avito/android/mortgage_invite/client_form/mvi/entity/ApplicationClientFormInternalAction;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ClientSelected implements ApplicationClientFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final MortgageClient f205238b;

        public ClientSelected(@k MortgageClient mortgageClient) {
            this.f205238b = mortgageClient;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ClientSelected) && L.f(this.f205238b, ((ClientSelected) obj).f205238b);
        }

        public final int hashCode() {
            return this.f205238b.hashCode();
        }

        @k
        public final String toString() {
            return "ClientSelected(client=" + this.f205238b + ')';
        }
    }

    /* compiled from: ApplicationClientFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_invite/client_form/mvi/entity/ApplicationClientFormInternalAction$CreateNewClient;", "Lcom/avito/android/mortgage_invite/client_form/mvi/entity/ApplicationClientFormInternalAction;", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CreateNewClient implements ApplicationClientFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CreateNewClient f205239b = new CreateNewClient();

        private CreateNewClient() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CreateNewClient);
        }

        public final int hashCode() {
            return -1885471335;
        }

        @k
        public final String toString() {
            return "CreateNewClient";
        }
    }

    /* compiled from: ApplicationClientFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage_invite/client_form/mvi/entity/ApplicationClientFormInternalAction$FormLoadingFailed;", "Lcom/avito/android/mortgage_invite/client_form/mvi/entity/ApplicationClientFormInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FormLoadingFailed implements ApplicationClientFormInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f205240b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f205241c;

        public FormLoadingFailed(@k ApiError apiError) {
            this.f205240b = apiError;
            this.f205241c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF146467d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FormLoadingFailed) && L.f(this.f205240b, ((FormLoadingFailed) obj).f205240b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF156021c() {
            return this.f205241c;
        }

        public final int hashCode() {
            return this.f205240b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("FormLoadingFailed(error="), this.f205240b, ')');
        }
    }

    /* compiled from: ApplicationClientFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_invite/client_form/mvi/entity/ApplicationClientFormInternalAction$FormLoadingStarted;", "Lcom/avito/android/mortgage_invite/client_form/mvi/entity/ApplicationClientFormInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FormLoadingStarted extends TrackableLoadingStarted implements ApplicationClientFormInternalAction {
    }

    /* compiled from: ApplicationClientFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage_invite/client_form/mvi/entity/ApplicationClientFormInternalAction$FormLoadingSuccess;", "Lcom/avito/android/mortgage_invite/client_form/mvi/entity/ApplicationClientFormInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FormLoadingSuccess implements ApplicationClientFormInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final T10.c f205242b;

        public FormLoadingSuccess(@k T10.c cVar) {
            this.f205242b = cVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF146467d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FormLoadingSuccess) && L.f(this.f205242b, ((FormLoadingSuccess) obj).f205242b);
        }

        public final int hashCode() {
            return this.f205242b.hashCode();
        }

        @k
        public final String toString() {
            return "FormLoadingSuccess(data=" + this.f205242b + ')';
        }
    }

    /* compiled from: ApplicationClientFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/client_form/mvi/entity/ApplicationClientFormInternalAction$OpenClientSearch;", "Lcom/avito/android/mortgage_invite/client_form/mvi/entity/ApplicationClientFormInternalAction;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenClientSearch implements ApplicationClientFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final MortgageClientSearchArguments f205245b;

        public OpenClientSearch(@k MortgageClientSearchArguments mortgageClientSearchArguments) {
            this.f205245b = mortgageClientSearchArguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenClientSearch) && L.f(this.f205245b, ((OpenClientSearch) obj).f205245b);
        }

        public final int hashCode() {
            return this.f205245b.hashCode();
        }

        @k
        public final String toString() {
            return "OpenClientSearch(arguments=" + this.f205245b + ')';
        }
    }

    /* compiled from: ApplicationClientFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/client_form/mvi/entity/ApplicationClientFormInternalAction$PhoneConfirmationRequired;", "Lcom/avito/android/mortgage_invite/client_form/mvi/entity/ApplicationClientFormInternalAction;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PhoneConfirmationRequired implements ApplicationClientFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PhoneConfirmArguments f205246b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final DeepLink f205247c;

        public PhoneConfirmationRequired(@k PhoneConfirmArguments phoneConfirmArguments, @k DeepLink deepLink) {
            this.f205246b = phoneConfirmArguments;
            this.f205247c = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PhoneConfirmationRequired)) {
                return false;
            }
            PhoneConfirmationRequired phoneConfirmationRequired = (PhoneConfirmationRequired) obj;
            return L.f(this.f205246b, phoneConfirmationRequired.f205246b) && L.f(this.f205247c, phoneConfirmationRequired.f205247c);
        }

        public final int hashCode() {
            return this.f205247c.hashCode() + (this.f205246b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PhoneConfirmationRequired(arguments=");
            sb2.append(this.f205246b);
            sb2.append(", successRedirectLink=");
            return a.v(sb2, this.f205247c, ')');
        }
    }

    /* compiled from: ApplicationClientFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/client_form/mvi/entity/ApplicationClientFormInternalAction$ScrollToItem;", "Lcom/avito/android/mortgage_invite/client_form/mvi/entity/ApplicationClientFormInternalAction;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ScrollToItem implements ApplicationClientFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f205248b;

        public ScrollToItem(int i12) {
            this.f205248b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ScrollToItem) && this.f205248b == ((ScrollToItem) obj).f205248b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f205248b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("ScrollToItem(index="), this.f205248b, ')');
        }
    }

    /* compiled from: ApplicationClientFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_invite/client_form/mvi/entity/ApplicationClientFormInternalAction$SetClientSearchError;", "Lcom/avito/android/mortgage_invite/client_form/mvi/entity/ApplicationClientFormInternalAction;", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetClientSearchError implements ApplicationClientFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final SetClientSearchError f205249b = new SetClientSearchError();

        private SetClientSearchError() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof SetClientSearchError);
        }

        public final int hashCode() {
            return 1649572041;
        }

        @k
        public final String toString() {
            return "SetClientSearchError";
        }
    }

    /* compiled from: ApplicationClientFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/client_form/mvi/entity/ApplicationClientFormInternalAction$HandleDeeplink;", "Lcom/avito/android/mortgage_invite/client_form/mvi/entity/ApplicationClientFormInternalAction;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements ApplicationClientFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f205243b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f205244c;

        public HandleDeeplink(@k DeepLink deepLink, boolean z12) {
            this.f205243b = deepLink;
            this.f205244c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HandleDeeplink)) {
                return false;
            }
            HandleDeeplink handleDeeplink = (HandleDeeplink) obj;
            return L.f(this.f205243b, handleDeeplink.f205243b) && this.f205244c == handleDeeplink.f205244c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f205244c) + (this.f205243b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HandleDeeplink(link=");
            sb2.append(this.f205243b);
            sb2.append(", shouldCloseScreen=");
            return r.x(sb2, this.f205244c, ')');
        }

        public /* synthetic */ HandleDeeplink(DeepLink deepLink, boolean z12, int i12, C42822w c42822w) {
            this(deepLink, (i12 & 2) != 0 ? false : z12);
        }
    }
}
