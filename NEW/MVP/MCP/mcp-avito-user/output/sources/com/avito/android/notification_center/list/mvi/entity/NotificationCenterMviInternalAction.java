package com.avito.android.notification_center.list.mvi.entity;

import Y61.k;
import Y61.l;
import android.net.Uri;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.CalledFrom;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.remote.model.notification.Notification;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: NotificationCenterMviInternalAction.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/notification_center/list/mvi/entity/NotificationCenterMviInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ChangeLoadingState", "ChangeRefreshLoadingState", "ClearError", "Content", "Error", "OpenDeeplink", "OpenPromoLink", "UpdateContent", "Lcom/avito/android/notification_center/list/mvi/entity/NotificationCenterMviInternalAction$ChangeLoadingState;", "Lcom/avito/android/notification_center/list/mvi/entity/NotificationCenterMviInternalAction$ChangeRefreshLoadingState;", "Lcom/avito/android/notification_center/list/mvi/entity/NotificationCenterMviInternalAction$ClearError;", "Lcom/avito/android/notification_center/list/mvi/entity/NotificationCenterMviInternalAction$Content;", "Lcom/avito/android/notification_center/list/mvi/entity/NotificationCenterMviInternalAction$Error;", "Lcom/avito/android/notification_center/list/mvi/entity/NotificationCenterMviInternalAction$OpenDeeplink;", "Lcom/avito/android/notification_center/list/mvi/entity/NotificationCenterMviInternalAction$OpenPromoLink;", "Lcom/avito/android/notification_center/list/mvi/entity/NotificationCenterMviInternalAction$UpdateContent;", "_avito_notification-center_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface NotificationCenterMviInternalAction extends n {

    /* compiled from: NotificationCenterMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/notification_center/list/mvi/entity/NotificationCenterMviInternalAction$ChangeLoadingState;", "Lcom/avito/android/notification_center/list/mvi/entity/NotificationCenterMviInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "_avito_notification-center_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeLoadingState extends TrackableLoadingStarted implements NotificationCenterMviInternalAction {

        /* renamed from: d, reason: collision with root package name */
        public final boolean f207666d;

        public ChangeLoadingState(boolean z12) {
            this.f207666d = z12;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChangeLoadingState) && this.f207666d == ((ChangeLoadingState) obj).f207666d;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final int hashCode() {
            return Boolean.hashCode(this.f207666d);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ChangeLoadingState(isLoading="), this.f207666d, ')');
        }
    }

    /* compiled from: NotificationCenterMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/notification_center/list/mvi/entity/NotificationCenterMviInternalAction$ChangeRefreshLoadingState;", "Lcom/avito/android/notification_center/list/mvi/entity/NotificationCenterMviInternalAction;", "_avito_notification-center_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeRefreshLoadingState implements NotificationCenterMviInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f207667b;

        public ChangeRefreshLoadingState(boolean z12) {
            this.f207667b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChangeRefreshLoadingState) && this.f207667b == ((ChangeRefreshLoadingState) obj).f207667b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f207667b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ChangeRefreshLoadingState(isLoading="), this.f207667b, ')');
        }
    }

    /* compiled from: NotificationCenterMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/notification_center/list/mvi/entity/NotificationCenterMviInternalAction$ClearError;", "Lcom/avito/android/notification_center/list/mvi/entity/NotificationCenterMviInternalAction;", "()V", "_avito_notification-center_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ClearError implements NotificationCenterMviInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ClearError f207668b = new ClearError();

        private ClearError() {
        }
    }

    /* compiled from: NotificationCenterMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/notification_center/list/mvi/entity/NotificationCenterMviInternalAction$Content;", "Lcom/avito/android/notification_center/list/mvi/entity/NotificationCenterMviInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_notification-center_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements NotificationCenterMviInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<Notification> f207669b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Uri f207670c;

        public Content(@k List<Notification> list, @l Uri uri) {
            this.f207669b = list;
            this.f207670c = uri;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF211967d() {
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
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return L.f(this.f207669b, content.f207669b) && L.f(this.f207670c, content.f207670c);
        }

        public final int hashCode() {
            int iHashCode = this.f207669b.hashCode() * 31;
            Uri uri = this.f207670c;
            return iHashCode + (uri == null ? 0 : uri.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Content(data=");
            sb2.append(this.f207669b);
            sb2.append(", nextPage=");
            return a.t(sb2, this.f207670c, ')');
        }
    }

    /* compiled from: NotificationCenterMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/notification_center/list/mvi/entity/NotificationCenterMviInternalAction$Error;", "Lcom/avito/android/notification_center/list/mvi/entity/NotificationCenterMviInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_notification-center_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements NotificationCenterMviInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f207671b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f207672c;

        public Error(@k Throwable th2) {
            this.f207671b = th2;
            this.f207672c = new J.a(th2);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF211967d() {
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
            return (obj instanceof Error) && L.f(this.f207671b, ((Error) obj).f207671b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF328859c() {
            return this.f207672c;
        }

        public final int hashCode() {
            return this.f207671b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("Error(throwable="), this.f207671b, ')');
        }
    }

    /* compiled from: NotificationCenterMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/notification_center/list/mvi/entity/NotificationCenterMviInternalAction$OpenDeeplink;", "Lcom/avito/android/notification_center/list/mvi/entity/NotificationCenterMviInternalAction;", "_avito_notification-center_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeeplink implements NotificationCenterMviInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f207673b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final CalledFrom.NotificationCenter f207674c;

        public OpenDeeplink(@k DeepLink deepLink, @k CalledFrom.NotificationCenter notificationCenter) {
            this.f207673b = deepLink;
            this.f207674c = notificationCenter;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenDeeplink)) {
                return false;
            }
            OpenDeeplink openDeeplink = (OpenDeeplink) obj;
            return L.f(this.f207673b, openDeeplink.f207673b) && L.f(this.f207674c, openDeeplink.f207674c);
        }

        public final int hashCode() {
            return this.f207674c.f67243b.hashCode() + (this.f207673b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "OpenDeeplink(deeplink=" + this.f207673b + ", calledFrom=" + this.f207674c + ')';
        }
    }

    /* compiled from: NotificationCenterMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/notification_center/list/mvi/entity/NotificationCenterMviInternalAction$OpenPromoLink;", "Lcom/avito/android/notification_center/list/mvi/entity/NotificationCenterMviInternalAction;", "_avito_notification-center_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenPromoLink implements NotificationCenterMviInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final WebViewLink f207675b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final CalledFrom.NotificationCenter f207676c;

        public OpenPromoLink(@k WebViewLink webViewLink, @k CalledFrom.NotificationCenter notificationCenter) {
            this.f207675b = webViewLink;
            this.f207676c = notificationCenter;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenPromoLink)) {
                return false;
            }
            OpenPromoLink openPromoLink = (OpenPromoLink) obj;
            return L.f(this.f207675b, openPromoLink.f207675b) && L.f(this.f207676c, openPromoLink.f207676c);
        }

        public final int hashCode() {
            return this.f207676c.f67243b.hashCode() + (this.f207675b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "OpenPromoLink(deeplink=" + this.f207675b + ", calledFrom=" + this.f207676c + ')';
        }
    }

    /* compiled from: NotificationCenterMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/notification_center/list/mvi/entity/NotificationCenterMviInternalAction$UpdateContent;", "Lcom/avito/android/notification_center/list/mvi/entity/NotificationCenterMviInternalAction;", "_avito_notification-center_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateContent implements NotificationCenterMviInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<Notification> f207677b;

        public UpdateContent(@k List<Notification> list) {
            this.f207677b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateContent) && L.f(this.f207677b, ((UpdateContent) obj).f207677b);
        }

        public final int hashCode() {
            return this.f207677b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("UpdateContent(data="), this.f207677b, ')');
        }
    }
}
