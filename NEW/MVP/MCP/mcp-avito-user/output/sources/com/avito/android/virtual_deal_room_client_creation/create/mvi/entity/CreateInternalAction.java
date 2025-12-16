package com.avito.android.virtual_deal_room_client_creation.create.mvi.entity;

import AK.c;
import PN0.a;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.remote.error.ApiError;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CreateInternalAction.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u000e\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0082\u0001\u000e\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lcom/avito/android/virtual_deal_room_client_creation/create/mvi/entity/CreateInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ClientSelected", "CloseClicked", "FirstNameInput", "InvalidForm", "LastNameInput", "LoadingSuggestError", "LoadingSuggestion", "MiddleNameInput", "PhoneInput", "PhoneNumberInUse", "SubmitFailure", "SubmitStarted", "SubmitSuccess", "SuggestedClients", "Lcom/avito/android/virtual_deal_room_client_creation/create/mvi/entity/CreateInternalAction$ClientSelected;", "Lcom/avito/android/virtual_deal_room_client_creation/create/mvi/entity/CreateInternalAction$CloseClicked;", "Lcom/avito/android/virtual_deal_room_client_creation/create/mvi/entity/CreateInternalAction$FirstNameInput;", "Lcom/avito/android/virtual_deal_room_client_creation/create/mvi/entity/CreateInternalAction$InvalidForm;", "Lcom/avito/android/virtual_deal_room_client_creation/create/mvi/entity/CreateInternalAction$LastNameInput;", "Lcom/avito/android/virtual_deal_room_client_creation/create/mvi/entity/CreateInternalAction$LoadingSuggestError;", "Lcom/avito/android/virtual_deal_room_client_creation/create/mvi/entity/CreateInternalAction$LoadingSuggestion;", "Lcom/avito/android/virtual_deal_room_client_creation/create/mvi/entity/CreateInternalAction$MiddleNameInput;", "Lcom/avito/android/virtual_deal_room_client_creation/create/mvi/entity/CreateInternalAction$PhoneInput;", "Lcom/avito/android/virtual_deal_room_client_creation/create/mvi/entity/CreateInternalAction$PhoneNumberInUse;", "Lcom/avito/android/virtual_deal_room_client_creation/create/mvi/entity/CreateInternalAction$SubmitFailure;", "Lcom/avito/android/virtual_deal_room_client_creation/create/mvi/entity/CreateInternalAction$SubmitStarted;", "Lcom/avito/android/virtual_deal_room_client_creation/create/mvi/entity/CreateInternalAction$SubmitSuccess;", "Lcom/avito/android/virtual_deal_room_client_creation/create/mvi/entity/CreateInternalAction$SuggestedClients;", "_avito_virtual-deal-room-client-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface CreateInternalAction extends n {

    /* compiled from: CreateInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room_client_creation/create/mvi/entity/CreateInternalAction$ClientSelected;", "Lcom/avito/android/virtual_deal_room_client_creation/create/mvi/entity/CreateInternalAction;", "_avito_virtual-deal-room-client-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ClientSelected implements CreateInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final a f326859b;

        public ClientSelected(@k a aVar) {
            this.f326859b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ClientSelected) && L.f(this.f326859b, ((ClientSelected) obj).f326859b);
        }

        public final int hashCode() {
            return this.f326859b.hashCode();
        }

        @k
        public final String toString() {
            return "ClientSelected(client=" + this.f326859b + ')';
        }
    }

    /* compiled from: CreateInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/virtual_deal_room_client_creation/create/mvi/entity/CreateInternalAction$CloseClicked;", "Lcom/avito/android/virtual_deal_room_client_creation/create/mvi/entity/CreateInternalAction;", "<init>", "()V", "_avito_virtual-deal-room-client-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseClicked implements CreateInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseClicked f326860b = new CloseClicked();

        private CloseClicked() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseClicked);
        }

        public final int hashCode() {
            return 69632408;
        }

        @k
        public final String toString() {
            return "CloseClicked";
        }
    }

    /* compiled from: CreateInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room_client_creation/create/mvi/entity/CreateInternalAction$FirstNameInput;", "Lcom/avito/android/virtual_deal_room_client_creation/create/mvi/entity/CreateInternalAction;", "_avito_virtual-deal-room-client-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FirstNameInput implements CreateInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f326861b;

        public FirstNameInput(@k String str) {
            this.f326861b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FirstNameInput) && L.f(this.f326861b, ((FirstNameInput) obj).f326861b);
        }

        public final int hashCode() {
            return this.f326861b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("FirstNameInput(input="), this.f326861b, ')');
        }
    }

    /* compiled from: CreateInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/virtual_deal_room_client_creation/create/mvi/entity/CreateInternalAction$InvalidForm;", "Lcom/avito/android/virtual_deal_room_client_creation/create/mvi/entity/CreateInternalAction;", "<init>", "()V", "_avito_virtual-deal-room-client-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InvalidForm implements CreateInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final InvalidForm f326862b = new InvalidForm();

        private InvalidForm() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof InvalidForm);
        }

        public final int hashCode() {
            return -104412238;
        }

        @k
        public final String toString() {
            return "InvalidForm";
        }
    }

    /* compiled from: CreateInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room_client_creation/create/mvi/entity/CreateInternalAction$LastNameInput;", "Lcom/avito/android/virtual_deal_room_client_creation/create/mvi/entity/CreateInternalAction;", "_avito_virtual-deal-room-client-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LastNameInput implements CreateInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f326863b;

        public LastNameInput(@k String str) {
            this.f326863b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LastNameInput) && L.f(this.f326863b, ((LastNameInput) obj).f326863b);
        }

        public final int hashCode() {
            return this.f326863b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("LastNameInput(input="), this.f326863b, ')');
        }
    }

    /* compiled from: CreateInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/virtual_deal_room_client_creation/create/mvi/entity/CreateInternalAction$LoadingSuggestError;", "Lcom/avito/android/virtual_deal_room_client_creation/create/mvi/entity/CreateInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_virtual-deal-room-client-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingSuggestError implements CreateInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f326864b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f326865c;

        public LoadingSuggestError(@k ApiError apiError) {
            this.f326864b = apiError;
            this.f326865c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF220626e() {
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
            return (obj instanceof LoadingSuggestError) && L.f(this.f326864b, ((LoadingSuggestError) obj).f326864b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF279562g() {
            return this.f326865c;
        }

        public final int hashCode() {
            return this.f326864b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("LoadingSuggestError(error="), this.f326864b, ')');
        }
    }

    /* compiled from: CreateInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/virtual_deal_room_client_creation/create/mvi/entity/CreateInternalAction$LoadingSuggestion;", "Lcom/avito/android/virtual_deal_room_client_creation/create/mvi/entity/CreateInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_virtual-deal-room-client-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LoadingSuggestion extends TrackableLoadingStarted implements CreateInternalAction {
    }

    /* compiled from: CreateInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room_client_creation/create/mvi/entity/CreateInternalAction$MiddleNameInput;", "Lcom/avito/android/virtual_deal_room_client_creation/create/mvi/entity/CreateInternalAction;", "_avito_virtual-deal-room-client-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MiddleNameInput implements CreateInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f326866b;

        public MiddleNameInput(@k String str) {
            this.f326866b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MiddleNameInput) && L.f(this.f326866b, ((MiddleNameInput) obj).f326866b);
        }

        public final int hashCode() {
            return this.f326866b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("MiddleNameInput(input="), this.f326866b, ')');
        }
    }

    /* compiled from: CreateInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room_client_creation/create/mvi/entity/CreateInternalAction$PhoneInput;", "Lcom/avito/android/virtual_deal_room_client_creation/create/mvi/entity/CreateInternalAction;", "_avito_virtual-deal-room-client-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PhoneInput implements CreateInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f326867b;

        public PhoneInput(@k String str) {
            this.f326867b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PhoneInput) && L.f(this.f326867b, ((PhoneInput) obj).f326867b);
        }

        public final int hashCode() {
            return this.f326867b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("PhoneInput(input="), this.f326867b, ')');
        }
    }

    /* compiled from: CreateInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/virtual_deal_room_client_creation/create/mvi/entity/CreateInternalAction$PhoneNumberInUse;", "Lcom/avito/android/virtual_deal_room_client_creation/create/mvi/entity/CreateInternalAction;", "<init>", "()V", "_avito_virtual-deal-room-client-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PhoneNumberInUse implements CreateInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final PhoneNumberInUse f326868b = new PhoneNumberInUse();

        private PhoneNumberInUse() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof PhoneNumberInUse);
        }

        public final int hashCode() {
            return -991881196;
        }

        @k
        public final String toString() {
            return "PhoneNumberInUse";
        }
    }

    /* compiled from: CreateInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room_client_creation/create/mvi/entity/CreateInternalAction$SubmitFailure;", "Lcom/avito/android/virtual_deal_room_client_creation/create/mvi/entity/CreateInternalAction;", "_avito_virtual-deal-room-client-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SubmitFailure implements CreateInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f326869b;

        public SubmitFailure(@k ApiError apiError) {
            this.f326869b = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SubmitFailure) && L.f(this.f326869b, ((SubmitFailure) obj).f326869b);
        }

        public final int hashCode() {
            return this.f326869b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("SubmitFailure(error="), this.f326869b, ')');
        }
    }

    /* compiled from: CreateInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/virtual_deal_room_client_creation/create/mvi/entity/CreateInternalAction$SubmitStarted;", "Lcom/avito/android/virtual_deal_room_client_creation/create/mvi/entity/CreateInternalAction;", "<init>", "()V", "_avito_virtual-deal-room-client-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SubmitStarted implements CreateInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final SubmitStarted f326870b = new SubmitStarted();

        private SubmitStarted() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof SubmitStarted);
        }

        public final int hashCode() {
            return -2145435680;
        }

        @k
        public final String toString() {
            return "SubmitStarted";
        }
    }

    /* compiled from: CreateInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room_client_creation/create/mvi/entity/CreateInternalAction$SubmitSuccess;", "Lcom/avito/android/virtual_deal_room_client_creation/create/mvi/entity/CreateInternalAction;", "_avito_virtual-deal-room-client-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SubmitSuccess implements CreateInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final a f326871b;

        public SubmitSuccess(@k a aVar) {
            this.f326871b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SubmitSuccess) && L.f(this.f326871b, ((SubmitSuccess) obj).f326871b);
        }

        public final int hashCode() {
            return this.f326871b.hashCode();
        }

        @k
        public final String toString() {
            return "SubmitSuccess(client=" + this.f326871b + ')';
        }
    }

    /* compiled from: CreateInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/virtual_deal_room_client_creation/create/mvi/entity/CreateInternalAction$SuggestedClients;", "Lcom/avito/android/virtual_deal_room_client_creation/create/mvi/entity/CreateInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_virtual-deal-room-client-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SuggestedClients implements CreateInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ArrayList f326872b;

        public SuggestedClients(@k ArrayList arrayList) {
            this.f326872b = arrayList;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF220626e() {
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
            return (obj instanceof SuggestedClients) && this.f326872b.equals(((SuggestedClients) obj).f326872b);
        }

        public final int hashCode() {
            return this.f326872b.hashCode();
        }

        @k
        public final String toString() {
            return e.p(new StringBuilder("SuggestedClients(data="), this.f326872b, ')');
        }
    }
}
