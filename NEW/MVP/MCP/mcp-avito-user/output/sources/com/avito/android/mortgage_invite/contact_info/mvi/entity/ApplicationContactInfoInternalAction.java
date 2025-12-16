package com.avito.android.mortgage_invite.contact_info.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import a20.C19669a;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mortgage_invite.client_search.model.MortgageClient;
import com.avito.android.mortgage_invite.client_search.model.MortgageClientSearchArguments;
import com.avito.android.mortgage_invite.common.domain.model.ContactInfoFieldId;
import com.avito.android.mortgage_invite.contact_info.model.ApplicationContactInfoArguments;
import com.avito.android.remote.error.ApiError;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import org.webrtc.h;

/* compiled from: ApplicationContactInfoInternalAction.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0010\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0082\u0001\u0010\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\""}, d2 = {"Lcom/avito/android/mortgage_invite/contact_info/mvi/entity/ApplicationContactInfoInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "AgentFieldUpdated", "Back", "ClientFieldUpdated", "ClientSelected", "CreateApplicationLoadingCompleted", "CreateApplicationLoadingFailed", "CreateApplicationLoadingStarted", "CreateNewClientClicked", "FormLoadingCompleted", "FormLoadingFailed", "FormLoadingStarted", "Init", "OpenClientSearch", "SetAgentFieldEmptyByMasked", "SetClientFieldEmptyByMasked", "UpdateValidationResult", "Lcom/avito/android/mortgage_invite/contact_info/mvi/entity/ApplicationContactInfoInternalAction$AgentFieldUpdated;", "Lcom/avito/android/mortgage_invite/contact_info/mvi/entity/ApplicationContactInfoInternalAction$Back;", "Lcom/avito/android/mortgage_invite/contact_info/mvi/entity/ApplicationContactInfoInternalAction$ClientFieldUpdated;", "Lcom/avito/android/mortgage_invite/contact_info/mvi/entity/ApplicationContactInfoInternalAction$ClientSelected;", "Lcom/avito/android/mortgage_invite/contact_info/mvi/entity/ApplicationContactInfoInternalAction$CreateApplicationLoadingCompleted;", "Lcom/avito/android/mortgage_invite/contact_info/mvi/entity/ApplicationContactInfoInternalAction$CreateApplicationLoadingFailed;", "Lcom/avito/android/mortgage_invite/contact_info/mvi/entity/ApplicationContactInfoInternalAction$CreateApplicationLoadingStarted;", "Lcom/avito/android/mortgage_invite/contact_info/mvi/entity/ApplicationContactInfoInternalAction$CreateNewClientClicked;", "Lcom/avito/android/mortgage_invite/contact_info/mvi/entity/ApplicationContactInfoInternalAction$FormLoadingCompleted;", "Lcom/avito/android/mortgage_invite/contact_info/mvi/entity/ApplicationContactInfoInternalAction$FormLoadingFailed;", "Lcom/avito/android/mortgage_invite/contact_info/mvi/entity/ApplicationContactInfoInternalAction$FormLoadingStarted;", "Lcom/avito/android/mortgage_invite/contact_info/mvi/entity/ApplicationContactInfoInternalAction$Init;", "Lcom/avito/android/mortgage_invite/contact_info/mvi/entity/ApplicationContactInfoInternalAction$OpenClientSearch;", "Lcom/avito/android/mortgage_invite/contact_info/mvi/entity/ApplicationContactInfoInternalAction$SetAgentFieldEmptyByMasked;", "Lcom/avito/android/mortgage_invite/contact_info/mvi/entity/ApplicationContactInfoInternalAction$SetClientFieldEmptyByMasked;", "Lcom/avito/android/mortgage_invite/contact_info/mvi/entity/ApplicationContactInfoInternalAction$UpdateValidationResult;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ApplicationContactInfoInternalAction extends n {

    /* compiled from: ApplicationContactInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/contact_info/mvi/entity/ApplicationContactInfoInternalAction$AgentFieldUpdated;", "Lcom/avito/android/mortgage_invite/contact_info/mvi/entity/ApplicationContactInfoInternalAction;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AgentFieldUpdated implements ApplicationContactInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ContactInfoFieldId f205697b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f205698c;

        public AgentFieldUpdated(@k ContactInfoFieldId contactInfoFieldId, @k String str) {
            this.f205697b = contactInfoFieldId;
            this.f205698c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AgentFieldUpdated)) {
                return false;
            }
            AgentFieldUpdated agentFieldUpdated = (AgentFieldUpdated) obj;
            return this.f205697b == agentFieldUpdated.f205697b && L.f(this.f205698c, agentFieldUpdated.f205698c);
        }

        public final int hashCode() {
            return this.f205698c.hashCode() + (this.f205697b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AgentFieldUpdated(id=");
            sb2.append(this.f205697b);
            sb2.append(", value=");
            return C22026a.c(sb2, this.f205698c, ')');
        }
    }

    /* compiled from: ApplicationContactInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_invite/contact_info/mvi/entity/ApplicationContactInfoInternalAction$Back;", "Lcom/avito/android/mortgage_invite/contact_info/mvi/entity/ApplicationContactInfoInternalAction;", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Back implements ApplicationContactInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Back f205699b = new Back();

        private Back() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Back);
        }

        public final int hashCode() {
            return -2043564613;
        }

        @k
        public final String toString() {
            return "Back";
        }
    }

    /* compiled from: ApplicationContactInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/contact_info/mvi/entity/ApplicationContactInfoInternalAction$ClientFieldUpdated;", "Lcom/avito/android/mortgage_invite/contact_info/mvi/entity/ApplicationContactInfoInternalAction;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ClientFieldUpdated implements ApplicationContactInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ContactInfoFieldId f205700b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f205701c;

        public ClientFieldUpdated(@k ContactInfoFieldId contactInfoFieldId, @k String str) {
            this.f205700b = contactInfoFieldId;
            this.f205701c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClientFieldUpdated)) {
                return false;
            }
            ClientFieldUpdated clientFieldUpdated = (ClientFieldUpdated) obj;
            return this.f205700b == clientFieldUpdated.f205700b && L.f(this.f205701c, clientFieldUpdated.f205701c);
        }

        public final int hashCode() {
            return this.f205701c.hashCode() + (this.f205700b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ClientFieldUpdated(id=");
            sb2.append(this.f205700b);
            sb2.append(", value=");
            return C22026a.c(sb2, this.f205701c, ')');
        }
    }

    /* compiled from: ApplicationContactInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/contact_info/mvi/entity/ApplicationContactInfoInternalAction$ClientSelected;", "Lcom/avito/android/mortgage_invite/contact_info/mvi/entity/ApplicationContactInfoInternalAction;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ClientSelected implements ApplicationContactInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final MortgageClient f205702b;

        public ClientSelected(@k MortgageClient mortgageClient) {
            this.f205702b = mortgageClient;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ClientSelected) && L.f(this.f205702b, ((ClientSelected) obj).f205702b);
        }

        public final int hashCode() {
            return this.f205702b.hashCode();
        }

        @k
        public final String toString() {
            return "ClientSelected(client=" + this.f205702b + ')';
        }
    }

    /* compiled from: ApplicationContactInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage_invite/contact_info/mvi/entity/ApplicationContactInfoInternalAction$CreateApplicationLoadingCompleted;", "Lcom/avito/android/mortgage_invite/contact_info/mvi/entity/ApplicationContactInfoInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CreateApplicationLoadingCompleted implements ApplicationContactInfoInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f205703b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final DeepLink f205704c;

        public CreateApplicationLoadingCompleted(@l String str, @l DeepLink deepLink) {
            this.f205703b = str;
            this.f205704c = deepLink;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF294761d() {
            return "contact_info_create_application";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return "contact_info_create_application";
        }
    }

    /* compiled from: ApplicationContactInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage_invite/contact_info/mvi/entity/ApplicationContactInfoInternalAction$CreateApplicationLoadingFailed;", "Lcom/avito/android/mortgage_invite/contact_info/mvi/entity/ApplicationContactInfoInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CreateApplicationLoadingFailed implements ApplicationContactInfoInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f205705b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f205706c;

        public CreateApplicationLoadingFailed(@k ApiError apiError) {
            this.f205705b = apiError;
            this.f205706c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF294761d() {
            return "contact_info_create_application";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return "contact_info_create_application";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CreateApplicationLoadingFailed) && L.f(this.f205705b, ((CreateApplicationLoadingFailed) obj).f205705b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF323221c() {
            return this.f205706c;
        }

        public final int hashCode() {
            return this.f205705b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("CreateApplicationLoadingFailed(error="), this.f205705b, ')');
        }
    }

    /* compiled from: ApplicationContactInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage_invite/contact_info/mvi/entity/ApplicationContactInfoInternalAction$CreateApplicationLoadingStarted;", "Lcom/avito/android/mortgage_invite/contact_info/mvi/entity/ApplicationContactInfoInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CreateApplicationLoadingStarted extends TrackableLoadingStarted implements ApplicationContactInfoInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f205707d = "contact_info_create_application";

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF294761d() {
            return this.f205707d;
        }
    }

    /* compiled from: ApplicationContactInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_invite/contact_info/mvi/entity/ApplicationContactInfoInternalAction$CreateNewClientClicked;", "Lcom/avito/android/mortgage_invite/contact_info/mvi/entity/ApplicationContactInfoInternalAction;", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CreateNewClientClicked implements ApplicationContactInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CreateNewClientClicked f205708b = new CreateNewClientClicked();

        private CreateNewClientClicked() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CreateNewClientClicked);
        }

        public final int hashCode() {
            return -873423604;
        }

        @k
        public final String toString() {
            return "CreateNewClientClicked";
        }
    }

    /* compiled from: ApplicationContactInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage_invite/contact_info/mvi/entity/ApplicationContactInfoInternalAction$FormLoadingCompleted;", "Lcom/avito/android/mortgage_invite/contact_info/mvi/entity/ApplicationContactInfoInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FormLoadingCompleted implements ApplicationContactInfoInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C19669a f205709b;

        public FormLoadingCompleted(@k C19669a c19669a) {
            this.f205709b = c19669a;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF294761d() {
            return "contact_info_form";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return "contact_info_form";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FormLoadingCompleted) && L.f(this.f205709b, ((FormLoadingCompleted) obj).f205709b);
        }

        public final int hashCode() {
            return this.f205709b.hashCode();
        }

        @k
        public final String toString() {
            return "FormLoadingCompleted(form=" + this.f205709b + ')';
        }
    }

    /* compiled from: ApplicationContactInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage_invite/contact_info/mvi/entity/ApplicationContactInfoInternalAction$FormLoadingFailed;", "Lcom/avito/android/mortgage_invite/contact_info/mvi/entity/ApplicationContactInfoInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FormLoadingFailed implements ApplicationContactInfoInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f205710b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f205711c;

        public FormLoadingFailed(@k ApiError apiError) {
            this.f205710b = apiError;
            this.f205711c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF294761d() {
            return "contact_info_form";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return "contact_info_form";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FormLoadingFailed) && L.f(this.f205710b, ((FormLoadingFailed) obj).f205710b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF323221c() {
            return this.f205711c;
        }

        public final int hashCode() {
            return this.f205710b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("FormLoadingFailed(error="), this.f205710b, ')');
        }
    }

    /* compiled from: ApplicationContactInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage_invite/contact_info/mvi/entity/ApplicationContactInfoInternalAction$FormLoadingStarted;", "Lcom/avito/android/mortgage_invite/contact_info/mvi/entity/ApplicationContactInfoInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FormLoadingStarted extends TrackableLoadingStarted implements ApplicationContactInfoInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f205712d = "contact_info_form";

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF294761d() {
            return this.f205712d;
        }
    }

    /* compiled from: ApplicationContactInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/contact_info/mvi/entity/ApplicationContactInfoInternalAction$Init;", "Lcom/avito/android/mortgage_invite/contact_info/mvi/entity/ApplicationContactInfoInternalAction;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Init implements ApplicationContactInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApplicationContactInfoArguments f205713b;

        public Init(@k ApplicationContactInfoArguments applicationContactInfoArguments) {
            this.f205713b = applicationContactInfoArguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Init) && L.f(this.f205713b, ((Init) obj).f205713b);
        }

        public final int hashCode() {
            return this.f205713b.hashCode();
        }

        @k
        public final String toString() {
            return "Init(arguments=" + this.f205713b + ')';
        }
    }

    /* compiled from: ApplicationContactInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/contact_info/mvi/entity/ApplicationContactInfoInternalAction$OpenClientSearch;", "Lcom/avito/android/mortgage_invite/contact_info/mvi/entity/ApplicationContactInfoInternalAction;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenClientSearch implements ApplicationContactInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final MortgageClientSearchArguments f205714b;

        public OpenClientSearch(@k MortgageClientSearchArguments mortgageClientSearchArguments) {
            this.f205714b = mortgageClientSearchArguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenClientSearch) && L.f(this.f205714b, ((OpenClientSearch) obj).f205714b);
        }

        public final int hashCode() {
            return this.f205714b.hashCode();
        }

        @k
        public final String toString() {
            return "OpenClientSearch(arguments=" + this.f205714b + ')';
        }
    }

    /* compiled from: ApplicationContactInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/contact_info/mvi/entity/ApplicationContactInfoInternalAction$SetAgentFieldEmptyByMasked;", "Lcom/avito/android/mortgage_invite/contact_info/mvi/entity/ApplicationContactInfoInternalAction;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetAgentFieldEmptyByMasked implements ApplicationContactInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ContactInfoFieldId f205715b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f205716c;

        public SetAgentFieldEmptyByMasked(@k ContactInfoFieldId contactInfoFieldId, boolean z12) {
            this.f205715b = contactInfoFieldId;
            this.f205716c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SetAgentFieldEmptyByMasked)) {
                return false;
            }
            SetAgentFieldEmptyByMasked setAgentFieldEmptyByMasked = (SetAgentFieldEmptyByMasked) obj;
            return this.f205715b == setAgentFieldEmptyByMasked.f205715b && this.f205716c == setAgentFieldEmptyByMasked.f205716c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f205716c) + (this.f205715b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SetAgentFieldEmptyByMasked(id=");
            sb2.append(this.f205715b);
            sb2.append(", isEmptyByMasked=");
            return r.x(sb2, this.f205716c, ')');
        }
    }

    /* compiled from: ApplicationContactInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/contact_info/mvi/entity/ApplicationContactInfoInternalAction$SetClientFieldEmptyByMasked;", "Lcom/avito/android/mortgage_invite/contact_info/mvi/entity/ApplicationContactInfoInternalAction;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetClientFieldEmptyByMasked implements ApplicationContactInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ContactInfoFieldId f205717b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f205718c;

        public SetClientFieldEmptyByMasked(@k ContactInfoFieldId contactInfoFieldId, boolean z12) {
            this.f205717b = contactInfoFieldId;
            this.f205718c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SetClientFieldEmptyByMasked)) {
                return false;
            }
            SetClientFieldEmptyByMasked setClientFieldEmptyByMasked = (SetClientFieldEmptyByMasked) obj;
            return this.f205717b == setClientFieldEmptyByMasked.f205717b && this.f205718c == setClientFieldEmptyByMasked.f205718c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f205718c) + (this.f205717b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SetClientFieldEmptyByMasked(id=");
            sb2.append(this.f205717b);
            sb2.append(", isEmptyByMasked=");
            return r.x(sb2, this.f205718c, ')');
        }
    }

    /* compiled from: ApplicationContactInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/contact_info/mvi/entity/ApplicationContactInfoInternalAction$UpdateValidationResult;", "Lcom/avito/android/mortgage_invite/contact_info/mvi/entity/ApplicationContactInfoInternalAction;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateValidationResult implements ApplicationContactInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final LinkedHashMap f205719b;

        public UpdateValidationResult(@k LinkedHashMap linkedHashMap) {
            this.f205719b = linkedHashMap;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateValidationResult) && this.f205719b.equals(((UpdateValidationResult) obj).f205719b);
        }

        public final int hashCode() {
            return this.f205719b.hashCode();
        }

        @k
        public final String toString() {
            return h.e(new StringBuilder("UpdateValidationResult(validation="), this.f205719b, ')');
        }
    }
}
