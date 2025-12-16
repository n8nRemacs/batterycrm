package com.avito.android.saved_searches.presentation.main.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import com.avito.android.saved_searches.model.SavedSearchData;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SavedSearchMainInternalAction.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0014\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0082\u0001\u0014\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()¨\u0006*"}, d2 = {"Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ContentLoadingSuccess", "EmailSettingsResult", "HandleDeeplink", "HideProgress", "PushSettingsResult", "RouteBack", "ShowEmailChooser", "ShowEmailSettings", "ShowError", "ShowNotificationSettingsScreen", "ShowProgressOnMainButton", "ShowProgressOnSecondaryButton", "ShowPushSettings", "ShowSkeletons", "ShowToast", "UpdateCurrentNameValue", "UpdateEmailIsConfirmed", "UpdateEmailToggleValue", "UpdateNotificationsEnabled", "UpdatePushToggleValue", "Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction$ContentLoadingSuccess;", "Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction$EmailSettingsResult;", "Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction$HandleDeeplink;", "Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction$HideProgress;", "Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction$PushSettingsResult;", "Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction$RouteBack;", "Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction$ShowEmailChooser;", "Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction$ShowEmailSettings;", "Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction$ShowError;", "Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction$ShowNotificationSettingsScreen;", "Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction$ShowProgressOnMainButton;", "Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction$ShowProgressOnSecondaryButton;", "Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction$ShowPushSettings;", "Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction$ShowSkeletons;", "Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction$ShowToast;", "Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction$UpdateCurrentNameValue;", "Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction$UpdateEmailIsConfirmed;", "Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction$UpdateEmailToggleValue;", "Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction$UpdateNotificationsEnabled;", "Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction$UpdatePushToggleValue;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SavedSearchMainInternalAction extends n {

    /* compiled from: SavedSearchMainInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction$ContentLoadingSuccess;", "Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentLoadingSuccess implements SavedSearchMainInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SavedSearchData f258638b;

        public ContentLoadingSuccess(@k SavedSearchData savedSearchData) {
            this.f258638b = savedSearchData;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ContentLoadingSuccess) && L.f(this.f258638b, ((ContentLoadingSuccess) obj).f258638b);
        }

        public final int hashCode() {
            return this.f258638b.hashCode();
        }

        @k
        public final String toString() {
            return "ContentLoadingSuccess(data=" + this.f258638b + ')';
        }
    }

    /* compiled from: SavedSearchMainInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction$EmailSettingsResult;", "Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class EmailSettingsResult implements SavedSearchMainInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SavedSearchData.Settings.SettingsDetails f258639b;

        public EmailSettingsResult(@k SavedSearchData.Settings.SettingsDetails settingsDetails) {
            this.f258639b = settingsDetails;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EmailSettingsResult) && L.f(this.f258639b, ((EmailSettingsResult) obj).f258639b);
        }

        public final int hashCode() {
            return this.f258639b.hashCode();
        }

        @k
        public final String toString() {
            return "EmailSettingsResult(settingsDetails=" + this.f258639b + ')';
        }
    }

    /* compiled from: SavedSearchMainInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction$HandleDeeplink;", "Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements SavedSearchMainInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f258640b;

        public HandleDeeplink(@k DeepLink deepLink) {
            this.f258640b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleDeeplink) && L.f(this.f258640b, ((HandleDeeplink) obj).f258640b);
        }

        public final int hashCode() {
            return this.f258640b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("HandleDeeplink(deepLink="), this.f258640b, ')');
        }
    }

    /* compiled from: SavedSearchMainInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction$HideProgress;", "Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction;", "<init>", "()V", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HideProgress implements SavedSearchMainInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final HideProgress f258641b = new HideProgress();

        private HideProgress() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof HideProgress);
        }

        public final int hashCode() {
            return -2010380151;
        }

        @k
        public final String toString() {
            return "HideProgress";
        }
    }

    /* compiled from: SavedSearchMainInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction$PushSettingsResult;", "Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PushSettingsResult implements SavedSearchMainInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SavedSearchData.Settings.SettingsDetails f258642b;

        public PushSettingsResult(@k SavedSearchData.Settings.SettingsDetails settingsDetails) {
            this.f258642b = settingsDetails;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PushSettingsResult) && L.f(this.f258642b, ((PushSettingsResult) obj).f258642b);
        }

        public final int hashCode() {
            return this.f258642b.hashCode();
        }

        @k
        public final String toString() {
            return "PushSettingsResult(settingsDetails=" + this.f258642b + ')';
        }
    }

    /* compiled from: SavedSearchMainInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction$RouteBack;", "Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction;", "<init>", "()V", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RouteBack implements SavedSearchMainInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final RouteBack f258643b = new RouteBack();

        private RouteBack() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof RouteBack);
        }

        public final int hashCode() {
            return 219245078;
        }

        @k
        public final String toString() {
            return "RouteBack";
        }
    }

    /* compiled from: SavedSearchMainInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction$ShowEmailChooser;", "Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction;", "<init>", "()V", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowEmailChooser implements SavedSearchMainInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowEmailChooser f258644b = new ShowEmailChooser();

        private ShowEmailChooser() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowEmailChooser);
        }

        public final int hashCode() {
            return -496990314;
        }

        @k
        public final String toString() {
            return "ShowEmailChooser";
        }
    }

    /* compiled from: SavedSearchMainInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction$ShowEmailSettings;", "Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowEmailSettings implements SavedSearchMainInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SavedSearchData.Settings.SettingsDetails f258645b;

        public ShowEmailSettings(@k SavedSearchData.Settings.SettingsDetails settingsDetails) {
            this.f258645b = settingsDetails;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowEmailSettings) && L.f(this.f258645b, ((ShowEmailSettings) obj).f258645b);
        }

        public final int hashCode() {
            return this.f258645b.hashCode();
        }

        @k
        public final String toString() {
            return "ShowEmailSettings(details=" + this.f258645b + ')';
        }
    }

    /* compiled from: SavedSearchMainInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction$ShowError;", "Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowError implements SavedSearchMainInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f258646b;

        public ShowError(@k ApiError apiError) {
            this.f258646b = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowError) && L.f(this.f258646b, ((ShowError) obj).f258646b);
        }

        public final int hashCode() {
            return this.f258646b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("ShowError(error="), this.f258646b, ')');
        }
    }

    /* compiled from: SavedSearchMainInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction$ShowNotificationSettingsScreen;", "Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction;", "<init>", "()V", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowNotificationSettingsScreen implements SavedSearchMainInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowNotificationSettingsScreen f258647b = new ShowNotificationSettingsScreen();

        private ShowNotificationSettingsScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowNotificationSettingsScreen);
        }

        public final int hashCode() {
            return -1069596271;
        }

        @k
        public final String toString() {
            return "ShowNotificationSettingsScreen";
        }
    }

    /* compiled from: SavedSearchMainInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction$ShowProgressOnMainButton;", "Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction;", "<init>", "()V", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowProgressOnMainButton implements SavedSearchMainInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowProgressOnMainButton f258648b = new ShowProgressOnMainButton();

        private ShowProgressOnMainButton() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowProgressOnMainButton);
        }

        public final int hashCode() {
            return 1720333038;
        }

        @k
        public final String toString() {
            return "ShowProgressOnMainButton";
        }
    }

    /* compiled from: SavedSearchMainInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction$ShowProgressOnSecondaryButton;", "Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction;", "<init>", "()V", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowProgressOnSecondaryButton implements SavedSearchMainInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowProgressOnSecondaryButton f258649b = new ShowProgressOnSecondaryButton();

        private ShowProgressOnSecondaryButton() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowProgressOnSecondaryButton);
        }

        public final int hashCode() {
            return 1971946243;
        }

        @k
        public final String toString() {
            return "ShowProgressOnSecondaryButton";
        }
    }

    /* compiled from: SavedSearchMainInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction$ShowPushSettings;", "Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowPushSettings implements SavedSearchMainInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SavedSearchData.Settings.SettingsDetails f258650b;

        public ShowPushSettings(@k SavedSearchData.Settings.SettingsDetails settingsDetails) {
            this.f258650b = settingsDetails;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowPushSettings) && L.f(this.f258650b, ((ShowPushSettings) obj).f258650b);
        }

        public final int hashCode() {
            return this.f258650b.hashCode();
        }

        @k
        public final String toString() {
            return "ShowPushSettings(details=" + this.f258650b + ')';
        }
    }

    /* compiled from: SavedSearchMainInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction$ShowSkeletons;", "Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction;", "<init>", "()V", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowSkeletons implements SavedSearchMainInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowSkeletons f258651b = new ShowSkeletons();

        private ShowSkeletons() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowSkeletons);
        }

        public final int hashCode() {
            return 616618895;
        }

        @k
        public final String toString() {
            return "ShowSkeletons";
        }
    }

    /* compiled from: SavedSearchMainInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction$UpdateCurrentNameValue;", "Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateCurrentNameValue implements SavedSearchMainInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f258656b;

        public UpdateCurrentNameValue(@k String str) {
            this.f258656b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateCurrentNameValue) && L.f(this.f258656b, ((UpdateCurrentNameValue) obj).f258656b);
        }

        public final int hashCode() {
            return this.f258656b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("UpdateCurrentNameValue(value="), this.f258656b, ')');
        }
    }

    /* compiled from: SavedSearchMainInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction$UpdateEmailIsConfirmed;", "Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction;", "<init>", "()V", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateEmailIsConfirmed implements SavedSearchMainInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final UpdateEmailIsConfirmed f258657b = new UpdateEmailIsConfirmed();

        private UpdateEmailIsConfirmed() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof UpdateEmailIsConfirmed);
        }

        public final int hashCode() {
            return -872281732;
        }

        @k
        public final String toString() {
            return "UpdateEmailIsConfirmed";
        }
    }

    /* compiled from: SavedSearchMainInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction$UpdateEmailToggleValue;", "Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateEmailToggleValue implements SavedSearchMainInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f258658b;

        public UpdateEmailToggleValue(boolean z12) {
            this.f258658b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateEmailToggleValue) && this.f258658b == ((UpdateEmailToggleValue) obj).f258658b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f258658b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("UpdateEmailToggleValue(value="), this.f258658b, ')');
        }
    }

    /* compiled from: SavedSearchMainInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction$UpdateNotificationsEnabled;", "Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateNotificationsEnabled implements SavedSearchMainInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f258659b;

        public UpdateNotificationsEnabled(boolean z12) {
            this.f258659b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateNotificationsEnabled) && this.f258659b == ((UpdateNotificationsEnabled) obj).f258659b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f258659b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("UpdateNotificationsEnabled(enabled="), this.f258659b, ')');
        }
    }

    /* compiled from: SavedSearchMainInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction$UpdatePushToggleValue;", "Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdatePushToggleValue implements SavedSearchMainInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f258660b;

        public UpdatePushToggleValue(boolean z12) {
            this.f258660b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdatePushToggleValue) && this.f258660b == ((UpdatePushToggleValue) obj).f258660b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f258660b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("UpdatePushToggleValue(value="), this.f258660b, ')');
        }
    }

    /* compiled from: SavedSearchMainInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction$ShowToast;", "Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainInternalAction;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowToast implements SavedSearchMainInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f258652b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final f f258653c;

        /* renamed from: d, reason: collision with root package name */
        public final int f258654d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final ToastBarPosition f258655e;

        public ShowToast(@k PrintableText printableText, @k f fVar, int i12, @k ToastBarPosition toastBarPosition) {
            this.f258652b = printableText;
            this.f258653c = fVar;
            this.f258654d = i12;
            this.f258655e = toastBarPosition;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowToast)) {
                return false;
            }
            ShowToast showToast = (ShowToast) obj;
            return L.f(this.f258652b, showToast.f258652b) && L.f(this.f258653c, showToast.f258653c) && this.f258654d == showToast.f258654d && this.f258655e == showToast.f258655e;
        }

        public final int hashCode() {
            return this.f258655e.hashCode() + r.e(this.f258654d, (this.f258653c.hashCode() + (this.f258652b.hashCode() * 31)) * 31, 31);
        }

        @k
        public final String toString() {
            return "ShowToast(text=" + this.f258652b + ", type=" + this.f258653c + ", duration=" + this.f258654d + ", position=" + this.f258655e + ')';
        }

        public /* synthetic */ ShowToast(PrintableText printableText, f fVar, int i12, ToastBarPosition toastBarPosition, int i13, C42822w c42822w) {
            this(printableText, (i13 & 2) != 0 ? f.a.f125253a : fVar, (i13 & 4) != 0 ? 2750 : i12, (i13 & 8) != 0 ? ToastBarPosition.f181047e : toastBarPosition);
        }
    }
}
