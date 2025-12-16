package com.avito.android.profile.remove.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.RemoveActionDeeplink;
import com.avito.android.profile.remove.confirm.ProfileRemoveConfirmDialogParams;
import com.avito.android.profile.remove.screen.get_money.HowToReturnMoneyParams;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.profile_removal.ProfileRemovalScreen;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProfileRemoveInternalAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/profile/remove/mvi/entity/ProfileRemoveInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "DataLoading", "Error", "OpenHowGetMoneyScreen", "OpenItemsScreen", "ShowConfirmDialog", "ShowConfirmScreen", "ShowSnackbar", "Lcom/avito/android/profile/remove/mvi/entity/ProfileRemoveInternalAction$DataLoading;", "Lcom/avito/android/profile/remove/mvi/entity/ProfileRemoveInternalAction$Error;", "Lcom/avito/android/profile/remove/mvi/entity/ProfileRemoveInternalAction$OpenHowGetMoneyScreen;", "Lcom/avito/android/profile/remove/mvi/entity/ProfileRemoveInternalAction$OpenItemsScreen;", "Lcom/avito/android/profile/remove/mvi/entity/ProfileRemoveInternalAction$ShowConfirmDialog;", "Lcom/avito/android/profile/remove/mvi/entity/ProfileRemoveInternalAction$ShowConfirmScreen;", "Lcom/avito/android/profile/remove/mvi/entity/ProfileRemoveInternalAction$ShowSnackbar;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface ProfileRemoveInternalAction extends n {

    /* compiled from: ProfileRemoveInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/remove/mvi/entity/ProfileRemoveInternalAction$DataLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/profile/remove/mvi/entity/ProfileRemoveInternalAction;", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DataLoading extends TrackableLoadingStarted implements ProfileRemoveInternalAction {
    }

    /* compiled from: ProfileRemoveInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/remove/mvi/entity/ProfileRemoveInternalAction$Error;", "Lcom/avito/android/profile/remove/mvi/entity/ProfileRemoveInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements ProfileRemoveInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f223955b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ApiError f223956c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final J.a f223957d;

        public Error(@k ApiError apiError, @k String str) {
            this.f223955b = str;
            this.f223956c = apiError;
            this.f223957d = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF314462e() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF314460f() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return L.f(this.f223955b, error.f223955b) && L.f(this.f223956c, error.f223956c);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF203575c() {
            return this.f223957d;
        }

        public final int hashCode() {
            return this.f223956c.hashCode() + (this.f223955b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(message=");
            sb2.append(this.f223955b);
            sb2.append(", error=");
            return c.n(sb2, this.f223956c, ')');
        }
    }

    /* compiled from: ProfileRemoveInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/remove/mvi/entity/ProfileRemoveInternalAction$OpenHowGetMoneyScreen;", "Lcom/avito/android/profile/remove/mvi/entity/ProfileRemoveInternalAction;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenHowGetMoneyScreen implements ProfileRemoveInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f223958b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final HowToReturnMoneyParams f223959c;

        public OpenHowGetMoneyScreen(@k String str, @k HowToReturnMoneyParams howToReturnMoneyParams) {
            this.f223958b = str;
            this.f223959c = howToReturnMoneyParams;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenHowGetMoneyScreen)) {
                return false;
            }
            OpenHowGetMoneyScreen openHowGetMoneyScreen = (OpenHowGetMoneyScreen) obj;
            return L.f(this.f223958b, openHowGetMoneyScreen.f223958b) && L.f(this.f223959c, openHowGetMoneyScreen.f223959c);
        }

        public final int hashCode() {
            return this.f223959c.hashCode() + (this.f223958b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "OpenHowGetMoneyScreen(screenKey=" + this.f223958b + ", params=" + this.f223959c + ')';
        }
    }

    /* compiled from: ProfileRemoveInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/remove/mvi/entity/ProfileRemoveInternalAction$OpenItemsScreen;", "Lcom/avito/android/profile/remove/mvi/entity/ProfileRemoveInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenItemsScreen implements ProfileRemoveInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f223960b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ProfileRemovalScreen f223961c;

        public OpenItemsScreen(@k String str, @k ProfileRemovalScreen profileRemovalScreen) {
            this.f223960b = str;
            this.f223961c = profileRemovalScreen;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF314462e() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF314460f() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenItemsScreen)) {
                return false;
            }
            OpenItemsScreen openItemsScreen = (OpenItemsScreen) obj;
            return L.f(this.f223960b, openItemsScreen.f223960b) && L.f(this.f223961c, openItemsScreen.f223961c);
        }

        public final int hashCode() {
            return this.f223961c.hashCode() + (this.f223960b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "OpenItemsScreen(screenKey=" + this.f223960b + ", screen=" + this.f223961c + ')';
        }
    }

    /* compiled from: ProfileRemoveInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/remove/mvi/entity/ProfileRemoveInternalAction$ShowConfirmDialog;", "Lcom/avito/android/profile/remove/mvi/entity/ProfileRemoveInternalAction;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowConfirmDialog implements ProfileRemoveInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final ProfileRemoveConfirmDialogParams f223962b;

        public ShowConfirmDialog(@l ProfileRemoveConfirmDialogParams profileRemoveConfirmDialogParams) {
            this.f223962b = profileRemoveConfirmDialogParams;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowConfirmDialog) && L.f(this.f223962b, ((ShowConfirmDialog) obj).f223962b);
        }

        public final int hashCode() {
            ProfileRemoveConfirmDialogParams profileRemoveConfirmDialogParams = this.f223962b;
            if (profileRemoveConfirmDialogParams == null) {
                return 0;
            }
            return profileRemoveConfirmDialogParams.hashCode();
        }

        @k
        public final String toString() {
            return "ShowConfirmDialog(params=" + this.f223962b + ')';
        }
    }

    /* compiled from: ProfileRemoveInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/remove/mvi/entity/ProfileRemoveInternalAction$ShowConfirmScreen;", "Lcom/avito/android/profile/remove/mvi/entity/ProfileRemoveInternalAction;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowConfirmScreen implements ProfileRemoveInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final RemoveActionDeeplink f223963b;

        public ShowConfirmScreen(@k RemoveActionDeeplink removeActionDeeplink) {
            this.f223963b = removeActionDeeplink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowConfirmScreen) && L.f(this.f223963b, ((ShowConfirmScreen) obj).f223963b);
        }

        public final int hashCode() {
            return this.f223963b.hashCode();
        }

        @k
        public final String toString() {
            return "ShowConfirmScreen(deeplink=" + this.f223963b + ')';
        }
    }

    /* compiled from: ProfileRemoveInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/remove/mvi/entity/ProfileRemoveInternalAction$ShowSnackbar;", "Lcom/avito/android/profile/remove/mvi/entity/ProfileRemoveInternalAction;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowSnackbar implements ProfileRemoveInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f223964b;

        public ShowSnackbar(@k String str) {
            this.f223964b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowSnackbar) && L.f(this.f223964b, ((ShowSnackbar) obj).f223964b);
        }

        public final int hashCode() {
            return this.f223964b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowSnackbar(message="), this.f223964b, ')');
        }
    }
}
