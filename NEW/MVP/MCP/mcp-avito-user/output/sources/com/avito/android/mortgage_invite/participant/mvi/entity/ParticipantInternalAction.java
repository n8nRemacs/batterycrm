package com.avito.android.mortgage_invite.participant.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
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
import com.avito.android.mortgage_invite.participant.domain.model.ParticipantFieldId;
import com.avito.android.remote.error.ApiError;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import o20.b;
import org.webrtc.h;

/* compiled from: ParticipantInternalAction.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0082\u0001\u000f\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"Lcom/avito/android/mortgage_invite/participant/mvi/entity/ParticipantInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "AgentFieldUpdated", "Back", "ClientFieldUpdated", "ClientSelected", "Close", "CreateApplicationLoadingCompleted", "CreateApplicationLoadingFailed", "CreateApplicationLoadingStarted", "CreateNewClientClicked", "FormLoadingCompleted", "FormLoadingFailed", "FormLoadingStarted", "OpenClientSearch", "SetAgentFieldEmptyByMasked", "UpdateValidationResult", "Lcom/avito/android/mortgage_invite/participant/mvi/entity/ParticipantInternalAction$AgentFieldUpdated;", "Lcom/avito/android/mortgage_invite/participant/mvi/entity/ParticipantInternalAction$Back;", "Lcom/avito/android/mortgage_invite/participant/mvi/entity/ParticipantInternalAction$ClientFieldUpdated;", "Lcom/avito/android/mortgage_invite/participant/mvi/entity/ParticipantInternalAction$ClientSelected;", "Lcom/avito/android/mortgage_invite/participant/mvi/entity/ParticipantInternalAction$Close;", "Lcom/avito/android/mortgage_invite/participant/mvi/entity/ParticipantInternalAction$CreateApplicationLoadingCompleted;", "Lcom/avito/android/mortgage_invite/participant/mvi/entity/ParticipantInternalAction$CreateApplicationLoadingFailed;", "Lcom/avito/android/mortgage_invite/participant/mvi/entity/ParticipantInternalAction$CreateApplicationLoadingStarted;", "Lcom/avito/android/mortgage_invite/participant/mvi/entity/ParticipantInternalAction$CreateNewClientClicked;", "Lcom/avito/android/mortgage_invite/participant/mvi/entity/ParticipantInternalAction$FormLoadingCompleted;", "Lcom/avito/android/mortgage_invite/participant/mvi/entity/ParticipantInternalAction$FormLoadingFailed;", "Lcom/avito/android/mortgage_invite/participant/mvi/entity/ParticipantInternalAction$FormLoadingStarted;", "Lcom/avito/android/mortgage_invite/participant/mvi/entity/ParticipantInternalAction$OpenClientSearch;", "Lcom/avito/android/mortgage_invite/participant/mvi/entity/ParticipantInternalAction$SetAgentFieldEmptyByMasked;", "Lcom/avito/android/mortgage_invite/participant/mvi/entity/ParticipantInternalAction$UpdateValidationResult;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ParticipantInternalAction extends n {

    /* compiled from: ParticipantInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/participant/mvi/entity/ParticipantInternalAction$AgentFieldUpdated;", "Lcom/avito/android/mortgage_invite/participant/mvi/entity/ParticipantInternalAction;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AgentFieldUpdated implements ParticipantInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ParticipantFieldId f206189b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f206190c;

        public AgentFieldUpdated(@k ParticipantFieldId participantFieldId, @k String str) {
            this.f206189b = participantFieldId;
            this.f206190c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AgentFieldUpdated)) {
                return false;
            }
            AgentFieldUpdated agentFieldUpdated = (AgentFieldUpdated) obj;
            return this.f206189b == agentFieldUpdated.f206189b && L.f(this.f206190c, agentFieldUpdated.f206190c);
        }

        public final int hashCode() {
            return this.f206190c.hashCode() + (this.f206189b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AgentFieldUpdated(id=");
            sb2.append(this.f206189b);
            sb2.append(", value=");
            return C22026a.c(sb2, this.f206190c, ')');
        }
    }

    /* compiled from: ParticipantInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/participant/mvi/entity/ParticipantInternalAction$Back;", "Lcom/avito/android/mortgage_invite/participant/mvi/entity/ParticipantInternalAction;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Back implements ParticipantInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final b f206191b;

        public Back(@k b bVar) {
            this.f206191b = bVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Back) && L.f(this.f206191b, ((Back) obj).f206191b);
        }

        public final int hashCode() {
            return this.f206191b.hashCode();
        }

        @k
        public final String toString() {
            return "Back(data=" + this.f206191b + ')';
        }
    }

    /* compiled from: ParticipantInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/participant/mvi/entity/ParticipantInternalAction$ClientFieldUpdated;", "Lcom/avito/android/mortgage_invite/participant/mvi/entity/ParticipantInternalAction;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ClientFieldUpdated implements ParticipantInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ParticipantFieldId f206192b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f206193c;

        public ClientFieldUpdated(@k ParticipantFieldId participantFieldId, @k String str) {
            this.f206192b = participantFieldId;
            this.f206193c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClientFieldUpdated)) {
                return false;
            }
            ClientFieldUpdated clientFieldUpdated = (ClientFieldUpdated) obj;
            return this.f206192b == clientFieldUpdated.f206192b && L.f(this.f206193c, clientFieldUpdated.f206193c);
        }

        public final int hashCode() {
            return this.f206193c.hashCode() + (this.f206192b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ClientFieldUpdated(id=");
            sb2.append(this.f206192b);
            sb2.append(", value=");
            return C22026a.c(sb2, this.f206193c, ')');
        }
    }

    /* compiled from: ParticipantInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/participant/mvi/entity/ParticipantInternalAction$ClientSelected;", "Lcom/avito/android/mortgage_invite/participant/mvi/entity/ParticipantInternalAction;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ClientSelected implements ParticipantInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final MortgageClient f206194b;

        public ClientSelected(@l MortgageClient mortgageClient) {
            this.f206194b = mortgageClient;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ClientSelected) && L.f(this.f206194b, ((ClientSelected) obj).f206194b);
        }

        public final int hashCode() {
            MortgageClient mortgageClient = this.f206194b;
            if (mortgageClient == null) {
                return 0;
            }
            return mortgageClient.hashCode();
        }

        @k
        public final String toString() {
            return "ClientSelected(client=" + this.f206194b + ')';
        }
    }

    /* compiled from: ParticipantInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_invite/participant/mvi/entity/ParticipantInternalAction$Close;", "Lcom/avito/android/mortgage_invite/participant/mvi/entity/ParticipantInternalAction;", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Close implements ParticipantInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f206195b = new Close();

        private Close() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 1954412251;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: ParticipantInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage_invite/participant/mvi/entity/ParticipantInternalAction$CreateApplicationLoadingCompleted;", "Lcom/avito/android/mortgage_invite/participant/mvi/entity/ParticipantInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CreateApplicationLoadingCompleted implements ParticipantInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f206196b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final DeepLink f206197c;

        public CreateApplicationLoadingCompleted(@l String str, @l DeepLink deepLink) {
            this.f206196b = str;
            this.f206197c = deepLink;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF205712d() {
            return "contact_info_create_application";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return "contact_info_create_application";
        }
    }

    /* compiled from: ParticipantInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage_invite/participant/mvi/entity/ParticipantInternalAction$CreateApplicationLoadingFailed;", "Lcom/avito/android/mortgage_invite/participant/mvi/entity/ParticipantInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CreateApplicationLoadingFailed implements ParticipantInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f206198b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f206199c;

        public CreateApplicationLoadingFailed(@k ApiError apiError) {
            this.f206198b = apiError;
            this.f206199c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF205712d() {
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
            return (obj instanceof CreateApplicationLoadingFailed) && L.f(this.f206198b, ((CreateApplicationLoadingFailed) obj).f206198b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF320274c() {
            return this.f206199c;
        }

        public final int hashCode() {
            return this.f206198b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("CreateApplicationLoadingFailed(error="), this.f206198b, ')');
        }
    }

    /* compiled from: ParticipantInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage_invite/participant/mvi/entity/ParticipantInternalAction$CreateApplicationLoadingStarted;", "Lcom/avito/android/mortgage_invite/participant/mvi/entity/ParticipantInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CreateApplicationLoadingStarted extends TrackableLoadingStarted implements ParticipantInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f206200d = "contact_info_create_application";

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF205712d() {
            return this.f206200d;
        }
    }

    /* compiled from: ParticipantInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_invite/participant/mvi/entity/ParticipantInternalAction$CreateNewClientClicked;", "Lcom/avito/android/mortgage_invite/participant/mvi/entity/ParticipantInternalAction;", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CreateNewClientClicked implements ParticipantInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CreateNewClientClicked f206201b = new CreateNewClientClicked();

        private CreateNewClientClicked() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CreateNewClientClicked);
        }

        public final int hashCode() {
            return -1775998283;
        }

        @k
        public final String toString() {
            return "CreateNewClientClicked";
        }
    }

    /* compiled from: ParticipantInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage_invite/participant/mvi/entity/ParticipantInternalAction$FormLoadingCompleted;", "Lcom/avito/android/mortgage_invite/participant/mvi/entity/ParticipantInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FormLoadingCompleted implements ParticipantInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final o20.c f206202b;

        public FormLoadingCompleted(@k o20.c cVar) {
            this.f206202b = cVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF205712d() {
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
            return (obj instanceof FormLoadingCompleted) && L.f(this.f206202b, ((FormLoadingCompleted) obj).f206202b);
        }

        public final int hashCode() {
            return this.f206202b.hashCode();
        }

        @k
        public final String toString() {
            return "FormLoadingCompleted(form=" + this.f206202b + ')';
        }
    }

    /* compiled from: ParticipantInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage_invite/participant/mvi/entity/ParticipantInternalAction$FormLoadingFailed;", "Lcom/avito/android/mortgage_invite/participant/mvi/entity/ParticipantInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FormLoadingFailed implements ParticipantInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f206203b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f206204c;

        public FormLoadingFailed(@k ApiError apiError) {
            this.f206203b = apiError;
            this.f206204c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF205712d() {
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
            return (obj instanceof FormLoadingFailed) && L.f(this.f206203b, ((FormLoadingFailed) obj).f206203b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF320274c() {
            return this.f206204c;
        }

        public final int hashCode() {
            return this.f206203b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("FormLoadingFailed(error="), this.f206203b, ')');
        }
    }

    /* compiled from: ParticipantInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage_invite/participant/mvi/entity/ParticipantInternalAction$FormLoadingStarted;", "Lcom/avito/android/mortgage_invite/participant/mvi/entity/ParticipantInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FormLoadingStarted extends TrackableLoadingStarted implements ParticipantInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f206205d = "contact_info_form";

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF205712d() {
            return this.f206205d;
        }
    }

    /* compiled from: ParticipantInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/participant/mvi/entity/ParticipantInternalAction$OpenClientSearch;", "Lcom/avito/android/mortgage_invite/participant/mvi/entity/ParticipantInternalAction;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenClientSearch implements ParticipantInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final MortgageClientSearchArguments f206206b;

        public OpenClientSearch(@k MortgageClientSearchArguments mortgageClientSearchArguments) {
            this.f206206b = mortgageClientSearchArguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenClientSearch) && L.f(this.f206206b, ((OpenClientSearch) obj).f206206b);
        }

        public final int hashCode() {
            return this.f206206b.hashCode();
        }

        @k
        public final String toString() {
            return "OpenClientSearch(arguments=" + this.f206206b + ')';
        }
    }

    /* compiled from: ParticipantInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/participant/mvi/entity/ParticipantInternalAction$SetAgentFieldEmptyByMasked;", "Lcom/avito/android/mortgage_invite/participant/mvi/entity/ParticipantInternalAction;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetAgentFieldEmptyByMasked implements ParticipantInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ParticipantFieldId f206207b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f206208c;

        public SetAgentFieldEmptyByMasked(@k ParticipantFieldId participantFieldId, boolean z12) {
            this.f206207b = participantFieldId;
            this.f206208c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SetAgentFieldEmptyByMasked)) {
                return false;
            }
            SetAgentFieldEmptyByMasked setAgentFieldEmptyByMasked = (SetAgentFieldEmptyByMasked) obj;
            return this.f206207b == setAgentFieldEmptyByMasked.f206207b && this.f206208c == setAgentFieldEmptyByMasked.f206208c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f206208c) + (this.f206207b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SetAgentFieldEmptyByMasked(id=");
            sb2.append(this.f206207b);
            sb2.append(", isEmptyByMasked=");
            return r.x(sb2, this.f206208c, ')');
        }
    }

    /* compiled from: ParticipantInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/participant/mvi/entity/ParticipantInternalAction$UpdateValidationResult;", "Lcom/avito/android/mortgage_invite/participant/mvi/entity/ParticipantInternalAction;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateValidationResult implements ParticipantInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final LinkedHashMap f206209b;

        public UpdateValidationResult(@k LinkedHashMap linkedHashMap) {
            this.f206209b = linkedHashMap;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateValidationResult) && this.f206209b.equals(((UpdateValidationResult) obj).f206209b);
        }

        public final int hashCode() {
            return this.f206209b.hashCode();
        }

        @k
        public final String toString() {
            return h.e(new StringBuilder("UpdateValidationResult(validation="), this.f206209b, ')');
        }
    }
}
