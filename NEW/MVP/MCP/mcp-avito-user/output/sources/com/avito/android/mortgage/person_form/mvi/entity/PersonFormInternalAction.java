package com.avito.android.mortgage.person_form.mvi.entity;

import E00.a;
import F00.c;
import JZ.m;
import JZ.u;
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
import com.avito.android.mortgage.api.model.items.form.SuggestFormContentItemValue;
import com.avito.android.mortgage.person_form.model.PersonFormArguments;
import com.avito.android.mortgage.phone_confirm.model.PhoneConfirmArguments;
import com.avito.android.remote.error.ApiError;
import com.avito.android.select.Arguments;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PersonFormInternalAction.kt */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002:#\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%\u0082\u0001#&'()*+,-./0123456789:;<=>?@ABCDEFGH¨\u0006I"}, d2 = {"Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "LE00/a;", "ButtonNextClicked", "CloseFlow", "DiscloseSuggestionClicked", "FieldUpdated", "FieldUploadingCompleted", "FieldUploadingFailed", "FieldUploadingStarted", "GoBack", "HandleDeeplink", "Init", "InputFieldClicked", "LoadingCompleted", "LoadingFailed", "LoadingStarted", "OpenPhoneConfirmationDialog", "OpenSelector", "OpenStep", "OpenSuggestion", "PhoneConfirmed", "ReloadingCompleted", "ReloadingFailed", "ReloadingStarted", "ScrollStarted", "ScrollTo", "SetVerificationBannerActionEnabled", "ShowError", "UpdateContent", "UpdateContentState", "UpdateStepsByBooleanField", "UpdateStepsByStringField", "UpdateVerificationBanner", "UploadingCompleted", "UploadingFailed", "UploadingStarted", "VerificationBannerActionClicked", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$ButtonNextClicked;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$CloseFlow;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$DiscloseSuggestionClicked;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$FieldUpdated;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$FieldUploadingCompleted;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$FieldUploadingFailed;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$FieldUploadingStarted;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$GoBack;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$HandleDeeplink;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$Init;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$InputFieldClicked;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$LoadingCompleted;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$LoadingFailed;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$LoadingStarted;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$OpenPhoneConfirmationDialog;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$OpenSelector;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$OpenStep;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$OpenSuggestion;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$PhoneConfirmed;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$ReloadingCompleted;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$ReloadingFailed;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$ReloadingStarted;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$ScrollStarted;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$ScrollTo;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$SetVerificationBannerActionEnabled;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$ShowError;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$UpdateContent;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$UpdateContentState;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$UpdateStepsByBooleanField;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$UpdateStepsByStringField;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$UpdateVerificationBanner;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$UploadingCompleted;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$UploadingFailed;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$UploadingStarted;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$VerificationBannerActionClicked;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface PersonFormInternalAction extends n, a {

    /* compiled from: PersonFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$ButtonNextClicked;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ButtonNextClicked implements PersonFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ButtonNextClicked f201175b = new ButtonNextClicked();

        private ButtonNextClicked() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ButtonNextClicked);
        }

        public final int hashCode() {
            return 532759766;
        }

        @k
        public final String toString() {
            return "ButtonNextClicked";
        }
    }

    /* compiled from: PersonFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$CloseFlow;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseFlow implements PersonFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseFlow f201176b = new CloseFlow();

        private CloseFlow() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseFlow);
        }

        public final int hashCode() {
            return 1198943482;
        }

        @k
        public final String toString() {
            return "CloseFlow";
        }
    }

    /* compiled from: PersonFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$DiscloseSuggestionClicked;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DiscloseSuggestionClicked implements PersonFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f201177b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f201178c;

        public DiscloseSuggestionClicked(@k String str, @l String str2) {
            this.f201177b = str;
            this.f201178c = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DiscloseSuggestionClicked)) {
                return false;
            }
            DiscloseSuggestionClicked discloseSuggestionClicked = (DiscloseSuggestionClicked) obj;
            return L.f(this.f201177b, discloseSuggestionClicked.f201177b) && L.f(this.f201178c, discloseSuggestionClicked.f201178c);
        }

        public final int hashCode() {
            int iHashCode = this.f201177b.hashCode() * 31;
            String str = this.f201178c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DiscloseSuggestionClicked(fieldId=");
            sb2.append(this.f201177b);
            sb2.append(", processId=");
            return C22026a.c(sb2, this.f201178c, ')');
        }
    }

    /* compiled from: PersonFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$FieldUpdated;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FieldUpdated implements PersonFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f201179b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f201180c;

        public FieldUpdated(@k String str, @l String str2) {
            this.f201179b = str;
            this.f201180c = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FieldUpdated)) {
                return false;
            }
            FieldUpdated fieldUpdated = (FieldUpdated) obj;
            return L.f(this.f201179b, fieldUpdated.f201179b) && L.f(this.f201180c, fieldUpdated.f201180c);
        }

        public final int hashCode() {
            int iHashCode = this.f201179b.hashCode() * 31;
            String str = this.f201180c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FieldUpdated(fieldId=");
            sb2.append(this.f201179b);
            sb2.append(", processId=");
            return C22026a.c(sb2, this.f201180c, ')');
        }
    }

    /* compiled from: PersonFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$FieldUploadingCompleted;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "LF00/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FieldUploadingCompleted implements PersonFormInternalAction, TrackableContent, c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Set<com.avito.android.mortgage.person_form.mvi.domain.validators.a> f201181b;

        public FieldUploadingCompleted(@k Set<com.avito.android.mortgage.person_form.mvi.domain.validators.a> set) {
            this.f201181b = set;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF185112d() {
            return "uploading_field";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF185111s() {
            return "uploading_field";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FieldUploadingCompleted) && L.f(this.f201181b, ((FieldUploadingCompleted) obj).f201181b);
        }

        public final int hashCode() {
            return this.f201181b.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.u(new StringBuilder("FieldUploadingCompleted(validationResult="), this.f201181b, ')');
        }
    }

    /* compiled from: PersonFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$FieldUploadingFailed;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "LF00/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FieldUploadingFailed implements PersonFormInternalAction, TrackableError, c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f201182b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f201183c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f201184d = "uploading_field";

        public FieldUploadingFailed(@k ApiError apiError) {
            this.f201182b = apiError;
            this.f201183c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF185112d() {
            return this.f201184d;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF185111s() {
            return this.f201184d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FieldUploadingFailed) && L.f(this.f201182b, ((FieldUploadingFailed) obj).f201182b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF185068d() {
            return this.f201183c;
        }

        public final int hashCode() {
            return this.f201182b.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.n(new StringBuilder("FieldUploadingFailed(error="), this.f201182b, ')');
        }
    }

    /* compiled from: PersonFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$FieldUploadingStarted;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FieldUploadingStarted extends TrackableLoadingStarted implements PersonFormInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f201185d = "uploading_field";

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF185112d() {
            return this.f201185d;
        }
    }

    /* compiled from: PersonFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$GoBack;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class GoBack implements PersonFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final GoBack f201186b = new GoBack();

        private GoBack() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof GoBack);
        }

        public final int hashCode() {
            return -924649285;
        }

        @k
        public final String toString() {
            return "GoBack";
        }
    }

    /* compiled from: PersonFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$HandleDeeplink;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements PersonFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f201187b;

        public HandleDeeplink(@k DeepLink deepLink) {
            this.f201187b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleDeeplink) && L.f(this.f201187b, ((HandleDeeplink) obj).f201187b);
        }

        public final int hashCode() {
            return this.f201187b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f201187b, ')');
        }
    }

    /* compiled from: PersonFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$Init;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Init implements PersonFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PersonFormArguments f201188b;

        public Init(@k PersonFormArguments personFormArguments) {
            this.f201188b = personFormArguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Init) && L.f(this.f201188b, ((Init) obj).f201188b);
        }

        public final int hashCode() {
            return this.f201188b.hashCode();
        }

        @k
        public final String toString() {
            return "Init(args=" + this.f201188b + ')';
        }
    }

    /* compiled from: PersonFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$InputFieldClicked;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InputFieldClicked implements PersonFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f201189b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f201190c;

        public InputFieldClicked(@k String str, @l String str2) {
            this.f201189b = str;
            this.f201190c = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InputFieldClicked)) {
                return false;
            }
            InputFieldClicked inputFieldClicked = (InputFieldClicked) obj;
            return L.f(this.f201189b, inputFieldClicked.f201189b) && L.f(this.f201190c, inputFieldClicked.f201190c);
        }

        public final int hashCode() {
            int iHashCode = this.f201189b.hashCode() * 31;
            String str = this.f201190c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("InputFieldClicked(fieldId=");
            sb2.append(this.f201189b);
            sb2.append(", processId=");
            return C22026a.c(sb2, this.f201190c, ')');
        }
    }

    /* compiled from: PersonFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$LoadingCompleted;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "LF00/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingCompleted implements PersonFormInternalAction, TrackableContent, c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final m f201191b;

        public LoadingCompleted(@k m mVar) {
            this.f201191b = mVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF185112d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF185111s() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoadingCompleted) && L.f(this.f201191b, ((LoadingCompleted) obj).f201191b);
        }

        public final int hashCode() {
            return this.f201191b.hashCode();
        }

        @k
        public final String toString() {
            return "LoadingCompleted(model=" + this.f201191b + ')';
        }
    }

    /* compiled from: PersonFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$LoadingFailed;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingFailed implements PersonFormInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f201192b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f201193c;

        public LoadingFailed(@k ApiError apiError) {
            this.f201192b = apiError;
            this.f201193c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF185112d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF185111s() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoadingFailed) && L.f(this.f201192b, ((LoadingFailed) obj).f201192b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF185068d() {
            return this.f201193c;
        }

        public final int hashCode() {
            return this.f201192b.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.n(new StringBuilder("LoadingFailed(error="), this.f201192b, ')');
        }
    }

    /* compiled from: PersonFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$LoadingStarted;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LoadingStarted extends TrackableLoadingStarted implements PersonFormInternalAction {
    }

    /* compiled from: PersonFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$OpenPhoneConfirmationDialog;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenPhoneConfirmationDialog implements PersonFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PhoneConfirmArguments f201194b;

        public OpenPhoneConfirmationDialog(@k PhoneConfirmArguments phoneConfirmArguments) {
            this.f201194b = phoneConfirmArguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenPhoneConfirmationDialog) && L.f(this.f201194b, ((OpenPhoneConfirmationDialog) obj).f201194b);
        }

        public final int hashCode() {
            return this.f201194b.hashCode();
        }

        @k
        public final String toString() {
            return "OpenPhoneConfirmationDialog(args=" + this.f201194b + ')';
        }
    }

    /* compiled from: PersonFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$OpenSelector;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenSelector implements PersonFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f201195b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Arguments f201196c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f201197d;

        public OpenSelector(@k String str, @k Arguments arguments, @l String str2) {
            this.f201195b = str;
            this.f201196c = arguments;
            this.f201197d = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenSelector)) {
                return false;
            }
            OpenSelector openSelector = (OpenSelector) obj;
            return L.f(this.f201195b, openSelector.f201195b) && L.f(this.f201196c, openSelector.f201196c) && L.f(this.f201197d, openSelector.f201197d);
        }

        public final int hashCode() {
            int iHashCode = (this.f201196c.hashCode() + (this.f201195b.hashCode() * 31)) * 31;
            String str = this.f201197d;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenSelector(fieldId=");
            sb2.append(this.f201195b);
            sb2.append(", arguments=");
            sb2.append(this.f201196c);
            sb2.append(", processId=");
            return C22026a.c(sb2, this.f201197d, ')');
        }
    }

    /* compiled from: PersonFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$OpenStep;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenStep implements PersonFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<String> f201198b;

        /* renamed from: c, reason: collision with root package name */
        public final int f201199c;

        public OpenStep(@k List<String> list, int i12) {
            this.f201198b = list;
            this.f201199c = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenStep)) {
                return false;
            }
            OpenStep openStep = (OpenStep) obj;
            return L.f(this.f201198b, openStep.f201198b) && this.f201199c == openStep.f201199c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f201199c) + (this.f201198b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenStep(steps=");
            sb2.append(this.f201198b);
            sb2.append(", stepIdx=");
            return r.t(sb2, this.f201199c, ')');
        }
    }

    /* compiled from: PersonFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$OpenSuggestion;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenSuggestion implements PersonFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SuggestFormContentItemValue f201200b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f201201c;

        public OpenSuggestion(@k SuggestFormContentItemValue suggestFormContentItemValue, @k String str) {
            this.f201200b = suggestFormContentItemValue;
            this.f201201c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenSuggestion)) {
                return false;
            }
            OpenSuggestion openSuggestion = (OpenSuggestion) obj;
            return L.f(this.f201200b, openSuggestion.f201200b) && L.f(this.f201201c, openSuggestion.f201201c);
        }

        public final int hashCode() {
            return this.f201201c.hashCode() + (this.f201200b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenSuggestion(suggestItem=");
            sb2.append(this.f201200b);
            sb2.append(", step=");
            return C22026a.c(sb2, this.f201201c, ')');
        }
    }

    /* compiled from: PersonFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$PhoneConfirmed;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PhoneConfirmed implements PersonFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final PhoneConfirmed f201202b = new PhoneConfirmed();

        private PhoneConfirmed() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof PhoneConfirmed);
        }

        public final int hashCode() {
            return -319620003;
        }

        @k
        public final String toString() {
            return "PhoneConfirmed";
        }
    }

    /* compiled from: PersonFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$ReloadingCompleted;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "LF00/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ReloadingCompleted implements PersonFormInternalAction, TrackableContent, c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final m f201203b;

        public ReloadingCompleted(@k m mVar) {
            this.f201203b = mVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF185112d() {
            return "form_reloading";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF185111s() {
            return "form_reloading";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ReloadingCompleted) && L.f(this.f201203b, ((ReloadingCompleted) obj).f201203b);
        }

        public final int hashCode() {
            return this.f201203b.hashCode();
        }

        @k
        public final String toString() {
            return "ReloadingCompleted(model=" + this.f201203b + ')';
        }
    }

    /* compiled from: PersonFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$ReloadingFailed;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ReloadingFailed implements PersonFormInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f201204b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f201205c;

        public ReloadingFailed(@k ApiError apiError) {
            this.f201204b = apiError;
            this.f201205c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF185112d() {
            return "form_reloading";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF185111s() {
            return "form_reloading";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ReloadingFailed) && L.f(this.f201204b, ((ReloadingFailed) obj).f201204b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF185068d() {
            return this.f201205c;
        }

        public final int hashCode() {
            return this.f201204b.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.n(new StringBuilder("ReloadingFailed(error="), this.f201204b, ')');
        }
    }

    /* compiled from: PersonFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$ReloadingStarted;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ReloadingStarted extends TrackableLoadingStarted implements PersonFormInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f201206d = "form_reloading";

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF185112d() {
            return this.f201206d;
        }
    }

    /* compiled from: PersonFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$ScrollStarted;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ScrollStarted implements PersonFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ScrollStarted f201207b = new ScrollStarted();

        private ScrollStarted() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ScrollStarted);
        }

        public final int hashCode() {
            return -2097873752;
        }

        @k
        public final String toString() {
            return "ScrollStarted";
        }
    }

    /* compiled from: PersonFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$ScrollTo;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ScrollTo implements PersonFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f201208b;

        public ScrollTo(int i12) {
            this.f201208b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ScrollTo) && this.f201208b == ((ScrollTo) obj).f201208b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f201208b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("ScrollTo(itemPosition="), this.f201208b, ')');
        }
    }

    /* compiled from: PersonFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$SetVerificationBannerActionEnabled;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetVerificationBannerActionEnabled implements PersonFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f201209b;

        public SetVerificationBannerActionEnabled(boolean z12) {
            this.f201209b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetVerificationBannerActionEnabled) && this.f201209b == ((SetVerificationBannerActionEnabled) obj).f201209b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f201209b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("SetVerificationBannerActionEnabled(isEnabled="), this.f201209b, ')');
        }
    }

    /* compiled from: PersonFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$ShowError;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowError implements PersonFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f201210b;

        public ShowError(@k ApiError apiError) {
            this.f201210b = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowError) && L.f(this.f201210b, ((ShowError) obj).f201210b);
        }

        public final int hashCode() {
            return this.f201210b.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.n(new StringBuilder("ShowError(apiError="), this.f201210b, ')');
        }
    }

    /* compiled from: PersonFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$UpdateContent;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "LF00/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateContent implements PersonFormInternalAction, c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final m f201211b;

        public UpdateContent(@k m mVar) {
            this.f201211b = mVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateContent) && L.f(this.f201211b, ((UpdateContent) obj).f201211b);
        }

        public final int hashCode() {
            return this.f201211b.hashCode();
        }

        @k
        public final String toString() {
            return "UpdateContent(model=" + this.f201211b + ')';
        }
    }

    /* compiled from: PersonFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$UpdateContentState;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateContentState implements PersonFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final F00.a f201212b;

        public UpdateContentState(@k F00.a aVar) {
            this.f201212b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateContentState) && L.f(this.f201212b, ((UpdateContentState) obj).f201212b);
        }

        public final int hashCode() {
            return this.f201212b.hashCode();
        }

        @k
        public final String toString() {
            return "UpdateContentState(contentState=" + this.f201212b + ')';
        }
    }

    /* compiled from: PersonFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$UpdateStepsByBooleanField;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateStepsByBooleanField implements PersonFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f201213b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f201214c;

        public UpdateStepsByBooleanField(@k String str, boolean z12) {
            this.f201213b = str;
            this.f201214c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateStepsByBooleanField)) {
                return false;
            }
            UpdateStepsByBooleanField updateStepsByBooleanField = (UpdateStepsByBooleanField) obj;
            return L.f(this.f201213b, updateStepsByBooleanField.f201213b) && this.f201214c == updateStepsByBooleanField.f201214c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f201214c) + (this.f201213b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateStepsByBooleanField(fieldId=");
            sb2.append(this.f201213b);
            sb2.append(", newValue=");
            return r.x(sb2, this.f201214c, ')');
        }
    }

    /* compiled from: PersonFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$UpdateStepsByStringField;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateStepsByStringField implements PersonFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f201215b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f201216c;

        public UpdateStepsByStringField(@k String str, @l String str2) {
            this.f201215b = str;
            this.f201216c = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateStepsByStringField)) {
                return false;
            }
            UpdateStepsByStringField updateStepsByStringField = (UpdateStepsByStringField) obj;
            return L.f(this.f201215b, updateStepsByStringField.f201215b) && L.f(this.f201216c, updateStepsByStringField.f201216c);
        }

        public final int hashCode() {
            int iHashCode = this.f201215b.hashCode() * 31;
            String str = this.f201216c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateStepsByStringField(fieldId=");
            sb2.append(this.f201215b);
            sb2.append(", newValue=");
            return C22026a.c(sb2, this.f201216c, ')');
        }
    }

    /* compiled from: PersonFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$UpdateVerificationBanner;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateVerificationBanner implements PersonFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final u f201217b;

        public UpdateVerificationBanner(@l u uVar) {
            this.f201217b = uVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateVerificationBanner) && L.f(this.f201217b, ((UpdateVerificationBanner) obj).f201217b);
        }

        public final int hashCode() {
            u uVar = this.f201217b;
            if (uVar == null) {
                return 0;
            }
            return uVar.hashCode();
        }

        @k
        public final String toString() {
            return "UpdateVerificationBanner(verificationBanner=" + this.f201217b + ')';
        }
    }

    /* compiled from: PersonFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$UploadingCompleted;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "LF00/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UploadingCompleted implements PersonFormInternalAction, TrackableContent, c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Set<com.avito.android.mortgage.person_form.mvi.domain.validators.a> f201218b;

        public UploadingCompleted(@k Set<com.avito.android.mortgage.person_form.mvi.domain.validators.a> set) {
            this.f201218b = set;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF185112d() {
            return "uploading_form";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF185111s() {
            return "uploading_form";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UploadingCompleted) && L.f(this.f201218b, ((UploadingCompleted) obj).f201218b);
        }

        public final int hashCode() {
            return this.f201218b.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.u(new StringBuilder("UploadingCompleted(validationResult="), this.f201218b, ')');
        }
    }

    /* compiled from: PersonFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$UploadingFailed;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UploadingFailed implements PersonFormInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f201219b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f201220c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f201221d = "uploading_form";

        public UploadingFailed(@k ApiError apiError) {
            this.f201219b = apiError;
            this.f201220c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF185112d() {
            return this.f201221d;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF185111s() {
            return this.f201221d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UploadingFailed) && L.f(this.f201219b, ((UploadingFailed) obj).f201219b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF185068d() {
            return this.f201220c;
        }

        public final int hashCode() {
            return this.f201219b.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.n(new StringBuilder("UploadingFailed(error="), this.f201219b, ')');
        }
    }

    /* compiled from: PersonFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$UploadingStarted;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UploadingStarted extends TrackableLoadingStarted implements PersonFormInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f201222d = "uploading_form";

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF185112d() {
            return this.f201222d;
        }
    }

    /* compiled from: PersonFormInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$VerificationBannerActionClicked;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class VerificationBannerActionClicked implements PersonFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f201223b;

        public VerificationBannerActionClicked(@k String str) {
            this.f201223b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VerificationBannerActionClicked) && L.f(this.f201223b, ((VerificationBannerActionClicked) obj).f201223b);
        }

        public final int hashCode() {
            return this.f201223b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("VerificationBannerActionClicked(verificationStatus="), this.f201223b, ')');
        }
    }
}
