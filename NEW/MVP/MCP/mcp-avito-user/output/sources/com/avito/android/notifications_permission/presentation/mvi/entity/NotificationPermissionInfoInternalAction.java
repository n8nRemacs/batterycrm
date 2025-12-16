package com.avito.android.notifications_permission.presentation.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.mvi.n;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: NotificationPermissionInfoInternalAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/notifications_permission/presentation/mvi/entity/NotificationPermissionInfoInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CloseScreen", "RequestPermission", "ShowNotificationPermissionRequestRational", "Lcom/avito/android/notifications_permission/presentation/mvi/entity/NotificationPermissionInfoInternalAction$CloseScreen;", "Lcom/avito/android/notifications_permission/presentation/mvi/entity/NotificationPermissionInfoInternalAction$RequestPermission;", "Lcom/avito/android/notifications_permission/presentation/mvi/entity/NotificationPermissionInfoInternalAction$ShowNotificationPermissionRequestRational;", "_avito_notifications-permission_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface NotificationPermissionInfoInternalAction extends n {

    /* compiled from: NotificationPermissionInfoInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/notifications_permission/presentation/mvi/entity/NotificationPermissionInfoInternalAction$CloseScreen;", "Lcom/avito/android/notifications_permission/presentation/mvi/entity/NotificationPermissionInfoInternalAction;", "()V", "_avito_notifications-permission_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CloseScreen implements NotificationPermissionInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f207876b = new CloseScreen();

        private CloseScreen() {
        }
    }

    /* compiled from: NotificationPermissionInfoInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/notifications_permission/presentation/mvi/entity/NotificationPermissionInfoInternalAction$RequestPermission;", "Lcom/avito/android/notifications_permission/presentation/mvi/entity/NotificationPermissionInfoInternalAction;", "_avito_notifications-permission_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RequestPermission implements NotificationPermissionInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f207877b;

        public RequestPermission(@k String str) {
            this.f207877b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RequestPermission) && L.f(this.f207877b, ((RequestPermission) obj).f207877b);
        }

        public final int hashCode() {
            return this.f207877b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("RequestPermission(permission="), this.f207877b, ')');
        }
    }

    /* compiled from: NotificationPermissionInfoInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/notifications_permission/presentation/mvi/entity/NotificationPermissionInfoInternalAction$ShowNotificationPermissionRequestRational;", "Lcom/avito/android/notifications_permission/presentation/mvi/entity/NotificationPermissionInfoInternalAction;", "()V", "_avito_notifications-permission_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowNotificationPermissionRequestRational implements NotificationPermissionInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowNotificationPermissionRequestRational f207878b = new ShowNotificationPermissionRequestRational();

        private ShowNotificationPermissionRequestRational() {
        }
    }
}
