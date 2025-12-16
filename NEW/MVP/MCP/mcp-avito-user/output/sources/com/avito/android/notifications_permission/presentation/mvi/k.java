package com.avito.android.notifications_permission.presentation.mvi;

import Q30.b;
import com.avito.android.arch.mvi.t;
import com.avito.android.notifications_permission.presentation.mvi.entity.NotificationPermissionInfoInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: NotificationPermissionInfoOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/notifications_permission/presentation/mvi/k;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/notifications_permission/presentation/mvi/entity/NotificationPermissionInfoInternalAction;", "LQ30/b;", "<init>", "()V", "_avito_notifications-permission_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class k implements t<NotificationPermissionInfoInternalAction, Q30.b> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final Q30.b b(NotificationPermissionInfoInternalAction notificationPermissionInfoInternalAction) {
        NotificationPermissionInfoInternalAction notificationPermissionInfoInternalAction2 = notificationPermissionInfoInternalAction;
        if (notificationPermissionInfoInternalAction2 instanceof NotificationPermissionInfoInternalAction.ShowNotificationPermissionRequestRational) {
            return b.C0884b.f13446a;
        }
        if (notificationPermissionInfoInternalAction2 instanceof NotificationPermissionInfoInternalAction.CloseScreen) {
            return b.a.f13445a;
        }
        if (notificationPermissionInfoInternalAction2 instanceof NotificationPermissionInfoInternalAction.RequestPermission) {
            return new b.c(((NotificationPermissionInfoInternalAction.RequestPermission) notificationPermissionInfoInternalAction2).f207877b);
        }
        throw new NoWhenBranchMatchedException();
    }
}
