package com.avito.android.passport.profile_add.create_flow.select_vertical.mvi.entity;

import X50.e;
import Y61.k;
import Y61.l;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.passport.profile_add.create_flow.host.Navigation;
import com.avito.android.remote.model.text.AttributedText;
import hb0.C40908a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectVerticalInternalAction.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u0082\u0001\f\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/select_vertical/mvi/entity/SelectVerticalInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ActionError", "EmptySelectError", "FinishActionInProgress", "Navigate", "OpenDeepLink", "OpenVerticalDisablingInfoBottomSheet", "ProfileConstructorLoaded", "ProfileConstructorLoading", "ProfileConstructorLoadingError", "SelectVertical", "ShowToast", "StartActionProgress", "Lcom/avito/android/passport/profile_add/create_flow/select_vertical/mvi/entity/SelectVerticalInternalAction$ActionError;", "Lcom/avito/android/passport/profile_add/create_flow/select_vertical/mvi/entity/SelectVerticalInternalAction$EmptySelectError;", "Lcom/avito/android/passport/profile_add/create_flow/select_vertical/mvi/entity/SelectVerticalInternalAction$FinishActionInProgress;", "Lcom/avito/android/passport/profile_add/create_flow/select_vertical/mvi/entity/SelectVerticalInternalAction$Navigate;", "Lcom/avito/android/passport/profile_add/create_flow/select_vertical/mvi/entity/SelectVerticalInternalAction$OpenDeepLink;", "Lcom/avito/android/passport/profile_add/create_flow/select_vertical/mvi/entity/SelectVerticalInternalAction$OpenVerticalDisablingInfoBottomSheet;", "Lcom/avito/android/passport/profile_add/create_flow/select_vertical/mvi/entity/SelectVerticalInternalAction$ProfileConstructorLoaded;", "Lcom/avito/android/passport/profile_add/create_flow/select_vertical/mvi/entity/SelectVerticalInternalAction$ProfileConstructorLoading;", "Lcom/avito/android/passport/profile_add/create_flow/select_vertical/mvi/entity/SelectVerticalInternalAction$ProfileConstructorLoadingError;", "Lcom/avito/android/passport/profile_add/create_flow/select_vertical/mvi/entity/SelectVerticalInternalAction$SelectVertical;", "Lcom/avito/android/passport/profile_add/create_flow/select_vertical/mvi/entity/SelectVerticalInternalAction$ShowToast;", "Lcom/avito/android/passport/profile_add/create_flow/select_vertical/mvi/entity/SelectVerticalInternalAction$StartActionProgress;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface SelectVerticalInternalAction extends n {

    /* compiled from: SelectVerticalInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/select_vertical/mvi/entity/SelectVerticalInternalAction$ActionError;", "Lcom/avito/android/passport/profile_add/create_flow/select_vertical/mvi/entity/SelectVerticalInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ActionError implements SelectVerticalInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f211954b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f211955c;

        public ActionError(@k Throwable th2) {
            this.f211954b = th2;
            this.f211955c = new J.a(th2);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF211747d() {
            return "finalizeAccountsMerge";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return "finalizeAccountsMerge";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionError) && L.f(this.f211954b, ((ActionError) obj).f211954b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF118027c() {
            return this.f211955c;
        }

        public final int hashCode() {
            return this.f211954b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("ActionError(throwable="), this.f211954b, ')');
        }
    }

    /* compiled from: SelectVerticalInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/select_vertical/mvi/entity/SelectVerticalInternalAction$EmptySelectError;", "Lcom/avito/android/passport/profile_add/create_flow/select_vertical/mvi/entity/SelectVerticalInternalAction;", "()V", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class EmptySelectError implements SelectVerticalInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final EmptySelectError f211956b = new EmptySelectError();

        private EmptySelectError() {
        }
    }

    /* compiled from: SelectVerticalInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/select_vertical/mvi/entity/SelectVerticalInternalAction$FinishActionInProgress;", "Lcom/avito/android/passport/profile_add/create_flow/select_vertical/mvi/entity/SelectVerticalInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "<init>", "()V", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FinishActionInProgress implements SelectVerticalInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final FinishActionInProgress f211957b = new FinishActionInProgress();

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final String f211958c = "finalizeAccountsMerge";

        private FinishActionInProgress() {
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF211747d() {
            return f211958c;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return f211958c;
        }
    }

    /* compiled from: SelectVerticalInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/select_vertical/mvi/entity/SelectVerticalInternalAction$Navigate;", "Lcom/avito/android/passport/profile_add/create_flow/select_vertical/mvi/entity/SelectVerticalInternalAction;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Navigate implements SelectVerticalInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Navigation f211959b;

        public Navigate(@k Navigation navigation2) {
            this.f211959b = navigation2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Navigate) && L.f(this.f211959b, ((Navigate) obj).f211959b);
        }

        public final int hashCode() {
            return this.f211959b.hashCode();
        }

        @k
        public final String toString() {
            return "Navigate(navigation=" + this.f211959b + ')';
        }
    }

    /* compiled from: SelectVerticalInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/select_vertical/mvi/entity/SelectVerticalInternalAction$OpenDeepLink;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "Lcom/avito/android/passport/profile_add/create_flow/select_vertical/mvi/entity/SelectVerticalInternalAction;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeepLink implements TrackableContent, SelectVerticalInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f211960b;

        public OpenDeepLink(@k DeepLink deepLink) {
            this.f211960b = deepLink;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF211747d() {
            return "finalizeAccountsMerge";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return "finalizeAccountsMerge";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDeepLink) && L.f(this.f211960b, ((OpenDeepLink) obj).f211960b);
        }

        public final int hashCode() {
            return this.f211960b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("OpenDeepLink(deepLink="), this.f211960b, ')');
        }
    }

    /* compiled from: SelectVerticalInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/select_vertical/mvi/entity/SelectVerticalInternalAction$OpenVerticalDisablingInfoBottomSheet;", "Lcom/avito/android/passport/profile_add/create_flow/select_vertical/mvi/entity/SelectVerticalInternalAction;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenVerticalDisablingInfoBottomSheet implements SelectVerticalInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AttributedText f211961b;

        public OpenVerticalDisablingInfoBottomSheet(@k AttributedText attributedText) {
            this.f211961b = attributedText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenVerticalDisablingInfoBottomSheet) && L.f(this.f211961b, ((OpenVerticalDisablingInfoBottomSheet) obj).f211961b);
        }

        public final int hashCode() {
            return this.f211961b.hashCode();
        }

        @k
        public final String toString() {
            return a.w(new StringBuilder("OpenVerticalDisablingInfoBottomSheet(description="), this.f211961b, ')');
        }
    }

    /* compiled from: SelectVerticalInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/select_vertical/mvi/entity/SelectVerticalInternalAction$ProfileConstructorLoaded;", "Lcom/avito/android/passport/profile_add/create_flow/select_vertical/mvi/entity/SelectVerticalInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ProfileConstructorLoaded implements SelectVerticalInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<e> f211962b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final C40908a f211963c;

        public ProfileConstructorLoaded(@k List<e> list, @l C40908a c40908a) {
            this.f211962b = list;
            this.f211963c = c40908a;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF212983c() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProfileConstructorLoaded)) {
                return false;
            }
            ProfileConstructorLoaded profileConstructorLoaded = (ProfileConstructorLoaded) obj;
            return L.f(this.f211962b, profileConstructorLoaded.f211962b) && L.f(this.f211963c, profileConstructorLoaded.f211963c);
        }

        public final int hashCode() {
            int iHashCode = this.f211962b.hashCode() * 31;
            C40908a c40908a = this.f211963c;
            return iHashCode + (c40908a == null ? 0 : c40908a.hashCode());
        }

        @k
        public final String toString() {
            return "ProfileConstructorLoaded(verticals=" + this.f211962b + ", savedProfileInfo=" + this.f211963c + ')';
        }
    }

    /* compiled from: SelectVerticalInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/select_vertical/mvi/entity/SelectVerticalInternalAction$ProfileConstructorLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/passport/profile_add/create_flow/select_vertical/mvi/entity/SelectVerticalInternalAction;", "()V", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ProfileConstructorLoading extends TrackableLoadingStarted implements SelectVerticalInternalAction {
    }

    /* compiled from: SelectVerticalInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/select_vertical/mvi/entity/SelectVerticalInternalAction$ProfileConstructorLoadingError;", "Lcom/avito/android/passport/profile_add/create_flow/select_vertical/mvi/entity/SelectVerticalInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ProfileConstructorLoadingError implements SelectVerticalInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f211964b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f211965c;

        public ProfileConstructorLoadingError(@k Throwable th2) {
            this.f211964b = th2;
            this.f211965c = new J.a(th2);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF212984d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProfileConstructorLoadingError) && L.f(this.f211964b, ((ProfileConstructorLoadingError) obj).f211964b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF212665b() {
            return this.f211965c;
        }

        public final int hashCode() {
            return this.f211964b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("ProfileConstructorLoadingError(throwable="), this.f211964b, ')');
        }
    }

    /* compiled from: SelectVerticalInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/select_vertical/mvi/entity/SelectVerticalInternalAction$SelectVertical;", "Lcom/avito/android/passport/profile_add/create_flow/select_vertical/mvi/entity/SelectVerticalInternalAction;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectVertical implements SelectVerticalInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final e f211966b;

        public SelectVertical(@k e eVar) {
            this.f211966b = eVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectVertical) && L.f(this.f211966b, ((SelectVertical) obj).f211966b);
        }

        public final int hashCode() {
            return this.f211966b.hashCode();
        }

        @k
        public final String toString() {
            return "SelectVertical(vertical=" + this.f211966b + ')';
        }
    }

    /* compiled from: SelectVerticalInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/select_vertical/mvi/entity/SelectVerticalInternalAction$ShowToast;", "Lcom/avito/android/passport/profile_add/create_flow/select_vertical/mvi/entity/SelectVerticalInternalAction;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowToast implements SelectVerticalInternalAction {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowToast)) {
                return false;
            }
            ((ShowToast) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "ShowToast(message=null)";
        }
    }

    /* compiled from: SelectVerticalInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/select_vertical/mvi/entity/SelectVerticalInternalAction$StartActionProgress;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/passport/profile_add/create_flow/select_vertical/mvi/entity/SelectVerticalInternalAction;", "<init>", "()V", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StartActionProgress extends TrackableLoadingStarted implements SelectVerticalInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f211967d = "finalizeAccountsMerge";

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF212984d() {
            return this.f211967d;
        }
    }
}
