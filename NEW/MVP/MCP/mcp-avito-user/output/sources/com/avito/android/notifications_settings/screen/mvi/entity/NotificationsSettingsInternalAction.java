package com.avito.android.notifications_settings.screen.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: NotificationsSettingsInternalAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/notifications_settings/screen/mvi/entity/NotificationsSettingsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Content", "Error", "Loading", "OpenSettingsDialog", "ShowSaveError", "UpdateContent", "UpdateNotificationsEnabled", "Lcom/avito/android/notifications_settings/screen/mvi/entity/NotificationsSettingsInternalAction$Content;", "Lcom/avito/android/notifications_settings/screen/mvi/entity/NotificationsSettingsInternalAction$Error;", "Lcom/avito/android/notifications_settings/screen/mvi/entity/NotificationsSettingsInternalAction$Loading;", "Lcom/avito/android/notifications_settings/screen/mvi/entity/NotificationsSettingsInternalAction$OpenSettingsDialog;", "Lcom/avito/android/notifications_settings/screen/mvi/entity/NotificationsSettingsInternalAction$ShowSaveError;", "Lcom/avito/android/notifications_settings/screen/mvi/entity/NotificationsSettingsInternalAction$UpdateContent;", "Lcom/avito/android/notifications_settings/screen/mvi/entity/NotificationsSettingsInternalAction$UpdateNotificationsEnabled;", "_avito_notifications-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface NotificationsSettingsInternalAction extends n {

    /* compiled from: NotificationsSettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/notifications_settings/screen/mvi/entity/NotificationsSettingsInternalAction$Content;", "Lcom/avito/android/notifications_settings/screen/mvi/entity/NotificationsSettingsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_notifications-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements NotificationsSettingsInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final NotificationsSettings f208119b;

        public Content(@k NotificationsSettings notificationsSettings) {
            this.f208119b = notificationsSettings;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF307400d() {
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
            return (obj instanceof Content) && L.f(this.f208119b, ((Content) obj).f208119b);
        }

        public final int hashCode() {
            return this.f208119b.hashCode();
        }

        @k
        public final String toString() {
            return "Content(notificationSettings=" + this.f208119b + ')';
        }
    }

    /* compiled from: NotificationsSettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/notifications_settings/screen/mvi/entity/NotificationsSettingsInternalAction$Error;", "Lcom/avito/android/notifications_settings/screen/mvi/entity/NotificationsSettingsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_notifications-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements NotificationsSettingsInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f208120b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f208121c;

        public Error(@k Throwable th2) {
            this.f208120b = th2;
            this.f208121c = new J.a(th2);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF307400d() {
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
            return (obj instanceof Error) && L.f(this.f208120b, ((Error) obj).f208120b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF127081c() {
            return this.f208121c;
        }

        public final int hashCode() {
            return this.f208120b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("Error(throwable="), this.f208120b, ')');
        }
    }

    /* compiled from: NotificationsSettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/notifications_settings/screen/mvi/entity/NotificationsSettingsInternalAction$Loading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/notifications_settings/screen/mvi/entity/NotificationsSettingsInternalAction;", "()V", "_avito_notifications-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements NotificationsSettingsInternalAction {
    }

    /* compiled from: NotificationsSettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/notifications_settings/screen/mvi/entity/NotificationsSettingsInternalAction$OpenSettingsDialog;", "Lcom/avito/android/notifications_settings/screen/mvi/entity/NotificationsSettingsInternalAction;", "()V", "_avito_notifications-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OpenSettingsDialog implements NotificationsSettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OpenSettingsDialog f208122b = new OpenSettingsDialog();

        private OpenSettingsDialog() {
        }
    }

    /* compiled from: NotificationsSettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/notifications_settings/screen/mvi/entity/NotificationsSettingsInternalAction$ShowSaveError;", "Lcom/avito/android/notifications_settings/screen/mvi/entity/NotificationsSettingsInternalAction;", "_avito_notifications-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowSaveError implements NotificationsSettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f208123b;

        public ShowSaveError(@k PrintableText printableText) {
            this.f208123b = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowSaveError) && L.f(this.f208123b, ((ShowSaveError) obj).f208123b);
        }

        public final int hashCode() {
            return this.f208123b.hashCode();
        }

        @k
        public final String toString() {
            return c.m(new StringBuilder("ShowSaveError(error="), this.f208123b, ')');
        }
    }

    /* compiled from: NotificationsSettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/notifications_settings/screen/mvi/entity/NotificationsSettingsInternalAction$UpdateContent;", "Lcom/avito/android/notifications_settings/screen/mvi/entity/NotificationsSettingsInternalAction;", "_avito_notifications-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateContent implements NotificationsSettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final NotificationsSettings f208124b;

        public UpdateContent(@k NotificationsSettings notificationsSettings) {
            this.f208124b = notificationsSettings;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateContent) && L.f(this.f208124b, ((UpdateContent) obj).f208124b);
        }

        public final int hashCode() {
            return this.f208124b.hashCode();
        }

        @k
        public final String toString() {
            return "UpdateContent(notificationSettings=" + this.f208124b + ')';
        }
    }

    /* compiled from: NotificationsSettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/notifications_settings/screen/mvi/entity/NotificationsSettingsInternalAction$UpdateNotificationsEnabled;", "Lcom/avito/android/notifications_settings/screen/mvi/entity/NotificationsSettingsInternalAction;", "()V", "_avito_notifications-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UpdateNotificationsEnabled implements NotificationsSettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final UpdateNotificationsEnabled f208125b = new UpdateNotificationsEnabled();

        private UpdateNotificationsEnabled() {
        }
    }
}
