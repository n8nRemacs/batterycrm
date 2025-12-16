package com.avito.android.safety.safety_settings.mvi.entity;

import X41.g;
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
import com.avito.android.deep_linking.links.auth.SessionDeleteLink;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.safety.safety_settings.mvi.entity.SafetySettingsElement;
import java.util.List;
import jo0.C42408d;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SafetySettingsInternalAction.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0017\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0082\u0001\u0017\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./¨\u00060"}, d2 = {"Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "AdditionalContentError", "AdditionalContentLoading", "AdditionalContentSuccess", "CloseAfterLogoutSessionBottomSheet", "CloseSessionBottomSheet", "CloseUnavailableTfaBottomSheet", "ContentError", "ContentLoading", "ContentSuccess", "DeleteSessionLocally", "NavigateBack", "NavigateToAuth", "OpenDisableTfaConfirmScreen", "ShowSessionBottomSheet", "ShowSessionBottomSheetLoading", "ShowSessionDeleteError", "ShowSuccessChangedPassword", "ShowSuccessDisableTfaToastBar", "ShowToastBarError", "ShowUnavailableTfaBottomSheet", "SuccessEnableTfa", "SwitchTfa", "SwitchTfaLoading", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction$AdditionalContentError;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction$AdditionalContentLoading;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction$AdditionalContentSuccess;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction$CloseAfterLogoutSessionBottomSheet;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction$CloseSessionBottomSheet;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction$CloseUnavailableTfaBottomSheet;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction$ContentError;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction$ContentLoading;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction$ContentSuccess;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction$DeleteSessionLocally;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction$NavigateBack;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction$NavigateToAuth;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction$OpenDisableTfaConfirmScreen;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction$ShowSessionBottomSheet;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction$ShowSessionBottomSheetLoading;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction$ShowSessionDeleteError;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction$ShowSuccessChangedPassword;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction$ShowSuccessDisableTfaToastBar;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction$ShowToastBarError;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction$ShowUnavailableTfaBottomSheet;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction$SuccessEnableTfa;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction$SwitchTfa;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction$SwitchTfaLoading;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SafetySettingsInternalAction extends n {

    /* compiled from: SafetySettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction$AdditionalContentError;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AdditionalContentError implements SafetySettingsInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f257702b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f257703c;

        public AdditionalContentError(@k String str) {
            this.f257702b = str;
            J.a.f90383b.getClass();
            this.f257703c = J.a.C2676a.d();
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF201644d() {
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
            return (obj instanceof AdditionalContentError) && L.f(this.f257702b, ((AdditionalContentError) obj).f257702b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF201642c() {
            return this.f257703c;
        }

        public final int hashCode() {
            return this.f257702b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("AdditionalContentError(message="), this.f257702b, ')');
        }
    }

    /* compiled from: SafetySettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction$AdditionalContentLoading;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AdditionalContentLoading extends TrackableLoadingStarted implements SafetySettingsInternalAction {
    }

    /* compiled from: SafetySettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction$AdditionalContentSuccess;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AdditionalContentSuccess implements SafetySettingsInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C42408d f257704b;

        public AdditionalContentSuccess(@k C42408d c42408d) {
            this.f257704b = c42408d;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF201644d() {
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
            return (obj instanceof AdditionalContentSuccess) && L.f(this.f257704b, ((AdditionalContentSuccess) obj).f257704b);
        }

        public final int hashCode() {
            return this.f257704b.hashCode();
        }

        @k
        public final String toString() {
            return "AdditionalContentSuccess(data=" + this.f257704b + ')';
        }
    }

    /* compiled from: SafetySettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction$CloseAfterLogoutSessionBottomSheet;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction;", "<init>", "()V", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseAfterLogoutSessionBottomSheet implements SafetySettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseAfterLogoutSessionBottomSheet f257705b = new CloseAfterLogoutSessionBottomSheet();

        private CloseAfterLogoutSessionBottomSheet() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseAfterLogoutSessionBottomSheet);
        }

        public final int hashCode() {
            return 465322116;
        }

        @k
        public final String toString() {
            return "CloseAfterLogoutSessionBottomSheet";
        }
    }

    /* compiled from: SafetySettingsInternalAction.kt */
    @g
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction$CloseSessionBottomSheet;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction;", "isAfterLoading", "", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CloseSessionBottomSheet implements SafetySettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f257706b;

        private /* synthetic */ CloseSessionBottomSheet(boolean z12) {
            this.f257706b = z12;
        }

        public static final /* synthetic */ CloseSessionBottomSheet c(boolean z12) {
            return new CloseSessionBottomSheet(z12);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof CloseSessionBottomSheet) {
                return this.f257706b == ((CloseSessionBottomSheet) obj).f257706b;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f257706b);
        }

        public final String toString() {
            return "CloseSessionBottomSheet(isAfterLoading=" + this.f257706b + ')';
        }
    }

    /* compiled from: SafetySettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction$CloseUnavailableTfaBottomSheet;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction;", "<init>", "()V", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseUnavailableTfaBottomSheet implements SafetySettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseUnavailableTfaBottomSheet f257707b = new CloseUnavailableTfaBottomSheet();

        private CloseUnavailableTfaBottomSheet() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseUnavailableTfaBottomSheet);
        }

        public final int hashCode() {
            return 157214869;
        }

        @k
        public final String toString() {
            return "CloseUnavailableTfaBottomSheet";
        }
    }

    /* compiled from: SafetySettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction$ContentError;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentError implements SafetySettingsInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f257708b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f257709c;

        public ContentError(@k String str) {
            this.f257708b = str;
            J.a.f90383b.getClass();
            this.f257709c = J.a.C2676a.d();
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF201644d() {
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
            return (obj instanceof ContentError) && L.f(this.f257708b, ((ContentError) obj).f257708b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF201642c() {
            return this.f257709c;
        }

        public final int hashCode() {
            return this.f257708b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ContentError(message="), this.f257708b, ')');
        }
    }

    /* compiled from: SafetySettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction$ContentLoading;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ContentLoading extends TrackableLoadingStarted implements SafetySettingsInternalAction {
    }

    /* compiled from: SafetySettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction$ContentSuccess;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentSuccess implements SafetySettingsInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C42408d f257710b;

        public ContentSuccess(@k C42408d c42408d) {
            this.f257710b = c42408d;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF201644d() {
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
            return (obj instanceof ContentSuccess) && L.f(this.f257710b, ((ContentSuccess) obj).f257710b);
        }

        public final int hashCode() {
            return this.f257710b.hashCode();
        }

        @k
        public final String toString() {
            return "ContentSuccess(data=" + this.f257710b + ')';
        }
    }

    /* compiled from: SafetySettingsInternalAction.kt */
    @g
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction$DeleteSessionLocally;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction;", ContextActionHandler.Link.DEEPLINK, "Lcom/avito/android/deep_linking/links/auth/SessionDeleteLink;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DeleteSessionLocally implements SafetySettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SessionDeleteLink f257711b;

        private /* synthetic */ DeleteSessionLocally(SessionDeleteLink sessionDeleteLink) {
            this.f257711b = sessionDeleteLink;
        }

        public static final /* synthetic */ DeleteSessionLocally c(SessionDeleteLink sessionDeleteLink) {
            return new DeleteSessionLocally(sessionDeleteLink);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof DeleteSessionLocally) {
                return L.f(this.f257711b, ((DeleteSessionLocally) obj).f257711b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f257711b.hashCode();
        }

        public final String toString() {
            return "DeleteSessionLocally(deepLink=" + this.f257711b + ')';
        }
    }

    /* compiled from: SafetySettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction$NavigateBack;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NavigateBack implements SafetySettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f257712b;

        public NavigateBack(boolean z12) {
            this.f257712b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NavigateBack) && this.f257712b == ((NavigateBack) obj).f257712b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f257712b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("NavigateBack(needParentRefresh="), this.f257712b, ')');
        }
    }

    /* compiled from: SafetySettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction$NavigateToAuth;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction;", "<init>", "()V", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NavigateToAuth implements SafetySettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final NavigateToAuth f257713b = new NavigateToAuth();

        private NavigateToAuth() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof NavigateToAuth);
        }

        public final int hashCode() {
            return -514711412;
        }

        @k
        public final String toString() {
            return "NavigateToAuth";
        }
    }

    /* compiled from: SafetySettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction$OpenDisableTfaConfirmScreen;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction;", "<init>", "()V", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDisableTfaConfirmScreen implements SafetySettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OpenDisableTfaConfirmScreen f257714b = new OpenDisableTfaConfirmScreen();

        private OpenDisableTfaConfirmScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof OpenDisableTfaConfirmScreen);
        }

        public final int hashCode() {
            return -860552509;
        }

        @k
        public final String toString() {
            return "OpenDisableTfaConfirmScreen";
        }
    }

    /* compiled from: SafetySettingsInternalAction.kt */
    @g
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction$ShowSessionBottomSheet;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction;", "actions", "", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsElement$SessionItem$a;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowSessionBottomSheet implements SafetySettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<SafetySettingsElement.SessionItem.a> f257715b;

        private /* synthetic */ ShowSessionBottomSheet(List list) {
            this.f257715b = list;
        }

        public static final /* synthetic */ ShowSessionBottomSheet c(List list) {
            return new ShowSessionBottomSheet(list);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof ShowSessionBottomSheet) {
                return L.f(this.f257715b, ((ShowSessionBottomSheet) obj).f257715b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f257715b.hashCode();
        }

        public final String toString() {
            return "ShowSessionBottomSheet(actions=" + this.f257715b + ')';
        }
    }

    /* compiled from: SafetySettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction$ShowSessionBottomSheetLoading;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction;", "<init>", "()V", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowSessionBottomSheetLoading implements SafetySettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowSessionBottomSheetLoading f257716b = new ShowSessionBottomSheetLoading();

        private ShowSessionBottomSheetLoading() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowSessionBottomSheetLoading);
        }

        public final int hashCode() {
            return -513741463;
        }

        @k
        public final String toString() {
            return "ShowSessionBottomSheetLoading";
        }
    }

    /* compiled from: SafetySettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction$ShowSessionDeleteError;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction;", "<init>", "()V", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowSessionDeleteError implements SafetySettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowSessionDeleteError f257717b = new ShowSessionDeleteError();

        private ShowSessionDeleteError() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowSessionDeleteError);
        }

        public final int hashCode() {
            return -336801412;
        }

        @k
        public final String toString() {
            return "ShowSessionDeleteError";
        }
    }

    /* compiled from: SafetySettingsInternalAction.kt */
    @g
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction$ShowSuccessChangedPassword;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction;", "message", "", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowSuccessChangedPassword implements SafetySettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f257718b;

        private /* synthetic */ ShowSuccessChangedPassword(String str) {
            this.f257718b = str;
        }

        public static final /* synthetic */ ShowSuccessChangedPassword c(String str) {
            return new ShowSuccessChangedPassword(str);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof ShowSuccessChangedPassword) {
                return L.f(this.f257718b, ((ShowSuccessChangedPassword) obj).f257718b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f257718b.hashCode();
        }

        public final String toString() {
            return C22026a.c(new StringBuilder("ShowSuccessChangedPassword(message="), this.f257718b, ')');
        }
    }

    /* compiled from: SafetySettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction$ShowSuccessDisableTfaToastBar;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction;", "<init>", "()V", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowSuccessDisableTfaToastBar implements SafetySettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowSuccessDisableTfaToastBar f257719b = new ShowSuccessDisableTfaToastBar();

        private ShowSuccessDisableTfaToastBar() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowSuccessDisableTfaToastBar);
        }

        public final int hashCode() {
            return 1817178785;
        }

        @k
        public final String toString() {
            return "ShowSuccessDisableTfaToastBar";
        }
    }

    /* compiled from: SafetySettingsInternalAction.kt */
    @g
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction$ShowToastBarError;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction;", "message", "", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowToastBarError implements SafetySettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f257720b;

        private /* synthetic */ ShowToastBarError(String str) {
            this.f257720b = str;
        }

        public static final /* synthetic */ ShowToastBarError c(String str) {
            return new ShowToastBarError(str);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof ShowToastBarError) {
                return L.f(this.f257720b, ((ShowToastBarError) obj).f257720b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f257720b.hashCode();
        }

        public final String toString() {
            return C22026a.c(new StringBuilder("ShowToastBarError(message="), this.f257720b, ')');
        }
    }

    /* compiled from: SafetySettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction$ShowUnavailableTfaBottomSheet;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction;", "<init>", "()V", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowUnavailableTfaBottomSheet implements SafetySettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowUnavailableTfaBottomSheet f257721b = new ShowUnavailableTfaBottomSheet();

        private ShowUnavailableTfaBottomSheet() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowUnavailableTfaBottomSheet);
        }

        public final int hashCode() {
            return -2070588864;
        }

        @k
        public final String toString() {
            return "ShowUnavailableTfaBottomSheet";
        }
    }

    /* compiled from: SafetySettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction$SuccessEnableTfa;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction;", "<init>", "()V", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SuccessEnableTfa implements SafetySettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final SuccessEnableTfa f257722b = new SuccessEnableTfa();

        private SuccessEnableTfa() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof SuccessEnableTfa);
        }

        public final int hashCode() {
            return -1280507423;
        }

        @k
        public final String toString() {
            return "SuccessEnableTfa";
        }
    }

    /* compiled from: SafetySettingsInternalAction.kt */
    @g
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction$SwitchTfa;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction;", "isEnabled", "", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SwitchTfa implements SafetySettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f257723b;

        private /* synthetic */ SwitchTfa(boolean z12) {
            this.f257723b = z12;
        }

        public static final /* synthetic */ SwitchTfa c(boolean z12) {
            return new SwitchTfa(z12);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof SwitchTfa) {
                return this.f257723b == ((SwitchTfa) obj).f257723b;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f257723b);
        }

        public final String toString() {
            return "SwitchTfa(isEnabled=" + this.f257723b + ')';
        }
    }

    /* compiled from: SafetySettingsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction$SwitchTfaLoading;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction;", "<init>", "()V", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SwitchTfaLoading implements SafetySettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final SwitchTfaLoading f257724b = new SwitchTfaLoading();

        private SwitchTfaLoading() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof SwitchTfaLoading);
        }

        public final int hashCode() {
            return 339892057;
        }

        @k
        public final String toString() {
            return "SwitchTfaLoading";
        }
    }
}
